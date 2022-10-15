package cn.org.sqx;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 这个程序使用大数字来计算彩票中大奖的可能性。
 *
 * @auther: sqx
 * @Date: 2022-10-15
 */
public class BigIntegerTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("你需要多少数字? ");
        int k = in.nextInt();

        System.out.print("最高数字是多少? ");
        int n = in.nextInt();

        /*
         * 计算二项式系数 n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
         **/

        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(
                    BigInteger.valueOf(i));

        System.out.println("你的赔率是1 /  " + lotteryOdds + ". 祝你好运!");
    }
}

