package org.sqx.equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @auther: sqx
 * @Date: 2022-11-27
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
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

    public boolean equals(Object otherObject) {
        // 一个快速测试，看看这些物体是否相同
        if (this == otherObject) return true;

        // 如果显式参数为空，必须返回false
        if (otherObject == null) return false;

        // 如果类不匹配，它们就不可能相等
        if (getClass() != otherObject.getClass()) return false;

        // 现在我们知道otherObject是非空 Employee
        var other = (Employee) otherObject;

        // 测试字段是否具有相同的值
        return Objects.equals(name, other.name)
                && salary == other.salary && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    public String toString() {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay="
                + hireDay + "]";
    }
}
