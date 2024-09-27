/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pedrapapeltesoura;

import javax.swing.ImageIcon;

public class Tela extends javax.swing.JFrame {

    int ponto = 0;
    int pontoPC = 0;
    
    public Tela() {
        initComponents();
        btnNovo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPedra = new javax.swing.JLabel();
        lblPapel = new javax.swing.JLabel();
        lblTesoura = new javax.swing.JLabel();
        lblPlacar = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        lblPedraPC = new javax.swing.JLabel();
        lblPapelPC = new javax.swing.JLabel();
        lblTesouraPC = new javax.swing.JLabel();
        lblPlacarPC = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pedra.png"))); // NOI18N
        lblPedra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPedraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPedraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPedraMouseExited(evt);
            }
        });

        lblPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/papel.png"))); // NOI18N
        lblPapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPapelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPapelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPapelMouseExited(evt);
            }
        });

        lblTesoura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tesoura.png"))); // NOI18N
        lblTesoura.setToolTipText("");
        lblTesoura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTesouraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTesouraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTesouraMouseExited(evt);
            }
        });

        lblPlacar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPlacar.setText("000");

        lblContra.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblContra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContra.setText("X");

        lblPedraPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pedra.png"))); // NOI18N
        lblPedraPC.setEnabled(false);

        lblPapelPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/papel.png"))); // NOI18N
        lblPapelPC.setEnabled(false);

        lblTesouraPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tesoura.png"))); // NOI18N
        lblTesouraPC.setEnabled(false);

        lblPlacarPC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPlacarPC.setText("000");

        btnNovo.setText("Novo jogo");
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPedra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPapel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTesoura))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPedraPC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNovo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPapelPC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTesouraPC))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(lblPlacar)))
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(lblPlacarPC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(lblContra, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblPlacarPC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPapelPC)
                    .addComponent(lblTesouraPC)
                    .addComponent(lblPedraPC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(lblContra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovo)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPapel)
                    .addComponent(lblTesoura)
                    .addComponent(lblPedra))
                .addGap(18, 18, 18)
                .addComponent(lblPlacar)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblTesouraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTesouraMouseEntered
        if(!btnNovo.isVisible()){
            lblTesoura.setIcon(new ImageIcon(getClass().getResource("/img/tesoura_azul.png")));
        }
    }//GEN-LAST:event_lblTesouraMouseEntered

    private void lblTesouraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTesouraMouseExited
        if(!btnNovo.isVisible()){
            lblTesoura.setIcon(new ImageIcon(getClass().getResource("/img/tesoura.png")));
        }
    }//GEN-LAST:event_lblTesouraMouseExited

    private void lblPapelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPapelMouseEntered
        if(!btnNovo.isVisible()){
            lblPapel.setIcon(new ImageIcon(getClass().getResource("/img/papel_azul.png")));
        }
    }//GEN-LAST:event_lblPapelMouseEntered

    private void lblPapelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPapelMouseExited
        if(!btnNovo.isVisible()){
            lblPapel.setIcon(new ImageIcon(getClass().getResource("/img/papel.png")));
        }
    }//GEN-LAST:event_lblPapelMouseExited

    private void lblPedraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPedraMouseEntered
        if(!btnNovo.isVisible()){
            lblPedra.setIcon(new ImageIcon(getClass().getResource("/img/pedra_azul.png")));
        }
    }//GEN-LAST:event_lblPedraMouseEntered

    private void lblPedraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPedraMouseExited
        if(!btnNovo.isVisible()){
            lblPedra.setIcon(new ImageIcon(getClass().getResource("/img/pedra.png")));
        }
    }//GEN-LAST:event_lblPedraMouseExited

    private void lblTesouraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTesouraMouseClicked
        if(!btnNovo.isVisible()){
            Jogar(2);
        }
    }//GEN-LAST:event_lblTesouraMouseClicked

    private void lblPapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPapelMouseClicked
        if(!btnNovo.isVisible()){
            Jogar(1);
        }
    }//GEN-LAST:event_lblPapelMouseClicked

    private void lblPedraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPedraMouseClicked
        if(!btnNovo.isVisible()){
            Jogar(0);
        }
    }//GEN-LAST:event_lblPedraMouseClicked

    private void btnNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseClicked
        lblPedra.setIcon(new ImageIcon(getClass().getResource("/img/pedra.png")));
        lblPapel.setIcon(new ImageIcon(getClass().getResource("/img/papel.png")));
        lblTesoura.setIcon(new ImageIcon(getClass().getResource("/img/tesoura.png")));
        lblPapelPC.setEnabled(false);
        lblPedraPC.setEnabled(false);
        lblTesouraPC.setEnabled(false);
        btnNovo.setVisible(false);
        lblContra.setText("X");
    }//GEN-LAST:event_btnNovoMouseClicked

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }
    
    public void Jogar(int a){
        int b = (int) (Math.random() * 3);
        
        if((a == 0 && b == 2) || (a == 1 && b == 0) || (a == 2 && b == 1)){
            if(a == 0)
            lblPedra.setIcon(new ImageIcon(getClass().getResource("/img/pedra_win.gif")));
            
            else if(a == 1)
            lblPapel.setIcon(new ImageIcon(getClass().getResource("/img/papel_win.gif")));
            
            else
            lblTesoura.setIcon(new ImageIcon(getClass().getResource("/img/tesoura_win.gif")));
            
            btnNovo.setVisible(true);
            lblContra.setText("Ganhou!");
            ponto++;
            
            if(ponto > 9){
                lblPlacar.setText("0"+ponto);
            }
            else if(ponto > 99){
                lblPlacar.setText(""+ponto);
            }
            else{
                lblPlacar.setText("00"+ponto);
            }
        }
        else if(a == b){
            if(b == 0){
                lblPedraPC.setEnabled(true);
            }  
            else if(b == 1){
                lblPapelPC.setEnabled(true);
            }            
            else{
                lblTesouraPC.setEnabled(true);
            }
            lblContra.setText("Empatou!");
            btnNovo.setVisible(true);
        }
        else{
            if(b == 0)
            lblPedraPC.setEnabled(true);
            
            else if(b == 1)
            lblPapelPC.setEnabled(true);
            
            else
            lblTesouraPC.setEnabled(true);
            
            btnNovo.setVisible(true);
            lblContra.setText("Perdeu!");
            pontoPC++;
        }
        if(pontoPC > 9){
            lblPlacarPC.setText("0"+pontoPC);
        }
        else if(pontoPC > 99){
            lblPlacarPC.setText(""+pontoPC);
        }
        else{
            lblPlacarPC.setText("00"+pontoPC);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblPapel;
    private javax.swing.JLabel lblPapelPC;
    private javax.swing.JLabel lblPedra;
    private javax.swing.JLabel lblPedraPC;
    private javax.swing.JLabel lblPlacar;
    private javax.swing.JLabel lblPlacarPC;
    private javax.swing.JLabel lblTesoura;
    private javax.swing.JLabel lblTesouraPC;
    // End of variables declaration//GEN-END:variables
}