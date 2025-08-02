import java.util.Scanner;

/**
 * Q10_AdminLogin
 * ログイン中かつ管理者であれば「管理画面へ」と表示します。
 */
public class Q10_AdminLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ログインしていますか？（true/false）: ");
        boolean isLoggedIn = sc.nextBoolean();
        System.out.print("管理者ですか？（true/false）: ");
        boolean isAdmin = sc.nextBoolean();

        if (isLoggedIn && isAdmin) {
            System.out.println("管理画面へようこそ");
        } else {
            System.out.println("アクセス権がありません");
        }
        sc.close();
    }
}
