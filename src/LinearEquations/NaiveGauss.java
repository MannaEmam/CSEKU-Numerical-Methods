package LinearEquations;
import java.util.Scanner;
public class NaiveGauss {
	static Scanner sc = new Scanner(System.in);
	public double a[] [];
	public double b[];
	public double output[];
	public int n;
	public double factor;
	//taking input
	public void Input() {
		System.out.println("Please enter the number of equations: ");
		n = sc.nextInt();
		double a[][] = new double [n][n];
		 double b[] = new double [n];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n ; j++)
			{
				System.out.println("Enter the coefficient of X" + (j+1) + " for " +" equation " + (i+1) + ": ");
				a[i][j] = sc.nextDouble();
			}
			System.out.println("Enter the value of constant b" + (i+1) + ": ");
			b[i] = sc.nextDouble(); 
		}
		forwardElimination(a,b,n);
	}
	//forward elimination
	public void forwardElimination(double a[][],double b[],int n)
	{
		for(int k = 0; k < n-1; k++)//outer loop controls how many times the forward elimination have to do
		{
			for(int i = k+1; i < n; i++)
			{
				 factor = a[i][k] / a[k][k];//the co-efficient of current equation/coeeficient of previous equation
				for(int j = k+1; j < n; j++)
				{
					a[i][j] = a[i][j] - factor * a[k][j];//multyplying the previous corresponding x terms coefficient with factor and subtracting it from current equation
				}
				b[i] = b[i] - factor * b[k];
			}
		}
		backwardSubstitution(a,b,n);
	}
	//backward substitution
	public void backwardSubstitution(double a[][],double b[],int n)
	{
		 double output[] = new double [n];
		output[n-1] = b[n-1] / a[n-1][n-1];//assigning the lasts x term value in the last index of output
		for(int i = n-2; i >= 0; i--)
		{
			double sum = b[i];//assigning coefficient value in sum 
			for(int j = i + 1; j < n; j++)
			{
				sum = sum - a[i][j] * output[j];//subtracting each x terms from the constant
			}
			output[i] = sum / a[i][i];//then divide it by the unknowns x terms coefficient
		}
		Output(output);
	}
	//output
	 public void Output(double output[])
	{
		System.out.println("Solution for Naive Gauss is :");
		 for(int i = 0; i < n; i++)
		{
			System.out.println("X" + (i+1) +" = "+ output[i]);
		}
	}
}
