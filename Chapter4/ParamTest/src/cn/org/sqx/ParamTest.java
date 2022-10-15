package cn.org.sqx;

/**
 * 这个程序演示了Java中的参数传递。
 *
 * @auther: sqx
 * @Date: 2022-10-15
 */
public class ParamTest {
    public static void main(String[] args) {
        /*
         * TODO 测试1：方法无法修改数字参数
         * */
        System.out.println("测试三倍的值：");
        double percent = 10;
        System.out.println("原来的值=" + percent);
        tripleValue(percent);

        /*
         * TODO 测试2：方法可以更改对象参数的状态
         * */
        System.out.println("\n测试三倍的薪水：");
        Employee sqx = new Employee("sqx", 50000);
        System.out.println("原来的薪水=" + sqx.getSalary());
        tripleSalary(sqx);

        /*
         * TODO 测试3：方法无法将新对象附加到对象参数
         * */
        System.out.println("\n测试 swap:");
        Employee a = new Employee("小红", 70000);
        Employee b = new Employee("小玉", 60000);
        System.out.println("测试前：a=" + a.getName());
        System.out.println("测试前：b=" + b.getName());
        swap(a, b);
        System.out.println("测试后：a=" + a.getName());
        System.out.println("测试后：b=" + b.getName());


    }

    private static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("结束后的值：x=" + x);
    }

    private static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("结束后的薪水=" + x.getSalary());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("方法结束: x=" + x.getName());
        System.out.println("方法结束: y=" + y.getName());
    }
}

class Employee // simplified Employee class
{
    private String name;
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
