package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student {

        private String firstName;
        private String lastName;
        private double gpa;

        public Student(String firstName, String lastName, double gpa) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gpa = gpa;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGpa() {
            return gpa;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", GPA=" + gpa +
                    '}';
        }

        public static void main(String[] args) {
            HashMap<String, Student> studentMap = new HashMap<>();

            // Create student objects
            Student student1 = new Student("Manoj", "Kumar", 3.5);
            Student student2 = new Student("Nani", "Nanu", 4.0);
            Student student3 = new Student("Vicky", "Venkat", 3.2);
            Student student4 = new Student("Neo", "Naraj", 3.8);
            Student student5 = new Student("Uday", "Raj", 3.7);
            Student student6 = new Student("Sai", "Anna", 3.9);
            Student student7 = new Student("Kishor", "Sanju", 3.6);
            Student student8 = new Student("Manu", "Mj", 3.4);

            // Add students to the HashMap
            studentMap.put(student1.getFirstName(), student1);
            studentMap.put(student2.getFirstName(), student2);
            studentMap.put(student3.getFirstName(), student3);
            studentMap.put(student4.getFirstName(), student4);
            studentMap.put(student5.getFirstName(), student5);
            studentMap.put(student6.getFirstName(), student6);
            studentMap.put(student7.getFirstName(), student7);
            studentMap.put(student8.getFirstName(), student8);

            // Print the HashMap using Entry Set
            System.out.println("HashMap using Entry Set:");
            for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

            // Print the HashMap using forEach method
            System.out.println("\nHashMap using forEach method:");
            studentMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

            // Print the HashMap using keySet and Iterator
            System.out.println("\nHashMap using keySet and Iterator:");
            Iterator<String> iterator = studentMap.keySet().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                System.out.println("Key: " + key + ", Value: " + studentMap.get(key));
            }
        }
    }


