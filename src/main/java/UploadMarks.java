/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELCOT
 */
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UploadMarks extends javax.swing.JFrame {

    /**
     * Creates new form UploadMarks
     */
    public UploadMarks() {
        initComponents();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tamil = new javax.swing.JTextField();
        rollno = new javax.swing.JTextField();
        english = new javax.swing.JTextField();
        wd = new javax.swing.JTextField();
        statistics = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        python = new javax.swing.JTextField();
        s2 = new javax.swing.JTextField();
        s3 = new javax.swing.JTextField();
        s4 = new javax.swing.JTextField();
        s5 = new javax.swing.JTextField();
        s1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\StudentsSystem\\StudentReg.png")); // NOI18N
        jButton1.setText("Students Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\StudentsSystem\\Timetable.png")); // NOI18N
        jButton3.setText("TimeTable");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\StudentsSystem\\logout.png")); // NOI18N
        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\StudentsSystem\\mark.png")); // NOI18N
        jButton6.setText("Upload Mark");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\StudentsSystem\\homeicon.png")); // NOI18N
        jButton7.setText("Home");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tamil.setForeground(new java.awt.Color(153, 153, 153));
        tamil.setText("Mark 1");
        tamil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tamilFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tamilFocusLost(evt);
            }
        });

        rollno.setForeground(new java.awt.Color(153, 153, 153));
        rollno.setText("Roll.No");
        rollno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rollnoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rollnoFocusLost(evt);
            }
        });

        english.setForeground(new java.awt.Color(153, 153, 153));
        english.setText("Mark 2");
        english.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                englishFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                englishFocusLost(evt);
            }
        });

        wd.setForeground(new java.awt.Color(153, 153, 153));
        wd.setText("Mark 4");
        wd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                wdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                wdFocusLost(evt);
            }
        });

        statistics.setForeground(new java.awt.Color(153, 153, 153));
        statistics.setText("Mark 5");
        statistics.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                statisticsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                statisticsFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Upload Marks");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        python.setForeground(new java.awt.Color(153, 153, 153));
        python.setText("Mark 3");
        python.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pythonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pythonFocusLost(evt);
            }
        });

        s2.setForeground(new java.awt.Color(153, 153, 153));
        s2.setText("Subject 2");
        s2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                s2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                s2FocusLost(evt);
            }
        });

        s3.setForeground(new java.awt.Color(153, 153, 153));
        s3.setText("Subject 3");
        s3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                s3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                s3FocusLost(evt);
            }
        });

        s4.setForeground(new java.awt.Color(153, 153, 153));
        s4.setText("Subject 4");
        s4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                s4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                s4FocusLost(evt);
            }
        });

        s5.setForeground(new java.awt.Color(153, 153, 153));
        s5.setText("Subject 5");
        s5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                s5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                s5FocusLost(evt);
            }
        });

        s1.setForeground(new java.awt.Color(153, 153, 153));
        s1.setText("Subject 1");
        s1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                s1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                s1FocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("ROLL.NO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(s2)
                            .addComponent(s3, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(s4, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(s5, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(s1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(statistics)
                            .addComponent(python)
                            .addComponent(wd)
                            .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tamil)
                            .addComponent(english))
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(227, 227, 227))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(english, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(python, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statistics, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 555, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
        Dashboard db = new Dashboard();
        db.tablesdata();
        db.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:/academicmanagementsystem", "root", "");
            String roll = "select rollno from uploadmarks where rollno=?";
            pst = con.prepareStatement(roll);
            pst.setString(1, rollno.getText());
            rs = pst.executeQuery();
            if (rollno.getText().equals("Roll.No") && tamil.getText().equals("Mark 1") && english.getText().equals("Mark 2")&& python.getText().equals("Mark 3")&& wd.getText().equals("Mark 4") && statistics.getText().equals("Mark 5") && s1.getText().equals("Subject 1") && s2.getText().equals("Subject 2") && s3.getText().equals("Subject 3") && s4.getText().equals("Subject 4") && s5.getText().equals("Subject 5")){ 
                JOptionPane.showMessageDialog(null, "Some Field is Missing");
            } else {
                if (!rs.next()) {
                    String sql = "INSERT INTO `uploadmarks`(`rollno`, `s1_name`, `s2_name`, `s3_name`, `s4_name`, `s5_name`, `sub1`, `sub2`, `sub3`, `sub4`, `sub5`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, rollno.getText());
                    pst.setString(2, s1.getText());
                    pst.setString(3, s2.getText());
                    pst.setString(4, s3.getText());
                    pst.setString(5, s4.getText());
                    pst.setString(6, s5.getText());
                    pst.setString(7, tamil.getText());
                    pst.setString(8, english.getText());
                    pst.setString(9, python.getText());
                    pst.setString(10, wd.getText());
                    pst.setString(11, statistics.getText());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Upload Successfully");
                    rollno.setText("");
                    rollno.setText("Roll.No");
                    rollno.setForeground(new Color(153, 153, 153));
                    tamil.setText("");
                    tamil.setText("Mark 1");
                    tamil.setForeground(new Color(153, 153, 153));
                    english.setText("");
                    english.setText("Mark 2");
                    english.setForeground(new Color(153, 153, 153));
                    python.setText("");
                    python.setText("Mark 3");
                    python.setForeground(new Color(153, 153, 153));
                    wd.setText("");
                    wd.setText("Mark 4");
                    wd.setForeground(new Color(153, 153, 153));
                    statistics.setText("");
                    statistics.setText("Mark 5");
                    statistics.setForeground(new Color(153, 153, 153));
                    s1.setText("");
                    s1.setText("Subject 1");
                    s1.setForeground(new Color(153, 153, 153));
                    s2.setText("");
                    s2.setText("Subject 2");
                    s2.setForeground(new Color(153, 153, 153));
                    s3.setText("");
                    s3.setText("Subject 3");
                    s3.setForeground(new Color(153, 153, 153));
                    s4.setText("");
                    s4.setText("Subject 4");
                    s4.setForeground(new Color(153, 153, 153));
                    s5.setText("");
                    s5.setText("Subject 5");
                    s5.setForeground(new Color(153, 153, 153));
                } else {
                    JOptionPane.showMessageDialog(null, "RegisterNum already exist");
                    rollno.setText("");
                    rollno.setText("Roll.No");
                    rollno.setForeground(new Color(153, 153, 153));
                    tamil.setText("");
                    tamil.setText("Mark 1");
                    tamil.setForeground(new Color(153, 153, 153));
                    english.setText("");
                    english.setText("Mark 2");
                    english.setForeground(new Color(153, 153, 153));
                    python.setText("");
                    python.setText("Mark 3");
                    python.setForeground(new Color(153, 153, 153));
                    wd.setText("");
                    wd.setText("Mark 4");
                    wd.setForeground(new Color(153, 153, 153));
                    statistics.setText("");
                    statistics.setText("Mark 5");
                    statistics.setForeground(new Color(153, 153, 153));
                    s1.setText("");
                    s1.setText("Subject 1");
                    s1.setForeground(new Color(153, 153, 153));
                    s2.setText("");
                    s2.setText("Subject 2");
                    s2.setForeground(new Color(153, 153, 153));
                    s3.setText("");
                    s3.setText("Subject 3");
                    s3.setForeground(new Color(153, 153, 153));
                    s4.setText("");
                    s4.setText("Subject 4");
                    s4.setForeground(new Color(153, 153, 153));
                    s5.setText("");
                    s5.setText("Subject 5");
                    s5.setForeground(new Color(153, 153, 153));
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UploadMarks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UploadMarks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        StudentsRegister studrg = new StudentsRegister();
        studrg.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        TimeTable tt = new TimeTable();
        tt.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(null, "You are already in UploadMarks Page");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void rollnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rollnoFocusGained
        if (rollno.getText().equals("Roll.No")) {
            rollno.setText("");
            rollno.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_rollnoFocusGained

    private void rollnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rollnoFocusLost
        if (rollno.getText().equals("")) {
            rollno.setText("Roll.No");
            rollno.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_rollnoFocusLost

    private void tamilFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tamilFocusGained
        if (tamil.getText().equals("Mark 1")) {
            tamil.setText("");
            tamil.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_tamilFocusGained

    private void tamilFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tamilFocusLost
        if (tamil.getText().equals("")) {
            tamil.setText("Mark 1");
            tamil.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_tamilFocusLost

    private void englishFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_englishFocusGained
        if (english.getText().equals("Mark 2")) {
            english.setText("");
            english.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_englishFocusGained

    private void englishFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_englishFocusLost
        if (english.getText().equals("")) {
            english.setText("Mark 2");
            english.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_englishFocusLost

    private void pythonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pythonFocusGained
        if (python.getText().equals("Mark 3")) {
            python.setText("");
            python.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_pythonFocusGained

    private void pythonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pythonFocusLost
        if (python.getText().equals("")) {
            python.setText("Mark 3");
            python.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_pythonFocusLost

    private void wdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_wdFocusGained
        if (wd.getText().equals("Mark 4")) {
            wd.setText("");
            wd.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_wdFocusGained

    private void wdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_wdFocusLost
        if (wd.getText().equals("")) {
            wd.setText("Mark 4");
            wd.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_wdFocusLost

    private void statisticsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statisticsFocusGained
        if (statistics.getText().equals("Mark 5")) {
            statistics.setText("");
            statistics.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_statisticsFocusGained

    private void statisticsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_statisticsFocusLost
        if (statistics.getText().equals("")) {
            statistics.setText("Mark 5");
            statistics.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_statisticsFocusLost

    private void s1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s1FocusGained
        if (s1.getText().equals("Subject 1")) {
            s1.setText("");
            s1.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_s1FocusGained

    private void s1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s1FocusLost
        if (s1.getText().equals("")) {
            s1.setText("Subject 1");
            s1.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_s1FocusLost

    private void s2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s2FocusGained
        if (s2.getText().equals("Subject 2")) {
            s2.setText("");
            s2.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_s2FocusGained

    private void s2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s2FocusLost
        if (s2.getText().equals("")) {
            s2.setText("Subject 2");
            s2.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_s2FocusLost

    private void s3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s3FocusGained
        if (s3.getText().equals("Subject 3")) {
            s3.setText("");
            s3.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_s3FocusGained

    private void s3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s3FocusLost
        if (s3.getText().equals("")) {
            s3.setText("Subject 3");
            s3.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_s3FocusLost

    private void s4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s4FocusGained
        if (s4.getText().equals("Subject 4")) {
            s4.setText("");
            s4.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_s4FocusGained

    private void s4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s4FocusLost
        if (s4.getText().equals("")) {
            s4.setText("Subject 4");
            s4.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_s4FocusLost

    private void s5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s5FocusGained
        if (s5.getText().equals("Subject 5")) {
            s5.setText("");
            s5.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_s5FocusGained

    private void s5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s5FocusLost
        if (s5.getText().equals("")) {
            s5.setText("Subject 5");
            s5.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_s5FocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UploadMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UploadMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UploadMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploadMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadMarks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField english;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField python;
    private javax.swing.JTextField rollno;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s3;
    private javax.swing.JTextField s4;
    private javax.swing.JTextField s5;
    private javax.swing.JTextField statistics;
    private javax.swing.JTextField tamil;
    private javax.swing.JTextField wd;
    // End of variables declaration//GEN-END:variables
}
