import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean status = true;
        int harga = 0;
        int total = 0;
        do{

        System.out.println("List Menu Makanan & Minuman \n 1.Bakso Biasa = 13000 \n 2.Mie Ayam = 10000 \n 3.Bakso Bakar = 16000 \n 4.Pangsit = 5000 \n 5.Es Teh = 3000 \n 6.Es Jeruk = 3000 \n 7.Es Lemon Tea = 3000 ");
        System.out.println("Mau Pesan Apa? ");
        int menu = input.nextInt();
    
            switch(menu){
                case 1: 
                harga = 13000;
                total += harga;
                break;
                case 2:
                harga = 10000;
                total += harga;
                break;
                case 3:
                harga = 16000;
                total += harga;
                break;
                case 4:
                harga = 5000;
                total += harga;
                break;
                case 5:
                harga = 3000;
                total += harga;
                break;
                case 6:
                harga = 3000;
                total += harga;
                break;
                case 7:
                harga = 3000;
                total += harga;
                break;
                
                default:
                harga =0;
                break;

            }
            System.out.println("Apakah ada yang mau dipesan lagi?(ya/tidak)");
            String lagi = input.next();
            if(lagi.equalsIgnoreCase("Tidak")){
                status = false;
            }
            System.out.println("total: "+total);
        }while(status);

        System.out.println("Masukkan Pembayaran: ");
        int pembayaran = input.nextInt();
        if(pembayaran>total){
            System.out.println("Uang Anda Kembalian");
            int kembalian = pembayaran-total;
            System.out.println("Uang kembalian: "+kembalian);
        }
        else if(pembayaran<total){
            System.out.println("Uang Anda Kurang");
            int Kurang = total-pembayaran;
            System.out.println("Uang Kurang: "+Kurang);
        }
        else{
            System.out.println("Uang Anda Pas");
        }
        
    }
    
}
