/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import short_cut.*;

public class user_register extends javax.swing.JFrame {

    public user_register() {
        super("Registration");
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registration");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(17, 20, 580, 60);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Id");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 120, 70, 30);

        txtid.setBorder(null);
        jPanel1.add(txtid);
        txtid.setBounds(270, 120, 210, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 170, 70, 30);

        txtname.setBorder(null);
        jPanel1.add(txtname);
        txtname.setBounds(270, 170, 210, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Phone No.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 220, 80, 30);

        txtphone.setBorder(null);
        jPanel1.add(txtphone);
        txtphone.setBounds(270, 220, 210, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("E-mail id");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 270, 70, 30);

        txtemail.setBorder(null);
        jPanel1.add(txtemail);
        txtemail.setBounds(270, 270, 210, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 320, 80, 30);

        txtpassword.setBorder(null);
        jPanel1.add(txtpassword);
        txtpassword.setBounds(270, 320, 210, 30);

        register.setBackground(new java.awt.Color(0, 204, 255));
        register.setText("Register");
        register.setBorder(null);
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel1.add(register);
        register.setBounds(200, 390, 160, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 610, 480);

        setSize(new java.awt.Dimension(650, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void addToDatabase(){
                String s=txtid.getText();
		int user_id=Integer.parseInt(s);
		String name=txtname.getText();
		String s1=txtphone.getText();
                long phone=Long.parseLong(s1);
		String email=txtemail.getText();
		String password=txtpassword.getText();
		try {
			Connect C=new Connect();
			Connection con=C.getConnection();
			PreparedStatement ps1=con.prepareStatement("select * from user_register");
			ResultSet rs=ps1.executeQuery();
			while(rs.next()) {
				int user_id1=rs.getInt("user_id");
				long phone1=rs.getLong("phone");
				String email1=rs.getString("email");
				if(user_id1==user_id) {
					JOptionPane.showMessageDialog(this,"User Id Already registered");
                                        txtid.setText("");
					return;
					}
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
			PreparedStatement ps2=con.prepareStatement("Insert into user_register values(?,?,?,?,?)");
			ps2.setInt(1,user_id);
			ps2.setString(2,name);
			ps2.setLong(3,phone);
			ps2.setString(4,email);
			ps2.setString(5,password);
			int i=ps2.executeUpdate();
			if(i>0){
				System.out.println("Success");
				}
			else {
				System.out.println("Failed");
				}
			}
		catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        addToDatabase();
        /*txtid.setText("");
        txtname.setText("");
        txtphone.setText("");
        txtemail.setText("");
        txtpassword.setText("");*/
    }//GEN-LAST:event_registerActionPerformed

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
            java.util.logging.Logger.getLogger(user_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton register;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
