package CurveFitting;
import java.util.Scanner;
public class NewtonsPolynomials {
	  static Scanner sc = new Scanner(System.in);
	  public     int i,j=1;
	  public double f1,f2=0.0,k,f=0;
	  public NewtonsPolynomials(int n)
	  {
			double x[] = new double [n+1];
			double y[] = new double [n+1];
			double p[] = new double [n+1];
			for(i = 0; i <=n ; i++)
			{
			    System.out.println("Enter the value of x" + i + ": ");
				x[i] = sc.nextDouble();
			    System.out.println("Enter the value of f(x" + i + "): ");
				y[i] = sc.nextDouble();
			}
		    System.out.println("Enter the value of x in f(x) you want to evaluate : ");		
			k = sc.nextDouble();
		    f=y[0];			
		    do
		    {
		        for (i = 0; i<n; i++)
		        {
		            p[i] = ((y[i+1]-y[i])/(x[i+j]-x[i]));
		            y[i] = p[i];
		        }
		        f1=1;
		        for(i = 0;i <j ;i++)
		            {
		                f1 *= (k-x[i]);
		            }
		        f2 += (y[0]*f1);
		        n--;
		        j++;
		    }

		    while(n!=0);
		    f += f2;
		    System.out.println("Output for Newton's Divided-Difference Interpolating Polynomials f("+ k + ") = " + f);
	  }
}
