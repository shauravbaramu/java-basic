import javax.swing.JOptionPane;



public class Practice {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Your name is "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        JOptionPane.showMessageDialog(null, "Your age is "+ age);
    }
}
