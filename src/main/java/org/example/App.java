package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld1 = (HelloWorld) context.getBean("helloWorld");
        HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");

        Cat cat1 = (Cat) context.getBean("cat");
        Cat cat2 = (Cat) context.getBean("cat");

        System.out.println("Бины HelloWorld равны? " + (helloWorld1 == helloWorld2));
        System.out.println("Бины Cat равны? " + (cat1 == cat2));
    }
}