package com.cybertek.test.day3_Locators;

import com.github.javafaker.Faker;

public class FakerPractice {
    public static void main(String[] args) {
        //create Faker object

        Faker fakeData = new Faker();
        //I need firstname
        String name = fakeData.name().firstName();

        System.out.println(name);

    }

}
