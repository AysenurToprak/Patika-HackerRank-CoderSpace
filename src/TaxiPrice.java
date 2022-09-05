import java.util.Scanner;

public class TaxiPrice {
    public static void main(String[] args) {
        int km;
        double total;
        double perkm = 2.20;
        Scanner scanner = new Scanner(System.in);
        System.out.println("mesafe giriniz");
        km = scanner.nextInt();
        total = (km*perkm);
        total += 10;

        if (total<20){
            System.out.println("ödeme tutatarı 20 tl");
        }
        else {
            System.out.println("ödeme tutarı : " + total);
        }
    }
}
