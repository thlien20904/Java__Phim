package ClassExtend;


import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JPasswordField;


public class PasswordTextField extends JPasswordField {
    private String placeholder;

    public PasswordTextField(String placeholder) {
        this.placeholder = placeholder;
        setEchoChar((char) 0); // Để placeholder hiện ra
        setText(placeholder);
        setForeground(Color.GRAY);

        addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (new String(getPassword()).equals(placeholder)) {
                    setText("");
                    setEchoChar('•'); // Đổi sang ký tự ẩn khi nhập
                    setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (getPassword().length == 0) {
                    setEchoChar((char) 0); // Hiện placeholder nếu trống
                    setText(placeholder);
                    setForeground(Color.GRAY);
                }
            }
        });
    }
}