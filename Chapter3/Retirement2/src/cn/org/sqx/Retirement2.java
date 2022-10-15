package cn.org.sqx;

import java.util.Scanner;

/**
 * 此程序演示了do/while循环。
 *
 * @auther: sqx
 * @Date: 2022-10-15
 */
public class Retirement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("你每年要花多少钱? ");
        double payment = in.nextDouble();

        System.out.print("利率 %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        // 更新帐户余额，而用户还没有准备好退休
        do {
            // 加上今年的付款和利息
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            year++;

            // 打印当前余额
            System.out.printf("一年后 %d, 你的余额是 %,.2f%n", year, balance);

            // 询问是否准备好退休并征求意
            System.out.print("准备退休了? (Y/N) ");
            input = in.next();
        }
        while (input.equals("N"));
    }
}
