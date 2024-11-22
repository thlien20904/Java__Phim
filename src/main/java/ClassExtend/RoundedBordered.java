package ClassExtend;

import javax.swing.border.Border;
import java.awt.*;

public class RoundedBordered implements Border {

    private int radius;
    private Color borderColor;

    public RoundedBordered(int radius, Color borderColor) {
        this.radius = radius;
        this.borderColor = borderColor;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        // Tăng padding thêm để nội dung không bị cắt
        int padding = radius / 2 + 5; // Điều chỉnh giá trị để đảm bảo chữ không bị cắt
        return new Insets(padding, padding, padding, padding);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Vẽ viền bo góc
        g2.setColor(borderColor);
        g2.drawRoundRect(x + 1, y + 1, width - 2, height - 2, radius, radius);

        g2.dispose();
    }
}

