package FE;

import BE.DatabaseHelper;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TrangNhapOTP extends javax.swing.JFrame {

    private String receivedOTP;
    private String userPhoneNumber;

    public TrangNhapOTP(String otp, String phoneNumber) {
        initComponents();
        this.receivedOTP = otp;
        this.userPhoneNumber = phoneNumber;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTextField_NhapMaOTP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_GuiLaiMaOTP = new javax.swing.JButton();
        btn_XacNhapMaOTP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(178, 201, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(215, 225, 247));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/image_TrangNhapOTP.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 440, 490));

        jPanel3.setBackground(new java.awt.Color(242, 246, 252));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("OTP verification");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Enter OTP Code ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        JTextField_NhapMaOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_NhapMaOTPActionPerformed(evt);
            }
        });
        jPanel3.add(JTextField_NhapMaOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 270, 50));

        jLabel4.setText("Didn't receive OTP code? ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 140, -1));

        btn_GuiLaiMaOTP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_GuiLaiMaOTP.setForeground(new java.awt.Color(51, 51, 255));
        btn_GuiLaiMaOTP.setText("Resend Code");
        btn_GuiLaiMaOTP.setContentAreaFilled(false);
        btn_GuiLaiMaOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuiLaiMaOTPActionPerformed(evt);
            }
        });
        jPanel3.add(btn_GuiLaiMaOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        btn_XacNhapMaOTP.setBackground(new java.awt.Color(51, 102, 255));
        btn_XacNhapMaOTP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_XacNhapMaOTP.setForeground(new java.awt.Color(255, 255, 255));
        btn_XacNhapMaOTP.setText("Vertify & Proceed");
        btn_XacNhapMaOTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XacNhapMaOTPActionPerformed(evt);
            }
        });
        jPanel3.add(btn_XacNhapMaOTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 270, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 340, 410));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 1060, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_XacNhapMaOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XacNhapMaOTPActionPerformed
        String enteredOTP = JTextField_NhapMaOTP.getText();
        if (!enteredOTP.equals(receivedOTP)) {
            JOptionPane.showMessageDialog(this, "M\u00e3 OTP kh\u00f4ng \u0111\u00fang, vui l\u00f2ng th\u1eed l\u1ea1i!");
            return;
        }

        if (DatabaseHelper.kiemTraSoDienThoai(userPhoneNumber)) {
            new Home().setVisible(true);
        } else {
            new ThongTinNguoiDung(userPhoneNumber).setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_btn_XacNhapMaOTPActionPerformed

    private void JTextField_NhapMaOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_NhapMaOTPActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_JTextField_NhapMaOTPActionPerformed

    private void btn_GuiLaiMaOTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuiLaiMaOTPActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Hệ thống chưa hỗ trợ gửi lại OTP.");
    }//GEN-LAST:event_btn_GuiLaiMaOTPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Dữ liệu OTP và SĐT giả định để test
        String otp = "123456";
        String phoneNumber = "0909123456";

        java.awt.EventQueue.invokeLater(() -> new TrangNhapOTP(otp, phoneNumber).setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextField_NhapMaOTP;
    private javax.swing.JButton btn_GuiLaiMaOTP;
    private javax.swing.JButton btn_XacNhapMaOTP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
