

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class ManageItems extends javax.swing.JFrame {

   Connection con;
     Statement stmt;
     ResultSet rs;
    public ManageItems() {
        initComponents();
        Connect();
        
    }

    public void Connect(){
       try{
   String host="jdbc:mysql://localhost:3306/billing";
          String uName="root";
          String uPass="";
  con=DriverManager.getConnection(host,uName,uPass);

         stmt=con.createStatement();
          ResultSet s=stmt.executeQuery("select distinct itemname from item");
 while (s.next()) {  

     jComboBox2.addItem(s.getString("itemname"));  
       }
       }catch(SQLException e){
  JOptionPane.showMessageDialog(this,e.getMessage());
       }
       DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
       Calendar cal = Calendar.getInstance();
   jTextField11.setText(dateFormat.format(cal.getTime()));
   
  
   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox();
        jButton9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Items");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(431, 13, 371, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Item Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 160, 100, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Item ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 90, 70, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Company/Brand");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(69, 207, 132, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Price");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(69, 320, 159, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(173, 86, 335, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Quantity");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(69, 261, 80, 20);

        jTextField2.setEnabled(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 150, 151, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(210, 210, 335, 30);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(238, 318, 270, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(173, 259, 145, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Box", "Pouch", "Cane", "Bag", "Unit", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(336, 258, 172, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(286, 374, 335, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Label");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(69, 376, 213, 20);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(286, 421, 335, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Calculate Total Qty");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(69, 419, 201, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("GST(%)");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(69, 470, 152, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Our Profit");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(69, 542, 116, 20);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(286, 470, 335, 30);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(286, 540, 335, 30);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(286, 588, 335, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Calculate Total Cost");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(69, 587, 201, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item ID", "Item Name", "Brand", "Quantity", "Price", "Pieces", "Total Quantity", "GST", "Profit", "Total Cost", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(710, 220, 641, 402);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(69, 628, 153, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setText("Modify");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(232, 628, 150, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setText("Remove");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(400, 628, 140, 30);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(770, 167, 464, 40);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(558, 628, 112, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Date");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(710, 90, 65, 30);
        getContentPane().add(jTextField11);
        jTextField11.setBounds(770, 86, 227, 30);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton8.setText("Available Stock");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(1040, 11, 203, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButton1.setText("New");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(173, 120, 60, 25);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jRadioButton2.setText("Old");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(334, 119, 60, 25);

        jComboBox2.setEnabled(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(330, 150, 129, 30);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.JPG"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(10, 11, 52, 49);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1712073296891.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1480, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int x = jComboBox1.getSelectedIndex();
        
if(x==0)
{
    JOptionPane.showMessageDialog(this, "Please Select A option From Dropdown List");
}
if(x==1)
{
jLabel8.setText("Quantity In Per Box");
jLabel5.setText("Price Per Box");
}
if(x==2)
{
jLabel8.setText("Quantity In Per Pouch");
jLabel5.setText("Price Per Pouch");
}
if(x==3)
{
jLabel8.setText("Quantity In Per Cane");
jLabel5.setText("Price Per Cane");
}
if(x==4)
{
jLabel8.setText("Quantity In Per Bag");
jLabel5.setText("Price Per Bag");
}
if(x==5)
{
jLabel8.setText("Quantity In Per Unit");
jLabel5.setText("Price Per Unit");
}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(!jTextField5.getText().isEmpty() && !jTextField6.getText().isEmpty())
{
        int n = Integer.parseInt(jTextField5.getText()) * Integer.parseInt(jTextField6.getText());
        jTextField7.setText(""+n);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double price , qty , gst , profit;
        price = Double.parseDouble(jTextField4.getText());
        qty = Double.parseDouble(jTextField5.getText());
        gst = Double.parseDouble(jTextField8.getText());
          profit = Double.parseDouble(jTextField9.getText());
          double total1 = price * qty;
          double total2 = (price * qty)*(gst/100);
          double total3 = total1 + total2;
          double totalcost = total3 + (total3*(profit/100));
          jTextField10.setText(""+totalcost);
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // save
        try
         {
        String itemid=jTextField1.getText();
        String itemname=jTextField2.getText();
        String brand=jTextField3.getText();
        String quantity=jTextField5.getText();
        String price=jTextField4.getText();
        String pieces=jTextField6.getText();
        String toalqty=jTextField7.getText();
        String gst=jTextField8.getText();
        String profit=jTextField9.getText();
        String totalcost=jTextField10.getText();
        String Date = jTextField11.getText();
        String sql;
        int n;
        if(jRadioButton1.isSelected())
        {
            
        sql="insert into item(itemname,brand,quantity,price,pieces,toalqty,gst,profit,totalcost,Date) values('"+itemname+"','"+brand+"',"+quantity+","+price+",'"+pieces+"','"+toalqty+"','"+gst+"','"+profit+"','"+totalcost+"','"+Date+"')";
        n = stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,n + " Records Saved Successfully!");
        
        String sql1="insert into itemstock(itemname,availquantity,price,gst,sellerprofit) values('"+itemname+"',"+quantity+","+price+",'"+gst+"','"+profit+"')";
        n = stmt.executeUpdate(sql1);
        
   JOptionPane.showMessageDialog(null,n + " Records Updated in Stock Successfully!");
   
   
        ResultSet s=stmt.executeQuery("select * from item");
 while (s.next()) {  

     jComboBox2.addItem(s.getString("itemname"));  
       }
        }
 if(jRadioButton2.isSelected())
 {String itemname1 = jComboBox2.getSelectedItem().toString();
     sql="insert into item(itemname,brand,quantity,price,pieces,toalqty,gst,profit,totalcost,Date) values('"+itemname1+"','"+brand+"',"+quantity+","+price+",'"+pieces+"','"+toalqty+"','"+gst+"','"+profit+"','"+totalcost+"','"+Date+"')";
        n = stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,n + " Records Saved Successfully!");
        
        
        
       
       
        String sql2="select availquantity from itemstock where itemname = '"+itemname1+"'";

         rs=stmt.executeQuery(sql2);
         // String str = "";
int updatedQuantity=0;
         while(rs.next()){
     //str+=rs.getString("teamid")+rs.getString("teamname")+"\n";
//rs.getString("itemid");
//rs.getString("itemname;
       updatedQuantity =  Integer.parseInt(rs.getString(1)) + Integer.parseInt(quantity);
           // String updatedQuantity1 = updatedQuantity;    
                  
            }
         
         
         String sql3="update itemstock set itemname='"+itemname1+"',availquantity="+updatedQuantity+",price="+price+",gst='"+gst+"',sellerprofit='"+profit+"' where itemname='"+itemname1+"'";
        n = stmt.executeUpdate(sql3);
        
   JOptionPane.showMessageDialog(null,n + " Records Updated in Stock Successfully!");
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 }
        
        
   
   
  /* if(n==1)
   {
       
       try{
       
        String sql1="select product,count(sale) from orders group by product;";

         rs=stmt.executeQuery(sql);
         // String str = "";

         while(rs.next()){
     //str+=rs.getString("teamid")+rs.getString("teamname")+"\n";
//rs.getString("itemid");
//rs.getString("itemname;
        rs.getString("quantity");
                rs.getString("price");
                rs.getString("gst");
                rs.getString("profit");
                  
            }
        }catch(SQLException  e){
    JOptionPane.showMessageDialog(this,e.getMessage());
    }
        }*/
   
   
     }
    catch(SQLException  e)
    {
    JOptionPane.showMessageDialog(this,e.getMessage());
    }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // modify
        try{
      

       String sql = "update item set itemname='"+jTextField2.getText()+"',brand='"+jTextField3.getText()+"',quantity='"+jTextField5.getText()+"',price='"+jTextField4.getText()+"',pieces='"+jTextField6.getText()+"',toalqty='"+jTextField7.getText()+"',gst='"+jTextField8.getText()+"',profit='"+jTextField9.getText()+"',totalcost='"+jTextField10.getText()+"' where itemid="+jTextField1.getText();
            stmt.executeUpdate(sql);
  JOptionPane.showMessageDialog(null,"Updated Successfully!");
        }catch(SQLException  e){
    JOptionPane.showMessageDialog(this,e.getMessage());
    }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // remove
        try{
    
        String sql="delete from item where itemid="+jTextField1.getText();
         stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Deleted Successfully!");
        }catch(SQLException  e){
    JOptionPane.showMessageDialog(this,e.getMessage());
    }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
         // clear
         jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       try{
       
        String sql="select * from item";

         rs=stmt.executeQuery(sql);
         // String str = "";
DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
model.setRowCount(0);
         while(rs.next()){
     //str+=rs.getString("teamid")+rs.getString("teamname")+"\n";
model.addRow(new Object[]{rs.getString("itemid"),rs.getString("itemname"),rs.getString("brand"),rs.getString("quantity"),rs.getString("price"),rs.getString("pieces"),rs.getString("toalqty"),rs.getString("gst"),rs.getString("profit"),rs.getString("totalcost"),rs.getString("Date")});  
            }
        }catch(SQLException  e){
    JOptionPane.showMessageDialog(this,e.getMessage());
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Stock stk = new Stock();
         stk.setSize(1400,700);
stk.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       jTextField2.setEnabled(true);
       jComboBox2.setEnabled(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jTextField2.setEnabled(false);
       jComboBox2.setEnabled(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
