//Object Oriented Programming
// Learned about various Inheritances
// Learned about polymorphism (It is having multiple functions with same name. can be used different methods by passing parameters)




class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("The specifications of this pen are:");
        System.out.println(this.color + " " + this.type);
    }
    //Non Parameterized Constructor
    Pen(){
        this.color = "red";
        this.type = "gel";
        System.out.println("New Color: " + this.color);
    }
}



class Student{
    String name;
    int age;

    //Parameterized constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;

    }
    public void writeName(){
        System.out.println(this.name + this.age);
    }
}

public class Main {
    public static void main(String[] args) {

        Pen pen1 = new Pen();
        Pen pen2 = new Pen();

        pen1.color = "Green";
        pen1.type = "Dot Pen";
        pen2.color = "Red";
        pen2.type = "Gel Pen";
        pen1.write();
        pen2.write();

        Student s1 = new Student("Saurav",23);
        s1.writeName();
    }
}