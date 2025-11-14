import javax.swing.*;

public class Main extends JFrame{

    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JLabel FirstName;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JTextField textField4;

    public Main() {
        setTitle("Application Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,800);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
