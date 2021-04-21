/**
 * class Main 
 *
 * @author Fakhrul Razo
 * @version 0.1
 */
public class Main
{
    public static void main(String args[])
    {
       System.out.println(Calculator.info);
       
    Calculator calculator1 = new Calculator();
    Calculator calculator4 = new Calculator();
    Calculator calculator2 = new Calculator(3,5);
    Calculator calculator3 = new Calculator(3);
       
       System.out.println("Nilai awal setelah konstruktor dipanggil");
       System.out.println("Nilai op2 Constructor tanpa parameter: "+calculator1.op2);
       System.out.println("Nilai op2 Constructor dengan 2 parameter: "+calculator2.op2);
       System.out.println("Nilai op2 Constructor dengan 3 parameter: "+calculator3.op2);
       
       System.out.println("Nilai op1 Constructor tanpa parameter: "+calculator1.getOp1());
       System.out.println("Nilai op1 Constructor dengan 2 parameter: "+calculator2.getOp1());
       System.out.println("Nilai op1 Constructor dengan 3 parameter: "+calculator3.getOp1());
        
       System.out.println("");
       System.out.println(Calculator.jumlahobject);
       
       System.out.println("");
       double hasil1 = calculator1.jumlah();
       double hasil2 = calculator1.jumlah(6, 2);
       System.out.println("Hasil penjumlahan method jumlah tanpa parameter: "+ hasil1);
       System.out.println("Hasil penjumlahan method jumlah dengan parameter: "+ hasil2);
       
       System.out.println("");
       double kurang1 = calculator1.kurang();
       double kurang2 = calculator1.kurang(6, 2);
       System.out.println("Hasil pengurangan method kurang tanpa parameter:  " + kurang1);
       System.out.println("Hasil pengurangan  method kurang dengan parameter:  "+ kurang2);
       
       System.out.println("");
       double perkalian1 = calculator1.perkalian();
       double perkalian2 = calculator1.perkalian(6, 2);
       System.out.println("Hasil perkalian method kali tanpa parameter:  " + perkalian1);
       System.out.println("Hasil perkalian  method kali dengan parameter:  "+ perkalian2);
       
       System.out.println("");
       double pembagian1 = calculator1.pembagian();
       double pembagian2 = calculator1.pembagian(6, 2);
       System.out.println("Hasil pembagian method bagi tanpa parameter:  " + pembagian1);
       System.out.println("Hasil pembagian  method bagi dengan parameter:  "+ pembagian2);
       
    }
    
}