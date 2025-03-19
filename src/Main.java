import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aryan's Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        SnakeGame game = new SnakeGame();
        frame.add(game);
        frame.pack();
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
