import java.util.Scanner;

public class mathClass {
   public static void main(String[] args) {

      /*double x = 3.14;
      double y = -10;

      double z = Math.max(x, y);
      double t = Math.min(x, y);
      double m = Math.abs(y);
      double n = Math.sqrt(x);
      double o = Math.round(x);
      double p = Math.ceil(x);
      double l = Math.floor(x);

      System.out.println(z);
      System.out.println(t);
      System.out.println(m);
      System.out.println(n);
      System.out.println(o);
      System.out.println(p);
      System.out.println(l);*/

      //Getting Hypotenuse

      double x;
      double y;
      double z;

      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter Side x: ");
      x = scanner.nextDouble();

      System.out.println("Enter Side y: ");
      y = scanner.nextDouble();

      z = Math.sqrt((x*x)+(y*y));

      System.out.println("The hypotenuse is: "+z);

      scanner.close();
   }
}
