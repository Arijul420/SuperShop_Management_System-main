package super_shop_management_system;

import com.mysql.jdbc.Connection;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;


public class Customer_Order extends javax.swing.JFrame {
    String s;
    public int grandtotal=0;
    public int customerID;
    public String product_name,category;
    public int price,available_units,product_id,avll,quan,new_avl;
    boolean ClickNext=false;
    int q=0;
    int p,total;
    
    String url = "jdbc:mysql://localhost:3306/supershop";
    String username = "root";
    String password = "";
    ResultSet result = null;
    String query = "";
    
    public Customer_Order() {
        initComponents();
       
    }
    public void setID(int id)
    {
        customerID=id;
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameF = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        catL = new javax.swing.JLabel();
        avL = new javax.swing.JLabel();
        quantityL = new javax.swing.JLabel();
        priceL = new javax.swing.JLabel();
        totalL = new javax.swing.JLabel();
        idl = new javax.swing.JLabel();
        nameL = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        del = new javax.swing.JButton();
        chckout = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        options = new javax.swing.JComboBox<>();
        view = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(173, 234, 219));
        jPanel2.setForeground(new java.awt.Color(0, 102, 255));

        jPanel3.setBackground(new java.awt.Color(37, 56, 74));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(173, 234, 219));
        jLabel1.setText("Customer Order");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID");
        jLabel2.setToolTipText("");

        idf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idfActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        nameF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        idLabel.setForeground(new java.awt.Color(0, 102, 255));
        idLabel.setText("ID");

        nameLabel.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 102, 255));
        nameLabel.setText("Name");

        jLabel10.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Category");

        jLabel11.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Availability");

        jLabel12.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setText("Quantity");

        jLabel13.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 255));
        jLabel13.setText("Price/Unit");

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Total");

        catL.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        avL.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        quantityL.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        priceL.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        totalL.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        idl.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        nameL.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N

        add.setBackground(new java.awt.Color(51, 255, 153));
        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        del.setBackground(new java.awt.Color(255, 102, 102));
        del.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        chckout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chckout.setText("Checkout");
        chckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckoutActionPerformed(evt);
            }
        });

        confirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        options.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        options.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Drinks", "Chips", "Biscuits", "Grocery", "Dairy", "Cosmetics", "All" }));
        options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsActionPerformed(evt);
            }
        });

        view.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(nameL))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(catL))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(avL)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel12)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantityL)
                                .addGap(48, 48, 48)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(priceL)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(options, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idf, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(nameF, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(confirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chckout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(del)
                        .addGap(46, 46, 46)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(idf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel7))
                        .addGap(13, 13, 13)))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(catL)
                            .addComponent(totalL)
                            .addComponent(priceL)
                            .addComponent(quantityL)
                            .addComponent(avL)
                            .addComponent(nameL)
                            .addComponent(idl))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(del)
                            .addComponent(add)
                            .addComponent(search)))
                    .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chckout))
                .addGap(32, 32, 32)
                .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(view)
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
         
       // price=Integer.valueOf(priceField.getText());
       // available_units=Integer.valueOf(unit_field.getText());
     
          try {
                
          
              Class.forName("com.mysql.jdbc.Driver");
              Connection con = (Connection) DriverManager.getConnection(url, username, password);

              Statement st = con.createStatement();

              String query = "";
              if (!(idf.getText().isEmpty())) {
                  product_id = Integer.valueOf(idf.getText());
                  query = "SELECT * FROM `productlist` WHERE `Product ID`=" + product_id;
              } else if (!(nameF.getText().isEmpty())) {
                  product_name = nameF.getText();
                  query = "SELECT * FROM `productlist` WHERE `Product Name`='" + product_name + "'";
              }

              ResultSet result = st.executeQuery(query);
              while (result.next()) {

                  idl.setText(result.getInt("Product ID") + "");
                  avL.setText(result.getInt("Availability") + "");
                  catL.setText(result.getString("Category"));
                  nameL.setText(result.getString("Product Name"));
                  priceL.setText(result.getInt("Price") + "");

              }

              con.close();
                st.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(this, "Error");
            }

        
    }//GEN-LAST:event_searchActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
      if(q<Integer.parseInt(avL.getText())) 
      {
      q++;
      quantityL.setText(q+"");
      p=Integer.valueOf(priceL.getText());
      total=p*q;
      totalL.setText(total+"");  
      }
      else
           JOptionPane.showMessageDialog(null, "Item not found!");
    }//GEN-LAST:event_addActionPerformed

    private void idfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idfActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_idfActionPerformed

    private void nameFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
   
        
        nameF.setText("");
        idf.setText("");
        quantityL.setText("");
        totalL.setText("");
        nameL.setText("");
        catL.setText("");
        idl.setText("");
        avL.setText("");
        priceL.setText("");
        q=0;   
    }//GEN-LAST:event_resetActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
     
      q--;
      quantityL.setText(q+"");
      p=Integer.valueOf(priceL.getText());
      total=p*q;
      totalL.setText(total+"");
         
    }//GEN-LAST:event_delActionPerformed

    private void chckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckoutActionPerformed
       Bill_info t =new Bill_info();
       t.setVisible(true);
       t.showTable(grandtotal,customerID);
    }//GEN-LAST:event_chckoutActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
       
        String pn=nameL.getText();
        product_id=Integer.valueOf(idl.getText());
        String query="INSERT INTO bill "+ "Values ("+product_id+",'"+pn+"',"+p+","+q+","+total+")";
        grandtotal+=total;
        
        

       try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con;

            con = (Connection) DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            quan = Integer.parseInt(quantityL.getText());
            avll = Integer.parseInt(avL.getText());
            new_avl = avll - quan;
            query = "UPDATE `productlist` SET `Availability`= " + new_avl + " WHERE `Product ID`= " + product_id;
            st.executeUpdate(query);

            st.close();
            con.close();
            JOptionPane.showMessageDialog(this, "Added successfully to cart");
        } catch (Exception e) {
            System.out.println(e);
        }
      
       
        
        
    }//GEN-LAST:event_confirmActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
      String op=options.getSelectedItem().toString();
      if(op.equals("Select"))
      {
           JOptionPane.showMessageDialog(this, "Select an option");
           return;
      }
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            String query="Select *FROM productlist where `Category` = '"+op+"'";
            if(op.equals("all"))
               query="Select *FROM productlist"; 
            ResultSet rs=st.executeQuery(query);
             JFrame frame = new JFrame();
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            JTable table = new JTable();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            JScrollPane jsp = new JScrollPane(table);
            table.setForeground(Color.blue);
            panel.setLayout(new BorderLayout());
            panel.add(jsp, BorderLayout.CENTER);
            frame.setContentPane(panel);
            frame.setVisible(true);
            st.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
          
               
      
    }//GEN-LAST:event_viewActionPerformed

    private void optionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionsActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel avL;
    private javax.swing.JLabel catL;
    private javax.swing.JButton chckout;
    private javax.swing.JButton confirm;
    private javax.swing.JButton del;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idf;
    private javax.swing.JLabel idl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nameF;
    private javax.swing.JLabel nameL;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JComboBox<String> options;
    private javax.swing.JLabel priceL;
    private javax.swing.JLabel quantityL;
    private javax.swing.JButton reset;
    private javax.swing.JButton search;
    private javax.swing.JLabel totalL;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}