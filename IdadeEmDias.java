import javax.swing.JOptionPane;
public class IdadeEmDias{

   public static void main (String [] args){
   
   int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade em anos: "));
   
   
   
   int idadeDias = (idade * 365);
   
   JOptionPane.showMessageDialog(null, "sua idade em dias é :" + idadeDias);
   
   }
}
