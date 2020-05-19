import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIMain extends JComponent {
    static JFrame frame = new JFrame();
    static JPanel jPanel = new JPanel();
    JButton jButton =new JButton("Start");
    JButton jButton1 =new JButton("Options");
    JButton jButton2 =new JButton("Exit");

    GUIMain(){
        frame = getFrame();
        frame.add(jPanel);
        jPanel.add(jButton);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.revalidate();

        }

        static JFrame getFrame(){
            frame.setVisible(true);
            frame.setResizable(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Stormy Travel");
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension dimension = toolkit.getScreenSize();
            frame.setBounds(dimension.width / 2 - 125, dimension.height / 2 - 125, 250, 250);
            return frame;
        }
    }

