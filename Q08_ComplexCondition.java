import java.util.Scanner;

/**
 * Q08_ComplexCondition
 * 複雑な条件に基づき「OK」と表示するか判定します。
 */
public class Q08_ComplexCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x を入力: ");
        int x = sc.nextInt();
        System.out.print("y を入力: ");
        int y = sc.nextInt();

        if ((x > 0 && x < 100) || (x < 0 && y >= 0)) {
            System.out.println("OK");
        } else {
            System.out.println("条件に合致しません");
        }
        sc.close();
    }
}
