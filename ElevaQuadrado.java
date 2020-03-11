import javax.swing.JOptionPane;
public class ElevaQuadrado{

   public static void main (String [] args){
   
   double base = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero a ser elevado ao quadrado : "));
  
   double resultado = Math.pow(base, 2);
  
   JOptionPane.showMessageDialog(null, "a base ao quadrado  e : " + resultado);

    
   }
}