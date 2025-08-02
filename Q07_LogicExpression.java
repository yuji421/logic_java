import java.util.Scanner;

/**
 * Q07_LogicExpression
 * 論理式の評価結果を確認します。
 */
public class Q07_LogicExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        boolean b = false;
        System.out.println("a || (b && !a) = " + (a || (b && !a))); // true
        sc.close();
    }
}
