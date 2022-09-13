
public class Array {
	
  public static void main(String[] args)
  {
	  int a[]= {1,2,3,4,5};
	  int esum=0;
	  int osum=0;
	  int ld;
	  
	  for(int i=0; i<a.length; i++)
	  {
		  ld=a[i]%10;
		  if(ld%2==0)
		  {
			  esum=esum+ld;
		  }
		  else
		  {
			  osum=osum+ld;  
		  }
	  }  
	  System.out.println(esum);
	  System.out.println(osum);
	  
  }
  
}
