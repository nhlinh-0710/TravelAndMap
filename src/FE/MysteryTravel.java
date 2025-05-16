package FE;

import com.formdev.flatlaf.FlatLightLaf;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.*;

public class MysteryTravel extends javax.swing.JFrame {

    public MysteryTravel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Ten_Logo1 = new javax.swing.JLabel();
        btn_home2 = new javax.swing.JButton();
        btn_language1 = new javax.swing.JButton();
        btn_aboutUs1 = new javax.swing.JButton();
        btn_contact2 = new javax.swing.JButton();
        btn_explore1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser_ReturnDate = new com.toedter.calendar.JDateChooser();
        jDateChooser_DepartureDate = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox_MaximumBudget = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox_Nature = new javax.swing.JCheckBox();
        jCheckBox_Culture = new javax.swing.JCheckBox();
        jCheckBox_Food = new javax.swing.JCheckBox();
        jCheckBox_Sport = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton_TotallyUnexpected = new javax.swing.JRadioButton();
        jRadioButton_KnowSomeInformationInAdvance = new javax.swing.JRadioButton();
        btn_StartMysteryTravel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Results = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ten_Logo1.setFont(new java.awt.Font("Vivaldi", 1, 35)); // NOI18N
        Ten_Logo1.setText("Travel and Map");
        jPanel1.add(Ten_Logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 50));

        btn_home2.setBackground(new java.awt.Color(0, 102, 102));
        btn_home2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_home2.setText("Home");
        btn_home2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_home2.setBorderPainted(false);
        btn_home2.setContentAreaFilled(false);
        btn_home2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, 71));

        btn_language1.setBackground(new java.awt.Color(0, 102, 102));
        btn_language1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_language1.setText("Language");
        btn_language1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_language1.setBorderPainted(false);
        btn_language1.setContentAreaFilled(false);
        btn_language1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_language1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_language1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        btn_aboutUs1.setBackground(new java.awt.Color(0, 102, 102));
        btn_aboutUs1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_aboutUs1.setText("About Us");
        btn_aboutUs1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_aboutUs1.setBorderPainted(false);
        btn_aboutUs1.setContentAreaFilled(false);
        btn_aboutUs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutUs1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_aboutUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, 70));

        btn_contact2.setBackground(new java.awt.Color(0, 102, 102));
        btn_contact2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_contact2.setText("Contact");
        btn_contact2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_contact2.setBorderPainted(false);
        btn_contact2.setContentAreaFilled(false);
        btn_contact2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contact2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_contact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, 71));

        btn_explore1.setBackground(new java.awt.Color(0, 0, 0));
        btn_explore1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_explore1.setText("Explore");
        btn_explore1.setBorder(null);
        btn_explore1.setContentAreaFilled(false);
        btn_explore1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_explore1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_explore1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 97, 70));

        jPanel2.setBackground(new java.awt.Color(254, 247, 244));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(235, 102, 43));
        jLabel10.setText("Time to go: ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel3.add(jDateChooser_ReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, 30));
        jPanel3.add(jDateChooser_DepartureDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 30));

        jLabel11.setText(" - ");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 20, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(235, 102, 43));
        jLabel12.setText("Maximum budget: ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jComboBox_MaximumBudget.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\"Dưới 5,000,000\",", "    \"5,000,000 - 10,000,000\",", "    \"Trên 10,000,000" }));
        jComboBox_MaximumBudget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_MaximumBudgetActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox_MaximumBudget, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 160, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(235, 102, 43));
        jLabel13.setText("Hobby: ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, -1));

        jCheckBox_Nature.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox_Nature.setText("Nature");
        jCheckBox_Nature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_NatureActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox_Nature, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jCheckBox_Culture.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox_Culture.setText("Culture");
        jCheckBox_Culture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_CultureActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox_Culture, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jCheckBox_Food.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox_Food.setText("Food");
        jCheckBox_Food.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_FoodActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox_Food, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jCheckBox_Sport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox_Sport.setText("Sport");
        jCheckBox_Sport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_SportActionPerformed(evt);
            }
        });
        jPanel3.add(jCheckBox_Sport, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(235, 102, 43));
        jLabel14.setText("Level of mystery: ");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jRadioButton_TotallyUnexpected.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_TotallyUnexpected.setText("Totally unexpected");
        jRadioButton_TotallyUnexpected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_TotallyUnexpectedActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton_TotallyUnexpected, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jRadioButton_KnowSomeInformationInAdvance.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton_KnowSomeInformationInAdvance.setText("Know some information in advance");
        jRadioButton_KnowSomeInformationInAdvance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_KnowSomeInformationInAdvanceActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton_KnowSomeInformationInAdvance, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        btn_StartMysteryTravel.setBackground(new java.awt.Color(235, 102, 43));
        btn_StartMysteryTravel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_StartMysteryTravel.setForeground(new java.awt.Color(255, 255, 255));
        btn_StartMysteryTravel.setText("Start Mystery Travel");
        btn_StartMysteryTravel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StartMysteryTravelActionPerformed(evt);
            }
        });
        jPanel3.add(btn_StartMysteryTravel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 170, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 740, 200));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/image3_MysteryTravel.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 220, 180, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/image2_MysteryTravel.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, 190, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/image1_MysteryTravel.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 102, 43));
        jLabel1.setText("Mystery Travel");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setText(" Memorable ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setText(" Journey");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("Let’s Create ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 280, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Open the magic door, let the unknown lead you ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("to explore lands you have never set foot on.");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/image4_MysteryTravel.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 290, 240));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 680));

        jTextArea_Results.setColumns(20);
        jTextArea_Results.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Results);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, 740, 180));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(235, 102, 43));
        jLabel16.setText("Results");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 700, 90, 30));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_home2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home2ActionPerformed
        // TODO add your handling code here:
        Home dk = new Home();

        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_home2ActionPerformed

    private void btn_language1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_language1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_language1ActionPerformed

    private void btn_aboutUs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutUs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_aboutUs1ActionPerformed

    private void btn_contact2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contact2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_contact2ActionPerformed

    private void btn_explore1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_explore1ActionPerformed
        // TODO add your handling code here:
        Explore dk = new Explore();

        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_explore1ActionPerformed

    private void jCheckBox_NatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_NatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_NatureActionPerformed

    private void jRadioButton_TotallyUnexpectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_TotallyUnexpectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_TotallyUnexpectedActionPerformed

    private void jRadioButton_KnowSomeInformationInAdvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_KnowSomeInformationInAdvanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_KnowSomeInformationInAdvanceActionPerformed

    private int getMaximumBudget() {
        String selected = jComboBox_MaximumBudget.getSelectedItem().toString().toLowerCase();

        if (selected.contains("dưới") || selected.contains("<") || selected.contains("less than")) {
            return 3000000;
        } else if (selected.contains("3") && selected.contains("5")) {
            return 5000000;
        } else if (selected.contains("5") && selected.contains("10")) {
            return 10000000;
        } else if (selected.contains("over") || selected.contains("trên") || selected.contains("more than")) {
            return Integer.MAX_VALUE; // nghĩa là không giới hạn chi phí
        }

        // Trường hợp cuối: cố gắng parse số trực tiếp
        try {
            return Integer.parseInt(selected.replaceAll("[^0-9]", ""));
        } catch (NumberFormatException e) {
            return 10000000; // fallback default
        }
    }
    private void jComboBox_MaximumBudgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_MaximumBudgetActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox_MaximumBudgetActionPerformed


    private void jCheckBox_FoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_FoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_FoodActionPerformed

    private void jCheckBox_CultureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_CultureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_CultureActionPerformed

    private void jCheckBox_SportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_SportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_SportActionPerformed

    private void searchMysteryTravel() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelandmap", "root", ""); PreparedStatement stmt = conn.prepareStatement("SELECT * FROM tblmysterytravel WHERE estimated_cost <= ?")) {

            stmt.setInt(1, getMaximumBudget());
            ResultSet rs = stmt.executeQuery();

            List<String> matchingResults = new ArrayList<>();

            while (rs.next()) {
                String hobbies = rs.getString("hobby");
                if (isHobbyMatch(hobbies)) {
                    String name = rs.getString("name");
                    String description = rs.getString("description");
                    String country = rs.getString("country");
                    String weather = rs.getString("weather");
                    int cost = rs.getInt("estimated_cost");
                    String hobby = rs.getString("hobby");

                    // Dạng đầy đủ kết quả
                    String fullResult = String.format(
                            "Tên: %s\nMô tả: %s\nQuốc gia: %s\nThời tiết: %s\nChi phí: %d VNĐ\nSở thích: %s\n---------------------------\n",
                            name, description, country, weather, cost, hobby
                    );

                    // Dạng ẩn thông tin
                    String mysteryResult = String.format(
                            "🔍 Đang khám phá điểm đến bí ẩn...\n\n🏝️ Gợi ý: %s\n(Thích hợp cho người yêu: %s)\n---------------------------\n",
                            description.split("\\.")[0] + "...", hobby
                    );

                    // Tùy chế độ mà lưu
                    if (isTotallyUnexpected()) {
                        matchingResults.add(mysteryResult);
                    } else {
                        matchingResults.add(fullResult);
                    }
                }
            }

            // Hiển thị kết quả
            if (matchingResults.isEmpty()) {
                jTextArea_Results.setText("Không tìm thấy địa điểm nào phù hợp.");
            } else {
                StringBuilder finalResult = new StringBuilder();

                if (isTotallyUnexpected()) {
                    // Chọn ngẫu nhiên 1 điểm đến bí ẩn
                    Random rand = new Random();
                    int randomIndex = rand.nextInt(matchingResults.size());

                    // Thêm hiệu ứng khám phá
                    jTextArea_Results.setText("⏳ Đang khám phá cánh cửa bí ẩn...\n\n");
                    Thread.sleep(1000); // delay 1s

                    jTextArea_Results.append(matchingResults.get(randomIndex));
                } else {
                    for (String result : matchingResults) {
                        finalResult.append(result);
                    }
                    jTextArea_Results.setText(finalResult.toString());
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage());
        }

    }

    private boolean isTotallyUnexpected() {
        return jRadioButton_TotallyUnexpected.isSelected();
    }

    private String getSelectedHobbies() {
        List<String> hobbies = new ArrayList<String>();
        if (jCheckBox_Nature.isSelected()) {
            hobbies.add("Nature");
        }
        if (jCheckBox_Food.isSelected()) {
            hobbies.add("Food");
        }
        if (jCheckBox_Culture.isSelected()) {
            hobbies.add("Culture");
        }
        if (jCheckBox_Sport.isSelected()) {
            hobbies.add("Sport");
        }
        return String.join(",", hobbies);
    }

    private boolean isHobbyMatch(String dbHobbies) {
        String[] selectedHobbies = getSelectedHobbies().split(",");
        for (String h : selectedHobbies) {
            if (dbHobbies.contains(h)) {
                return true;
            }
        }
        return false;
    }

    private void btn_StartMysteryTravelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StartMysteryTravelActionPerformed
        // TODO add your handling code here:
        if (jDateChooser_DepartureDate.getDate() == null || jDateChooser_ReturnDate.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày khởi hành và ngày về.");
            return;
        }
        if (jDateChooser_ReturnDate.getDate().before(jDateChooser_DepartureDate.getDate())) {
            JOptionPane.showMessageDialog(this, "Ngày về phải sau ngày khởi hành!");
            return;
        }

        searchMysteryTravel();


    }//GEN-LAST:event_btn_StartMysteryTravelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            FlatLightLaf.setup(); // setup giao diện FlatLaf
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        // Khởi động giao diện của bạn
        new MysteryTravel(); // hoặc tên Frame/Form của bạn

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MysteryTravel().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ten_Logo1;
    private javax.swing.JButton btn_StartMysteryTravel;
    private javax.swing.JButton btn_aboutUs1;
    private javax.swing.JButton btn_contact2;
    private javax.swing.JButton btn_explore1;
    private javax.swing.JButton btn_home2;
    private javax.swing.JButton btn_language1;
    private javax.swing.JCheckBox jCheckBox_Culture;
    private javax.swing.JCheckBox jCheckBox_Food;
    private javax.swing.JCheckBox jCheckBox_Nature;
    private javax.swing.JCheckBox jCheckBox_Sport;
    private javax.swing.JComboBox<String> jComboBox_MaximumBudget;
    private com.toedter.calendar.JDateChooser jDateChooser_DepartureDate;
    private com.toedter.calendar.JDateChooser jDateChooser_ReturnDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton_KnowSomeInformationInAdvance;
    private javax.swing.JRadioButton jRadioButton_TotallyUnexpected;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_Results;
    // End of variables declaration//GEN-END:variables
}
