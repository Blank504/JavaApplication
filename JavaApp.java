import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class JavaApp {
    public static void main (String[] args){

        String s1[] = { "cat","dog","elephant","lion","gorrila","meow" };
        String week[]= { "Monday","Tuesday","Wednesday",
                         "Thursday","Friday","Saturday","Sunday"};
         

        JFrame frame = new JFrame("Example Java App");
        ImageIcon appicon = new ImageIcon("C:/Users/Admin/Downloads/Ote4UrfQ.jpg");
        JLabel lbl = new JLabel("Name:");
        JTextField tf = new JTextField("Enter your name");
        JLabel lbl2 = new JLabel("Address:");
        JTextField tf2 = new JTextField("Enter your address");
         JLabel lbl3 = new JLabel("Email:");
         JTextField tf3 = new JTextField("Enter your email");
         JLabel lpw = new JLabel("Password:");
         JPasswordField pw = new JPasswordField();
         JCheckBox cb = new JCheckBox("Male");
         JCheckBox cb2 = new JCheckBox("Female");
         JRadioButton rb = new JRadioButton("meow");
        JButton btn = new JButton("Submit");
        JTextArea ta = new JTextArea("This is khai");
        JComboBox c = new JComboBox<>(s1);
        JList l = new JList<>(week);
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("Menu");
        JMenuItem mi1 =new JMenuItem("First");
         JMenuItem mi2 =new JMenuItem("Second "); 
         JMenuItem mi3 =new JMenuItem("Third");
        

        lbl.setBounds(5,10,50,30);
        tf.setBounds(100,10,100,30);
        lbl2.setBounds(5,50,75,30);
        tf2.setBounds(100,50,200,30);
        lbl3.setBounds(5,90,50,30);
        tf3.setBounds(100,90,200,30);
        lpw.setBounds(5,130,200,30);
        pw.setBounds(100,130,200,30);
        cb.setBounds(100, 170, 100, 30);
        cb2.setBounds(200, 170, 100, 30);
        rb.setBounds(300, 170, 100, 30);
        btn.setBounds(5,210,75,30);
        ta.setBounds(5,250,500,30);
        c.setBounds(5, 290, 100, 30);
        l.setBounds(5, 320, 100, 130);
        
        frame.add(lbl);
        frame.add(tf);
        frame.add(lbl2);
        frame.add(tf2);
        frame.add(lbl3);
        frame.add(tf3);
        frame.add(lpw);
        frame.add(pw);
        frame.add(cb);
        frame.add(cb2);
        frame.add(rb);
        frame.add(btn);
        frame.add(ta);
         frame.add(c);
         frame.add(l);
         m.add(mi1);
         m.add(mi2);
         m.add(mi3);
         mb.add(m);
   
         frame.setJMenuBar(mb);
        frame.setIconImage(appicon.getImage());
       frame.setLayout(null);
       frame.setSize(900,900);
       frame.setVisible(true);
       



    }
}
