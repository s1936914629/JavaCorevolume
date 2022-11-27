package org.sqx.objectAnalyzer;

import java.util.ArrayList;

/**
 * 这个程序使用反射来监视物体
 *
 * @auther: sqx
 * @Date: 2022-11-27
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args)
            throws ReflectiveOperationException {
        var squares = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++)
            squares.add(i * i);
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}

