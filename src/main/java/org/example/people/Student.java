package org.example.people;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int credits;
    private int student_id;
    private List<Integer> grades;

    public Student(String name,String address,int age,String country,int student_id) {
        super(name,address,age,country);
        this.credits = 0;
        this.student_id = student_id;
        this.grades = new ArrayList<Integer>();

    }
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }
    public void study(){
        credits++;
    }
    public int credits(){
        return credits;
    }
    public int getStudent_id(){
        return student_id;
    }

    public void setStudent_id(int student_id){
        this.student_id = student_id;
    }

    public void addGrade(int grade){
        if(grade >= 0 && grade <= 100){
            grades.add(grade);
        }else {
            System.out.println("This grade is not valid");
        }
    }

    public List<Integer> getGrades(){
        return grades;
    }
    @Override
    public String toString(){
        return this.getName() + "\n     " + this.getAddress() + "\n     credits: " + credits;
    }

    public static void main(String[] args) {
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki",20,"Finland",1782);
                System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());
    }


}
