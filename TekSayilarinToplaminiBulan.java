import java.util.Scanner;
public class TekSayilarinToplaminiBulan {
    public static void main(String[] args) {
        int n;
        int toplam = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("Sayi giriniz : ");
            n  = scan.nextInt();
            if(n % 2 == 1){
                toplam += n;
            }
        }while(n > 0);
        System.out.println("Toplam "+ toplam);
        scan.close();
    }
}
