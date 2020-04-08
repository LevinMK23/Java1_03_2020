package lesson5.homework;

import lesson5.persons.Group;

import java.util.ArrayList;

public class Worker {
//ФИО, должность, email, телефон, зарплата, возраст;
    String fio;
    String position;
    String email;
    String phone;
    int paycheck;
    int age;

    public Worker(String fio, String position, String email,String phone, int paycheck, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.paycheck = paycheck;
        this.age = age;
    }
    public void Info(){
        System.out.println("ФИО сотрудника - " + fio);
        System.out.println("Должность сотрудника - " + position);
        System.out.println("Email- " + email);
        System.out.println("Tелефон - " + phone);
        System.out.println("Зарплата - " + paycheck);
        System.out.println("Возраст - "+ age);
    }

}
