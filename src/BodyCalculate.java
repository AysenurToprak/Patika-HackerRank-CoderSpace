import java.util.Scanner;

public class BodyCalculate {
    public static void main(String[] args) {
        double boy,kilo,ortalam;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boy");
        boy = scanner.nextDouble();
        System.out.println("kilo");
        kilo = scanner.nextDouble();

        ortalam = (kilo / (boy * boy));
        System.out.println("Vücut Kitle İndeksiniz : " +ortalam);
    }
}
