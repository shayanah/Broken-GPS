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
		
		// 60 mile/hour and 1 hour
		g.GoRandomly(60, 1);
		double d = g.distanceC(new Coordinate(), g.location);
		
		System.out.print("Car's final position: ");
		Coordinate.print(g.location);
		System.out.println("the total distance car has drived is: " + d);
		
	}
}