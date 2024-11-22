import javax.swing.*;
import java.awt.*;

public class WatchlistExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Watchlist Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Tạo panel với GridLayout 4 cột, số dòng không giới hạn
        JPanel watchlistPanel = new JPanel(new GridLayout(0, 4, 10, 10)); // 0 dòng nghĩa là số dòng không giới hạn, 4 cột, khoảng cách ngang và dọc 10 pixel

        // Thêm các thành phần vào panel
        for (int i = 1; i <= 20; i++) {
            watchlistPanel.add(new JButton("Item " + i)); // Thay đổi JButton thành thành phần mong muốn
        }

        // Đặt panel vào trong JScrollPane
        JScrollPane scrollPane = new JScrollPane(watchlistPanel);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
