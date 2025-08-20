import java.util.Scanner;

public class PercabanganSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Warna Lampu");
        String lampu = input.next();
        
        switch (lampu) {
            case "merah":
                System.out.println("Anda harus berhenti");
                break;
            case "kuning":
                System.out.println("Anda siap siap ya");
                break;
            case "hijau":
                System.out.println("Anda boleh jalan");
                break;
            default:
                System.out.println("Salah ketik yaa");
                break;
        }
    }
}
