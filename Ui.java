import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ui implements ActionListener{
    JFrame fr;
    JRadioButton rb1, rb2, rb3;
    JButton rb4;
    JLabel lb1,lb2;
    ButtonGroup bg;
    String ques[] = {"Do you bring the shopping bag when going shopping?"};
    String op1[] = {"a"};
    String op2[] = {"b"};
    String op3[] = {"c"};
    int cn;

    Ui() {
        fr=new JFrame();
        fr.setLayout(null);
        fr.setSize(600,600);
        Container c=fr.getContentPane();
        c.setBackground(Color.cyan);
        lb1=new JLabel(ques[0]);
        lb1.setBounds(50,50,300,30);
        fr.add(lb1);
        lb1.setFont(new Font("chiller",Font.BOLD,30));
        rb1=new JRadioButton(op1[0]);
        rb1.setBounds(100,120,100,30);
        fr.add(rb1);
        rb2=new JRadioButton(op2[0]);
        rb2.setBounds(350,120,100,30);
        fr.add(rb2);
        rb3=new JRadioButton(op3[0]);
        rb3.setBounds(100,200,100,30);
        fr.add(rb3);
        bg =new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
        rb4.addActionListener(this);

        rb4=new JButton("Next");
        rb4.setBounds(250,400,100,30);
        fr.add(rb4);
        rb4.addActionListener(this);
        fr.setVisible(true);
        }
        public static void main(String s[])
        {
        new Ui();
        }
        public void actionPerformed(ActionEvent e)
        {
        if(e.getSource()==rb4)
        {
        String en="";
        if(rb1.isSelected())
        en=rb1.getText();
        if(rb2.isSelected())
        en=rb2.getText();
        if(rb3.isSelected())
        en=rb3.getText();
        if(rb4.isSelected())
        en=rb4.getText();
        /*
        if(en.equals(ans[cn]))
        JOptionPane.showMessageDialog(null,"Right Answer");
        else
        JOptionPane.showMessageDialog(null,"Wrong Answer");
        }
        */

        /*
        if (e.getSource()==b2)
        {
        cn++;
        lb1.setText(ques[cn]);
        rb1.setText(op1[cn]);
        rb2.setText(op2[cn]);
        rb3.setText(op3[cn]);
        }

        */
        


    }



}
