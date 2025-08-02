import java.util.Scanner;

/**
 * Q06_EvenAndSmall
 * 数が偶数かつ10以下であるかを判定します。
 */
public class Q06_EvenAndSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数を入力: ");
        int num = sc.nextInt();

        if (num % 2 == 0 && num <= 10) {
            System.out.println("条件に合致（偶数かつ10以下）");
        } else {
            System.out.println("条件に合致しません");
        }
        sc.close();
    }
}
