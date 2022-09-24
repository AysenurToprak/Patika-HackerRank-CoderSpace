import java.util.Scanner;

public class ChinesZodiac {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yılı Giriniz");
        year = scanner.nextInt();
        if (year%12==0){
            System.out.println("Burcunuz maymun");
        } else if (year%12==1) {
            System.out.println("horoz");
        } else if (year%12==2) {
            System.out.println("köpek");
        }
        else if (year%12==3) {
            System.out.println("domuz");
        }
        else if (year%12==4) {
            System.out.println("fare");
        }
        else if (year%12==5) {
            System.out.println("öküz");
        }
        else if (year%12==6) {
            System.out.println("kaplan");
        }
        else if (year%12==7) {
            System.out.println("tavşan");
        }
        else if (year%12==8) {
            System.out.println("ejderha");
        }
        else if (year%12==9) {
            System.out.println("yılan");
        }
        else if (year%12==10) {
            System.out.println("at");
        }
        else if (year%12==11) {
            System.out.println("koyun");
        }
    }
}
