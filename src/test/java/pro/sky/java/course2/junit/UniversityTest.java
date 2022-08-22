package pro.sky.java.course2.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UniversityTest {
    private Student student1;
    private Student student2;
    private Student student3;
    private University university;

    @BeforeEach
    public void setUp() {
        student1 = new Student("Евгений", 35, true);
        student2 = new Student(" Марина", 34, false);
        student3 = new Student("Алина", 7, false);

        University university = new University();
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
    }
    @Test
    public void getAllStudents() {
//        Student student1 = new Student("Евгений", 35, true);
//        Student student2 = new Student(" Марина", 34, false);
//        Student student3 = new Student("Алина", 7, false);
//
//        University university = new University();
//        university.addStudent(student1);
//        university.addStudent(student2);
//        university.addStudent(student3);

        List<Student> expected = university.getAllStudents();

        List<Student> actual = new ArrayList<Student>();


        actual.add(student1);
        actual.add(student2);
        actual.add(student3);

        assertEquals(expected, actual);
    }

    @Test
    public void getALlStudentsIsNotNull() {
        University university = new University();
        List<Student> expected = university.getAllStudents();

        assertNotNull(expected);
    }


    @Test
    public void getAllStudentsIsMale() {
        Student student1 = new Student("Евгений", 35, true);
        Student student2 = new Student(" Марина", 34, false);
        Student student3 = new Student("Алина", 7, false);

        University university = new University();
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        List<Student> expected = university.getAllStudents(true);

        List<Student> actual = new ArrayList<Student>();
        actual.add(student1);
//        actual.add(student2);
//        actual.add(student3);

        assertEquals(expected, actual);
    }
}
