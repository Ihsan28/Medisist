/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medisist;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dev
 */
public class Doctor extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Doctor
     */
    public Doctor() {
             initComponents();
             setLocationRelativeTo(null);     
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbBloodGroup = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtDoctorID = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JTextField();
        txtDoctorFName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtQualification = new javax.swing.JTextField();
        txtSpecialization = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtDateOfJoining = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btnDetails = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(10, 24, 39));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 254));
        jPanel1.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel3.setText("Doctor id:");

        jLabel4.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel5.setText("Father's Name:");

        jLabel6.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel6.setText("Address:");

        jLabel7.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel7.setText("Contact No.:");

        jLabel8.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel8.setText("Email id:");

        jLabel9.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel9.setText("Qualification:");

        jLabel2.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel2.setText("Specialization:");

        jLabel12.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel12.setText("Gender");

        cmbBloodGroup.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        cmbBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        cmbBloodGroup.setSelectedIndex(-1);
        cmbBloodGroup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbBloodGroup.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel10.setText("Blood Group");

        cmbGender.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        cmbGender.setSelectedIndex(-1);
        cmbGender.setBorder(null);
        cmbGender.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        jLabel11.setText("Date Of Joining");

        jLabel22.setFont(new java.awt.Font("Norasi", 0, 12)); // NOI18N
        jLabel22.setText("(DD/MM/YYYY)");

        txtDoctorID.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        txtDoctorID.setBorder(null);

        txtDoctorName.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        txtDoctorName.setBorder(null);

        txtDoctorFName.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        txtDoctorFName.setBorder(null);

        txtContact.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        txtContact.setBorder(null);

        txtEmail.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        txtEmail.setBorder(null);

        txtQualification.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        txtQualification.setBorder(null);

        txtSpecialization.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        txtSpecialization.setBorder(null);

        txtAddress.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        txtAddress.setBorder(null);
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtDateOfJoining.setBorder(null);
        txtDateOfJoining.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtDateOfJoining.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtAddress)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(1, 1, 1))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtContact, javax.swing.GroupLayout.Alignment.TRAILING))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3)
                                    .addComponent(txtDoctorID, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(txtDoctorName, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(txtDoctorFName, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(jSeparator1)
                                    .addComponent(jSeparator2))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator9)
                                        .addComponent(txtSpecialization)
                                        .addComponent(cmbBloodGroup, javax.swing.GroupLayout.Alignment.TRAILING, 0, 202, Short.MAX_VALUE))
                                    .addComponent(txtQualification, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDateOfJoining, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(jSeparator10))))
                        .addGap(36, 36, 36))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(21, 21, 21))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtContact, txtDateOfJoining, txtDoctorFName, txtDoctorID, txtDoctorName});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDoctorFName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtQualification, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDateOfJoining, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addContainerGap())
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 390, 600));

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Playfair Display Black", 0, 24)); // NOI18N
        jLabel1.setText("Doctors");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(688, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        jPanel4.setBackground(new java.awt.Color(1, 50, 67));

        jPanel6.setBackground(new java.awt.Color(52, 73, 94));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(52, 73, 94));

        btnSave.setBackground(new java.awt.Color(52, 73, 94));
        btnSave.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        btnSave.setForeground(java.awt.Color.white);
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medisist/save.png"))); // NOI18N
        btnSave.setText("     Save");
        btnSave.setBorderPainted(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setFocusPainted(false);
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSave)
        );

        jPanel8.setBackground(new java.awt.Color(52, 73, 94));

        btnDelete.setBackground(new java.awt.Color(52, 73, 94));
        btnDelete.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        btnDelete.setForeground(java.awt.Color.white);
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medisist/delete.png"))); // NOI18N
        btnDelete.setText("     Delete");
        btnDelete.setBorder(null);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setEnabled(false);
        btnDelete.setFocusPainted(false);
        btnDelete.setPreferredSize(new java.awt.Dimension(132, 44));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(52, 73, 94));

        btnDetails.setBackground(new java.awt.Color(52, 73, 94));
        btnDetails.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        btnDetails.setForeground(java.awt.Color.white);
        btnDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medisist/file.png"))); // NOI18N
        btnDetails.setText("    Details");
        btnDetails.setBorderPainted(false);
        btnDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetails.setPreferredSize(new java.awt.Dimension(132, 44));
        btnDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDetailsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDetailsMouseEntered(evt);
            }
        });
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(52, 73, 94));
        jPanel3.setToolTipText("New");
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(52, 73, 94));
        btnNew.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        btnNew.setForeground(java.awt.Color.white);
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medisist/edit.png"))); // NOI18N
        btnNew.setText("     New");
        btnNew.setToolTipText("New");
        btnNew.setBorderPainted(false);
        btnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNew.setFocusPainted(false);
        btnNew.setPreferredSize(new java.awt.Dimension(132, 44));
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewMouseEntered(evt);
            }
        });
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(52, 73, 94));

        btnUpdate.setBackground(new java.awt.Color(52, 73, 94));
        btnUpdate.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        btnUpdate.setForeground(java.awt.Color.white);
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medisist/update.png"))); // NOI18N
        btnUpdate.setText("     Update");
        btnUpdate.setBorder(null);
        btnUpdate.setBorderPainted(false);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.setEnabled(false);
        btnUpdate.setFocusPainted(false);
        btnUpdate.setPreferredSize(new java.awt.Dimension(132, 44));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Medisist/home.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel13)
                .addGap(35, 35, 35)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 630));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 670));

        setSize(new java.awt.Dimension(889, 669));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
                                  
        try{
            con=Connect.ConnectDB();
            if (txtDoctorID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter doctor id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtDoctorName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter doctor name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txtDoctorFName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Father's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtAddress.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (txtContact.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter contact no.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
            if (txtQualification.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter qualifications","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtSpecialization.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter specialization","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             if (cmbGender.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please select gender","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbBloodGroup.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please select blood group","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           
            if (txtDateOfJoining.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter joining date","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Statement stmt=con.createStatement();
            String sql1="Select DoctorID from Doctor where DoctorID= '" + txtDoctorID.getText() + "'";
             rs=stmt.executeQuery(sql1);
             if(rs.next()){
                 JOptionPane.showMessageDialog( this, "Doctor ID already exists","Error", JOptionPane.ERROR_MESSAGE);
                  txtDoctorID.setText("");
                  txtDoctorID.requestDefaultFocus();
                  return;
      }
            String sql= "insert into Doctor(DoctorID,DoctorName,FathersName,Email,ContactNo,Qualifications,Specialization,Gender,Bloodgroup,DateofJoining,Address)values('"+ txtDoctorID.getText() + "','"+ txtDoctorName.getText() + "','"+ txtDoctorFName.getText() + "','"+ txtEmail.getText() + "','"+ txtContact.getText() + "','"+ txtQualification.getText() + "','"+ txtSpecialization.getText() + "','" + cmbGender.getSelectedItem() + "','"+ cmbBloodGroup.getSelectedItem() + "','" + txtDateOfJoining.getText() + "','" + txtAddress.getText() + "')";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully saved","Doctor Record",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);
        } catch (SQLException ex) {
        Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        Reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        this.hide();
        Doctor_Record d=new Doctor_Record();
        d.setVisible(true);
        
    }//GEN-LAST:event_btnDetailsActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            int e=JOptionPane.showConfirmDialog(null,"Are you sure want to Delete?","Confirmation",JOptionPane.YES_NO_OPTION);
            if(e==0){
                con=Connect.ConnectDB();
                String sql="delete from Doctor where DoctorID='"+txtDoctorID.getText()+"'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully Deleted","Record",JOptionPane.INFORMATION_MESSAGE);
                Reset();
            }    
        }catch(HeadlessException | SQLException e){
            JOptionPane.showConfirmDialog(this,e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       try{
           con=Connect.ConnectDB();
           String sql="update Doctor set DoctorName='"+ txtDoctorName.getText() + "',FathersName='"+ txtDoctorFName.getText() + "',Email='"+ txtEmail.getText() + "',ContactNo='"+ txtContact.getText() + "',Qualifications='"+ txtQualification.getText() + "',Specialization='"+ txtSpecialization.getText() + "',Gender='" + cmbGender.getSelectedItem() + "',BloodGroup='"+ cmbBloodGroup.getSelectedItem() + "',DateOfJoining='" + txtDateOfJoining.getText() + "',Address='" + txtAddress.getText() + "' where DoctorID='" + txtDoctorID.getText() + "'";
           pst=con.prepareStatement(sql);
           pst.execute();
           JOptionPane.showMessageDialog(this,"Successfully updated","Doctor Record",JOptionPane.INFORMATION_MESSAGE);
           btnUpdate.setEnabled(false);
       }catch(HeadlessException | SQLException e){
            JOptionPane.showConfirmDialog(this,e);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
     
    }//GEN-LAST:event_jPanel6MouseEntered

    private void btnNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseEntered
        jPanel3.setBackground(new Color(0,102,204));
        btnNew.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_btnNewMouseEntered

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered

    }//GEN-LAST:event_jPanel3MouseEntered

    private void btnNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseExited
       jPanel3.setBackground(new Color(52,73,94));
       btnNew.setBackground(new Color(52,73,94));
    }//GEN-LAST:event_btnNewMouseExited

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        jPanel7.setBackground(new Color(0,102,204));
        btnSave.setBackground(new Color(0,102,204));// TODO add your handling code here:
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
       jPanel7.setBackground(new Color(52,73,94));
       btnSave.setBackground(new Color(52,73,94)); // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        jPanel8.setBackground(new Color(0,102,204));
        btnDelete.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
       jPanel8.setBackground(new Color(52,73,94));
       btnDelete.setBackground(new Color(52,73,94));// TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
      jPanel9.setBackground(new Color(0,102,204));
        btnUpdate.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
         jPanel9.setBackground(new Color(52,73,94));
       btnUpdate.setBackground(new Color(52,73,94)); // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnDetailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetailsMouseEntered
    jPanel10.setBackground(new Color(0,102,204));
        btnDetails.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_btnDetailsMouseEntered

    private void btnDetailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetailsMouseExited
         jPanel10.setBackground(new Color(52,73,94));
       btnDetails.setBackground(new Color(52,73,94));// TODO add your handling code here:
    }//GEN-LAST:event_btnDetailsMouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
     this.dispose();
     Admin_Main frm=new Admin_Main();
     frm.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked
private void Reset()
{
    txtDoctorID.setText("");
    txtDoctorName.setText("");
    txtDoctorFName.setText("");
    txtContact.setText("");
    txtAddress.setText("");
    txtQualification.setText("");
    txtEmail.setText("");
    txtSpecialization.setText("");
    txtDateOfJoining.setText("");
    cmbBloodGroup.setSelectedIndex(-1);
    cmbGender.setSelectedIndex(-1);
    btnSave.setEnabled(true);
    btnUpdate.setEnabled(false);
    btnDelete.setEnabled(false);
    txtDoctorID.requestDefaultFocus();

}

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnNew;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdate;
    public javax.swing.JComboBox cmbBloodGroup;
    public javax.swing.JComboBox cmbGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JTextField txtAddress;
    public javax.swing.JTextField txtContact;
    public javax.swing.JFormattedTextField txtDateOfJoining;
    public javax.swing.JTextField txtDoctorFName;
    private javax.swing.JTextField txtDoctorID;
    public javax.swing.JTextField txtDoctorName;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtQualification;
    public javax.swing.JTextField txtSpecialization;
    // End of variables declaration//GEN-END:variables
}
