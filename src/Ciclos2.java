import javax.swing.JOptionPane;
public class Ciclos2 {
     public static void main(String[]args){
         int res;
         for (int a = 1; a <= 10; a++) {
             System.out.print("TABLA DE: "+a );
             System.out.print("     " );
         }
             for (int a = 1; a<= 10; a++) {
                 System.out.println("      ");
                 for (int b = 1; b <= 10; b++){
                 res= a*b;
                 System.out.print(b+" * "+a+" = "+res+"\t");
                 
             }
             
         }
     }
    
}
