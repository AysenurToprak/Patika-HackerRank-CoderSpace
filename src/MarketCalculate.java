import java.util.Scanner;

public class MarketCalculate {
    public static void main(String[] args) {
        double pear = 2.14, apple = 3.67,tomato = 1.11,banana = 0.95,aubergine = 5.00;
        double total,pear1,apple1,tomato1,banana1,aubergine1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Armut");
        pear1 = scanner.nextDouble();
        System.out.println("Elma ");
        apple1 = scanner.nextDouble();
        System.out.println("domates");
        tomato1 = scanner.nextDouble();
        System.out.println("muz");
        banana1 = scanner.nextDouble();
        System.out.println("patlıcan");
        aubergine1 = scanner.nextDouble();
        total = (pear1*pear)+(banana1*banana)+(apple1*apple)+(tomato1*tomato)+(aubergine1*aubergine);
        System.out.println("toplam"+total);

    }
}
