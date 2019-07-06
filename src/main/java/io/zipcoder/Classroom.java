package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Classroom {
    ArrayList<Student> students;

    public Classroom(int maxNumberofStudents) {
        ArrayList<Student> students = new ArrayList<>(maxNumberofStudents);
    }

    public Classroom(ArrayList<Student> students) {
        this.students = students;
    }
    public Classroom(){
        ArrayList<Student> students = new ArrayList<>(30);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
    public Double getAverageExamScore(){
        Double runningtotal = 0.0;
        Integer counter = 0;
        for (Student student:this.students)
              {
                  for (Double exam:student.examscores) {

                      runningtotal += exam;
                      counter++;
                  }

        }


        return runningtotal/counter;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(String firstName,String lastName) {
        for (Student student : students) {
            String fN = student.getFirstName();
            String lN = student.getLastName();
            if (firstName == fN && lastName == lN) {
                students.remove(student);
            }

        }
    }
    public class CustomComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1,Student o2){
            if(o1.getAverageExamScore()< o2.getAverageExamScore()) return -1;
            if(o1.getAverageExamScore()>o2.getAverageExamScore()) return 1;
            return 0;
    }

    public void getStudentByScore(){
        ArrayList<Student> gradeSort = new ArrayList<>();

        students.sort(Comparator.)



        }
    }
}

