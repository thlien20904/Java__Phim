import ClassExtend.CustomScrollBarUI;
import javax.swing.*;
import java.awt.*;

public class CustomScrollBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom ScrollBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel watchlistPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10); // Khoảng cách giữa các thành phần

        for (int i = 1; i <= 20; i++) {
            c.gridx = (i - 1) % 4; // Cột từ 0 đến 3
            c.gridy = (i - 1) / 4; // Tăng hàng sau mỗi 4 thành phần
            watchlistPanel.add(new JButton("Item " + i), c);
        }

        JScrollPane scrollPane = new JScrollPane(watchlistPanel);
        scrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        scrollPane.getHorizontalScrollBar().setUI(new CustomScrollBarUI());

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
