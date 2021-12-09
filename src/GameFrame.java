import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {
    Game game;
    JButton resetButton;
    JPanel resetPanel = new JPanel();
    GameFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,1000);
        this.getContentPane().setBackground(new Color(50,50,50));
        this.setLayout(new BorderLayout());
        resetPanel.setLayout(new BorderLayout());
        resetPanel.setBounds(0,0,800,100);
        resetButton = new JButton();
        resetButton.setText("Reset");
        resetButton.setSize(100,50);
        resetButton.setLocation(0,0);
        resetButton.addActionListener(this);
        game = new Game();
        resetPanel.add(resetButton);
        this.add(resetPanel,BorderLayout.SOUTH);
        this.add(game);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetButton){
            this.remove(game);
            game = new Game();
            this.add(game);
            SwingUtilities.updateComponentTreeUI(this);
        }
    }
}
