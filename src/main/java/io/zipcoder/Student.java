package io.zipcoder;
import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examscores;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken(){
        return examscores.size();
    }
    public double getAverageExamScore(){
        Double sum = 0.0;
        for(Double x:examscores){
            sum +=x;
        }
        return sum/examscores.size();
    }
    public String  getExamscores() {
        String output ="Exam Scores:";

        for(int i = 0; i <examscores.size(); i++) {
           output +=  String.format("\n\tExam %d -> %d",i+1,examscores.get(i));

        }


        return output;

    }
    public void addStudent(Student student){

    }
    @Override
    public String toString(){

      String str = String.format("Student Name: %s %s",firstName,lastName)+
      String.format("\nAverage Score: %d",getAverageExamScore())+ getExamscores();


        return str;
    }
    public void addExamScore(Double score){
        examscores.add(score);
    }
    public void setExamScore(int examNumber,Double score){

        examscores.set(examNumber,score);
    }




    public Student(String firstName, String lastName, ArrayList<Double> examscores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examscores = examscores;
    }
}
