package day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveStudents {
    public static void main(String[] args) {
        // Create the ArrayList of Students
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Manoj", "Kumar", 3.5));
        studentList.add(new Student("Nani", "Nanu", 4.0));
        studentList.add(new Student("Vicky", "Venkat", 3.2));
        studentList.add(new Student("Sai", "Anna", 3.8));

        // Calculate the average GPA
        double totalGpa = 0;
        for (Student student : studentList) {
            totalGpa += student.getGpa();
        }
        double averageGpa = totalGpa / studentList.size();

        System.out.println("Before removal:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Remove students with GPA less than the average
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getGpa() < averageGpa) {
                iterator.remove();
            }
        }

        System.out.println("\nAfter removal:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
