import java.util.Scanner;

public class KDVCalculated {
    public static void main(String[] args) {
    double price,taxRate=0.18,taxRate2=0.8,taxRatetotal,taxtotal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ücreti Giriniz: ");
        price = scanner.nextDouble();
        if (price<=1000){
            taxRatetotal = price * taxRate;
            taxtotal = price + taxRatetotal;

            System.out.println("Kdv'siz tutar" +price);
            System.out.println("kdv oranı" +taxRate);
            System.out.println("kdv tutarı" +taxRatetotal);
            System.out.println("kdvli tutar"+ taxtotal);
        }
        else {
            taxRatetotal = price * taxRate2;
            taxtotal = price + taxRatetotal;

            System.out.println("Kdv'siz tutar" +price);
            System.out.println("kdv oranı" +taxRate2);
            System.out.println("kdv tutarı" +taxRatetotal);
            System.out.println("kdvli tutar"+ taxtotal);
        }

    }
}
