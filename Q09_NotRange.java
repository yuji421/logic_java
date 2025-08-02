import java.util.Scanner;

/**
 * Q09_NotRange
 * xが0より大きくかつ10未満でなければ「範囲外」と表示します。
 */
public class Q09_NotRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x を入力: ");
        int x = sc.nextInt();

        if (!(x > 0 && x < 10)) {
            System.out.println("範囲外");
        } else {
            System.out.println("範囲内");
        }
        sc.close();
    }
}
