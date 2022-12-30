import javax.swing.*;

public class JavaApp {
    public static void main (String[] args){

        JFrame frame = new JFrame("Example Java App");
        
        JPanel p = new JPanel();
        ImageIcon icon= new ImageIcon("C:/Users/Admin/Downloads/sword-sheath-s-child-manga-manhua-webtoon-hd-wallpaper-preview.jpg");
        ImageIcon appicon = new ImageIcon("C:/Users/Admin/Downloads/Ote4UrfQ.jpg");
        JLabel lbl = new JLabel("This picture is aswome",icon,SwingConstants.HORIZONTAL);
        
        // lbl.setText("Hello World");
        // frame.add(lbl);
        p.add(lbl);
        frame.add(p);
        frame.setIconImage(appicon.getImage());
       
       frame.setSize(900,900);
       frame.setVisible(true);
       



    }
}
