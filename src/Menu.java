import javax.swing.*;
import javax.swing.plaf.basic.DefaultMenuLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    JLabel textfield = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JPanel MenuPanel = new JPanel();
    Menu(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame frame=new JFrame();
        JPanel buttonsPanel = new JPanel();

        JButton onePlayer=new JButton("One Player");
        onePlayer.setMaximumSize(new Dimension(200,100));
        onePlayer.setFont(new Font("MV Boli",Font.BOLD,20));
        onePlayer.setForeground(new Color(0,255,0));
        onePlayer.setBackground(new Color(0,0,0));

        JButton twoPlayer = new JButton("Two Player");
        twoPlayer.setMaximumSize(new Dimension(200,100));
        twoPlayer.setFont(new Font("MV Boli",Font.BOLD,20));
        twoPlayer.setForeground(new Color(0,255,0));
        twoPlayer.setBackground(new Color(0,0,0));

        JButton exit = new JButton("Exit");
        exit.setMaximumSize(new Dimension(200,100));
        exit.setFont(new Font("MV Boli",Font.BOLD,20));
        exit.setForeground(new Color(0,255,0));
        exit.setBackground(new Color(0,0,0));

        twoPlayer.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
                GameFrame2 gameFrame2 = new GameFrame2();
            }
        });
        onePlayer.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
                GameFrame gameFrame = new GameFrame();
            }
        });
        exit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });

        textfield.setBackground(new Color(0,0,0));
        textfield.setForeground(new Color(25,255,0));
        textfield.setFont(new Font("Ink Free",Font.BOLD,60));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        buttonsPanel.setLayout(new BoxLayout(buttonsPanel,BoxLayout.Y_AXIS));
        buttonsPanel.setPreferredSize(new Dimension(450,600));
        buttonsPanel.setBackground(new Color(150,150,150));
        buttonsPanel.add(Box.createRigidArea(new Dimension(10, 30)));
        buttonsPanel.add(textfield);
        buttonsPanel.add(Box.createRigidArea(new Dimension(50, 30)));
        buttonsPanel.add(onePlayer);
        buttonsPanel.add(Box.createRigidArea(new Dimension(100, 20)));
        buttonsPanel.add(twoPlayer);
        buttonsPanel.add(Box.createRigidArea(new Dimension(100, 20)));
        buttonsPanel.add(exit);

        textPanel.add(textfield);
        buttonPanel.setBackground(new Color(150,150,150));
        buttonPanel.add(buttonsPanel);
        MenuPanel.setLayout(new BoxLayout(MenuPanel,BoxLayout.Y_AXIS));
        MenuPanel.add(textPanel);
        MenuPanel.add(buttonPanel);
        MenuPanel.setBackground(new Color(150,150,150));
        textPanel.setBackground(new Color(0,0,0));

        frame.add(MenuPanel);
        frame.setSize(800,800);//400 width and 500 height
        frame.getContentPane().setBackground(new Color (50,50,50));
        frame.setLayout(new GridBagLayout());
        frame.setVisible(true);//making the frame visible
    }
}
