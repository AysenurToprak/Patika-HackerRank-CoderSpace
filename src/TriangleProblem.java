import java.util.Scanner;

public class TriangleProblem {
    public static void main(String[] args) {

        int a , b, c;
        double cevre,cevre1;
        double alan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz");
        a = scanner.nextInt();
        System.out.println("İkinci kenarı giriniz");
        b = scanner.nextInt();
        System.out.println("üçüncü kenarı giriniz");
        c = scanner.nextInt();

        cevre = (a+b+c)*2;
        System.out.println("çevre="+cevre);
        cevre1 = cevre/2;
        alan = Math.sqrt((cevre1)*(cevre1-a)*(cevre1-b)*(cevre1-c));
        System.out.println("Alan= " +alan);



    }
}
