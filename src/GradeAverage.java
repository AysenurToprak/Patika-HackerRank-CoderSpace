import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {

        int math,physics,turkish,chemistry,history,music;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik Notunu giriniz");
        math = scanner.nextInt();

        System.out.println("Fizik Notunu giriniz");
        physics = scanner.nextInt();

        System.out.println("Türkçe Notunu giriniz");
        turkish = scanner.nextInt();

        System.out.println("Kimya Notunu giriniz");
        chemistry = scanner.nextInt();

        System.out.println("Tarih Notunu giriniz");
        history = scanner.nextInt();

        System.out.println("Müzik Notunu giriniz");
        music = scanner.nextInt();

        int total = math+physics+turkish+chemistry+history+music;
        double average = total/6;
        String a = (average >= 60) ? "Geçtiniz" : "Kaldınız";
        System.out.println(a);
    }
}