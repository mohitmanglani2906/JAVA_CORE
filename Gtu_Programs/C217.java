/*
Create a class called Student.
Write a student manager program to
manipulate the student information from files by using the BufferedReader and BufferedWriter.
*/
package gtupapers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

class Student
{
    String roll_no;
    double percentage;
    int marks;
   // int stu[] = new int[100];
    
    void countPercentage(String roll_no,int marks)
    {
        this.roll_no=roll_no;
        percentage = (this.marks*100)/500;
        System.out.println(percentage);
    }
    
}

public class C217 
{
    public static void main(String[] args) throws Exception
    {
        Student s = new Student();
        s.marks=390;
       // int m = s.marks;
        //String str = Integer.toString(m);
        File file = new File("stu2.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(Integer.toString(s.marks));
        bw.flush();
        bw.close();
        
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String m1="";
        m1 = br.readLine();
        s.countPercentage("1",Integer.parseInt(m1));
        
        
     /*   while((m1=br.readLine())!=null){
            
        }*/
        
        
        
    }
}
