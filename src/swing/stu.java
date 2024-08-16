
package swing;

import database.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;


public class stu extends javax.swing.JFrame {

   
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs= null;

    public stu() {
        initComponents();
        con = DBconnect.connect();
        //table call
        tableload();
    }
    
     public void tableload()
    {
        
        try {
            String sql = "SELECT sid,sname,sgrade,sclass,sgender,sbktype,sbkname,sbkidate,sbkrdate,scurntsta from student";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            ctable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
        }
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidepnel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        stockbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        sidbox = new javax.swing.JTextField();
        snamebox = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        sbknamebox = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        sgradebox = new javax.swing.JComboBox<>();
        cprintbtn = new javax.swing.JButton();
        caddbtn = new javax.swing.JButton();
        cupdatebtn = new javax.swing.JButton();
        delbtn = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        scurbox = new javax.swing.JComboBox<>();
        bkrdate = new com.toedter.calendar.JDateChooser();
        sgenderbox = new javax.swing.JComboBox<>();
        sclassbox = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        sbktypbox = new javax.swing.JComboBox<>();
        sbkidate = new com.toedter.calendar.JDateChooser();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        clerbtn1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ctable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepnel2.setBackground(new java.awt.Color(23, 35, 51));
        sidepnel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_home_48px_1.png"))); // NOI18N
        sidepnel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 30));

        jButton8.setText("Home");
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        sidepnel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 80, 20));

        getContentPane().add(sidepnel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 140, 630));

        jPanel2.setBackground(new java.awt.Color(71, 120, 190));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_close_window_30px.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 10, 31, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/206897 (1).png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 52, 30));

        jButton9.setText("Teacher");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 90, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/png-transparent-computer-icons-student-school-student-angle-people-logo-thumbnail (1).png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 52, 30));

        jButton10.setText("Student");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 90, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/29302 (1).png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 52, 40));

        jButton11.setText("Book");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 90, 20));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_small_business_48px_1.png"))); // NOI18N
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 60, 40));

        stockbtn.setText("Stock");
        stockbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockbtnActionPerformed(evt);
            }
        });
        jPanel2.add(stockbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 90, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 1650, 50));

        jPanel3.setBackground(new java.awt.Color(71, 120, 190));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/5850276 (1).png"))); // NOI18N
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Details");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 255)));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 4, 310, 60));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 280, 10));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 70));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 255, 255));
        jLabel19.setText("Student Number");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        sidbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidboxActionPerformed(evt);
            }
        });
        jPanel3.add(sidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 130, 30));
        jPanel3.add(snamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 270, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 255, 255));
        jLabel20.setText("Name");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 255, 255));
        jLabel21.setText("grade");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jPanel3.add(sbknamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 270, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 255, 255));
        jLabel24.setText("Book Return date");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        sgradebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" }));
        jPanel3.add(sgradebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 90, -1));

        cprintbtn.setText("Print");
        jPanel3.add(cprintbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, -1, -1));

        caddbtn.setText("Add");
        caddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caddbtnActionPerformed(evt);
            }
        });
        jPanel3.add(caddbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        cupdatebtn.setText("Update");
        cupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cupdatebtnActionPerformed(evt);
            }
        });
        jPanel3.add(cupdatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, -1));

        delbtn.setText("Delete");
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });
        jPanel3.add(delbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 255, 255));
        jLabel25.setText("Gender");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 255, 255));
        jLabel27.setText("current states");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        scurbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book Issued", "Book returned" }));
        scurbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scurboxActionPerformed(evt);
            }
        });
        jPanel3.add(scurbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, -1, -1));

        bkrdate.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(bkrdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        sgenderbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel3.add(sgenderbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 130, -1));

        sclassbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));
        jPanel3.add(sclassbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 90, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 255, 255));
        jLabel28.setText("Class");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(153, 255, 255));
        jLabel29.setText("Book Type");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        sbktypbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classics", "Novel", "Horror", "Fantasy", "Science fiction", "History", "Short story" }));
        jPanel3.add(sbktypbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 130, -1));

        sbkidate.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(sbkidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 255, 255));
        jLabel30.setText("Book name");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 255, 255));
        jLabel31.setText("Book Issue date");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        clerbtn1.setText("Clear");
        clerbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clerbtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(clerbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 420, 570));

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));

        ctable.setModel(new javax.swing.table.DefaultTableModel(
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
        ctable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ctableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ctable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 1220, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        home h1 = new home();
        h1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void ctableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctableMouseClicked
        // TODO add your handling code here:
        
//value eka select krma box walta ynna
        int r = ctable.getSelectedRow();

        String id = ctable.getValueAt(r, 0).toString();
        String name = ctable.getValueAt(r, 1).toString();
        String gra = ctable.getValueAt(r, 2).toString();
        String clz = ctable.getValueAt(r, 3).toString();
        String gen = ctable.getValueAt(r, 4).toString();
        String bktyp = ctable.getValueAt(r, 5).toString();
        String bknme = ctable.getValueAt(r, 6).toString();
        String idate = ctable.getValueAt(r, 7).toString();
        String rdate = ctable.getValueAt(r, 8).toString();
        String sur = ctable.getValueAt(r, 9).toString();
        
        sidbox.setText(id);
        snamebox.setText(name);
        sgradebox.setSelectedItem(gra);
        sclassbox.setSelectedItem(clz);
        sgenderbox.setSelectedItem(gen);
        sbktypbox.setSelectedItem(bktyp);
        sbknamebox.setText(bknme);
        sbkidate.setDateFormatString(idate);
        bkrdate.setDateFormatString(rdate);
        scurbox.setSelectedItem(sur);
        
        
    }//GEN-LAST:event_ctableMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         Teacher st = new Teacher();
        st.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         stu st = new stu();
        st.setVisible(true);
        this.dispose();
      
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Book st = new Book();
        st.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_jButton11ActionPerformed

    private void stockbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockbtnActionPerformed
        // TODO add your handling code here:

        supli st = new supli();
        st.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stockbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clerbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clerbtn1ActionPerformed

        sidbox.setText("");
        snamebox.setText("");
        sgradebox.setSelectedItem("");
        sclassbox.setSelectedItem("");
        sgenderbox.setSelectedItem("");
        sbktypbox.setSelectedItem("");
        sbknamebox.setText("");
        sbkidate.setDateFormatString("");
        bkrdate.setDateFormatString("");
        scurbox.setSelectedItem("");
    }//GEN-LAST:event_clerbtn1ActionPerformed

    private void scurboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scurboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scurboxActionPerformed

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed

        int x = JOptionPane.showConfirmDialog(null, "Do you really want to Delete this");
        //update krna oneda ahnwa
        if (x == 0) {
            String id = sidbox.getText();

            String sql = "DELETE from student where sid = '" + id + "'";

            //loku wedak krddi try catch ekk athulta danwa
            try {
                pst = con.prepareStatement(sql);
                pst.execute();
                tableload();
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_delbtnActionPerformed

    private void cupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cupdatebtnActionPerformed
        // TODO add your handling code here:
        //update krddi ahana message
        int x = JOptionPane.showConfirmDialog(null, "Do you really want to update");
        //update krna sidahnwa
        if(x==0)
        {
            String sid = sidbox.getText();
            String sname = snamebox.getText();
            String sgra = sgradebox.getSelectedItem().toString();
            String sclz = sclassbox.getSelectedItem().toString();
            String sgen = sgenderbox.getSelectedItem().toString();
            String sbktyp = sbktypbox.getSelectedItem().toString();
            String sbknam = sbknamebox.getText();
            String sbkidat = ((JTextField)sbkidate.getDateEditor().getUiComponent()).getText();
            String sbkrdt = ((JTextField)bkrdate.getDateEditor().getUiComponent()).getText();
            String scurnt = scurbox.getSelectedItem().toString();

            String sql = "UPDATE student SET sname = '"+ sname +"', sgrade = '"+ sgra +"', sclass = '"+ sclz +"', sgender = '"+ sgen +"', sbktype = '"+ sbktyp +"', sbkname = '"+ sbknam +"', sbkidate = '"+ sbkidat +"', sbkrdate = '"+ sbkrdt +"', scurntsta = '"+ scurnt +"' where sid = '"+ sid +"'";

            //loku wedak krddi try cacach ekk athulta danwa
            try {
                pst = con.prepareStatement(sql);
                pst.execute();
                tableload();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_cupdatebtnActionPerformed

    private void caddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caddbtnActionPerformed
        // TODO add your handlingsidhere:

        //data base add part
        String sid = sidbox.getText();
        String sname = snamebox.getText();
        String sgra = sgradebox.getSelectedItem().toString();
        String sclz = sclassbox.getSelectedItem().toString();
        String sgen = sgenderbox.getSelectedItem().toString();
        String sbktyp = sbktypbox.getSelectedItem().toString();
        String sbknam = sbknamebox.getText();
        String sbkidat = ((JTextField)sbkidate.getDateEditor().getUiComponent()).getText();
        String sbkrdt = ((JTextField)bkrdate.getDateEditor().getUiComponent()).getText();
        String scurnt = scurbox.getSelectedItem().toString();
        //String cur = curbox.getSelectedItem().toString();
        // String cur = ((JTextField)bkrdate.getDateEditor().getUiComponent()).getText();

        try {
            //String q = "INSERT INTO emp (ename,econtac,email,egen,jobti,nic) values ('"+ ename +"','"+ econt +"','"+ email +"','"+ egen +"','"+ ejob +"','"+ enic +"')";
            String q = "INSERT INTO student (sname,sgrade,sclass,sgender,sbktype,sbkname,sbkidate,sbkrdate,scurntsta) values ('"+ sname +"','"+ sgra +"','"+ sclz +"','"+ sgen +"','"+ sbktyp +"','"+ sbknam +"','"+ sbkidat +"','"+ sbkrdt +"','"+ scurnt +"')";

            pst = con.prepareStatement(q);
            pst.execute();//execute krnwa database ekaata
            //load table
            tableload();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_caddbtnActionPerformed

    private void sidboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidboxActionPerformed

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
            java.util.logging.Logger.getLogger(stu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser bkrdate;
    private javax.swing.JButton caddbtn;
    private javax.swing.JButton clerbtn1;
    private javax.swing.JButton cprintbtn;
    private javax.swing.JTable ctable;
    private javax.swing.JButton cupdatebtn;
    private javax.swing.JButton delbtn;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser sbkidate;
    private javax.swing.JTextField sbknamebox;
    private javax.swing.JComboBox<String> sbktypbox;
    private javax.swing.JComboBox<String> sclassbox;
    private javax.swing.JComboBox<String> scurbox;
    private javax.swing.JComboBox<String> sgenderbox;
    private javax.swing.JComboBox<String> sgradebox;
    private javax.swing.JTextField sidbox;
    private javax.swing.JPanel sidepnel2;
    private javax.swing.JTextField snamebox;
    private javax.swing.JButton stockbtn;
    // End of variables declaration//GEN-END:variables
}
