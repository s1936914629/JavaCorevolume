package org.sqx.inheritance;

/**
 * @auther: sqx
 * @Date: 2022-11-27
 */
public class Manager extends Employee {
    private double bonus;

    /**
     * @param name   姓名
     * @param salary 工资
     * @param year   雇佣年
     * @param month  雇佣月
     * @param day    雇佣日
     */
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }
}
