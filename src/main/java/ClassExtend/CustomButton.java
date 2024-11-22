package ClassExtend;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;

public class CustomButton extends JButton {
    private float transparency;
    private Color borderColor;
    private int borderRadius;
    private float borderWidth;

    public CustomButton(float transparency, Color borderColor, int borderRadius, float borderWidth) {
        this.transparency = transparency;
        this.borderColor = borderColor;
        this.borderRadius = borderRadius;
        this.borderWidth = borderWidth;
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Vẽ viền bo góc
        g2d.setColor(borderColor);
        g2d.setStroke(new java.awt.BasicStroke(borderWidth));
        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float(borderWidth / 2, borderWidth / 2,
                getWidth() - borderWidth, getHeight() - borderWidth, borderRadius, borderRadius);
        g2d.draw(roundedRectangle);
        
        g2d.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        // Bỏ qua vẽ viền mặc định
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, transparency));
        super.paint(g2d);
    }

    // Phương thức để thay đổi độ trong suốt
    public void setTransparency(float transparency) {
        this.transparency = transparency;
        repaint();
    }

    // Phương thức để thay đổi màu viền
    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        repaint();
    }

    // Phương thức để thay đổi bán kính bo góc
    public void setBorderRadius(int borderRadius) {
        this.borderRadius = borderRadius;
        repaint();
    }

    // Phương thức để thay đổi độ dày viền
    public void setBorderWidth(float borderWidth) {
        this.borderWidth = borderWidth;
        repaint();
    }
}
