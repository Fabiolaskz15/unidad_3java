import javax.swing.JOptionPane;
public class SelectivoSwitch {
    public static void main(String[]vane){
        // declaracion de variables 
        byte opcion;
        byte b,h,r;
        double a;
        opcion= Byte.parseByte(JOptionPane.showInputDialog("MENU DE OPCIONES \n "
                + "1.- TRIANGULO \n 2.- RECTANGULO\n 3.-CIRCULO \n "
                + "ESCRIBE EL NUMERO DE TU SELECCION"));
        
        switch (opcion){
            case 1: 
                b= Byte.parseByte(JOptionPane.showInputDialog("ingresa el valor "
                        + "de la base"));
             h= Byte.parseByte(JOptionPane.showInputDialog("ingresa la altura "));
             a=(b*h)/2;
            JOptionPane.showMessageDialog(null,"el arean de tu triangulo es "+ a);
                break;
            case 2: 
                b= Byte.parseByte(JOptionPane.showInputDialog("ingresa el valor "
                        + "de la base"));
        h= Byte.parseByte(JOptionPane.showInputDialog("ingresa la altura "));
                a=b*h;
            JOptionPane.showMessageDialog(null,"el area del rectangulo es "+ a);
                break;
            case 3:    r= Byte.parseByte(JOptionPane.showInputDialog("ingresa el "
                    + "radio del circulo"));
                a= Math.PI*(r*r);
            JOptionPane.showMessageDialog(null,"el area del circulo es "+ a);
                break;
            default: JOptionPane.showMessageDialog(null,"solo es posible seleccionar "
                    + "1,2 o 3\n intente nuevamente");
            
        }
    }//cierra el metodo main
    
}// cierra la clase 
