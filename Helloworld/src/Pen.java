
public class Pen 
{
	private String name;
	private String colour;
	private String brand;
	private double cost;

	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getcolour()
	{
		return colour;
	}
	public void setcolour(String colour)
	{
		this.colour=colour;
	}
	public String getbrand()
	{
		return brand;
	}
	public void setbrand(String brand)
	{
		this.brand=brand;
	}
	public double getcost()
	{
		return cost;
	}
	public void setcost(double cost)
	{
	    this.cost=cost;
	}
	Pen(String name,String colour,String brand,double cost)
	{
		this.name=name;
		this.colour=colour;
		this.brand=brand;
		this.cost=cost;
	}
	public void work()
	{
		System.out.println(name+" pen is colour "+colour);
	}
}

