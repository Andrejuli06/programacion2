package com.mycompany.acess;

import people.Person;

public class Acess {

    public static void main(String[] args) {
        OtherClass other = new OtherClass();
        other.sayhello();
        Person person = new Person("pepito","perez", 15);
        //Person.createFullName("ads", "ads");
        System.out.println(person.getFullName());
        System.out.println(person.getAge());
    }

}
