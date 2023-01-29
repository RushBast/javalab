import java.io.*;
import java.util.*;

class quadratic{
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a b c");

            double b=sc.nextDouble();
            double a=sc.nextDouble();
            double c=sc.nextDouble();
            double d = b*b-4*a*c;
            if (d>0){
                double r1=((-b+Math.pow(d, 0.5))/2*a);
                double r2=((-b-Math.pow(d, 0.5))/2*a);
                System.out.println("The roots are"+r1+"  "+r2);
            }
            else if (d==0){
                double r=(b/2*a);
                System.out.println("The roots are "+r);
            }
            else{
                System.out.println("roots are imaginary");
            }
        } finally{
            sc.close();
        }
    }
}
