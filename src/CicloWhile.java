import javax.swing.JOptionPane;
public class CicloWhile {
    public static void main(String[]args){
        float estatura,imc;
        short peso;
        int alumno=1;
        while (alumno<=41){
            peso=Short.parseShort(JOptionPane.showInputDialog("Captura tu peso"));
            estatura=Float.parseFloat(JOptionPane.showInputDialog("Captura tu "
                    + "estatura en formato de metros"));
            imc=(float) (peso/(estatura*estatura));
            if(imc<18.49){
                JOptionPane.showMessageDialog(null,"peso bajo");
            }else if(imc>=18.49 && imc<= 24.99){
               JOptionPane.showMessageDialog(null,"peso normal"); 
            }else if(imc>=25 && imc<= 29.99){
                JOptionPane.showMessageDialog(null,"sobrepeso");
            }else if(imc>=30 && imc<= 34.99){
               JOptionPane.showMessageDialog(null,"obesidad leve"); 
            }else if(imc>=35 && imc<= 39.99){
                JOptionPane.showMessageDialog(null,"obesidad media");
            }else{
                JOptionPane.showMessageDialog(null,"obesidad morbida");
            }
            alumno++;
        }
    }
    
}
