public class Strong {
    
	public static void main(String[] args) {
		int num=145,num1=num,ld,f,sum=0;
		
		while(num>0)//145>0=t//14>0=t//1>=t
		{
			ld=num%10;//5//4//1
			f=factorial(ld);//f(5)=120//f(4)==24//f(1)=1
			sum=sum+f;//120//120+24=144//144+1=145
			num=num/10;//14//1////0
		}
		if(sum==num1){
			System.out.println(" Strong number");
		}
		else {
			System.out.println(" not a Strong number");
		}
	}
	public static int factorial(int n) {
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;//5*4*3*2*1=120//4*3*2*1=24//1
		}
		return fact;
	}
}
