package com.company;
import java.util.Deque;
import java.util.Scanner;


public class QueueDemo {
    Scanner sc=new Scanner(System.in);
    ;
    public void people(Deque<Person> deque) {//адамдарды Декю аркылы кезекке қосу
        deque.addLast(new Student("Oralov Yerasyl",18,Genders.MAN,178,75,"ENU",2));
        deque.addLast(new Worker("Amanov Timur",27,Genders.MAN,179,74,"Programmist",450000));
        deque.addLast(new Pensioner("Qairatov Elaman",68,Genders.MAN,168,70,5,120000));
        deque.addLast(new Student("Esenova Madina",19,Genders.WOMAN,163,55,"ENU",3));
        deque.addLast(new Worker("Musina Raushan",35,Genders.WOMAN,160,59,"Teacher",250000));
        deque.addLast(new Pensioner("Abbasova Ayagoz",72,Genders.WOMAN,158,65,14,105000));
    }

    public void print(Deque<Person> deque) {
        for(Person person : deque) // foreach тасилимен кезекти экранга шыгару
            System.out.println(person);
    }

    public void addPerson(Deque<Person> deque) {//адамды кезекке қосу
        int n;//студент, пенсионер, не жұмысшы екенін таңдау үшін
        String nameSurname;//қосатын адамның аты-жөні
        int age;//жасы
        Genders gender=Genders.MAN;//жынысы, по умолчанию ер адам, бірақ таңдағанда өзгереді
        int genderIndex;//ер/әйел екенін таңдау үшін
        int height;//бойы
        double weight;//салмағы
        System.out.println("\nKezekke qosatyn adam: 1-Student, 2-Zhumysshy, 3-Pensioner");
        n=sc.nextInt();//студент, пенсионер, не жұмысшы екенін таңдау үшін клавиатурадан енгізу
        System.out.println("Kezekke qosatyn adamnyn aty-joni:");
        nameSurname=sc.nextLine();
        nameSurname=sc.nextLine();//аты-жөнін енгізу
        System.out.println("Jasy:");
        age=sc.nextInt();//жасын енгізу
        System.out.println("Kezekke qosatyn adamnyn zhynysy: 1-er, 2-aiel");
        genderIndex=sc.nextInt();//жынысын таңдау
        if(genderIndex==1)
            gender=Genders.MAN;
        else if(genderIndex==2)// 2 Айел адамды тандау
            gender=Genders.WOMAN;
        else System.out.println("Qate berdiniz!");
        System.out.println("Boiy");
        height=sc.nextInt();//бойын енгізу
        System.out.println("Salmagy");
        weight=sc.nextDouble();//салмағын енгізу
        switch (n) {//студент, пенсионер, не жұмысшы екеніне байланысты
            // суит кейс аркылы тандау жургизу
            case 1:
                String university;//университет
                int course;//курс
                System.out.println("Qai univerde oqidy?");
                university=sc.next();
                System.out.println("Qai kursta oqidy?");
                course=sc.nextInt();
                deque.addLast(new Student(nameSurname,age,gender,height,weight,university,course));//студентті кезекке қосу
                break;
            case 2:
                String work;//жұмысы
                int salary;//айлығы
                System.out.println("Qandai jumys isteidi?");
                work=sc.next();
                System.out.println("Jalaqysy qansha?");
                salary=sc.nextInt();
                deque.addLast(new Worker(nameSurname,age,gender,height,weight,work,salary));//жұмысшыны кезекке қосу
                break;
            case 3:
                int year,pensionAmount;//жыл және зейнетақы
                System.out.println("Zeinetke shyqqanyna qansha jyl boldy?");
                year=sc.nextInt();
                System.out.println("Zeinetaqy molsheri:");
                pensionAmount=sc.nextInt();
                deque.addLast(new Pensioner(nameSurname,age,gender,height,weight,year,pensionAmount));//пенсионерді кезекке қосу
                break;
            default:
                System.out.println("Kezekke qosa almaisyz!");
        }
    }
}
