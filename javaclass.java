import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class javaclass {
    public static void main (String[] args){
    JFrame frame = new JFrame("My App");
    JLabel l = new JLabel("Name");
    JLabel l2 = new JLabel("Copied name");
    JTextField tf = new JTextField("");
    JTextField tf2 = new JTextField("");
    JButton copybtn = new JButton("Copy Name");


    l.setBounds(5,100,100,30);
    l2.setBounds(5,140,100,30);
    tf.setBounds(100,100,200,30);
    tf2.setBounds(100,140,200,30);
    copybtn.setBounds(100,375,200,30);


    ActionListener al = new ActionListener(){
   
         public void actionPerformed(ActionEvent e){
            tf2.setText(tf.getText());
        }
        };

        copybtn.addActionListener(al);

      frame.add(l);
      frame.add(l2);
      frame.add(tf);
      frame.add(tf2);
      frame.add(copybtn);
      frame.setLayout(null);
      frame.setSize(400,500);
      frame.setVisible(true);

}  


}
