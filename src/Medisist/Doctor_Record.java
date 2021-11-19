/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medisist;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author dev
 */
public class Doctor_Record extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
   


    /**
     * Creates new form Doctor
     */
    public Doctor_Record() {
             initComponents();
             con=Connect.ConnectDB();
             Get_Data();
             setLocationRelativeTo(null);
            TblDoc.getTableHeader().setOpaque(false);
             TblDoc.getTableHeader().setForeground(new Color (38, 166, 91));
             TblDoc.getTableHeader().setFont(new Font("URW Palladio L",Font.PLAIN,18)); 
             
             
             
    }
 
    private void Get_Data(){
       String sql="select DoctorID as 'D_ ID', DoctorName as 'Doctor Name',FathersName as 'Father Name',Address,ContactNo as 'Contact No',Email as 'Email ID',Qualifications,Specialization,Gender,Bloodgroup as 'Blood Group',DateOfJoining as 'Joining Date' from Doctor order by DoctorName"; 
        try{
               pst=con.prepareStatement(sql);
               rs=pst.executeQuery();
               TblDoc.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblDoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(10, 24, 39));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Playfair Display Black", 0, 24)); // NOI18N
        jLabel1.setText("Doctors Details");

        jPanel5.setBackground(new java.awt.Color(47, 50, 176));
        jPanel5.setPreferredSize(new java.awt.Dimension(40, 30));

        jLabel7.setFont(new java.awt.Font("URW Palladio L", 1, 24)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jLabel7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel7KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1066, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 8, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 40));

        jPanel1.setBackground(new java.awt.Color(10, 24, 39));
        jPanel1.setForeground(new java.awt.Color(10, 24, 39));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 1, true));

        TblDoc.setAutoCreateRowSorter(true);
        TblDoc.setFont(new java.awt.Font("Norasi", 0, 18)); // NOI18N
        TblDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TblDoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TblDoc.setGridColor(java.awt.Color.pink);
        TblDoc.setRowHeight(25);
        TblDoc.setSurrendersFocusOnKeystroke(true);
        TblDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblDocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblDoc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 1230, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 740));

        setSize(new java.awt.Dimension(1319, 741));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TblDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblDocMouseClicked
        try{
            con=Connect.ConnectDB();
            int row=TblDoc.getSelectedRow();
            String table_click= TblDoc.getModel().getValueAt(row, 0).toString();
            String sql= "select * from Doctor where DoctorID = '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                this.hide();
                Doctor d=new Doctor();
                d.setVisible(true);
                String add2=rs.getString("DoctorName");
                d.txtDoctorName.setText(add2);
                String add3=rs.getString("Fathersname");
                d.txtDoctorFName.setText(add3);
                String add5=rs.getString("Email");
                d.txtEmail.setText(add5);
                String add6=rs.getString("Qualifications");
                d.txtQualification.setText(add6);
                String add7=rs.getString("Specialization");
                d.txtSpecialization.setText(add7);
                String add9=rs.getString("BloodGroup");
                d.cmbBloodGroup.setSelectedItem(add9);
                String add11=rs.getString("Gender");
                d.cmbGender.setSelectedItem(add11);
                String add14=rs.getString("DateOfJoining");
                d.txtDateOfJoining.setText(add14);
                String add15=rs.getString("Address");
                d.txtAddress.setText(add15);
                String add16=rs.getString("ContactNo");
                d.txtContact.setText(add16);
                d.btnUpdate.setEnabled(true);
                d.btnDelete.setEnabled(true);
                d.btnSave.setEnabled(false);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_TblDocMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.hide();
        Doctor frm=new Doctor();
        frm.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel7KeyPressed

    }//GEN-LAST:event_jLabel7KeyPressed

    
    

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
            java.util.logging.Logger.getLogger(Doctor_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor_Record().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TblDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}