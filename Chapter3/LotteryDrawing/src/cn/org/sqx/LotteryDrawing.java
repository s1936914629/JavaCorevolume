package cn.org.sqx;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 这个程序演示数组操作。
 *
 * @auther: sqx
 * @Date: 2022-10-15
 */
public class LotteryDrawing
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("你需要多少个数字? ");
        int k = in.nextInt();

        System.out.print("最高数字是多少? ");
        int n = in.nextInt();

        // 用数字填充数组 1 2 3 . . . n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        // 抽出k个数字，并将它们放入第二个数组中
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++)
        {
            // 在0 和 n - 1之间建立一个随机索引
            int r = (int) (Math.random() * n);

            // 选择随机位置的元素
            result[i] = numbers[r];

            // 将最后一个元素移动到随机位置
            numbers[r] = numbers[n - 1];
            n--;
        }

        // 打印排序后的数组
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r : result)
            System.out.println(r);
    }
}

