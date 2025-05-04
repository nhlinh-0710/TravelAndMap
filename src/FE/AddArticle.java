package FE;

import com.formdev.flatlaf.FlatLightLaf;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;

public class AddArticle extends javax.swing.JFrame {

    private JTextField txt_LocationName;
    private JTextField txt_Address;
    private JTextField txt_Price;
    private JLabel lbl_Image; // nếu có hiển thị ảnh
    private File selectedImageFile; // Dùng để lưu file ảnh tạm thời
    private String selectedNational = "";
    private String selectedCity = "";

    public AddArticle() {
        initComponents();
        txt_LocationName = new JTextField();
        txt_Address = new JTextField();
        txt_Price = new JTextField();
        lbl_Image = new JLabel("Add Image"); // Nếu có label ảnh
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Ten_Logo = new javax.swing.JLabel();
        btn_home1 = new javax.swing.JButton();
        btn_language = new javax.swing.JButton();
        btn_aboutUs = new javax.swing.JButton();
        btn_contact1 = new javax.swing.JButton();
        btn_explore = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_RefreshAddArticle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_QuayLaiSearchResults = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_Submit = new javax.swing.JButton();
        btn_ThemAnh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField_NhapTenDiaDiem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_NhapGiaTien = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_NhapMoTaDiaDiem = new javax.swing.JTextField();
        jComboBox_ChonQuocGia = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_ChonThanhPho = new javax.swing.JComboBox<>();
        btnRadio_Culture = new javax.swing.JRadioButton();
        btnRadio_Nature = new javax.swing.JRadioButton();
        btnRadio_Adventure = new javax.swing.JRadioButton();
        btnRadio_Food = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 247, 244));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 247, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ten_Logo.setFont(new java.awt.Font("Vivaldi", 1, 35)); // NOI18N
        Ten_Logo.setText("Travel and Map");
        jPanel1.add(Ten_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 40, -1, 50));

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
        jPanel1.add(btn_home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 37, -1, 71));

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
        jPanel1.add(btn_language, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 58, -1, -1));

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
        jPanel1.add(btn_aboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 38, -1, 70));

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
        jPanel1.add(btn_contact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 37, -1, 71));

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
        jPanel1.add(btn_explore, new org.netbeans.lib.awtextra.AbsoluteConstraints(852, 38, 97, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel2.setText("Add article");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 140, 60));

        btn_RefreshAddArticle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_RefreshAddArticle.setText("Add article");
        btn_RefreshAddArticle.setBorder(null);
        btn_RefreshAddArticle.setContentAreaFilled(false);
        jPanel1.add(btn_RefreshAddArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 70, 40));

        jLabel1.setText(">");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, 20));

        btn_QuayLaiSearchResults.setText("Search Results");
        btn_QuayLaiSearchResults.setBorder(null);
        btn_QuayLaiSearchResults.setContentAreaFilled(false);
        btn_QuayLaiSearchResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuayLaiSearchResultsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_QuayLaiSearchResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Submit.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_Submit.setText("Submit");
        btn_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubmitActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 110, 50));

        btn_ThemAnh.setText("Add Image");
        btn_ThemAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemAnhActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ThemAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 300, 250));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("Location Name: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jTextField_NhapTenDiaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NhapTenDiaDiemActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_NhapTenDiaDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 420, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setText("Description: ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jTextField_NhapGiaTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NhapGiaTienActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_NhapGiaTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 420, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("City:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jTextField_NhapMoTaDiaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NhapMoTaDiaDiemActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_NhapMoTaDiaDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 420, 30));

        jComboBox_ChonQuocGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VietNam", "USA", "ThaiLand", "Singapore" }));
        jComboBox_ChonQuocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ChonQuocGiaActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox_ChonQuocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 160, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setText("Price: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setText("National: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jComboBox_ChonThanhPho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HaNoi", "DaNang", "HCM", "Hue" }));
        jComboBox_ChonThanhPho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ChonThanhPhoActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox_ChonThanhPho, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 160, -1));

        btnRadio_Culture.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRadio_Culture.setText("Culture");
        btnRadio_Culture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio_CultureActionPerformed(evt);
            }
        });
        jPanel2.add(btnRadio_Culture, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 80, -1));

        btnRadio_Nature.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRadio_Nature.setText("Nature");
        btnRadio_Nature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio_NatureActionPerformed(evt);
            }
        });
        jPanel2.add(btnRadio_Nature, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        btnRadio_Adventure.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRadio_Adventure.setText("Adventure");
        btnRadio_Adventure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio_AdventureActionPerformed(evt);
            }
        });
        jPanel2.add(btnRadio_Adventure, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        btnRadio_Food.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRadio_Food.setText("Food");
        btnRadio_Food.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadio_FoodActionPerformed(evt);
            }
        });
        jPanel2.add(btnRadio_Food, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 990, 440));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void btn_ThemAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemAnhActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedImageFile = fileChooser.getSelectedFile();
            // Hiển thị ảnh có thể dùng JLabel nếu cần
            System.out.println("Ảnh đã chọn: " + selectedImageFile.getAbsolutePath());
        }
    }//GEN-LAST:event_btn_ThemAnhActionPerformed

    private void jTextField_NhapTenDiaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NhapTenDiaDiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NhapTenDiaDiemActionPerformed

    private void jTextField_NhapMoTaDiaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NhapMoTaDiaDiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NhapMoTaDiaDiemActionPerformed

    private void jTextField_NhapGiaTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NhapGiaTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NhapGiaTienActionPerformed

    private void btn_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubmitActionPerformed
        // TODO add your handling code here:
        String locationName = jTextField_NhapTenDiaDiem.getText();
        String description = jTextField_NhapMoTaDiaDiem.getText();
        String priceText = jTextField_NhapGiaTien.getText();

        // Validate bắt buộc chọn quốc gia + thành phố
        if (selectedNational.isEmpty() || selectedCity.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn Quốc gia và Thành phố.");
            return;
        }
        if (locationName.isEmpty() || description.isEmpty() || priceText.isEmpty() || selectedImageFile == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin và chọn ảnh.");
            return;
        }

        try {
            double price = Double.parseDouble(priceText);
            FileInputStream fis = new FileInputStream(selectedImageFile);

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/travelandmap", "root", "");

            // CHỈNH LẠI SQL: thêm 2 cột National, City
            String sql = "INSERT INTO tbldatabase_post "
                    + "(National, City, location_name, description, price, image, category) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, selectedNational);
            pstmt.setString(2, selectedCity);
            pstmt.setString(3, locationName);
            pstmt.setString(4, description);
            pstmt.setDouble(5, price);
            pstmt.setBinaryStream(6, fis, (int) selectedImageFile.length());
            pstmt.setString(7, selectedCategory);

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Thêm địa điểm thành công!");
            conn.close();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá tiền không hợp lệ!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_SubmitActionPerformed

    private void jComboBox_ChonQuocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ChonQuocGiaActionPerformed
        // TODO add your handling code here:
        // Lấy giá trị đã chọn
        selectedNational = jComboBox_ChonQuocGia.getSelectedItem().toString();

        // (Tuỳ chọn) Nếu bạn muốn đổi danh sách thành phố theo quốc gia:
        DefaultComboBoxModel<String> cityModel = new DefaultComboBoxModel<>();
        switch (selectedNational) {
            case "VietNam":
                cityModel.addElement("HaNoi");
                cityModel.addElement("DaNang");
                cityModel.addElement("HCM");
                cityModel.addElement("Hue");
                break;
            case "USA":
                cityModel.addElement("NewYork");
                cityModel.addElement("LosAngeles");
                break;
            // ... các nước khác
            default:
                cityModel.addElement("Chọn thành phố");
        }
        jComboBox_ChonThanhPho.setModel(cityModel);
    }//GEN-LAST:event_jComboBox_ChonQuocGiaActionPerformed

    private void jComboBox_ChonThanhPhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ChonThanhPhoActionPerformed
        // TODO add your handling code here:
        if (jComboBox_ChonThanhPho.getItemCount() > 0) {
            selectedCity = jComboBox_ChonThanhPho.getSelectedItem().toString();
        }
    }//GEN-LAST:event_jComboBox_ChonThanhPhoActionPerformed

    private void btn_QuayLaiSearchResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuayLaiSearchResultsActionPerformed
        // TODO add your handling code here:
        SearchResults dk = new SearchResults();

        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_QuayLaiSearchResultsActionPerformed
    
    private String selectedCategory = "";
    private void btnRadio_CultureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio_CultureActionPerformed
        // TODO add your handling code here:
        selectedCategory = "Culture";
    }//GEN-LAST:event_btnRadio_CultureActionPerformed

    private void btnRadio_FoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio_FoodActionPerformed
        // TODO add your handling code here:
        selectedCategory = "Food";
    }//GEN-LAST:event_btnRadio_FoodActionPerformed

    private void btnRadio_NatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio_NatureActionPerformed
        // TODO add your handling code here:
        selectedCategory = "Nature";
    }//GEN-LAST:event_btnRadio_NatureActionPerformed

    private void btnRadio_AdventureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadio_AdventureActionPerformed
        // TODO add your handling code here:
        selectedCategory = "Adventure";
    }//GEN-LAST:event_btnRadio_AdventureActionPerformed

    public static void main(String args[]) {
        try {
            FlatLightLaf.setup(); // setup giao diện FlatLaf
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        // Khởi động giao diện của bạn
        new FlightPriceTracking(); // hoặc tên Frame/Form của bạn
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddArticle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ten_Logo;
    private javax.swing.JRadioButton btnRadio_Adventure;
    private javax.swing.JRadioButton btnRadio_Culture;
    private javax.swing.JRadioButton btnRadio_Food;
    private javax.swing.JRadioButton btnRadio_Nature;
    private javax.swing.JButton btn_QuayLaiSearchResults;
    private javax.swing.JButton btn_RefreshAddArticle;
    private javax.swing.JButton btn_Submit;
    private javax.swing.JButton btn_ThemAnh;
    private javax.swing.JButton btn_aboutUs;
    private javax.swing.JButton btn_contact1;
    private javax.swing.JButton btn_explore;
    private javax.swing.JButton btn_home1;
    private javax.swing.JButton btn_language;
    private javax.swing.JComboBox<String> jComboBox_ChonQuocGia;
    private javax.swing.JComboBox<String> jComboBox_ChonThanhPho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_NhapGiaTien;
    private javax.swing.JTextField jTextField_NhapMoTaDiaDiem;
    private javax.swing.JTextField jTextField_NhapTenDiaDiem;
    // End of variables declaration//GEN-END:variables
}
