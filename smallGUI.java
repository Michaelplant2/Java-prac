import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class smallGUI {
   public static void main(String[] args) {

      String name = JOptionPane.showInputDialog("Enter Your Name");
      JOptionPane.showMessageDialog(null, "Hello "+name);

      int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
      JOptionPane.showMessageDialog(null, "You are "+age+" years old");
      
      double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height In Inches"));
      JOptionPane.showMessageDialog(null, "You are "+height+" inches tall");
   }
}