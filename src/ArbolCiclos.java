import javax.swing.JOptionPane;
public class ArbolCiclos {
    public static void main(String[]args){
        int altura=20;
        System.out.println("             FELIZ NAVIDAD\n");
        for (int fil = 0; fil < altura; fil++) {
            for (int es=0; es<(altura-fil-1); es++) {
                System.out.print(" ");
            }
                for (int As = 0; As < (fil*2)+1; As++) {
                    System.out.print("\u001B[32m*");
                    
            }
            System.out.println("");
        }
        int largoT=3;
        for (int base= 0; base < largoT; base++) {
            
        for (int es = 0; es < (altura-2); es++) {
            System.out.print(" ");
            
        }
            for (int tron = 0; tron < 4; tron++) {
                System.out.print("\033[35m|");
                
            }
            System.out.println("");
        }
    
    }
   
}
 

