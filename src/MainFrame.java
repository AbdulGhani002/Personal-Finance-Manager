import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("C:/CC/Code/Java/Personal Finance Manager/src/manager.png");
        JFrame frame = new JFrame();
        frame.setSize(720, 680);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Personal Finance Manager");

        JPanel imagePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        imagePanel.setLayout(new BorderLayout());
        frame.setContentPane(imagePanel);

        JLabel titleLabel = new JLabel("Personal Finance Manager", SwingConstants.LEFT);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 50));
        imagePanel.add(titleLabel, BorderLayout.NORTH);


        frame.setVisible(true);
    }

}
