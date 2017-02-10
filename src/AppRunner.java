import javax.swing.*;

public class AppRunner {
    public static void main(String[] CHAND){
        ActionServer frame = new ActionServer(500, 600);
        frame.setTitle("CI- Calculator");
        //frame.setSize(350, 500);
        frame.getContentPane().setBackground(Helper.darkGrey);
        frame.setLocationRelativeTo(null);
        //frame.setMaximizedBounds(new Rectangle(300, 200));
        frame.setResizable(false);
        ImageIcon img = new ImageIcon("assets/calculator-icon.png");
        frame.setIconImage(img.getImage());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
