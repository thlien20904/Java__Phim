package ClassExtend;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

public class RoundedBorderFrame extends JFrame {
    private Color borderColor;
    private int borderWidth;
    private int cornerRadius;

    public RoundedBorderFrame(Color borderColor, int borderWidth, int cornerRadius) {
        this.borderColor = borderColor;
        this.borderWidth = borderWidth;
        this.cornerRadius = cornerRadius;
        setUndecorated(true);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Bo góc cho JFrame
        Shape shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);
        setShape(shape);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Vẽ viền bo góc
        Shape borderShape = new RoundRectangle2D.Double(borderWidth / 2.0, borderWidth / 2.0,
                getWidth() - borderWidth, getHeight() - borderWidth, cornerRadius, cornerRadius);

        g2d.setColor(borderColor);
        g2d.setStroke(new java.awt.BasicStroke(borderWidth));
        g2d.draw(borderShape);

        g2d.dispose();
    }
    
}
