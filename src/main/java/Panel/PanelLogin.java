/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Panel;

import ClassComponent.AccountData;
import Interface.LoginListener;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class PanelLogin extends javax.swing.JPanel {

    /**
     * Creates new form PanelLogin
     */
    private JPanel body;
    //private AccountData acc;
    private LoginListener listener;

    //private HomeFrame home;
    public PanelLogin() {
        initComponents();
        dangky1.setPanel(this);
        dangnhap1.setpanelLogin(this);
        dangnhap1.setLoginListener(new LoginListener() {
            @Override
            public void onLoginSuccess(AccountData account) {
                if(listener!=null)
                {
                    listener.onLoginSuccess(account);
                } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });

        quenMK1.setPanel(this);
    }

    public void setListener(LoginListener listener) {
        this.listener = listener;
    }
    
    
    
    public void setHome(HomeFrame main)
    {
        dangnhap1.setHome(main);
    }
    
    
    public void setBody(JPanel body) {
        //dangky1.setPanelBody(this);
        dangnhap1.setPanelBody(body);
        //quenMK1.setPanelBody(this);
    }
    public void setAccLogin(JPanel acc)
    {
        dangnhap1.setAcc(acc);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dangnhap1 = new Panel.Dangnhap();
        quenMK1 = new Panel.QuenMK();
        dangky1 = new Panel.Dangky();

        setLayout(new java.awt.CardLayout());
        add(dangnhap1, "Dangnhap");
        add(quenMK1, "QuenMK");
        add(dangky1, "Dangky");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Panel.Dangky dangky1;
    private Panel.Dangnhap dangnhap1;
    private Panel.QuenMK quenMK1;
    // End of variables declaration//GEN-END:variables
}
