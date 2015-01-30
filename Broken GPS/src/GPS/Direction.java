package GPS;

import java.util.Random;

public enum Direction {

	North(0,1), South(0,-1), East(1,0), West(-1,0);
	
	Coordinate turn;
	
	Direction(int a, int b)
	{
		turn = new Coordinate(a,b);
		
	}
	
	
	public static Direction getRandomDirection()
	{
		Random rand = new Random();
		return Direction.values()[rand.nextInt(Direction.values().length)];
	}
}
