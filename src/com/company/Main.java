package com.company;

public class Main {

    public static void main(String[] args) {

//        taskOne();
//        taskTwo();
//        taskThree();

        taskFour();

    }

    public static void taskOne(){

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;


        System.out.println("ФИО сотрудика - " + fullName);

    }

    public static void taskTwo(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        fullName = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудика для заполнения отчета - " + fullName);
    }

    public static void taskThree(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        fullName = fullName.replace(" ", "; ");

        System.out.println("Данные ФИО сотрудика для административного отдела - " + fullName);
    }

    public static void taskFour(){
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;

        if (fullName.contains("ё")) {
            fullName = fullName.replace("ё", "е");

        }

        System.out.println("Данные ФИО сотрудика - " + fullName);
    }
}
