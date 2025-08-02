import java.util.Scanner;

/**
 * Q05_TeenChecker
 * 年齢が13〜19歳のティーンエイジャーかどうかを判定します。
 */
public class Q05_TeenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("年齢を入力: ");
        int age = sc.nextInt();

        if (age >= 13 && age <= 19) {
            System.out.println("ティーンエイジャーです。");
        } else {
            System.out.println("ティーンエイジャーではありません。");
        }
        sc.close();
    }
}

