package cn.org.sqx;

import java.time.LocalDate;

/**
 * 此程序测试Employee类。
 *
 * @auther: sqx
 * @Date: 2022-10-15
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("sqx", 75000, 1998, 10, 4);
        staff[1] = new Employee("小狐", 50000, 1000, 11, 2);
        staff[2] = new Employee("小玉", 45230, 1890, 1, 16);

        // 将每个人的工资提高5%
        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
                    + e.getHireDay());
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
