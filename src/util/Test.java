package util;

import model.Grade;
import model.Student;
import model.StudentSubjectGrade;
import model.Subject;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Student student1 = new Student(12, "Kamal");
        Student student2 = new Student(13, "Aytac");
        Student student3 = new Student(14, "Ayna");
        Student student4 = new Student(15, "Qorxmaz");
        Student student5 = new Student(16, "Elmir");

        Subject subject1 = new Subject(22, "Math");
        Subject subject2 = new Subject(23, "Literatue");
        Subject subject3 = new Subject(24, "Oop");
        Subject subject4 = new Subject(25, "Philosophy");
        Subject subject5 = new Subject(26, "Grammmar");

        Grade grade1 = new Grade(95, "A");
        Grade grade2 = new Grade(85, "B");
        Grade grade3 = new Grade(75, "C");
        Grade grade4 = new Grade(65, "D");
        Grade grade5 = new Grade(55, "E");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);


        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(subject1);
        subjectList.add(subject2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        List<Grade> gradeList = new ArrayList<>();
        gradeList.add(grade1);
        gradeList.add(grade2);
        gradeList.add(grade3);
        gradeList.add(grade4);
        gradeList.add(grade5);

        StudentSubjectGrade studentSubjectGrade1 = new StudentSubjectGrade(subject1, student1, grade1);
        StudentSubjectGrade studentSubjectGrade2 = new StudentSubjectGrade(subject2, student2, grade2);
        StudentSubjectGrade studentSubjectGrade3 = new StudentSubjectGrade(subject3, student3, grade3);
        StudentSubjectGrade studentSubjectGrade4 = new StudentSubjectGrade(subject4, student4, grade4);
        StudentSubjectGrade studentSubjectGrade5 = new StudentSubjectGrade(subject5, student5, grade5);

        List<StudentSubjectGrade> ssg = new ArrayList<>();
        ssg.add(studentSubjectGrade1);
        ssg.add(studentSubjectGrade2);
        ssg.add(studentSubjectGrade3);
        ssg.add(studentSubjectGrade4);
        ssg.add(studentSubjectGrade5);

        for (StudentSubjectGrade getStudentSubjectGrade: ssg) {
            System.out.println(getStudentSubjectGrade.getStudent().getName()+ " "+
                    getStudentSubjectGrade.getGrade().getName() + " " + getStudentSubjectGrade.getSubject().getName());

        }


    }
}
