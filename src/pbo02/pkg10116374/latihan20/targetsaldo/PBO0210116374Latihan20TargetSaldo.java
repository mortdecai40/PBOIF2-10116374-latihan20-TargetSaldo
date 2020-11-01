package pbo02.pkg10116374.latihan20.targetsaldo;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/** @author
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk menghitung target saldo yang diinginkan
 *
 */
public class PBO0210116374Latihan20TargetSaldo {
     public static void targetSaldoTabungan(double saldoAwal, double bunga){
        double saldoAkhir = 0,
               bungabulan;
        int i = 1;
        
        //Format number
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        bungabulan = bunga/100;
        
        while(saldoAkhir <= 6000000){
            saldoAkhir = (saldoAwal * bungabulan) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " %s %n", kursIndonesia.format(saldoAkhir));
            saldoAwal = saldoAkhir;
            i++;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal, bunga;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan saldo awal : ");
        saldoAwal = keyboard.nextDouble();
        
        System.out.print("Masukkan bunga/bulan(8%) : ");
        bunga = keyboard.nextInt();
        
        System.out.println("");
        targetSaldoTabungan(saldoAwal, bunga);
    }
    
}
