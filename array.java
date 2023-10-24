public class array {

   public static void main(String[] args) {
      
      // String[] cars = {"Camaro", "Corvette", "Tesla", "Ram"};

      // cars[0] = "Mustang";

      // System.out.println(cars[3]);


      // Another way to write array.
      String[] cars = new String[3];

      cars[0] = "Camaro";
      cars[1] = "Tesla";
      cars[2] = "Ram";

      for(int i=0; i<cars.length; i++) {
         System.out.println(cars[i]);
      }


   }
   
}
