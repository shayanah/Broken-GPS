/*
 * Algorithm:
 * for(i = 0 ; i < mileage ; i++)
		{
			foreach five minutes
			{
				turnTo = getARandomeDirection();
				location = add(location, turnTo);
			}
			else
				location = continueToTheDirection();
		}
		TotalDistance()
			return Math.sqrt( (startPoint.Y - endPoint.Y) * (startPoint.Y - endPoint.Y)
				+ (startPoint.X - endPoint.X) * (startPoint.X - endPoint.X) ) ;		
 */
package GPS;

import java.util.Random;

public class program {

	public static void main(String [] args)
	{
		BrokenGps g = new BrokenGps();
		/*double k = g.distanceC(new Coordinate(4,1), new Coordinate(5,3));
		System.out.println(k);
		System.out.println(Direction.values()[3]);*/
		
		g.GoRandomly(60, 1);
		double d = g.distanceC(new Coordinate(), g.location);
		
		Coordinate.print(g.location);
		System.out.println("the final distance car has drived is: " + d);
		
	}
}