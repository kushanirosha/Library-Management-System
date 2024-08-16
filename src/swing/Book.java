
package swing;
import database.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;


public class Book extends javax.swing.JFrame {

    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs= null;

   
    public Book() {
        initComponents();
        con = DBconnect.connect();
        //table call
        tableload();
    }
 public void tableload()
    {
        
        try {
            String sql = "SELECT bid,bname,isbn,btype,bsub,bprice,qty,badd from book";
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
        bid = new javax.swing.JTextField();
        bname = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        isbm = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        bprice = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        btype = new javax.swing.JComboBox<>();
        cprintbtn = new javax.swing.JButton();
        caddbtn = new javax.swing.JButton();
        cupdatebtn = new javax.swing.JButton();
        cdelbtn = new javax.swing.JButton();
        cclerbtn = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        bqty = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        bsub = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        badd = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ctable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidepnel2.setBackground(new java.awt.Color(23, 35, 51));
        sidepnel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_home_48px_1.png"))); // NOI18N
        sidepnel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 30));

        jButton8.setText("Home");
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        sidepnel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 80, 20));

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
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 52, 30));

        jButton9.setText("Teachers");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 90, 20));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/png-transparent-computer-icons-student-school-student-angle-people-logo-thumbnail (1).png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 52, 30));

        jButton10.setText("Students");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 90, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/29302 (1).png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 52, 40));

        jButton11.setText("Books");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 90, 20));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_small_business_48px_1.png"))); // NOI18N
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 60, 40));

        stockbtn.setText("Stock");
        stockbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockbtnActionPerformed(evt);
            }
        });
        jPanel2.add(stockbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 90, 20));

        jPanel3.setBackground(new java.awt.Color(71, 120, 190));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/8832880 (1).png"))); // NOI18N
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Books Info");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 255)));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 4, 310, 60));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 280, 10));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 70));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 255, 255));
        jLabel19.setText("Employee id");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        bid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bidActionPerformed(evt);
            }
        });
        jPanel3.add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 130, 30));
        jPanel3.add(bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 270, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 255, 255));
        jLabel20.setText("Name");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jPanel3.add(isbm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 270, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 255, 255));
        jLabel21.setText("ISBN Number");
        jLabel21.setToolTipText("");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 255, 255));
        jLabel22.setText("Book Price");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        jPanel3.add(bprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 270, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 255, 255));
        jLabel23.setText("QTY");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        btype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classics", "Novel", "Horror", "Fantasy", "Science fiction", "History", "Short story" }));
        jPanel3.add(btype, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 70, -1));

        cprintbtn.setText("Print");
        jPanel3.add(cprintbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, -1, -1));

        caddbtn.setText("Add");
        caddbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caddbtnActionPerformed(evt);
            }
        });
        jPanel3.add(caddbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        cupdatebtn.setText("Update");
        cupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cupdatebtnActionPerformed(evt);
            }
        });
        jPanel3.add(cupdatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, -1));

        cdelbtn.setText("Delete");
        cdelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdelbtnActionPerformed(evt);
            }
        });
        jPanel3.add(cdelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, -1, -1));

        cclerbtn.setText("Clear");
        cclerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cclerbtnActionPerformed(evt);
            }
        });
        jPanel3.add(cclerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 255, 255));
        jLabel25.setText("Book Type");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel3.add(bqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 70, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 255, 255));
        jLabel27.setText("Sub Catogary");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        bsub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinhala", "English", "Tamil" }));
        jPanel3.add(bsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 130, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 255, 255));
        jLabel24.setText("Bokk Add date");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        badd.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(badd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

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
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sidepnel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1658, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 600, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(sidepnel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        //page eka load krnna constructo ekk hdghda
        Teacher c1 = new Teacher();
        c1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        //page eka load krnna constructor ekk hdghda
        stu s1 = new stu();
        s1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        //page eka load krnna constructor ekk hdghda

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

    private void bidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bidActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bidActionPerformed

    private void caddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caddbtnActionPerformed

        String bidd = bid.getText();
        String bnam = bname.getText();
        String isdm = isbm.getText();
        String btyp = btype.getSelectedItem().toString();
        String bsu = bsub.getSelectedItem().toString();
        String bpric = bprice.getText();
        String bqt = bqty.getText();
        String bamo = ((JTextField)badd.getDateEditor().getUiComponent()).getText();
        //String bdi = bdis.getText(); 
       //String bto = btot.getText(); 
      
        

        try {
            String q = "INSERT INTO book (bname,isbn,btype,bsub,bprice,qty,badd) values ('" + bnam + "','" + isdm + "','" + btyp + "','" + bsu + "','" + bpric + "','" + bqt + "','" + bamo + "')";
            pst = con.prepareStatement(q);
            pst.execute();//execute krnwa database ekata
            //load table
            tableload();
        } catch (Exception e) {
        }

        getStock();

    }//GEN-LAST:event_caddbtnActionPerformed

    private void getStock() {

        //data base add part
        String cpro = bsub.getSelectedItem().toString();
        int cqty = Integer.parseInt(bqty.getText());

        try {
            String q = "SELECT * FROM stock WHERE prod = '" + cpro + "'";
            pst = con.prepareStatement(q);
            pst.execute();//execute krnwa database ekaata
            rs = pst.executeQuery();
            while (rs.next()) {
                cpro = rs.getString(1);
                cqty = rs.getInt(2);
            }
            addStock(cpro, cqty);
        } catch (Exception e) {
        }

    }

    private void addStock(String cprod, int cqtyd) {

        //data base add part
        String cpro = bsub.getSelectedItem().toString();
        int cqty = Integer.parseInt(bqty.getText());
        String bt = btype.getSelectedItem().toString();

        int newQty = cqtyd + cqty;

        try {
            String q = "UPDATE stock SET qty = '" + newQty + "',btype = '" + bt + "'  WHERE prod = '" + cpro + "' ";
            pst = con.prepareStatement(q);
            pst.execute();//execute krnwa database ekaata
        } catch (Exception e) {
        }

    }
    
    
    
    private void cupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cupdatebtnActionPerformed

         int x = JOptionPane.showConfirmDialog(null, "Do you really want to update");
        //update krna oneda ahnwa
        if (x == 0) {
       
         String bidd = bid.getText();
        String bnam = bname.getText();
        String isdm = isbm.getText();
        String btyp = btype.getSelectedItem().toString();
        String bsu = bsub.getSelectedItem().toString();
        String bpric = bprice.getText();
        String bqt = bqty.getText();
        String bamo = ((JTextField)badd.getDateEditor().getUiComponent()).getText();
       // String bdi = bdis.getText(); 
        //String bto = btot.getText();
        
        
            String sql = "UPDATE book SET bname = '" + bnam + "' , isbn = '" + isdm + "' , btype = '" + btyp + "' , bsub = '" + bsu + "' , bprice = '" + bpric + "' , qty = '" + bqt + "' , badd = '" + bamo + "' where bid = '" + bidd + "'";

            //loku wedak krddi try catch ekk athulta danwa
            try {
                pst = con.prepareStatement(sql);
                pst.execute();

                tableload();

            } catch (Exception e) {
            }
        }
        
    }//GEN-LAST:event_cupdatebtnActionPerformed

    private void cdelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdelbtnActionPerformed
        // TODO add your handling code here:
        
         int x = JOptionPane.showConfirmDialog(null, "Do you really want to Delete this");
        //update krna oneda ahnwa
        if (x == 0) {
            String id = bid.getText();

            String sql = "DELETE from book where bid = '" + id + "'";

            //loku wedak krddi try catch ekk athulta danwa
            try {
                pst = con.prepareStatement(sql);
                pst.execute();
                tableload();
            } catch (Exception e) {
            }
        }
    
    }//GEN-LAST:event_cdelbtnActionPerformed

    private void cclerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cclerbtnActionPerformed
        // TODO add your handling code here:
         bid.setText("");
        badd.setDateFormatString("");
        //bdis.setText("");
        bname.setText("");
        bprice.setText("");
        bqty.setText("");
        bsub.setSelectedItem("");
       // btot.setText("");
        btype.setSelectedItem("");
        isbm.setText("");
        
       
    }//GEN-LAST:event_cclerbtnActionPerformed

    private void ctableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctableMouseClicked
         //value eka select krma box walta ynna
        int r = ctable.getSelectedRow();

        String id = ctable.getValueAt(r, 0).toString();
        String name = ctable.getValueAt(r, 1).toString();
        String isbmm = ctable.getValueAt(r, 2).toString();
        String bty = ctable.getValueAt(r, 3).toString();
        String bsu = ctable.getValueAt(r, 4).toString();
        String bpri = ctable.getValueAt(r, 5).toString();
        String bqtyy = ctable.getValueAt(r, 6).toString();
        String bamo = ctable.getValueAt(r, 7).toString();
        //String bdiss = ctable.getValueAt(r, 8).toString();
        //String bto = ctable.getValueAt(r, 9).toString();

         bid.setText(id);
         bname.setText(name);
         isbm.setText(isbmm);
         btype.setSelectedItem(bty);
         bsub.setSelectedItem(bsu);
         bprice.setText(bpri);
         bqty.setText(bqtyy);
         badd.setDateFormatString(bamo);
         //bdis.setText(bdiss);
        // btot.setText(bto);


    }//GEN-LAST:event_ctableMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        home h1 = new home();
        h1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser badd;
    private javax.swing.JTextField bid;
    private javax.swing.JTextField bname;
    private javax.swing.JTextField bprice;
    private javax.swing.JTextField bqty;
    private javax.swing.JComboBox<String> bsub;
    private javax.swing.JComboBox<String> btype;
    private javax.swing.JButton caddbtn;
    private javax.swing.JButton cclerbtn;
    private javax.swing.JButton cdelbtn;
    private javax.swing.JButton cprintbtn;
    private javax.swing.JTable ctable;
    private javax.swing.JButton cupdatebtn;
    private javax.swing.JTextField isbm;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel sidepnel2;
    private javax.swing.JButton stockbtn;
    // End of variables declaration//GEN-END:variables
}
