package Programs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import short_cut.*;

public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        super("Registration");
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtPwd = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Id");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 60, 80, 30);

        txtId.setBorder(null);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId);
        txtId.setBounds(170, 60, 200, 30);

        txtPwd.setBorder(null);
        jPanel1.add(txtPwd);
        txtPwd.setBounds(170, 130, 200, 30);

        btnSubmit.setBackground(new java.awt.Color(102, 204, 255));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit);
        btnSubmit.setBounds(150, 200, 110, 50);

        result.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        result.setForeground(new java.awt.Color(255, 255, 255));
        result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(result);
        result.setBounds(30, 270, 420, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 130, 80, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Programs/Java.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 10, 460, 310);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 330);

        setSize(new java.awt.Dimension(504, 369));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void addToDatabase() {
        String s=txtId.getText();
        String password=txtPwd.getText();
        int id=Integer.parseInt(s);
                try {
            Connect C=new Connect();
            Connection con=C.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from register");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
            int id1=rs.getInt("id");
            if(id1==id){
                JOptionPane.showMessageDialog(this,"Id Already Exist");
                txtId.setText("");
                txtPwd.setText("");
                return;
            }
            }
            PreparedStatement ps2=con.prepareStatement("Insert into register values(?,?)");
            ps2.setInt(1,id);
            ps2.setString(2,password);
            int i = ps2.executeUpdate();
            if (i > 0) {
                result.setText("Success");
            } else {
                result.setText("Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        addToDatabase();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel result;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPwd;
    // End of variables declaration//GEN-END:variables
}
