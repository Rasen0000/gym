package com.gym;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Atletics {
    private static String name;
    private static Integer weight;
    private static Integer age;
    private static Integer calories;

    public static void enterData(){
        System.out.println("Введите имя: ");
        Scanner in = new Scanner(System.in);
        name = in.next();
        System.out.println("Введите Ваш вес: ");
        Scanner we = new Scanner(System.in);
        weight = we.nextInt();
        System.out.println("Введите Ваш возраст: ");
        Scanner ag = new Scanner(System.in);
        age = ag.nextInt();
        System.out.println(name + " " + weight + " " + age +" ");


    }



}
