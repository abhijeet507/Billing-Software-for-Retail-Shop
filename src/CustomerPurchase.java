import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class CustomerPurchase extends javax.swing.JFrame {
Statement stmt;
     ResultSet rs;
    Connection con;
    public CustomerPurchase() {
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
         ResultSet r=stmt.executeQuery("select * from customer");

 while (r.next()) {  
     jComboBox1.addItem(r.getString("Name"));  
       }
 ResultSet s=stmt.executeQuery("select * from itemstock");
 while (s.next()) {  

     jComboBox2.addItem(s.getString("itemname"));  
       }
 
 double gst = 0.0;
 double sellerprofit = 0.0;
 ResultSet t=stmt.executeQuery("select availquantity,price,gst,sellerprofit from itemstock where itemname='"+jComboBox2.getSelectedItem()+"'");
 while (t.next()) {  
int availquantity = Integer.parseInt(t.getString("availquantity"));
     jTextField2.setText(""+availquantity); 
     jTextField8.setText(t.getString("price"));
    price = Double.parseDouble(t.getString("price")); 
     gst = Double.parseDouble(t.getString("gst")); 
     jTextField9.setText(t.getString("gst"));
      sellerprofit = Double.parseDouble(t.getString("sellerprofit")); 
      jTextField10.setText(t.getString("sellerprofit"));
       }
 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
       Calendar cal = Calendar.getInstance();
   jTextField11.setText(dateFormat.format(cal.getTime()));
 
       }//try end
       
       
       catch(SQLException e){
  JOptionPane.showMessageDialog(this,e.getMessage());
       }
       
       
       
       
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField7 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField12 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("To");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 80, 30, 20);

        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(200, 70, 122, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Invoice No.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 130, 100, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 120, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Item Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 170, 100, 20);

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(200, 160, 147, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 370, 80, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Available");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 330, 90, 15);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(200, 320, 147, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(200, 360, 147, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Discount(%)");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 490, 110, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Amount");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(120, 450, 71, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Discounted Amount");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 560, 160, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(200, 440, 147, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(200, 480, 147, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(200, 560, 150, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Old");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(190, 10, 50, 30);

        jTextField7.setEnabled(false);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(360, 70, 138, 30);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("New");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(310, 10, 51, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(559, 33, 178, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("CalAmount");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 400, 148, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("CalAmount");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(200, 520, 148, 30);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(200, 200, 147, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Price");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 210, 50, 20);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(771, 33, 189, 23);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(989, 33, 204, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Tax(%)");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(120, 250, 70, 20);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(200, 240, 147, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Seller Profit(%)");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 290, 140, 15);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(200, 280, 147, 30);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Confirm Order");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(569, 523, 222, 30);

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(559, 62, 705, 14);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemName", "Price", "Quantity", "Tax", "Amount", "Discount", "Amount(With Discount)"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Total Amount");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Date");

        jLabel15.setText("jLabel15");

        jLabel16.setText("Customer Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(92, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(559, 94, 627, 423);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("Print Bill");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(839, 523, 256, 30);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.JPG"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(10, 11, 58, 39);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1712075903714.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(-20, -40, 1980, 1020);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jLabel15.setText(jComboBox1.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jComboBox1.setEnabled(true);
         jTextField7.setEnabled(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       jComboBox1.setEnabled(false);
         jTextField7.setEnabled(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//add

DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

model.addRow(new Object[]{jComboBox2.getSelectedItem().toString(),jTextField8.getText(),jTextField3.getText(),jTextField9.getText(),jTextField4.getText(),jTextField5.getText(),jTextField6.getText()});
//////////////
int rows=jTable1.getRowCount();
Double caltotal = 0.0;
for(int row = 0; row<rows; row++)
{    String a = jTable1.getValueAt(row, 6).toString();
    caltotal=caltotal+Double.parseDouble(a);
     
     
    }//GEN-LAST:event_jButton1ActionPerformed
    jTextField12.setText(""+caltotal);
    }
    
    double amount = 0.0;
double price = 0.0;
double disAmount = 0.0;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Double q =  Double.parseDouble(jTextField3.getText());
        Double g =  Double.parseDouble(jTextField9.getText());
        Double pr =  Double.parseDouble(jTextField10.getText());
        Double t1 = price*q;
        Double t2 = t1*(g/100.0);
        Double t3 = (t1+t2)*(pr/100.0);
        amount = t1 + t2 + t3;
 jTextField4.setText(""+amount);
 
    }//GEN-LAST:event_jButton2ActionPerformed
double total = 0.0;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double t = Double.parseDouble(jTextField4.getText());
        disAmount = (t*(Double.parseDouble(jTextField5.getText())/100.0));
        total = Double.parseDouble(jTextField4.getText())-disAmount;
 jTextField6.setText(""+total);
    }//GEN-LAST:event_jButton3ActionPerformed
String cname = "";
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(jRadioButton1.isSelected())
    {
     cname = jComboBox1.getSelectedItem().toString();
    
    }
    if(jRadioButton2.isSelected())
    {
    cname = jTextField7.getText();
    }
    ////////////////////////////////////////
    try
         {
             int rows=jTable1.getRowCount();
        String date = jTextField11.getText();
        for(int row = 0; row<rows; row++)
{
    String titemname = (String)jTable1.getValueAt(row, 0);
     String  tprice= (String)jTable1.getValueAt(row, 1);
    String  tquantity= (String)jTable1.getValueAt(row, 2);
     
    String ttax = (String)jTable1.getValueAt(row, 3);
    String tbill = (String)jTable1.getValueAt(row, 4);
    String tdis = (String)jTable1.getValueAt(row, 5);
    String tdisbill = (String)jTable1.getValueAt(row, 6);
    
        String sql="insert into sellitem(cname,date,itemname,price,quantity,tax,bill,discount,disbill) values('"+cname+"','"+date+"','"+titemname+"',"+tprice+",'"+tquantity+"','"+ttax+"','"+tbill+"','"+tdis+"','"+tdisbill+"')";
        stmt.executeUpdate(sql);
        
        int updatedQuantity=0;
        String sql2="select availquantity from itemstock where itemname = '"+titemname+"'";

         rs=stmt.executeQuery(sql2);
         // String str = "";

         while(rs.next()){
     //str+=rs.getString("teamid")+rs.getString("teamname")+"\n";
//rs.getString("itemid");
//rs.getString("itemname;
       updatedQuantity =  Integer.parseInt(rs.getString(1)) - Integer.parseInt(tquantity);
           // String updatedQuantity1 = updatedQuantity;    
                  
            }
        
        
    String sql3="update itemstock set availquantity="+updatedQuantity+" where itemname='"+titemname+"'";
       stmt.executeUpdate(sql3);  
       
       
       
}
   JOptionPane.showMessageDialog(null,"Saved Successfully!");
     }
    catch(SQLException  e)
    {
    JOptionPane.showMessageDialog(this,e.getMessage());
    }
    
    
    
    
    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // update
        jLabel12.setText("");
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        if(jTable1.getSelectedRow()==-1)
        {
            if(jTable1.getRowCount()==0)
            {
                jLabel12.setText("Table is Empty");
            }
            else
            {
                jLabel12.setText("You Must Select A Product");
            }
        }  
        else
        {
     

     model.setValueAt(jComboBox2.getSelectedItem().toString(),jTable1.getSelectedRow(),0); 
      model.setValueAt(jTextField8.getText(),jTable1.getSelectedRow(),1); 
     model.setValueAt(jTextField3.getText(),jTable1.getSelectedRow(),2); 
     model.setValueAt(jTextField9.getText(),jTable1.getSelectedRow(),3);
      model.setValueAt(jTextField4.getText(),jTable1.getSelectedRow(),4); 
       model.setValueAt(jTextField5.getText(),jTable1.getSelectedRow(),5); 
      model.setValueAt(jTextField6.getText(),jTable1.getSelectedRow(),6);
        }
        
        
        int rows=jTable1.getRowCount();
Double caltotal = 0.0;
for(int row = 0; row<rows; row++)
{    String a = jTable1.getValueAt(row, 6).toString();
    caltotal=caltotal+Double.parseDouble(a);
     
     
    }                                        
    jTextField12.setText(""+caltotal);
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // delete
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        jLabel12.setText("");
        if(jTable1.getSelectedRow()==-1)
        {
            if(jTable1.getRowCount()==0)
            {
                jLabel12.setText("Table is Empty");
            }
            else
            {
                jLabel12.setText("You Must Select A Product");
            }
        }  
        else
        {
      

     model.removeRow(jTable1.getSelectedRow()); 
     
        }
        
        //////////////
        
        int rows=jTable1.getRowCount();
Double caltotal = 0.0;
for(int row = 0; row<rows; row++)
{    String a = jTable1.getValueAt(row, 6).toString();
    caltotal=caltotal+Double.parseDouble(a);
     
     
    }                                        
    jTextField12.setText(""+caltotal);
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        jComboBox2.setSelectedItem(model.getValueAt(jTable1.getSelectedRow(), 0).toString());
        jTextField8.setText(model.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextField3.setText(model.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jTextField9.setText(model.getValueAt(jTable1.getSelectedRow(), 3).toString());
        jTextField4.setText(model.getValueAt(jTable1.getSelectedRow(), 4).toString());
        jTextField5.setText(model.getValueAt(jTable1.getSelectedRow(), 5).toString());
        jTextField6.setText(model.getValueAt(jTable1.getSelectedRow(), 6).toString());
        
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        try
        {
            
            String host="jdbc:mysql://localhost:3306/billing";
          String uName="root";
          String uPass="";
  con=DriverManager.getConnection(host,uName,uPass);

         stmt=con.createStatement();
            
            
        double gst = 0.0;
 double sellerprofit = 0.0;
 ResultSet m=stmt.executeQuery("select availquantity,price,gst,sellerprofit from itemstock where itemname='"+jComboBox2.getSelectedItem()+"'");
 while (m.next()) {  
int availquantity = Integer.parseInt(m.getString("availquantity"));
     jTextField2.setText(""+availquantity); 
     jTextField8.setText(m.getString("price"));
    price = Double.parseDouble(m.getString("price")); 
     gst = Double.parseDouble(m.getString("gst")); 
     jTextField9.setText(m.getString("gst"));
      sellerprofit = Double.parseDouble(m.getString("sellerprofit")); 
      jTextField10.setText(m.getString("sellerprofit"));
      
       }
        }
        catch(Exception ex)
        {
            
        }
        
        
       
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        PrinterJob pj = PrinterJob.getPrinterJob();
  pj.setJobName(" Print Component ");

  pj.setPrintable (new Printable() {    
    public int print(Graphics pg, PageFormat pf, int pageNum){
      if (pageNum > 0){
      return Printable.NO_SUCH_PAGE;
      }

      Graphics2D g2 = (Graphics2D) pg;
      g2.translate(pf.getImageableX(), pf.getImageableY());
      jPanel1.paint(g2);
      return Printable.PAGE_EXISTS;
    }
  });
  if (pj.printDialog() == false)
  return;

  try {
        pj.print();
  } catch (PrinterException ex) {
        // handle exception
  }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    
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
            java.util.logging.Logger.getLogger(CustomerPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerPurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerPurchase().setVisible(true);
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
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
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
