package se.iths.twentytwo.exercises.chapter6.vehicledealer;

import java.math.BigDecimal;

public class Person {
    private String name;
    private int age;
    private String work;
    private BigDecimal bankBalance;

    public Person(String name, int age, String work, BigDecimal bankBalance) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.bankBalance = bankBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public BigDecimal getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(BigDecimal bankBalance) {
        this.bankBalance = bankBalance;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                ", bankBalance=" + bankBalance +
                '}';
    }
}
