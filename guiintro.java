import javax.swing.JOptionPane;
public class guiintro {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("input name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "hello "+name);
        JOptionPane.showMessageDialog(null, "age is "+ age);
        if (age>=18) {
            JOptionPane.showMessageDialog(null, "you are eligible to vote");
        } else {
            JOptionPane.showMessageDialog(null, "you are not eligible to vote");
        }
    }
}
