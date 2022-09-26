import java.util.Scanner;
/*Dışarıda verilen bir sayı nokta oluşturuluyor ve bu nokta  ile beşgen oluşturuluyor. N. iterasyonda toplam kaç tane nokta
olduğunu bulan algoritma yazılmıştır. Her adım bir önceki adımı kapsayacak şekilde beşge oluşturacaktır. */
public class pentonalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        System.out.println(PentagonalNumber(Integer.parseInt(scanner.nextLine())));
    }
    static int PentagonalNumber(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result += (i-1)*5;
        }
        return result;

        // return num == 1 ? 1 : PentagonalNumber(num - 1) + 5 * (num - 1); bu çözüm recursive dir
    }
}
/*import java.util.Scanner;

public class Solution {
stdin stdout burada string parse edebilmek için boyutu kadar döngüye soktuk
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s="";
        while(scan.hasNext())
        {
            s=scan.nextLine();
        }

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}*/