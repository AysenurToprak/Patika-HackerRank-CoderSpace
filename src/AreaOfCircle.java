import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double area;
        double pi = 3.14;
        int r ,angle;
        Scanner scanner = new Scanner(System.in);
        System.out.println("yarı çapı giriniz");
        r = scanner.nextInt();
        System.out.println("açıyı giriniz");
        angle = scanner.nextInt();

        area = (pi*(r*r)*angle)/360;
        System.out.println("alan" + area);
    }
}
