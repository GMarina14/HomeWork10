import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        task1();
        task2();
        task3();
    }

    public static void task1()
    {
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("The full name of the employee is " + fullName);
        System.out.println();
    }

    public static void task2()
    {
        System.out.println("Task 2");
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameUpLetters = fullName.toUpperCase();
        System.out.println("The full name of the employee to fill out the report - " + fullNameUpLetters);

        System.out.println();
    }

    public static void task3()
    {
        System.out.println("Task 3");
        String fullName = "Иванов Семён Семёнович";
        String fullNameCorrect = fullName.replace("ё", "е");
        System.out.println("The full name of the employee is " + fullNameCorrect);

        System.out.println();
    }
}
