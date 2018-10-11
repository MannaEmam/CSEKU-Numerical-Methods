package CurveFitting;
import java.util.Scanner;
public class LinearRegression {
	static Scanner sc = new Scanner(System.in);
 public LinearRegression(int n)
 {
	 double x[] = new double [n];
	 double y[] = new double [n];
	 double sumx = 0,sumy = 0,sumxy = 0,sumx2 = 0,xm = 0,ym= 0,a0 = 0, a1 = 0;
	 for(int i = 0; i < n; i++)
	 {
		System.out.println("Enter x" + (i+1) + " : ");
		x[i] = sc.nextDouble();
		sumx += x[i];
		sumx2 += x[i] * x[i];
		System.out.println("Enter y" + (i+1) + " : ");
		y[i] = sc.nextDouble();
		sumy += y[i];
		sumxy += x[i] * y[i];
	 }
	 xm = sumx/n;
	 ym = sumy/n;
	 a1 = (n*sumxy - sumx*sumy) / (n*sumx2 - sumx*sumx);
	 a0 = ym - a1*xm;
	 System.out.println("y = " + a0 +" + " + a1 + "x");
 }
}
