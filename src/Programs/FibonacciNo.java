/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Programs;

/**
 *
 * @author ToyBoX
 */
public class FibonacciNo extends javax.swing.JFrame {
    /**
     * Creates new form FibonacciSeries
     */
    public FibonacciNo() {
        super("Fibonacci");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Input = new javax.swing.JTextField();
        Calcu = new javax.swing.JButton();
        Result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("FibonacciSeries");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 20, 260, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("----------------------------------------------------");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 60, 260, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Enter No.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 100, 70, 30);
        jPanel1.add(Input);
        Input.setBounds(120, 100, 190, 30);

        Calcu.setBackground(new java.awt.Color(102, 255, 255));
        Calcu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Calcu.setText("Check");
        Calcu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcuActionPerformed(evt);
            }
        });
        jPanel1.add(Calcu);
        Calcu.setBounds(110, 150, 130, 30);

        Result.setBackground(new java.awt.Color(153, 255, 255));
        Result.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(Result);
        Result.setBounds(20, 200, 330, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 360, 260);

        setSize(new java.awt.Dimension(414, 347));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CalcuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcuActionPerformed
       String s=Input.getText();
       int i=Integer.parseInt(s);
       int a=0,b=1,c=0;
       while(a+b<=i){
           c=a+b;
           if(c==i)Result.setText(i+" is a Fibonacci Number");
       a=b;
       b=c;
       }
       if(c!=i) Result.setText(i+" is not a Fibonacci Number");
    }//GEN-LAST:event_CalcuActionPerformed

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
            java.util.logging.Logger.getLogger(FibonacciNo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FibonacciNo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FibonacciNo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FibonacciNo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FibonacciNo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcu;
    private javax.swing.JTextField Input;
    private javax.swing.JLabel Result;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
