/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado;

import java.util.Random;

/**
 *
 * @author L15_12
 */
public class frmDado extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public frmDado() {
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
        btnLancia = new javax.swing.JButton();
        btnLanciTris = new javax.swing.JButton();
        btnLanciBis = new javax.swing.JButton();
        txtB = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        txtA = new javax.swing.JTextField();
        lblRisultato = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaRisultato = new javax.swing.JTextArea();
        txtN = new javax.swing.JTextField();
        bntMultiConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLancia.setText("Lancia");
        btnLancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanciaActionPerformed(evt);
            }
        });

        btnLanciTris.setText("quanti lanci per il tris");
        btnLanciTris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanciTrisActionPerformed(evt);
            }
        });

        btnLanciBis.setText("quanti lanci per il bis");
        btnLanciBis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanciBisActionPerformed(evt);
            }
        });

        txtB.setText("b");

        txtC.setText("c");

        txtA.setText("a");

        lblRisultato.setText("risultato");

        txtaRisultato.setColumns(20);
        txtaRisultato.setRows(5);
        txtaRisultato.setText("txtaRisultato");
        jScrollPane1.setViewportView(txtaRisultato);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblRisultato, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLancia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLanciTris, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLanciBis, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRisultato)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLancia)
                        .addGap(18, 18, 18)
                        .addComponent(btnLanciTris)
                        .addGap(18, 18, 18)
                        .addComponent(btnLanciBis)
                        .addContainerGap(73, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );

        txtN.setText("n");

        bntMultiConta.setText("dopo n lanci stampare (per ogni faccia) il numero di tris");
        bntMultiConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMultiContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(bntMultiConta)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntMultiConta)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntMultiContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMultiContaActionPerformed
        int a, b, c, n, i;
        Random random = new Random();

        try {
            n = Integer.parseInt(txtN.getText());
        } catch (NumberFormatException numberFormatException) {
            n = 0;
            txtN.setText("" + n);
        }

        int[] conta = new int[7]; // lo 0 lo butto
        for (i = 0; i < 7; i++) {
            conta[i] = 0;
        }
        for (i = 0; i < n; i++) {
            a = random.nextInt(6) + 1;
            b = random.nextInt(6) + 1;
            c = random.nextInt(6) + 1;
            if (a == b && b == c) {
                conta[a]++;
            }
            txtA.setText("" + a);
            txtB.setText("" + b);
            txtC.setText("" + c);
        }
        txtaRisultato.setText("n° lanci:" + n + "\n");
        for (i = 1; i < 7; i++) {
            txtaRisultato.append("tris di " + i + " :" + conta[i] + "\n");
        }
        //for (i =

        // cercare pure la faccia di tris che è uscita più spesso
        int max = conta[1];
        for (i = 2; i < 7; i++) {
            if (conta[i] > max) {
                max = conta[i];
            }
        }
        for (i = 1; i < 7; i++) {
            if (max == conta[i]) {
                txtaRisultato.append("faccia con tris più spesso: " + i + "\n");
            }
        }

        // cercare pure la faccia di tris che è uscita meno spesso
        int min = conta[1];
        for (i = 2; i < 7; i++) {
            if (conta[i] < min) {
                min = conta[i];
            }
        }
        for (i = 1; i < 7; i++) {
            if (conta[i] == min) {
                txtaRisultato.append("faccia con tris meno spesso: " + i + "\n");
            }
        }

    }//GEN-LAST:event_bntMultiContaActionPerformed

    private void btnLanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanciaActionPerformed
        int a, b, c;
        Random random = new Random();
        a = random.nextInt(6) + 1;
        b = random.nextInt(6) + 1;
        c = random.nextInt(6) + 1;
        txtA.setText("" + a);
        txtB.setText("" + b);
        txtC.setText("" + c);
        txtaRisultato.setText("");
        if (a == b && b == c) {
            txtaRisultato.setText("TRIS!!!");
        } else if (a == b || b == c || a == c) {
            txtaRisultato.setText("BIS!!!");
        }

    }//GEN-LAST:event_btnLanciaActionPerformed

    private void btnLanciTrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanciTrisActionPerformed
        int a, b, c, n;
        Random random = new Random();
        n = 0;
        do {
            a = random.nextInt(6) + 1;
            b = random.nextInt(6) + 1;
            c = random.nextInt(6) + 1;
            txtA.setText("" + a);
            txtB.setText("" + b);
            txtC.setText("" + c);
            n++;
        } while (!(a == b && b == c));
        txtA.setText("" + a);
        txtB.setText("" + b);
        txtC.setText("" + c);
        txtaRisultato.setText("n° lanci:" + n + "\n");
    }//GEN-LAST:event_btnLanciTrisActionPerformed

    private void btnLanciBisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanciBisActionPerformed
        int a, b, c, n;
        Random random = new Random();
        n = 0;
        do {
            a = random.nextInt(6) + 1;
            b = random.nextInt(6) + 1;
            c = random.nextInt(6) + 1;
            txtA.setText("" + a);
            txtB.setText("" + b);
            txtC.setText("" + c);
            n++;
        } while (!(a == b || b == c || a == c));
        txtA.setText("" + a);
        txtB.setText("" + b);
        txtC.setText("" + c);
        txtaRisultato.setText("n° lanci:" + n + "\n");
    }//GEN-LAST:event_btnLanciBisActionPerformed

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
            java.util.logging.Logger.getLogger(frmDado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntMultiConta;
    private javax.swing.JButton btnLanciBis;
    private javax.swing.JButton btnLanciTris;
    private javax.swing.JButton btnLancia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRisultato;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextArea txtaRisultato;
    // End of variables declaration//GEN-END:variables
}
