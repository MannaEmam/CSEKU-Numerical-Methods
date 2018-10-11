package LinearEquations;

import java.util.Scanner;

public class InputOutput {
	static Scanner sc = new Scanner(System.in);
	public static  double a[] [];
	public  static double b[];
	public  static double output[];
	public  static int n;
 public InputOutput()
 {
		System.out.println("Please enter the number of unknown terms: ");
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
			System.out.println("Enter ethe value of constant b" + (i+1));
			b[i] = sc.nextDouble(); 
		}
 }
 public InputOutput(double output[])
{
	for(int i = 0; i < n; i++)
	{
		System.out.println("X " + (i+1) + output[i]);
	}
}
}
