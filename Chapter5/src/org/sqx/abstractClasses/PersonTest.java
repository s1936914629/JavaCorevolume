package org.sqx.abstractClasses;

/**
 * 这个程序演示了抽象类
 * @auther: sqx
 * @Date: 2022-11-27
 */
public class PersonTest {
    public static void main(String[] args) {
        var people = new Person[2];

        // fill the people array with Student and Employee objects
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        // print out names and descriptions of all Person objects
        for (Person p : people)
            System.out.println(p.getName() + ", " + p.getDescription());
    }
}
