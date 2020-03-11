import javax.swing.JOptionPane;
public class ComprimentoStrings{

   public static void main (String [] args){
   
   String primeira = JOptionPane.showInputDialog("Qual a string 1 ");
   String segunda = JOptionPane.showInputDialog("Qual a string 2 ");
   String terceira = JOptionPane.showInputDialog("Qual a string 3 ");
   
   

   int length = primeira.length() + segunda.length() + terceira.length();
   
   JOptionPane.showMessageDialog(null, " o comprimento das strings e : " + length);
   
   }
}