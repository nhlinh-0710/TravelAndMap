package FE;

import BE.DatabaseHelper;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ThongTinNguoiDung extends javax.swing.JFrame {

    public ThongTinNguoiDung(String phoneNumber) {
        initComponents();
        jTextField_SDT.setText(phoneNumber);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Ten = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jTextField_SDT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_DiaChi = new javax.swing.JTextField();
        btn_LuuThongTin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Sign up");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 140, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Let’s get you all st up so you can access your personal account.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 510, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));
        jPanel1.add(jTextField_Ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 520, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Phone Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));
        jPanel1.add(jTextField_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 250, 40));
        jPanel1.add(jTextField_SDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 250, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Address");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));
        jPanel1.add(jTextField_DiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 520, 40));

        btn_LuuThongTin.setBackground(new java.awt.Color(204, 51, 255));
        btn_LuuThongTin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_LuuThongTin.setText("Create account");
        btn_LuuThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LuuThongTinActionPerformed(evt);
            }
        });
        jPanel1.add(btn_LuuThongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 250, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 700, 700));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/image_SignUp.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 370, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LuuThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuThongTinActionPerformed
        // TODO add your handling code here:
        String phone = jTextField_SDT.getText();
        String name = jTextField_Ten.getText();
        String email = jTextField_Email.getText();
        String address = jTextField_DiaChi.getText();

        try (Connection conn = DatabaseHelper.getConnection()) {
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "K\u1ebft n\u1ed1i c\u01a1 s\u1edf d\u1eef li\u1ec7u th\u1ea5t b\u1ea1i!");
                return;
            }
            String query = "INSERT INTO tbl_thongtinnguoidung (phone_number, name, email, address) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, phone);
            stmt.setString(2, name);
            stmt.setString(3, email);
            stmt.setString(4, address);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "L\u01b0u th\u00f4ng tin th\u00e0nh c\u00f4ng!");
            new Home().setVisible(true);
            this.setVisible(false);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "L\u1ed7i l\u01b0u d\u1eef li\u1ec7u!");
        }
    }//GEN-LAST:event_btn_LuuThongTinActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new ThongTinNguoiDung("").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_LuuThongTin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_DiaChi;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_SDT;
    private javax.swing.JTextField jTextField_Ten;
    // End of variables declaration//GEN-END:variables
}
