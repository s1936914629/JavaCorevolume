package org.sqx.inheritance;



/**
 * 这个程序演示了继承
 *
 * @auther: sqx
 * @Date: 2022-11-27
 */
public class ManagerTest {
    public static void main(String[] args) {
        // construct a Manager object
        Employee boss = new Employee("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        var staff = new Employee[3];

        // fill the staff array with Manager and Employee objects

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}
