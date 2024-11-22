package ClassExtend;

import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Point;

public class DraggableResizableFrame extends JFrame {
    private Point initialClick;
    private JFrame parent;

    public DraggableResizableFrame() {
        // Thiết lập JFrame cơ bản
        setUndecorated(true);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Thêm sự kiện chuột để kéo cửa sổ
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                getComponentAt(initialClick);
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Lấy vị trí hiện tại của cửa sổ
                int thisX = getLocation().x;
                int thisY = getLocation().y;

                // Tính toán vị trí mới của cửa sổ
                int xMoved = e.getX() - initialClick.x;
                int yMoved = e.getY() - initialClick.y;
                int X = thisX + xMoved;
                int Y = thisY + yMoved;

                // Di chuyển cửa sổ đến vị trí mới
                setLocation(X, Y);
            }
        });

        // Cấu hình cho phép thay đổi kích thước
        // Có thể mở rộng thêm, ví dụ kéo các góc và cạnh để thay đổi kích thước
    }
}
