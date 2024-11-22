package ClassExtend;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class CustomScrollBarUI extends BasicScrollBarUI {

    private static final Color THUMB_COLOR_START = new Color(200, 60, 143); // Màu bắt đầu cho gradient
    private static final Color THUMB_COLOR_END = new Color(112, 136, 210); // Màu kết thúc cho gradient
    private static final Color TRACK_COLOR = new Color(228, 228, 228); // Màu của đường cuộn
    private static final Color BORDER_COLOR = Color.DARK_GRAY; // Màu của viền
    private static final int THUMB_MARGIN = 2; // Khoảng cách giữa thumb và track

    @Override
    protected void configureScrollBarColors() {
        this.trackColor = TRACK_COLOR;
    }

    @Override
    protected JButton createDecreaseButton(int orientation) {
        return createZeroButton();
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        return createZeroButton();
    }

    private JButton createZeroButton() {
        JButton button = new JButton();
        button.setPreferredSize(new Dimension(0, 0));
        button.setMinimumSize(new Dimension(0, 0));
        button.setMaximumSize(new Dimension(0, 0));
        return button;
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        Graphics2D g2 = (Graphics2D) g.create();
        GradientPaint gradientPaint = new GradientPaint(
            thumbBounds.x, thumbBounds.y, THUMB_COLOR_START,
            thumbBounds.x, thumbBounds.y + thumbBounds.height, THUMB_COLOR_END);
        g2.setPaint(gradientPaint);
        g2.fillRoundRect(
            thumbBounds.x + THUMB_MARGIN, thumbBounds.y + THUMB_MARGIN,
            thumbBounds.width - 2 * THUMB_MARGIN, thumbBounds.height - 2 * THUMB_MARGIN, 10, 10); // Bo tròn góc 10px và tạo khoảng cách

        // Vẽ viền
        g2.setColor(BORDER_COLOR);
        g2.drawRoundRect(
            thumbBounds.x + THUMB_MARGIN, thumbBounds.y + THUMB_MARGIN,
            thumbBounds.width - 2 * THUMB_MARGIN, thumbBounds.height - 2 * THUMB_MARGIN, 10, 10); // Vẽ viền bo góc

        g2.dispose();
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setPaint(TRACK_COLOR);
        g2.fillRoundRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height, 10, 10); // Bo tròn góc 10px
        g2.dispose();
    }
}
