package org.example.week11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Student {
    private int id;
    private String name;
    private String university;
    private String department;
    private double GPA;
    public Student(int id, String name, String university, String department, double GPA) {
        this.id = id;
        this.name = name;
        this.university = university;
        this.department = department;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public String getDepartment() {
        return department;
    }

    public double getGPA() {
        return GPA;
    }
    @Override
    public String toString() {
        return "Name: "+ this.name;
    }
}

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }

}

class EmptyStudentListException extends RuntimeException {
    public EmptyStudentListException(String message) {
        super(message);
    }
}

class InvalidStudentDataException extends Exception{
    public InvalidStudentDataException(String message){
        super(message);
    }
}

class StudentSystem {
    private List<Student> students;

    public StudentSystem(List<Student> students) throws InvalidStudentDataException {
        this.students = students;
        validateStudentData(students);
    }

    public StudentSystem(String filename) throws IOException, InvalidStudentDataException {
        this.students = readStudents(filename);
        validateStudentData(students);
    }

    public static List<Student> readStudents(String filename) throws IOException {
        List<Student> studentList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    String university = parts[2].trim();
                    String department = parts[3].trim();
                    double gpa = Double.parseDouble(parts[4].trim());
                    studentList.add(new Student(id, name, university, department, gpa));
                }
            }
        }
        return studentList;
    }

    private void validateStudentData(List<Student> students) throws InvalidStudentDataException {
        for (Student student : students) {
            if (student.getGPA() < 6 || student.getGPA() > 10) {
                throw new InvalidStudentDataException("Read data has invalid rows.");
            }
        }
    }

    public int noOfStudents() {
        return students.size();
    }

    public Optional<Student> getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public Student getHighestGPAStudent() {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("List of students is empty.");
        }

        Student highestGPAStudent = students.get(0);

        for (Student student : students) {
            if (student.getGPA() > highestGPAStudent.getGPA()) {
                highestGPAStudent = student;
            }
        }
        return highestGPAStudent;
    }

    public Student getLongestNameStudent() {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("List of students is empty.");
        }

        Student longestNameStudent = students.get(0);

        for (Student student : students) {
            if (student.getName() != null && student.getName().length() > longestNameStudent.getName().length()) {
                longestNameStudent = student;
            }
        }
        return longestNameStudent;
    }

    public static List<String> getNames(List<Student> students) {
        List<String> names = new ArrayList<>();
        for (Student student : students) {
            names.add(student.getName());
        }
        return names;
    }
}