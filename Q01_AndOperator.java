import java.util.Scanner;

/**
 * Q01_AndOperator
 * 2つの真偽値を入力し、論理積（AND）の結果を出力します。
 */
public class Q01_AndOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("true か false を入力（1つ目）: ");
        boolean a = sc.nextBoolean();
        System.out.print("true か false を入力（2つ目）: ");
        boolean b = sc.nextBoolean();

        System.out.println("a && b = " + (a && b));
        sc.close();
    }
}
