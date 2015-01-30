package GPS;

public class BrokenGps {

	public BrokenGps(){ location = new Coordinate();}
	
	public double distanceC(Coordinate startPoint, Coordinate endPoint)
	{
		return Math.sqrt( (startPoint.Y - endPoint.Y) * (startPoint.Y - endPoint.Y)
				+ (startPoint.X - endPoint.X) * (startPoint.X - endPoint.X) ) ;	
	}
	
	public Coordinate GoRandomly(double speed, double time)
	{
		double mileage = speed * time ;
		
		Direction d = Direction.getRandomDirection() ;
		for(int i = 0 ; i < mileage ; i++)
		{
			if(i % 5 == 0 && i != 0)
			{
				d = Direction.getRandomDirection() ;
				location = Coordinate.add(location, d.turn);
			}
			else
				location = Coordinate.add(location, d.turn);
			
		}
		return location;
		
	}
	public Coordinate location;
}
