package methods;
import java.util.Scanner;
import CurveFitting.*;
import LinearEquations.*;
import integral.*;
public class MainMethod {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter an option :\n1. Bracketing Methods\n2. Open Methods\n3. Linear Equations\n4. Curve Fitting\n5. Integral");
            //Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Please choose a method from Bracketing Methods :\n1. Bisecting Method\n2. The False Position Method");
                choice = sc.nextInt();
                if (choice == 1) {
                    BisectionMethod bm = new BisectionMethod();

                    System.out.print("\nEnter the lower Value Xi : ");
                    double Xi = sc.nextDouble();

                    System.out.print("\nEnter the upper Value Xu : ");
                    double Xu = sc.nextDouble();
                    System.out.print("\nEnter the Error Criterion Es : ");
                    double Es = sc.nextDouble();
                    //System.out.print("\nEnter the True Value for Compute the True Percent Relative Error : ");
                    //double tvalue = sc.nextDouble();
                    System.out.println("\nIter.     Xi      Xu       Ea        ");
                    bm.BMethod(Xi, Xu,Es);
                } else if (choice == 2) {
                    FalsePositionMethod fpm = new FalsePositionMethod();

                    System.out.print("\nEnter the lower Value Xi : ");
                    double Xi = sc.nextDouble();

                    System.out.print("\nEnter the upper Value Xu : ");
                    double Xu = sc.nextDouble();
                    System.out.print("\nEnter the Error Criterion Es : ");
                    double Es = sc.nextDouble();
                    System.out.print("\nEnter the True Value for Compute the True Percent Relative Error : ");
                    double tvalue = sc.nextDouble();

                    System.out.println("\nIter.         Xi           Xu          Xr          Ea                 Et");
                    fpm.FMethod(Xi, Xu, tvalue, Es);
                }

            } else if (choice == 2) {
            	System.out.println("Please choose a method from open Methods :\n1. Fixed Point Iteration Method\n2. Newton Raphson Method");
            	choice = sc.nextInt();
            	if(choice == 1)
            	{
            		FixedPoint fp = new FixedPoint();
            		System.out.println("Enter approximate p: ");
        	        double p0 = sc.nextDouble();

        	        System.out.println("Desired Tolerance: ");
        	        double tol = sc.nextDouble();

        	        System.out.println("Maximum Iterations: ");
        	        int no = sc.nextInt();
        	        fp.fixedPoint(p0, tol, no);
        	              
            	}
            	if(choice == 2)
            	{
            		System.out.println("Sorry the method is not implemented.");
            	}
            } 
            else if(choice == 3)
            {
        		System.out.println("Please choose a method for solving liner equations:\n1. Naive Gauss\n2. Gauss Jordan\n3. Gauss Seidel");
        		choice = sc.nextInt();
        		if(choice == 1)
        		{
            	NaiveGauss ng = new NaiveGauss();
        		ng.Input();
        		}
        		else if(choice == 2)
        		{
        			System.out.println("Please enter the number of equations: ");
        			int n = sc.nextInt();
        			GaussJordan gj = new GaussJordan(n);
        		}
        		else if(choice == 3)
        		{
        			System.out.println("Please enter the number of equations: ");
        			int n = sc.nextInt();
        			double a[][] = new double [n][n];
        			 double b[] = new double [n];
        			 double x[] = new double [n];
        			for(int i = 0; i < n; i++)
        			{
        				for(int j = 0; j < n ; j++)
        				{
        					System.out.println("Enter the coefficient of X" + (j+1) + " for " +" equation " + (i+1) + ": ");
        					a[i][j] = sc.nextDouble();
        				}
        				System.out.println("Enter the value of constant b" + (i+1) + ": ");
        				b[i] = sc.nextDouble();
        				x[i] = 0;
        			}
        			System.out.println("Enter es: ");
        			double es = sc.nextDouble();
        			//System.out.println("Enter maximum number of iterations: ");
        			//int imax = sc.nextInt();
        			GaussSeidel gs = new GaussSeidel(n, a, b, x, es);	
        		}
        		
            }
            else if(choice == 4)
            {
            	System.out.println("Please choose a method :\n1. Linear Regression\n2. Newton's Divided-Difference Interpolating Polynomials\n3. Lagrange Interpolating Polynomials");
            	choice = sc.nextInt();
            	if(choice == 1)
            	{
            		System.out.println("Enter the value of n: ");
            		int n = sc.nextInt();
            		LinearRegression lr = new LinearRegression(n);
            	}
            	else if(choice == 2)
            	{
            		System.out.println("Enter the number of order: ");
            		int n = sc.nextInt();
            		NewtonsPolynomials np = new NewtonsPolynomials(n);
            	}
            	else if(choice == 3)
            	{
            		System.out.println("Enter the number of order: ");
            		int n = sc.nextInt();
            		LagrangePolynomials lP = new LagrangePolynomials(n);
            	}
            	
            }
            else if(choice == 5)
            {
            	System.out.println("Please choose a method :\n1. Romberg Integration");
            	choice = sc.nextInt();
            	if(choice == 1)
            	{
            		System.out.println("Enter the value of a: ");
            		double a= sc.nextDouble();
            		System.out.println("Enter the value of b: ");
            		double b= sc.nextDouble();
            		System.out.println("Enter the true value: ");
            		double tvalue= sc.nextDouble();
            		RombergIntegral RI = new RombergIntegral(a, b, tvalue);
            	}
            	
            }
            	else {
                System.out.println("Invalid input\n");
                
            }
        }
    }
}


