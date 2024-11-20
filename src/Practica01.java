import javax.swing.JOptionPane;
public class Practica01 {
    public static void main(String [] args){
        byte color;
        double costo , total;
        costo= Double.parseDouble(JOptionPane.showInputDialog("ingrese el costo a pagar"));
        JOptionPane.showMessageDialog(null, "Rojo=1\nVerdes=2\nAzul=3\nAmarillo=4");
        color= Byte.parseByte(JOptionPane.showInputDialog("ingrese el numero de el color"));
        if(color==1){
            total=costo-(costo*(40.0/100.0));
            JOptionPane.showMessageDialog(null,"descuento: 40%\ncosto: "+ total+""
                    + "\n color asignado: Rojo");
        }else if(color==2){
            total=costo-(costo*(28.0/100.0));
            JOptionPane.showMessageDialog(null,"descuento: 28%\ncosto: "+ total+""
                    + "\n color asignado: Verde");
        }else if(color==3){
            total=costo-(costo*(15.0/100.0));
            JOptionPane.showMessageDialog(null,"descuento: 15%\ncosto: "+ total+""
                    + "\n color asignado: Azul");
        }else if(color==4){
            total=costo-(costo*(5.0/100.0));
            JOptionPane.showMessageDialog(null,"descuento: 5%\ncosto: "+ total+""
                    + "\n color asignado: Amarillo");
        }else{
            JOptionPane.showMessageDialog(null,"error, vuelve a intentarlo");
        }
        }
    }