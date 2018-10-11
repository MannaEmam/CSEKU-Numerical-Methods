package methods;
public class BisectionMethod {
    int count = 1;
    double temp;
    double Ea;

       public void BMethod(double Xi, double Xu, double Es){
           while(true) {

               double Xr = (Xi + Xu) / 2;
         //      double Et = ETRelativeError(tvalue, Xr);
               if(count == 1)
                   System.out.println(count+"     "+Xi+"    "+Xu+"    "+Xr+"    'no Ea'      ");
               else {
                   Ea = Math.abs(EaApproximateError(Xr, temp));
                   System.out.println(count+"     "+Xi+"    "+Xu+"    "+Xr+"     "+Ea+"      ");
                   if(Ea < Es)
                       break;
               }
               double mul = FValue(Xi) * FValue(Xr);
               if (mul < 0) {
                   Xu = Xr;
               } else {
                   Xi = Xr;
               }
               temp = Xr;

               count++;
           }
       }
       public double FValue(double c){
           double r = (-26 + 82.3 * c - 88*c*c + 45.4 * c* c* c - 9* c* c* c* c + 0.65* c* c* c* c* c);
           return r;
       }

       /*public double ETRelativeError(double t, double a){
           return ((t - a)/t)*100;
       }*/

       public double EaApproximateError(double now, double old){
           return ((now-old)/now)*100;
       }
}
