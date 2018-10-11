package methods;

public class FixedPoint {

		  public void fixedPoint(double p0,double tol ,int no)
		  {
		  double p;
		  int i=1;
	        while (i<=no){
	            p = g(p0);
	            //ea = Math.abs(p-p0) / p * 100;
	            if(Math.abs(p-p0) < tol)
	                break;
	           if(i <= no)
	            {
	            	System.out.printf("Iteration %d: x = %f\n", i, p);
	            }

	            i++;
	            p0 = p;

	            if(i>no)
	                System.out.printf("Method failed after %d iterations\n", no);
	        }
	    }
	    static double g(double x){
	        return ((-11+17*x*x-2.5*x*x*x)/22);
	    }
	    static double f(double x){
	    	return (-11-22*x+17*x*x-2.5*x*x*x);
}
	  }
