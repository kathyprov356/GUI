import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtStname;
    private JButton calculateButton;
    private JTextField txtM1;
    private JTextField txtM2;
    private JTextField txtM3;
    private JTextField txtAvg;
    private JPanel Main;
    private JTextField txtTotal;
    private JLabel txtTermAss;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
    calculateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int m1, m2, m3, TA, tot;
            double avg;

            m1 = Integer.parseInt(txtM1.getText());
            m2 = Integer.parseInt(txtM2.getText());
            m3 = Integer.parseInt(txtM3.getText());

            tot = (int) ((m1 * .25) + (m2 * .40) + (m3 * .35));


            txtTotal.setText(String.valueOf(tot));


            if(tot > 75) {
                txtAvg.setText("Pass");
            } else {

                txtAvg.setText("Failed");
            }




        }
    });
}
}
