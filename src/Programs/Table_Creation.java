/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
        
public class Table_Creation extends javax.swing.JFrame {
    Connection con;
    String Id="";
    int t=0;
    public Table_Creation() {
        initComponents();
        bindData();
        id();
    }      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtadd = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        register = new javax.swing.JButton();
        update = new javax.swing.JButton();
        ramdom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 700, 140);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Id");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 190, 70, 30);

        txtid.setEditable(false);
        txtid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtid);
        txtid.setBounds(290, 190, 210, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 240, 70, 30);

        txtname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtname);
        txtname.setBounds(290, 240, 210, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Phone No.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 340, 80, 30);

        txtphone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtphone);
        txtphone.setBounds(290, 340, 210, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("E-mail id");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 390, 70, 30);

        txtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtemail);
        txtemail.setBounds(290, 390, 210, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 440, 80, 30);

        txtpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtpassword);
        txtpassword.setBounds(290, 440, 210, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Address");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(120, 290, 70, 30);

        txtadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtadd);
        txtadd.setBounds(290, 290, 210, 30);

        delete.setBackground(new java.awt.Color(0, 102, 255));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setText("Delete");
        delete.setBorder(null);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(540, 390, 170, 60);

        register.setBackground(new java.awt.Color(0, 102, 255));
        register.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        register.setText("Register");
        register.setBorder(null);
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel1.add(register);
        register.setBounds(540, 210, 170, 60);

        update.setBackground(new java.awt.Color(0, 102, 255));
        update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        update.setText("Update");
        update.setBorder(null);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(540, 300, 170, 60);
        jPanel1.add(ramdom);
        ramdom.setBounds(30, 210, 60, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 750, 510);

        setSize(new java.awt.Dimension(788, 572));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void id(){
    try {
        int i=1;
        Connection();
	PreparedStatement ps1=con.prepareStatement("select * from user_register");
	ResultSet rs=ps1.executeQuery();
	while(rs.next()) {
        i++;
        txtid.setText(""+(i));
        }
}
    catch(Exception e){
    e.printStackTrace();
    }
    bindData();
    }
    /*public void Ramo(){
    Random R=new Random();
    int ro=R.nextInt(100);
    ramdom.setText(""+ro);
    }*/
    public void addToDatabase(){
                String s=txtid.getText();
		int user_id=Integer.parseInt(s);
		String name=txtname.getText();
                String address=txtadd.getText();
		String s1=txtphone.getText();
                long phone=Long.parseLong(s1);
		String email=txtemail.getText();
		String password=txtpassword.getText();
		try {
			Connection();
			PreparedStatement ps1=con.prepareStatement("select * from user_register");
			ResultSet rs=ps1.executeQuery();
			while(rs.next()) {
				long phone1=rs.getLong("phone");
				String email1=rs.getString("email");
				if(phone1==phone) {
					JOptionPane.showMessageDialog(this,"Phone number Already registered");
                                        txtphone.setText("");
					return;
					}
				if(email1.equals(email)) {
					JOptionPane.showMessageDialog(this,"E-mail Id Already registered");
                                        txtemail.setText("");
					return;
					}
				}
			PreparedStatement ps2=con.prepareStatement("Insert into user_register values(?,?,?,?,?,?)");
			ps2.setInt(1,user_id);
			ps2.setString(2,name);
			ps2.setString(3,address);
			ps2.setLong(4,phone);
			ps2.setString(5,email);
                        ps2.setString(6,password);
			int i=ps2.executeUpdate();
			if(i>0){
				JOptionPane.showMessageDialog(this,"Registration Successful");
                                txtid.setText("");
                                txtname.setText("");
                                txtadd.setText("");
                                txtphone.setText("");
                                txtemail.setText("");
                                txtpassword.setText("");
				}
			else {
				JOptionPane.showMessageDialog(this,"Registration Failed","Failed",2);
				}
			}
		catch (Exception e) {
			e.printStackTrace();
		}
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.rowAtPoint(evt.getPoint());
        int column = jTable1.columnAtPoint(evt.getPoint());
        Id = jTable1.getModel().getValueAt(row, 0)+"";
        System.out.println(Id);
        t=1;
        try {
            Connection();
            PreparedStatement ps = con.prepareStatement("select * from user_register where user_id="+Integer.parseInt(Id)+ " ");
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
                txtid.setText(rs.getString("user_Id"));
                txtname.setText(rs.getString("name"));
                txtadd.setText(rs.getString("address"));
                txtphone.setText(rs.getString("phone"));
                txtemail.setText(rs.getString("email"));
                txtpassword.setText(rs.getString("password"));
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        try{
            String s=txtid.getText();
            int id=Integer.parseInt(s);
            Connection();
            PreparedStatement ps=con.prepareStatement("Delete from user_register where User_ID=?");
            ps.setInt(1,id);
            int count=ps.executeUpdate();
            if(count>0) {
                JOptionPane.showMessageDialog(this,"Deletion Success");
                txtid.setText("");
                txtname.setText("");
                txtadd.setText("");
                txtphone.setText("");
                txtemail.setText("");
                txtpassword.setText("");
            }
            else {
                JOptionPane.showMessageDialog(this,"Deletion Failed");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        bindData();
        id();
    }//GEN-LAST:event_deleteActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed

       addToDatabase();
       bindData();
        id();
    }//GEN-LAST:event_registerActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        try{
            String id=txtid.getText();
            int user_id=Integer.parseInt(id);
            String name=txtname.getText();
            String address=txtadd.getText();
            String pho=txtphone.getText();
            long phone=Long.parseLong(pho);
            String email=txtemail.getText();
            String password=txtpassword.getText();
            Connection();
            PreparedStatement ps=con.prepareStatement("Update user_register set user_id=?, name=?, address=?, phone=?, email=?, password=? where user_id=?");
            ps.setInt(1,user_id);
            ps.setString(2,name);
            ps.setString(3,address);
            ps.setLong(4,phone);
            ps.setString(5,email);
            ps.setString(6,password);
            ps.setString(7,id);
            ps.executeUpdate();
            txtid.setText("");
            txtname.setText("");
            txtadd.setText("");
            txtphone.setText("");
            txtemail.setText("");
            txtpassword.setText("");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        bindData();
        id();
    }//GEN-LAST:event_updateActionPerformed

    void bindData() {
        try {
            Connection();
            PreparedStatement ps=con.prepareStatement("select * from user_register");
            ResultSet rs=ps.executeQuery();
            DefaultTableModel tableModel =buildTableModel(rs);
            jTable1.setModel(tableModel);
            while(rs.next()) {
                txtid.setText(rs.getString("user_Id"));
                txtname.setText(rs.getString("name"));
                txtadd.setText(rs.getString("address"));
                txtphone.setText(rs.getString("phone"));
                txtemail.setText(rs.getString("email"));
                txtpassword.setText(rs.getString("password"));
            }
        } catch (Exception e) {
              System.out.println(e);
        }
    }                                    
    public static DefaultTableModel buildTableModel(ResultSet rs)
            throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();
        Vector colname=new Vector();
        int columnCount=metaData.getColumnCount();
        for (int column=1;column<=columnCount;column++) {
            colname.add(metaData.getColumnName(column));
        }
        Vector data=new Vector();
        while (rs.next()) {
            Vector vector=new Vector();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        return new DefaultTableModel(data,colname);
    }
    
	private void Connection(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample2","root","Sidharth@123");	
		}
		catch(Exception e){
			System.out.print(e);
		}
        }
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
            java.util.logging.Logger.getLogger(Table_Creation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table_Creation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table_Creation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table_Creation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table_Creation().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel ramdom;
    private javax.swing.JButton register;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtphone;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
