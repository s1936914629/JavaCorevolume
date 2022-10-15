package cn.org.sqx;

import cn.org.sqx.corejava.Employee;

import static java.lang.System.out;

/**
 * 这个程序演示了包的使用这个程序演示包的使用
 *
 * @auther: sqx
 * @Date: 2022-10-15
 */
public class packageTest {
    public static void main(String[] args) {
        Employee sqx = new Employee("sqx", 50000, 1999, 10, 1);

        sqx.raiseSalary(5);

        // 由于使用了静态导入语句，我们不必在这里使用System。
        out.println("name=" + sqx.getName() + ",salary=" + sqx.getSalary());

    }
}
