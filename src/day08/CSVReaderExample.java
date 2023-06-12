package day08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSVReaderExample {
    public static void main(String[] args) {
        String csvFile = "records.csv";
        String line;
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                if(line.length() >0){
                    String[] data = line.split(",");
                    String firstName = data[0];
                    String lastName = data[1];
                    double gpa = Double.parseDouble(data[2]);

                    Student student = new Student(firstName, lastName, gpa);
                    students.add(student);
                }

            }

            Collections.sort(students);

            for (Student student : students) {
                System.out.println("Name: " + student.getFirstName() + " " + student.getLastName() +
                        ", GPA: " + student.getGpa());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
