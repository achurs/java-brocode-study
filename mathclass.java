import javax.swing.JOptionPane;
public class mathclass {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "enter the 2 sides of the triangle");
        int a=Integer.parseInt(JOptionPane.showInputDialog("enter a"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("enter b"));
        double hyp = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        JOptionPane.showMessageDialog(null, "the hypotunuse is "+hyp);
    }
}
