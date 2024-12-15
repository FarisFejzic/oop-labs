package org.example.week11;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class StudentSystemTest {
    @Test
    void testIfStudentIsPresent() throws IOException, InvalidStudentDataException {
        StudentSystem system = new StudentSystem("students.csv");
        assertTrue(system.noOfStudents() > 0);
    }

    @Test
    void testStudentWithId100() throws IOException, InvalidStudentDataException {
        StudentSystem system = new StudentSystem("students.csv");
        assertFalse(system.getStudentById(100).isPresent());
    }

    @Test
    void testHighestGPAStudent() throws IOException, InvalidStudentDataException {
        StudentSystem system = new StudentSystem("students.csv");
        Student highestGPAStudent = system.getHighestGPAStudent();
        assertEquals(9.8, highestGPAStudent.getGPA());
    }

    @Test
    void testExceptionForEmptyStudentList() {
        Exception exception = assertThrows(EmptyStudentListException.class, () -> {
            new StudentSystem(new ArrayList<>()).getHighestGPAStudent();
        });
        assertEquals("List of students is empty.", exception.getMessage());
    }

    @Test
    void testExceptionMessageForEmptyStudentList() {
        Exception exception = assertThrows(EmptyStudentListException.class, () -> {
            new StudentSystem(new ArrayList<>()).getHighestGPAStudent();
        });
        assertEquals("List of students is empty.", exception.getMessage());
    }

    @Test
    void testNamesArray() throws IOException {
        List<Student> students = StudentSystem.readStudents("students.csv");
        List<String> names = students.stream().map(Student::getName).collect(Collectors.toList());
        assertIterableEquals(
                Arrays.asList("Camila Wood", "Alexander Thompson", "Liam Taylor", "Evelyn Jenkins", "Michael Jackson"),
                names.subList(0, 5)
        );
    }

    @Test
    void testSameStudent() throws IOException, InvalidStudentDataException {
        StudentSystem system = new StudentSystem("students.csv");
        Student highestGPAStudent = system.getHighestGPAStudent();
        assertEquals(12, highestGPAStudent.getId());
    }

    @Test
    void testValidateStudentDataThrowsException() {
        List<Student> invalidStudents = Arrays.asList(
                new Student(1, "Test Student", "Test University", "IT", 5.0),
                new Student(2, "Another Student", "Test University", "CS", 10.5)
        );

        assertThrows(InvalidStudentDataException.class, () -> {
            new StudentSystem(invalidStudents);
        });
    }

    @Test
    void testStudentToString() {
        Student student = new Student(1, "Test Student", "Test University", "IT", 9.0);
        assertEquals("Test Student", student.toString());
    }
}