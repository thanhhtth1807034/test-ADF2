package mainThread;

import controller.StudentController;
import entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        while (true) {
            StudentController studentController = new StudentController();
            Scanner scanner = new Scanner(System.in);
            System.out.println("--------Student Manager------");
            System.out.println("1. Add new Student");
            System.out.println("2. Save");
            System.out.println("3. Display all student");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentController.add();
                    break;
                case 2:
                    studentController.Save();
                    break;
                case 3:
                    studentController.Display();
                    break;
                case 4:

                    break;
                default:
                    System.out.println("Lua chon sai vui long chon lai!!!");
                    break;
            }
        }
    }
}
