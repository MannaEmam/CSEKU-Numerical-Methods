package integral;

public class RombergIntegral {
	public int n;
	public double a,b,integration,h; 
	  public RombergIntegral(double a,double b, double tvalue)
	  {
		double in[] = new double [5];
		in[1] = trapezoidal(1,a,b);
	    in[2] = trapezoidal(2,a,b);
	    in[3] = trapezoidal(4,a,b);
	    in[4] = trapezoidal(8,a,b);

	    System.out.println("O(h2) : ");
	    System.out.println("I = " + in[1] + "\tEt = " + Math.abs((((tvalue-in[1])/tvalue)*100)) + "%");
	    System.out.println("I = " + in[2] + "\tEt = " + Math.abs((((tvalue-in[2])/tvalue)*100)) + "%");
	    System.out.println("I = " + in[3] + "\tEt = " + Math.abs((((tvalue-in[3])/tvalue)*100)) + "%");
	    System.out.println("I = " + in[4] + "\tEt = " + Math.abs((((tvalue-in[4])/tvalue)*100)) + "%");
	    //for O(h4)
	    in[1]=(((4*in[2])/3)-(in[1]/3));
	    in[2]=(((4*in[3])/3)-(in[2]/3));
	    in[3]= (((4*in[4])/3)-(in[3]/3));
	    System.out.println("O(h4) : ");
	    System.out.println("I = " + in[1] + "\tEt = " + Math.abs((((tvalue-in[1])/tvalue)*100)) + "%");
	    System.out.println("I = " + in[2] + "\tEt = " + Math.abs((((tvalue-in[2])/tvalue)*100)) + "%");
	    System.out.println("I = " + in[3] + "\tEt = " + Math.abs((((tvalue-in[3])/tvalue)*100)) + "%");
//for O(h6)
	    in[1]= ((16*in[2])/15-(in[1]/15));
	    in[2]= ((16*in[3])/15-(in[2]/15));
	    System.out.println("O(h6) : ");
	    System.out.println("I = " + in[1] + "\tEt = " + Math.abs((((tvalue-in[1])/tvalue)*100)) + "%");
	    System.out.println("I = " + in[2] + "\tEt = " + Math.abs((((tvalue-in[2])/tvalue)*100)) + "%");
	    //again for O(h2)
	    /*
	    System.out.println("O(h2) : ");
	    System.out.println("I = " + in[1] + "\tEt = " + (((tvalue-in[1])/tvalue)*100) + "%");
	    System.out.println("I = " + in[2] + "\tEt = " + (((tvalue-in[2])/tvalue)*100) + "%");
	    System.out.println("I = " + in[3] + "\tEt = " + (((tvalue-in[3])/tvalue)*100) + "%");
	    System.out.println("I = " + in[4] + "\tEt = " + (((tvalue-in[4])/tvalue)*100) + "%");
	    */
	    //O(h6) to O(h8)
	    in[1]= ((64*in[2])/63-(in[1]/63));
	    System.out.println("O(h8) : ");
	    System.out.println("I = " + in[1] + "\tEt = " + Math.abs((((tvalue-in[1])/tvalue)*100)) + "%");
	  }
public	double Function(double x)
	{
	    return ( 0.2 + 25*x-200*Math.pow(x,2)+675*Math.pow(x,3)-900*Math.pow(x,4)+400*Math.pow(x,5) );

	}

public	double trapezoidal(int n,double a, double b){

	    h = (b-a)/n;

	    double mids = 0.0 ;
	    for(int i=1;i<=n-1;i++){
	        mids+=Function(h*i);
	    }
	    return ((b-a)*(Function(a)+2*mids+Function(b)))/(2*n);

	}
}
