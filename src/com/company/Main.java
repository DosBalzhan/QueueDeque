package com.company;
import java.util.ArrayDeque;
import java.util.Deque;
public class Main {

    public static void main(String[] args) {
        Deque<Person> deque = new ArrayDeque<Person>();// бос дек
        QueueDemo qd = new QueueDemo();// QueueDemo класының объектісін құру
        qd.people(deque);// people әдісін шақыру, яғни кезекке адамдарды қосу
        qd.print(deque);// print әдісін шақыру, кезекті экранға шығару
        qd.addPerson(deque);// addPerson әдісін шақыру арқылы кезек соңына адамды қосу
        System.out.println("\nAdamdy qosqannan keiingi kezek:\n");
        qd.print(deque);// адамды кезекке қосқаннан кейін кезекті экранға шығару
    }
}
