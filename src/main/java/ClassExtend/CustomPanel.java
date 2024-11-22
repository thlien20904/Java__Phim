package ClassExtend;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class CustomPanel extends JPanel {
    private BufferedImage backgroundImage;
    private Color borderColor = null;
    private int borderWidth = 0;
    private int cornerRadius = 0;

    // Constructor rỗng
    public CustomPanel() {
        // Cài đặt mặc định nếu cần
    }

    // Phương thức đặt hình ảnh nền
    public void setBackgroundImage(String imagePath) {
        try {
            backgroundImage = ImageIO.read(new File(imagePath));
            repaint();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Phương thức đặt màu viền
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        repaint();
    }

    // Phương thức đặt độ dày viền
    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
        repaint();
    }

    // Phương thức đặt góc bo tròn
    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
        repaint();
    }
    
    public void setPanelAttributes(Color borderColor, int borderWidth, int cornerRadius, String imagePath) {
        setBorderColor(borderColor);
        setBorderWidth(borderWidth);
        setCornerRadius(cornerRadius);
        setBackgroundImage(imagePath);
    }
        
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();

        // Vẽ nền
        if (backgroundImage != null) {
            g2.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        } else {
            g2.setColor(getBackground());
            g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius));
        }

        // Vẽ viền
        g2.setColor(borderColor);
        g2.setStroke(new BasicStroke(borderWidth));
        g2.draw(new RoundRectangle2D.Double(borderWidth / 2.0, borderWidth / 2.0, getWidth() - borderWidth, getHeight() - borderWidth, cornerRadius, cornerRadius));

        g2.dispose();
    }
}
