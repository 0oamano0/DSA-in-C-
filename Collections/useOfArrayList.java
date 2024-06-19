import java.util.ArrayList;

class Student{
    int Rollno;
    String name;
    double cgpa;
    Student(int rno,String n,double mark){
        this.Rollno=rno;
        this.name=n;
        this.cgpa=mark;
        // System.out.println(rno);
        // System.out.println(n);
        // System.out.println(mark);
       
    }
    @Override
    public String toString(){
        return "Roll no : "+Rollno+" Name : "+name+" CGPA : "+cgpa;
    }
}

public class useOfArrayList {
    public static void main(String[] args) {
        // ArrayList<Integer> arr=new ArrayList<>();
        // arr.add(10);
        // arr.add(20);
        // System.out.println(arr);
        ArrayList<Student> arr=new ArrayList<>();
        Student s1=new Student(21,"Aman",9.8);
        arr.add(s1);
        Student s2=new Student(20,"Chaman",9.2);
        arr.add(s2);
        arr.add(new Student(103,"b",7.4));
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i).name);
        }
        

        

        

    }
    
}





/*
 !   Array                  ArrayList
 ?   Fixed Size             No Fixed Size
 ?   Static                 Dynamic
 ?   can perform CRUD       some operation Missed
 */
