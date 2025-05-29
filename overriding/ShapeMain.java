class Shape
{
	String colour;

	Shape(){}

	Shape(String colour){ this.colour = colour ;}

	public double area()
	{
		return 0.0d;
	}

	public void display()
	{
		System.out.println("Shape has some display");
	}
}

class Circle extends Shape
{
	double radius;
	Circle(double radius,String colour)
	{
		super(colour);
		this.radius = radius;
	}

	@Override
	public double area()
	{
		double res = 3.14d * radius * radius ;
		return res;
	}

	@Override
	public void display()
	{
		System.out.println("Circle is of area "+area()+" of colour :"+colour+" and radius :"+radius);
	}
}

class Rectangle extends Shape
{
	int length;
	int breadth;
	Rectangle(int length,int breadth,String colour)
	{
		super(colour);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area()
	{
		double res = length * breadth;
		return res;
	}

	@Override
	public void display()
	{
		System.out.println("Rectangle is of area "+area()+" of colour :"+colour+" and length :"+length+" breadth :"+breadth);
	}

}

class ShapeMain
{
	public static void main(String[] args) 
	{
		Shape s;

		s = new Circle(4,"Red");
		s.display();

		System.out.println("-------------");

		s = new Rectangle(2,5,"Rainbow");
		s.display();	
	}
}