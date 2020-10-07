
package Telas;


import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame { 


    
   void Logar(){
    Cadastro c1 = new Cadastro();
        if (textLogin.getText().equals("admin") && (passSenha.getText().equals("admin"))){
                User principal = new User();
                principal.setVisible(true);
                this.dispose();
	}
else { 
JOptionPane.showMessageDialog(null,"Login ou Senha incorretos","LOJA",JOptionPane.PLAIN_MESSAGE);				
				}
    
    }
    
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passSenha = new javax.swing.JPasswordField();
        BtnEntrar = new javax.swing.JButton();
        textLogin = new javax.swing.JTextField();
        BtnCadastro = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel1.setText("Senha:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel2.setText("Login:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 70, 30));

        passSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(passSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 190, 30));

        BtnEntrar.setText("Entrar");
        BtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 140, 40));

        textLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLoginActionPerformed(evt);
            }
        });
        jPanel1.add(textLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 190, 30));

        BtnCadastro.setText("Cadastra-se");
        BtnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastroActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 140, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Fundo.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passSenhaActionPerformed
       
    }//GEN-LAST:event_passSenhaActionPerformed

    private void textLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLoginActionPerformed
        
    }//GEN-LAST:event_textLoginActionPerformed

    private void BtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntrarActionPerformed
	Logar();


    }//GEN-LAST:event_BtnEntrarActionPerformed

    private void BtnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastroActionPerformed
      Cadastro cadas = new Cadastro();
      cadas.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_BtnCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastro;
    private javax.swing.JButton BtnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPasswordField passSenha;
    private javax.swing.JTextField textLogin;
    // End of variables declaration//GEN-END:variables
}
