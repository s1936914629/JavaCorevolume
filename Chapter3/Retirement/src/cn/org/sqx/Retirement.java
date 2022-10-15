package cn.org.sqx;

import java.util.Scanner;

/**
 * 此程序演示了while循环。
 *
 * @auther: sqx
 * @Date: 2022-10-15
 */
public class Retirement {
    public static void main(String[] args) {
        // read inputs
        Scanner in = new Scanner(System.in);

        System.out.print("你需要多少钱才能退休? ");
        double goal = in.nextDouble();

        System.out.print("你每年要花多少钱? ");
        double payment = in.nextDouble();

        System.out.print("利率 %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        // 当目标未达到时，更新帐户余额
        while (balance < goal) {
            // 加上今年的付款和利息
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.println("你可以退休 " + years + " 年.");
    }
}
