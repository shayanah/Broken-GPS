package GPS;

public class Coordinate {
	
	public int X;
	public int Y;
	
	Coordinate(int x,int y){ X = x; Y = y ;}
	Coordinate(){ X = 0 ; Y = 0 ;}
	
	public static Coordinate add(Coordinate a, Coordinate b)
	{
		Coordinate c = new Coordinate();
		c.X = a.X + b.X;
		c.Y = a.Y + b.Y;
		return c;
	}
	
	public static void print(Coordinate p){ System.out.println("X: "+ p.X + " Y: " + p.Y);}
}
