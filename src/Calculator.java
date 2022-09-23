import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1,num2,select;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci Sayı : ");
        num1 = scanner.nextInt();
        System.out.println("İkinci Sayı : ");
        num2 = scanner.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division ");
        System.out.println("Please select one of them : ");
        select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Answer : " + (num1+num2));
                break;
            case 2:
                System.out.println("Answer : " + (num1-num2));
                break;
            case 3:
                System.out.println("Answer : " + (num1*num2));
                break;
            case 4:
                System.out.println("Answer : " + (num1/num2));
                break;
            default:
                System.out.println("Your select was wrong!");
        }
    }
}
