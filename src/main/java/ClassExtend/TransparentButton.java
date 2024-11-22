package ClassExtend;

import java.awt.AlphaComposite;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TransparentButton extends JButton {
    private float transparency;

    public TransparentButton(float transparency) {
        this.transparency = transparency;
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Chỉ thiết lập độ trong suốt cho phần vẽ của button
        g2d.setComposite(AlphaComposite.SrcOver.derive(transparency));
        
        // Không vẽ nền, chỉ vẽ phần nội dung của button
        super.paintComponent(g2d);
        g2d.dispose();
    }
    
    // Phương thức để thay đổi độ trong suốt
    public void setTransparency(float transparency) {
        this.transparency = transparency;
        repaint();
    }
}
