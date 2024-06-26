//Object Oriented Programming
class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("The specifications of this pen are:");
        System.out.println(this.color + " " + this.type);
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
    }
}