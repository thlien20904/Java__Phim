package ClassExtend;

import javax.swing.*;
import java.awt.*;

public class CustomLabel extends JLabel {

    public CustomLabel() {
        super();
        
    }

    public void setCustomText(String text) {
        // Sử dụng HTML để tự động xuống dòng
        String htmlText = "<html>" + text + "</html>";
        setText(htmlText);
    }

    @Override
    public void setText(String text) {
        super.setText(text);
        repaint();
    }
}
