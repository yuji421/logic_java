import java.util.Scanner;

/**
 * Q03_NotOperator
 * 晴れかどうかを入力し、晴れていなければ傘を持って行くように表示します。
 */
public class Q03_NotOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("今日は晴れですか？（true/false）: ");
        boolean isSunny = sc.nextBoolean();

        if (!isSunny) {
            System.out.println("傘を持って行こう！");
        } else {
            System.out.println("傘はいらないね！");
        }
        sc.close();
    }
}

