package ClassExtend;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelCustom extends JPanel {
    private Color borderColor;
    private int cornerRadius;
    private int borderWidth;
    private Image backgroundImage;

    public PanelCustom() {
    }

    public PanelCustom(int radius, Color borderColor, int borderWidth, String imagePath, boolean b) {
        this.cornerRadius = radius;
        this.borderColor = borderColor;
        this.borderWidth = borderWidth;
        if (imagePath != null && !imagePath.isEmpty()) {
            this.backgroundImage = new ImageIcon(imagePath).getImage();
        }
        setOpaque(b);  // Đặt panel thành không trong suốt để hỗ trợ hiển thị ảnh PNG
    }

    public void setBackgroundImage(String imagePath) {
        this.backgroundImage = new ImageIcon(imagePath).getImage();
        repaint();
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        repaint();
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
        repaint();
    }

    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // Tạo hình chữ nhật bo góc
        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float(0, 0, width, height, cornerRadius, cornerRadius);
        Area area = new Area(roundedRectangle);

        // Vẽ màu nền (chỉ vẽ nếu không có ảnh nền)
        if (backgroundImage == null) {
            graphics.setClip(area);
            graphics.setColor(getBackground());
            graphics.fill(area);
        }

        // Vẽ hình ảnh nền
        if (backgroundImage != null) {
            graphics.setClip(area);
            graphics.drawImage(backgroundImage, 0, 0, width, height, this);
        }
        graphics.setClip(null);

        // Vẽ viền bo góc
        if (borderColor != null && borderWidth > 0) {
            graphics.setColor(borderColor);
            graphics.setStroke(new BasicStroke(borderWidth));
            graphics.draw(roundedRectangle);
        }

        graphics.dispose();
    }
}
