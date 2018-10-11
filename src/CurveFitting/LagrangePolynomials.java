package CurveFitting;
import java.util.Scanner;
public class LagrangePolynomials {
	  static Scanner sc = new Scanner(System.in);
	  public     int n,i,j;
	  public double k = 0,a;
	  public LagrangePolynomials(int n)
	  {
			double x[] = new double [n+1];
			double y[] = new double [n+1];
			for(i = 0; i <=n ; i++)
			{
			    System.out.println("Enter the value of x" + i + ": ");
				x[i] = sc.nextDouble();
			    System.out.println("Enter the value of f(x" + i + "): ");
				y[i] = sc.nextDouble();
			}
		    System.out.println("Enter the value of x in f(x) you want to evaluate : ");		
			a = sc.nextDouble();
	        for(i=0; i<=n; i++)
	        {
	            double s=1;
	            double t=1;
	            for(j=0; j<=n; j++)
	            	
	            {
	                if(j!=i)
	                {
	                    s=s*(a-x[j]);
	                    t=t*(x[i]-x[j]);
	                }
	            }
	            k=k+((s/t)*y[i]);
	        }
		    System.out.println("Output for Lagrange Interpolating Polynomials f("+ a + ") = " + k);	        
	  }
}
