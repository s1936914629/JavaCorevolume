package cn.org.sqx;

import java.util.Scanner;

/**
 * 此程序演示了for循环。
 *
 * @auther: sqx
 * @Date: 2022-10-15
 */
public class LotteryOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("你需要多少个数字? ");
        int k = in.nextInt();

        System.out.print("最大的数字是多少? ");
        int n = in.nextInt();

        /*
         * 计算二项式系数 n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
         */

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * (n - i + 1) / i;

        System.out.println("你的赔率是1 / " + lotteryOdds + ". 祝你好运！");
    }
}
