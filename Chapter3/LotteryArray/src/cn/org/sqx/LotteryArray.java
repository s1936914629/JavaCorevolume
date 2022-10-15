package cn.org.sqx;

/**
 * 这个程序演示了一个三角形数组。
 *
 * @auther: sqx
 * @Date: 2022-10-15
 */
public class LotteryArray {
    public static void main(String[] args) {
        final int NMAX = 10;

        // 分配三角形的数组
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++)
            odds[n] = new int[n + 1];

        // 填补三角形的数组
        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++) {
                /*
                 * 计算二项式系数 n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
                 */
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;

                odds[n][k] = lotteryOdds;
            }

        // 打印三角形的数组
        for (int[] row : odds) {
            for (int odd : row)
                System.out.printf("%4d", odd);
            System.out.println();
        }
    }
}

