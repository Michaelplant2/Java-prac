import java.util.*;

public class twoArrayList {

   public static void main(String[] args) {
      
      ArrayList<ArrayList<String>> groceryList = new ArrayList();

      ArrayList<String> bakeryList = new ArrayList();
      bakeryList.add("Pasta");
      bakeryList.add("Bread");
      bakeryList.add("Donuts");

      ArrayList<String> produceList = new ArrayList();
      produceList.add("Tomatoes");
      produceList.add("Zucchini");
      produceList.add("Peppers");

      ArrayList<String> drinkList = new ArrayList();
      drinkList.add("Soda");
      drinkList.add("Coffee");

      groceryList.add(bakeryList);
      groceryList.add(produceList);
      groceryList.add(drinkList);

      System.out.println(groceryList.get(0).get(2));

   }
   
}
