import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int res = dx(str);

        System.out.println(res);
    }

    private static int dx(String str) {
        int res = 0;
        List<String> stringList = new ArrayList<>();

        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }

        for (int j = str.length() - 1; j >= 0; j--) {
            if (' ' == chars[j]) {
                break;
            }
            res++;
        }

        return res;
    }

}
