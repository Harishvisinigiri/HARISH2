
public class Driver1 
{
	public static void main(String[] args)
	{
		Pen p1 = new Pen("octane","blue","china",50.0);
		Pen p2 = new Pen("cello","green","japan",50.0);
		Pen p3 = new Pen("pentonic","red","india",50.0);
		p1.setcost(60);// modifying value of variable
        displayDetails(p1);
	    displayDetails(p2);
		displayDetails(p3);
	}
	public static void displayDetails(Pen p)
	{
		System.out.println("name :"+p.getname());//reading value of variable
	    System.out.println("colour :"+p.getcolour());
		System.out.println("brand :"+p.getbrand());
		System.out.println("cost :"+p.getcost());
		p.work();
		System.out.println("---------------------------------");
	}
}

