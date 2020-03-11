 import javax.swing.JOptionPane;
public class AreaRetangulo{

   public static void main (String [] args){
   
   double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retangulo: "));
   
   double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retangulo: "));
   

   
   double area = (base * altura);
   
   JOptionPane.showMessageDialog(null, "A area do triangulo e : " + area);
   
   }
}
