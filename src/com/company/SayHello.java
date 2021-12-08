package com.company;

import java.util.Scanner;

public class SayHello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = scanner.nextLine();
        sayHello(name);
    }
    public static void sayHello (String name) {
        System.out.println("Hello, " + name + "!");
    }
}
/*
Напишете метод, който приема име и изписва на конзолата Hello, <името>!.
 */