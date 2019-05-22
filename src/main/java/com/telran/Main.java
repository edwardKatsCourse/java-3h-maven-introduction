package com.telran;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        System.out.println("Name:");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Age: ");
        Integer age = new Scanner(System.in).nextInt();

        Person p1 = new Person(name, age, true);

        String json = objectMapper.writeValueAsString(p1);
        FileUtils.write(new File("person.txt"), json);

//        System.out.println(json);
//
//        Person personFromJson = objectMapper.readValue(json, Person.class);
//        System.out.println(personFromJson);
    }
}


class Person {

    private String name;
    private Integer age;
    private Boolean isResident;

    //ctor with all parameters
    //ctor default
    //getters ans setters
    //toString


    public Person(String name, Integer age, Boolean isResident) {
        this.name = name;
        this.age = age;
        this.isResident = isResident;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getResident() {
        return isResident;
    }

    public void setResident(Boolean resident) {
        isResident = resident;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isResident=" + isResident +
                '}';
    }
}