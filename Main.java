/**
 *class Main 
 *
 * @author Fakhrul Razi
 * @version 0.1
 */
public class Main{
   
        public static void main (String args[]){
            kalkulator kalkul = new kalkulator();
            
            kalkul.name = "operator ";
            
            System.out.println("nilai 1 = "+ kalkul.x);
            System.out.println("nilai 1 = "+ kalkul.y);
            
            System.out.println(kalkul.name + "penjumlahan 4 + 2 = "+ kalkul.penjumlahan);
            System.out.println(kalkul.name + "pengurangan 4 - 2 = "+ kalkul.pengurangan);
            System.out.println(kalkul.name + "perkalian 4 * 2 = "+ kalkul.perkalian);
            System.out.println(kalkul.name + "pembagian 4 / 2 = "+ kalkul.pembagian);
        }
    }