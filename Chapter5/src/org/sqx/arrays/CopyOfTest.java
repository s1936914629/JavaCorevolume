package org.sqx.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 这个程序演示了如何使用反射操作数组
 *
 * @auther: sqx
 * @Date: 2022-11-27
 */
public class CopyOfTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom", "Dick", "Harry"};
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate an exception.");
        b = (String[]) badCopyOf(b, 10);
    }

    /**
     * 此方法试图通过分配新数组并复制所有元素来增长数组
     *
     * @param a         阵列的增
     * @param newLength 新的长度
     * @return 数组的所有元素
     * 数组的类型为Object[]，与数组的类型不相同
     */
    public static Object[] badCopyOf(Object[] a, int newLength) // not useful
    {
        var newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    /**
     * 此方法通过分配相同类型和的新数组来增长数组
     * 复制所有元素
     *
     * @param A数组增长。这可以是对象数组或基本类型数组
     * @return 元素的所有元素的较大数组
     */
    public static Object goodCopyOf(Object a, int newLength) {
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}

