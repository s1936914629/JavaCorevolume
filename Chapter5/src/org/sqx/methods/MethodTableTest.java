package org.sqx.methods;

import java.lang.reflect.Method;

/**
 * 这个程序展示了如何通过反射调用方法。
 *
 * @auther: sqx
 * @Date: 2022-11-27
 */
public class MethodTableTest {
    public static void main(String[] args)
            throws ReflectiveOperationException {
        // Get方法指向square和SQRT方法的指针
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        // print tables of x- and y-values
        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
    }

    /**
     * 返回数字的平方
     *
     * @param x a number
     * @return x squared
     */
    public static double square(double x) {
        return x * x;
    }

    /**
     * 为方法打印具有x和y值的表
     *
     * @param 从x值的下界
     * @param 到x值的上界
     * @param n    表示表中的行数
     * @param f    具有双参数和双返回值的方法
     */
    public static void printTable(double from, double to, int n, Method f)
            throws ReflectiveOperationException {
        // print out the method as table header
        System.out.println(f);

        double dx = (to - from) / (n - 1);

        for (double x = from; x <= to; x += dx) {
            double y = (Double) f.invoke(null, x);
            System.out.printf("%10.4f | %10.4f%n", x, y);
        }
    }
}
