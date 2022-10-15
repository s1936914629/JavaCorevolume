package cn.org.sqx;

import java.util.Random;

/**
 * 这个程序演示了对象构造。
 *
 * @auther: sqx
 * @Date: 2022-10-15
 */
public class constructorTest {
    public static void main(String[] args) {
        // 用三个Employee对象填充staff数组
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("sqx", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        // 打印所有Employee对象的信息
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }
    }
}

class Employee {
    private static int nextId;

    // 静态初始化块
    static {
        var generator = new Random();
        // 将nextId设置为0到9999之间的随机数
        nextId = generator.nextInt(10000);
    }

    private int id;
    private String name = ""; // 实例字段初始化
    private double salary;

    // 对象初始化块
    {
        id = nextId;
        nextId++;
    }

    // 三个重载构造函数
    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee(double s) {
        // 调用Employee(String, double)构造函数
        this("Employee #" + nextId, s);
    }

    // 默认构造函数
    public Employee() {
        // name initialized to ""--see above
        // 工资未显式设置——初始化为0
        // 在初始化块中初始化的Id
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}

