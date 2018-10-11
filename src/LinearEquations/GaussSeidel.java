package LinearEquations;
public class GaussSeidel {

	public GaussSeidel (int n,double a[][],double b[], double x[],double es)
	{
		int flag;
		for(int i = 0; i < n; i++)
		{
			double dummy = a[i][i];
			for(int j = 0; j < n; j++) 
			{
				a[i][j] = a[i][j] / dummy;
			}
			b[i] = b[i] / dummy;//dividing both x terms coefficient and constant with xi's terms coefficient
		}
		for(int i = 0; i < n; i++)
		{
			double sum = b[i];
			for(int j = 0; j < n; j++) 
			{
				if(i != j)
				{
					sum = sum - a[i][j] * x[j];//assuming other terms 0 except the xi term
				}
			}
			x[i] = sum;
		}
		int iter = 2;
		double ea = 0;
		//substituting the value of x that we get after setting each value of x term = 0
		do {
			flag = 1;
			for(int i = 0; i < n; i++)
			{			flag = 1;
				double sum = b[i];
				double old = x[i];
				for(int j = 0; j < n; j++) 
				{
					if(i != j)
					{
						sum = sum - a[i][j] * x[j];//substituting the value of x terms  that we get previously except the ith term
					}
				}
				x[i] = sum;
				if(flag == 1 && x[i] != 0)
				{
					 ea = Math.abs((x[i] - old) / x[i]) * 100;
				}
				if (ea < es) 
				{
					flag = 0;
				}
			}
			iter += 1;
		} while (flag == 1);
		//output
		System.out.println("Solution for Gauss Seidel is :");
		 for(int i = 0; i < n; i++)
		{
			System.out.println("X" + (i+1) +" = "+ x[i]);
		}
			System.out.println("Number of iteration: " + iter);
	}
}
