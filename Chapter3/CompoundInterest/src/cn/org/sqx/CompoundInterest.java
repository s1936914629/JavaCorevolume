package cn.org.sqx;

/**
 * 这个程序演示了如何在二维数组中存储表格数据。
 *
 * @auther: sqx
 * @Date: 2022-10-15
 */
public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        // 将利率设置为 10 . . . 15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;

        double[][] balances = new double[NYEARS][NRATES];

        // 将初始余额设置为 10000
        for (int j = 0; j < balances[0].length; j++)
            balances[0][j] = 10000;

        // 计算未来几年的利息
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                // 从上一行获取去年的余额
                double oldBalance = balances[i - 1][j];

                // 计算利息
                double interest = oldBalance * interestRate[j];

                // 计算今年的结余
                balances[i][j] = oldBalance + interest;
            }
        }

        // 打印一行利率
        for (int j = 0; j < interestRate.length; j++)
            System.out.printf("%9.0f%%", 100 * interestRate[j]);

        System.out.println();

        // 打印余额表
        for (double[] row : balances) {
            // print table row
            for (double b : row)
                System.out.printf("%10.2f", b);

            System.out.println();
        }
    }
}
