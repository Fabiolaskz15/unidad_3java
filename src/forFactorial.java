import javax.swing.JOptionPane;
public class forFactorial {
    public static void main(String[]args){
    byte numero,x;
    byte resp;
    int fact=1;
    do{
     fact=1;
    numero= Byte.parseByte(JOptionPane.showInputDialog("Escribe un numero"));
    for(x=numero;x>=1;x--){
        fact*=x;
        
    }
    JOptionPane.showMessageDialog(null, "El factorial de "+ numero+" es: "+fact);
    resp=Byte.parseByte(JOptionPane.showInputDialog("captura 1 si deseas realizar"
            + " otro calculo"));
    }while(resp==1);
    
}
    
    
}
