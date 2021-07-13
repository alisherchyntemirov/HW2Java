package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(info(45,12));
        System.out.println(info(24,16));
        System.out.println(info(15,29));
        System.out.println(info(30,39));
        System.out.println(info(generateRandomAge(), 27));
    }
    public static String info(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять 1";
        }
        else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять 2";
        }
        else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять 3";
        }
        else {
            return "Оставайтесь дома ";
        }
    }

    public static int generateRandomAge() {
        Random random= new Random();
        int age=random.nextInt(70);
        return  age;
    }
}
