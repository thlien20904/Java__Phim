package ClassExtend;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHasher {
    
    public String hashPassword(String password) {
        String hashedPassword = null;
        try {
            // Tạo MessageDigest instance cho SHA-256
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            
            // Băm mật khẩu
            byte[] hashBytes = messageDigest.digest(password.getBytes());
            
            // Chuyển đổi mảng byte thành chuỗi hex
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            
            hashedPassword = hexString.toString();
            
            // Cắt ngắn chuỗi băm thành 40 ký tự
            if (hashedPassword.length() > 40) {
                hashedPassword = hashedPassword.substring(0, 40);
            }
            
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        
        return hashedPassword;
    }
}

