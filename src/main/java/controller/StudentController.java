package controller;

import entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    static ArrayList<Student> list = new ArrayList<>();

    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter EnrolID: ");
        String EnrolID = scanner.nextLine();
        System.out.println("Please enter FirstName: ");
        String FirstName = scanner.nextLine();
        System.out.println("Please enter LastName: ");
        String LastName = scanner.nextLine();
        System.out.println("Please enter Age: ");
        int Age = scanner.nextInt();
        Student student = new Student(EnrolID, FirstName, LastName, Age);
        list.add(student);
    }

    public void Save() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\test-ADF2\\src\\main\\resources\\students.dat"));
            String content = "  EnrolID  " + "             " + "FullName" + "            " + "  Age \n" + "----------" + "  " + " -----------------------------" + "  " + "---------\n";
            bufferedWriter.write(content);
            for (Student student : list
            ) {
                bufferedWriter.write(
                         student.getEnrolID() + "             " + student.getFirstName() +" "+ student.getLastName() + "               " + student.getAge() + "\n"
                );
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Display(){
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("F:\\test-ADF2\\src\\main\\resources\\students.dat");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while (true){
            try {
                String line = bufferedReader.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
