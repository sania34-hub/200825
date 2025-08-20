import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Harga Pembelian ");
        double pembelian = input.nextDouble();
        
        if(pembelian > 250000){
            System.out.println("dapat diskon 10%");
        }else{
            System.out.println("Mohon maaf anda tidak mendapatkan diskon");
        }

        System.out.println("Terima Kasih sudah berbelanja");
    }
    
}
