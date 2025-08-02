import java.util.Scanner;

/**
 * Q04_PassCheck
 * 点数と優秀フラグをもとに、合格かどうかを判定します。
 */
public class Q04_PassCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("点数を入力: ");
        int score = sc.nextInt();
        System.out.print("優秀ですか？（true/false）: ");
        boolean isExcellent = sc.nextBoolean();

        if (score >= 80 || isExcellent) {
            System.out.println("合格です！");
        } else {
            System.out.println("不合格です。");
        }
        sc.close();
    }
}

