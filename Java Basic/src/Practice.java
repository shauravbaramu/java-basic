//import javax.swing.JOptionPane; // Simple GUI dialog box for user input and show messages
import java.util.Scanner; // Used to take user input


public class Practice {

    public static void main(String[] args) {
//        String name = JOptionPane.showInputDialog("What is your name?");
//        JOptionPane.showMessageDialog(null, "Your name is "+ name);
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
//        JOptionPane.showMessageDialog(null, "Your age is "+ age);
//
//        String food = JOptionPane.showInputDialog("What is your favourite food?");
//        JOptionPane.showMessageDialog(null, "Your favourite food is "+ food);

        //First we need to create object of scanner inorder to use it
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("What is your age?");
        int age = sc.nextInt();
        sc.nextLine(); // Here we called nextLine method because when we use nextInt it only reads numeric data and ignores other
                        // when user press enter after providing data it accepts \n as data and it ignores that data but next time nextLine is called
                        // It accepts that as the data beofre we enter so all we need to do is call it once again after nextInt

        System.out.println("What is your favourite food?");
        String food = sc.nextLine();

        System.out.println("What is your favourite color?");
        String color = sc.nextLine();




        System.out.println("Your Name is " + name);
        System.out.println("Your Age is " + age);
        System.out.println("Your favourite food is " + food);
        System.out.println("Your color is " + color);

//        if (age <= 19) {
//            System.out.println("You are a Teenager "+ name);
//        }
//        else {
//            System.out.println("You are an adult "+ name);
//
//        }

        //Switch and Cases
        System.out.println("What day is today?");
        String day = sc.nextLine();

        switch (day.toLowerCase()) { // Here used toLowerCase function so that the switch works regardless of whatever may be the input case like user
                                        // might inout capitalized or smaller.
            case "sunday": System.out.println("It is Sunday");
            break;
            case "monday": System.out.println("It is Monday");
            break;
            case "tuesday": System.out.println("It is Tuesday");
            break;
            case "wednesday": System.out.println("It is Wednesday");
            break;
            case "thursday": System.out.println("It is Thursday");
            break;
            case "friday": System.out.println("It is Friday");
            break;
            case "saturday": System.out.println("It is Saturday");

        }




        sc.close();
    }
}
