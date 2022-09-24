import java.util.Scanner;

public class SuggestHeat {
    public static void main(String[] args) {
        int heat;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıcaklık Giriniz");
        heat = scanner.nextInt();
        if (heat < 5){
            System.out.println("Kayak");
        } else if (heat>5 && heat<15) {
            System.out.println("sinema");

        } else if (heat>15 && heat<25) {
            System.out.println("piknik");

        }
        else {
            System.out.println("Yüzme");
        }
    }
}
