import java.util.Scanner;

/**
 * Q02_RangeCheck
 * 入力された値が 10 以上かつ 20 以下かを判定します。
 */
public class Q02_RangeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("数値を入力: ");
        int num = sc.nextInt();

        boolean inRange = (num >= 10 && num <= 20);
        System.out.println("10〜20の範囲内？: " + inRange);
        sc.close();
    }
}

