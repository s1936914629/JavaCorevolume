package org.sqx.abstractClasses;

/**
 * @auther: sqx
 * @Date: 2022-11-27
 */
public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }
}

