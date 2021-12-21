package ExamplePraograms;

public class Fibonacci {

	public static void main(String[] args) {
		int i,a=1,b=1,c=0,n=10;
		System.out.print(a);
		System.out.print(" "+b);
		for(i=0;i<n-2;i++) {
		    c=a+b;
		    a=b;
		    b=c;
		    System.out.print(" "+c);
		}
		System.out.println();
		System.out.print(n+"th number of the series is: "+c);
		
	}

}
