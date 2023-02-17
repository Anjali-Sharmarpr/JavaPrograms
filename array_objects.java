//creating array of objects (to store different type of elements)

 class Student{
     String name;
     int marks;
}
public class array_objects {
    public static void main(String args[]){

        Student s1= new Student();
        s1.name="Anjali";
        s1.marks=65;

        Student s2= new Student();
        s2.name="Ruth";
        s2.marks=99;

        Student s3= new Student();
        s3.name="Harry";
        s3.marks=41;

        Student s4= new Student();
        s4.name="Chris";
        s4.marks=75;

         Student arr[]=new Student[4];
         arr[0]=s1;
         arr[1]=s2;
         arr[2]=s3;
         arr[3]=s4;

         for (Student i : arr){
            System.out.println(i.name + " "+ " : "+ i.marks );
         }

    }
}
