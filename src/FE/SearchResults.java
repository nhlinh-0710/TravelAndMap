package FE;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SearchResults extends javax.swing.JFrame {

    public SearchResults() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        Ten_Logo = new javax.swing.JLabel();
        btn_home1 = new javax.swing.JButton();
        btn_language = new javax.swing.JButton();
        btn_aboutUs = new javax.swing.JButton();
        btn_contact1 = new javax.swing.JButton();
        btn_explore = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_KetQuaTimKiem = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        KhungChuaAnh1 = new javax.swing.JLabel();
        btn_XemThem1 = new javax.swing.JButton();
        text_MoTaDiaDiem1 = new javax.swing.JTextField();
        text_TenDiaDiem1 = new javax.swing.JTextField();
        text_GiaTien1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        KhungChuaAnh2 = new javax.swing.JLabel();
        btn_XemThem2 = new javax.swing.JButton();
        text_TenDiaDiem2 = new javax.swing.JTextField();
        text_MoTaDiaDiem2 = new javax.swing.JTextField();
        text_GiaTien2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        KhungChuaAnh3 = new javax.swing.JLabel();
        btn_XemThem3 = new javax.swing.JButton();
        text_MoTaDiaDiem3 = new javax.swing.JTextField();
        text_GiaTien3 = new javax.swing.JTextField();
        text_TenDiaDiem3 = new javax.swing.JTextField();
        btn_DangBaiViet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(254, 247, 244));
        jPanel2.setPreferredSize(new java.awt.Dimension(1300, 1500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ten_Logo.setFont(new java.awt.Font("Vivaldi", 1, 35)); // NOI18N
        Ten_Logo.setText("Travel and Map");
        jPanel2.add(Ten_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 40, -1, 50));

        btn_home1.setBackground(new java.awt.Color(0, 102, 102));
        btn_home1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_home1.setText("Home");
        btn_home1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_home1.setBorderPainted(false);
        btn_home1.setContentAreaFilled(false);
        btn_home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 37, -1, 71));

        btn_language.setBackground(new java.awt.Color(0, 102, 102));
        btn_language.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_language.setText("Language");
        btn_language.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_language.setBorderPainted(false);
        btn_language.setContentAreaFilled(false);
        btn_language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_languageActionPerformed(evt);
            }
        });
        jPanel2.add(btn_language, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 58, -1, -1));

        btn_aboutUs.setBackground(new java.awt.Color(0, 102, 102));
        btn_aboutUs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_aboutUs.setText("About Us");
        btn_aboutUs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_aboutUs.setBorderPainted(false);
        btn_aboutUs.setContentAreaFilled(false);
        btn_aboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutUsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_aboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 38, -1, 70));

        btn_contact1.setBackground(new java.awt.Color(0, 102, 102));
        btn_contact1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_contact1.setText("Contact");
        btn_contact1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_contact1.setBorderPainted(false);
        btn_contact1.setContentAreaFilled(false);
        btn_contact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contact1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_contact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 37, -1, 71));

        btn_explore.setBackground(new java.awt.Color(0, 0, 0));
        btn_explore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_explore.setText("Explore");
        btn_explore.setBorder(null);
        btn_explore.setContentAreaFilled(false);
        btn_explore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exploreActionPerformed(evt);
            }
        });
        jPanel2.add(btn_explore, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 38, 97, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Search Results: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txt_KetQuaTimKiem.setBackground(new java.awt.Color(254, 247, 244));
        txt_KetQuaTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_KetQuaTimKiem.setBorder(null);
        txt_KetQuaTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_KetQuaTimKiemActionPerformed(evt);
            }
        });
        jPanel2.add(txt_KetQuaTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 390, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KhungChuaAnh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhungChuaAnh1MouseClicked(evt);
            }
        });
        jPanel1.add(KhungChuaAnh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 250));

        btn_XemThem1.setText("Xem Thêm");
        jPanel1.add(btn_XemThem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 110, 30));

        text_MoTaDiaDiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_MoTaDiaDiem1ActionPerformed(evt);
            }
        });
        jPanel1.add(text_MoTaDiaDiem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 310, 140));

        text_TenDiaDiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_TenDiaDiem1ActionPerformed(evt);
            }
        });
        jPanel1.add(text_TenDiaDiem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 310, -1));

        text_GiaTien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_GiaTien1ActionPerformed(evt);
            }
        });
        jPanel1.add(text_GiaTien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 162, 170, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 850, 250));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KhungChuaAnh2.setText("Ảnh 2");
        KhungChuaAnh2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhungChuaAnh2MouseClicked(evt);
            }
        });
        jPanel3.add(KhungChuaAnh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 250));

        btn_XemThem2.setText("Xem Thêm");
        jPanel3.add(btn_XemThem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 110, 30));

        text_TenDiaDiem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_TenDiaDiem2ActionPerformed(evt);
            }
        });
        jPanel3.add(text_TenDiaDiem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 310, -1));

        text_MoTaDiaDiem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_MoTaDiaDiem2ActionPerformed(evt);
            }
        });
        jPanel3.add(text_MoTaDiaDiem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 310, 140));

        text_GiaTien2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_GiaTien2ActionPerformed(evt);
            }
        });
        jPanel3.add(text_GiaTien2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 170, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 850, 250));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KhungChuaAnh3.setText("Ảnh 3");
        KhungChuaAnh3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhungChuaAnh3MouseClicked(evt);
            }
        });
        jPanel4.add(KhungChuaAnh3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 250));

        btn_XemThem3.setText("Xem Thêm");
        jPanel4.add(btn_XemThem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 110, 30));

        text_MoTaDiaDiem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_MoTaDiaDiem3ActionPerformed(evt);
            }
        });
        jPanel4.add(text_MoTaDiaDiem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 310, 140));

        text_GiaTien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_GiaTien3ActionPerformed(evt);
            }
        });
        jPanel4.add(text_GiaTien3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 162, 170, 30));

        text_TenDiaDiem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_TenDiaDiem3ActionPerformed(evt);
            }
        });
        jPanel4.add(text_TenDiaDiem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 310, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 710, 850, 250));

        btn_DangBaiViet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_DangBaiViet.setText("Add article");
        btn_DangBaiViet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangBaiVietActionPerformed(evt);
            }
        });
        jPanel2.add(btn_DangBaiViet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, 110, 40));

        jScrollPane2.setViewportView(jPanel2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private String national, city, location_name, category;
    private Connection connection;

    // Constructor
    public SearchResults(String national, String city, String location_name, String category, String inputText) {
        initComponents();
       

         parseInputAndSearch(inputText);
    }
    private void parseInputAndSearch(String inputText) {
    // Cắt chuỗi input: "VietNam, DaNang, CauRong"
    String[] parts = inputText.split(",");
    this.national = parts.length > 0 ? parts[0].trim() : "";
    this.city = parts.length > 1 ? parts[1].trim() : "";
    this.location_name = parts.length > 2 ? parts[2].trim() : "";
    this.category = ""; // Cho phép để trống sở thích

    connectToDatabase();
    showSearchResults();
}

    // Phương thức kết nối với cơ sở dữ liệu
    private void connectToDatabase() {
        String url = "jdbc:mysql://localhost:3306/travelandmap";
        String user = "root";
        String password = "";

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Kết nối thành công!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Không thể kết nối cơ sở dữ liệu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Phương thức lấy dữ liệu từ database theo từ khóa
    private void showSearchResults() {
        StringBuilder query = new StringBuilder("SELECT * FROM tbldatabase_post WHERE 1=1");

        if (!national.isEmpty()) query.append(" AND LOWER(National) LIKE ?");
        if (!city.isEmpty()) query.append(" AND LOWER(City) LIKE ?");
        if (!location_name.isEmpty()) query.append(" AND LOWER(location_name) LIKE ?");
        if (!category.isEmpty()) query.append(" AND LOWER(category) LIKE ?");

        try (PreparedStatement stmt = connection.prepareStatement(query.toString())) {
            int index = 1;
            if (!national.isEmpty()) stmt.setString(index++, "%" + national.toLowerCase() + "%");
            if (!city.isEmpty()) stmt.setString(index++, "%" + city.toLowerCase() + "%");
            if (!location_name.isEmpty()) stmt.setString(index++, "%" + location_name.toLowerCase() + "%");
            if (!category.isEmpty()) stmt.setString(index++, "%" + category.toLowerCase() + "%");

            ResultSet rs = stmt.executeQuery();

            int count = 0;
            while (rs.next() && count < 3) {
                switch (count) {
                    case 0:
                        text_TenDiaDiem1.setText(rs.getString("location_name"));
                        text_MoTaDiaDiem1.setText(rs.getString("description"));
                        text_GiaTien1.setText(rs.getString("price"));
                        KhungChuaAnh1.setIcon(convertBlobToImage(rs.getBlob("image")));
                        break;
                    case 1:
                        text_TenDiaDiem2.setText(rs.getString("location_name"));
                        text_MoTaDiaDiem2.setText(rs.getString("description"));
                        text_GiaTien2.setText(rs.getString("price"));
                        KhungChuaAnh2.setIcon(convertBlobToImage(rs.getBlob("image")));
                        break;
                    case 2:
                        text_TenDiaDiem3.setText(rs.getString("location_name"));
                        text_MoTaDiaDiem3.setText(rs.getString("description"));
                        text_GiaTien3.setText(rs.getString("price"));
                        KhungChuaAnh3.setIcon(convertBlobToImage(rs.getBlob("image")));
                        break;
                }
                count++;
            }

            if (count == 0) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả phù hợp!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        txt_KetQuaTimKiem.setText(national + ", " + city + ", " + location_name + ", " + category);
    }

    // Phương thức chuyển đổi Blob thành ImageIcon
    private ImageIcon convertBlobToImage(Blob blob) {
        try {
            byte[] imageBytes = blob.getBytes(1, (int) blob.length());
            ImageIcon icon = new ImageIcon(imageBytes);
            Image scaledImage = icon.getImage().getScaledInstance(300, 250, Image.SCALE_SMOOTH);
            return new ImageIcon(scaledImage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void btn_home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home1ActionPerformed
        // TODO add your handling code here:
        Home dk = new Home();

        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_home1ActionPerformed

    private void btn_languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_languageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_languageActionPerformed

    private void btn_aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_aboutUsActionPerformed

    private void btn_contact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contact1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_contact1ActionPerformed

    private void btn_exploreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exploreActionPerformed

        Explore dk = new Explore();

        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_exploreActionPerformed

    private void btn_DangBaiVietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangBaiVietActionPerformed
        // TODO add your handling code here:
        AddArticle dk = new AddArticle();

        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_DangBaiVietActionPerformed

    private void txt_KetQuaTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_KetQuaTimKiemActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txt_KetQuaTimKiemActionPerformed


    private void text_TenDiaDiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_TenDiaDiem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_TenDiaDiem1ActionPerformed

    private void text_MoTaDiaDiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_MoTaDiaDiem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_MoTaDiaDiem1ActionPerformed

    private void text_GiaTien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_GiaTien1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_GiaTien1ActionPerformed

    private void KhungChuaAnh1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhungChuaAnh1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_KhungChuaAnh1MouseClicked

    private void text_MoTaDiaDiem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_MoTaDiaDiem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_MoTaDiaDiem2ActionPerformed

    private void text_GiaTien2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_GiaTien2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_GiaTien2ActionPerformed

    private void text_TenDiaDiem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_TenDiaDiem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_TenDiaDiem2ActionPerformed

    private void text_MoTaDiaDiem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_MoTaDiaDiem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_MoTaDiaDiem3ActionPerformed

    private void text_GiaTien3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_GiaTien3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_GiaTien3ActionPerformed

    private void text_TenDiaDiem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_TenDiaDiem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_TenDiaDiem3ActionPerformed

    private void KhungChuaAnh2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhungChuaAnh2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_KhungChuaAnh2MouseClicked

    private void KhungChuaAnh3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhungChuaAnh3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_KhungChuaAnh3MouseClicked

    public static void main(String args[]) {
        try {
            FlatLightLaf.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchResults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KhungChuaAnh1;
    private javax.swing.JLabel KhungChuaAnh2;
    private javax.swing.JLabel KhungChuaAnh3;
    private javax.swing.JLabel Ten_Logo;
    private javax.swing.JButton btn_DangBaiViet;
    private javax.swing.JButton btn_XemThem1;
    private javax.swing.JButton btn_XemThem2;
    private javax.swing.JButton btn_XemThem3;
    private javax.swing.JButton btn_aboutUs;
    private javax.swing.JButton btn_contact1;
    private javax.swing.JButton btn_explore;
    private javax.swing.JButton btn_home1;
    private javax.swing.JButton btn_language;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField text_GiaTien1;
    private javax.swing.JTextField text_GiaTien2;
    private javax.swing.JTextField text_GiaTien3;
    private javax.swing.JTextField text_MoTaDiaDiem1;
    private javax.swing.JTextField text_MoTaDiaDiem2;
    private javax.swing.JTextField text_MoTaDiaDiem3;
    private javax.swing.JTextField text_TenDiaDiem1;
    private javax.swing.JTextField text_TenDiaDiem2;
    private javax.swing.JTextField text_TenDiaDiem3;
    private javax.swing.JTextField txt_KetQuaTimKiem;
    // End of variables declaration//GEN-END:variables
}
