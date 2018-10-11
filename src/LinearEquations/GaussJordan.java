package LinearEquations;

import java.util.Scanner;

public class GaussJordan {
	static Scanner sc = new Scanner(System.in);
     public GaussJordan(int n) {
		double a[][] = new double [n][n+1];
		//taking input
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n + 1 ; j++)
			{
				if(j == n)
				{
					System.out.println("Enter ethe value of constant b" + (i+1) + ": ");
					a[i][j] = sc.nextDouble();
					
				}
				else {
					System.out.println("Enter the coefficient of X" + (j+1) + " for " +" equation " + (i+1) + ": ");
					a[i][j] = sc.nextDouble();
				}
			}
		}
	//making an identity matrix
		for(int k = 0; k < n; k++)
		{
			for(int l = k + 1; l < n + 1; l++)
			{
				//dividing by pivot element
				a[k][l] = a[k][l] / a[k][k];
			}
			a[k][k] = 1;
			for(int i = 0; i < n; i++)
			{
				if(i==k)
				{
					continue;//becuase this the current row where we made the 1
				}
				else
				{	
					double temp = a[i][k];//the multiplying element to make 0 
					for(int j = 0; j < n+1; j++)
					{
						
						a[i][j] = a[i][j] - (a[k][j] * temp);
					}
				}	
				for(int m = 0; m < n; m++)
				{
					for(int r = 0; r < n+1 ; r++)
					{
						System.out.print(a[m][r]+ " \t");
					}
					System.out.println();
				}
			}
		}

	//output
		 System.out.println("Solution for Gauss Jordan is :");
			for(int m = 0; m < n; m++)
			{
				for(int r = 0; r < n+1 ; r++)
				{
					System.out.print(a[m][r]+ " \t");
				}
				System.out.println();
			}
}
}
