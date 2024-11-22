package ClassExtend;

import javax.swing.*;
import java.awt.*;

public class ImageBackGround extends JPanel {
    private Image backgroundImage;

    public ImageBackGround(String imagePath) {
        this.backgroundImage = new ImageIcon(imagePath).getImage();
    }

    public ImageBackGround() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void setImg(String imagePath)
    {
        this.backgroundImage = new ImageIcon(imagePath).getImage();
        this.repaint();
        this.validate();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}
