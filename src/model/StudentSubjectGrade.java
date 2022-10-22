package model;

public class StudentSubjectGrade {

    private Subject subject;
    private Student student;
    private Grade grade;

    public StudentSubjectGrade(Subject subject, Student student, Grade grade) {
        this.subject = subject;
        this.student = student;
        this.grade = grade;
    }

    public StudentSubjectGrade() {

    }

    public Subject getSubject() {
        return subject;
    }

    public StudentSubjectGrade setSubject(Subject subject) {
        this.subject = subject;
        return this;
    }

    public Student getStudent() {
        return student;
    }

    public StudentSubjectGrade setStudent(Student student) {
        this.student = student;
        return this;
    }

    public Grade getGrade() {
        return grade;
    }

    public StudentSubjectGrade setGrade(Grade grade) {
        this.grade = grade;
        return this;
    }


}

