import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Main extends JFrame{

    private JTabbedPane tabbedPane1;
    private JPanel MainPanel;
    private JLabel FirstName;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JTextField textField4;
    private JTextField textField5;
    private JProgressBar progressBar1;
    private JTextField textField6;
    private JSpinner spinner1;
    private JComboBox comboBox2;
    private JComboBox comboBox4;
    private JTextField textField7;

    public Main() {
        setContentPane(MainPanel);
        setTitle("Application Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,800);
        setVisible(true);
        //First Name
        textField1.addActionListener(new ActionListener() {
            boolean NameAdd = false;
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!(textField1.getText().equals("")) && !NameAdd) {
                    //adds to progress bar
                    progressBar1.setValue(progressBar1.getValue()+20);
                    NameAdd = true;
                }
            }
        });
        //Last Name
        textField2.addActionListener(new ActionListener() {
            boolean NameAdd = false;
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!(textField2.getText().equals("")) && !NameAdd) {
                    //adds to progress bar
                    progressBar1.setValue(progressBar1.getValue()+20);
                    NameAdd = true;
                }
            }
        });

        spinner1.setModel(new SpinnerNumberModel(1,1,31,1));

        //Salary
        textField5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        new Main();
    }


}
