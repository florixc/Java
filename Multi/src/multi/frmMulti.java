package multi;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author utente1
 */
public class frmMulti extends javax.swing.JFrame {

    /**
     * Creates new form frmMulti
     */
    public frmMulti() {
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
        txtA = new javax.swing.JTextField();
        btnFattoriale = new javax.swing.JButton();
        txtRisultato = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        btnPotenza = new javax.swing.JButton();
        btnMassimo = new javax.swing.JButton();
        btnIpotenusa = new javax.swing.JButton();
        btnSomma = new javax.swing.JButton();
        txtC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnEsisteTriangolo = new javax.swing.JButton();
        btnDadi = new javax.swing.JButton();
        btnNumeroLanci = new javax.swing.JButton();
        btnPari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnOrdinamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtA.setText("txtA");

        btnFattoriale.setText("btnFattoriale");
        btnFattoriale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFattorialeActionPerformed(evt);
            }
        });

        txtRisultato.setText("txtRisultato");

        jLabel1.setText("a");

        jLabel2.setText("risultato");

        jLabel3.setText("b");

        txtB.setText("txtB");

        btnPotenza.setText("btnPotenza");
        btnPotenza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenzaActionPerformed(evt);
            }
        });

        btnMassimo.setText("btnMassimo");
        btnMassimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMassimoActionPerformed(evt);
            }
        });

        btnIpotenusa.setText("btnIpotenusa");
        btnIpotenusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIpotenusaActionPerformed(evt);
            }
        });

        btnSomma.setText("btnSomma");
        btnSomma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSommaActionPerformed(evt);
            }
        });

        txtC.setText("txtC");

        jLabel4.setText("c");

        btnEsisteTriangolo.setText("btnEsisteTriangolo");
        btnEsisteTriangolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsisteTriangoloActionPerformed(evt);
            }
        });

        btnDadi.setText("btnDadi");
        btnDadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadiActionPerformed(evt);
            }
        });

        btnNumeroLanci.setText("btnNumeroLanci");
        btnNumeroLanci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeroLanciActionPerformed(evt);
            }
        });

        btnPari.setText("btnPari");
        btnPari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPariActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.setText("txtArea");
        jScrollPane1.setViewportView(txtArea);

        btnOrdinamento.setText("btnOrdinamento");
        btnOrdinamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdinamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRisultato, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrdinamento))))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNumeroLanci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDadi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFattoriale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIpotenusa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSomma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEsisteTriangolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMassimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPotenza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFattoriale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPotenza)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRisultato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMassimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSomma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIpotenusa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEsisteTriangolo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDadi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumeroLanci)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPari))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrdinamento)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFattorialeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFattorialeActionPerformed
        int i, a, f;

        f = 1;
        a = Integer.parseInt(txtA.getText());

        for (i = 1; i <= a; i = i + 1) {
            f = f * i;
        }

        txtRisultato.setText("" + f);
    }//GEN-LAST:event_btnFattorialeActionPerformed

    private void btnPotenzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenzaActionPerformed
        int a, b;
        double p;
        a = Integer.parseInt(txtA.getText());
        b = Integer.parseInt(txtB.getText());
        p = Math.pow(a, b);
        txtRisultato.setText("" + p);
    }//GEN-LAST:event_btnPotenzaActionPerformed

    private void btnMassimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMassimoActionPerformed
        int a, b, max;

        a = Integer.parseInt(txtA.getText());
        b = Integer.parseInt(txtB.getText());
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        txtRisultato.setText("" + max);
    }//GEN-LAST:event_btnMassimoActionPerformed

    private void btnNumeroLanciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeroLanciActionPerformed
        // lanciare in automatico ripetutamente tre dadi e stampare (per ogni lancio) i dadi usciti e il numero di tentativo finchè non arriva il tris
        int a, b, c, n;
        Random random = new Random();
        n = 0;
        do {
            n = n + 1;
            a = random.nextInt(6) + 1;
            b = random.nextInt(6) + 1;
            c = random.nextInt(6) + 1;
            txtA.setText("" + a);
            txtB.setText("" + b);
            txtC.setText("" + c);
            txtRisultato.setText("" + n);
        } while (a != b || b != c);  //(! (a==b && b==c));
    }//GEN-LAST:event_btnNumeroLanciActionPerformed

    private void btnDadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadiActionPerformed
        // generare tre dadi casuali e dire se esce il tris (e in caso il bis)
        Random random = new Random();
        int a = random.nextInt(6) + 1;
        int b = random.nextInt(6) + 1;
        int c = random.nextInt(6) + 1;
        txtA.setText("" + a);
        txtB.setText("" + b);
        txtC.setText("" + c);
        if (a == b && b == c) {
            txtRisultato.setText("TRIS!!!");
        } else if (a == b || b == c || a == c) {
            txtRisultato.setText("BIS!!!");
        } else {
            txtRisultato.setText("Hai perso");
        }


    }//GEN-LAST:event_btnDadiActionPerformed

    private void btnEsisteTriangoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsisteTriangoloActionPerformed
        // dire se esiste il triangolo e in caso se è equilatero, iscoscele o scaleno
        int a, b, c;

        a = Integer.parseInt(txtA.getText());
        b = Integer.parseInt(txtB.getText());
        c = Integer.parseInt(txtC.getText());
        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
                txtRisultato.setText("equilatero");
            } else if (a == b || b == c || a == c) {
                txtRisultato.setText("isoscele");
            } else {
                txtRisultato.setText("scaleno");
            }
        } else {
            txtRisultato.setText("non esiste");
        }
    }//GEN-LAST:event_btnEsisteTriangoloActionPerformed

    private void btnSommaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSommaActionPerformed
        int a, b, somma;

        a = Integer.parseInt(txtA.getText());
        b = Integer.parseInt(txtB.getText());
        somma = a + b;
        txtRisultato.setText("" + somma);
    }//GEN-LAST:event_btnSommaActionPerformed

    private void btnIpotenusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIpotenusaActionPerformed
        int a, b;
        double ipotenusa;
        a = Integer.parseInt(txtA.getText());
        b = Integer.parseInt(txtB.getText());
        ipotenusa = Math.sqrt(a * a + b * b);
        txtRisultato.setText("" + ipotenusa);
    }//GEN-LAST:event_btnIpotenusaActionPerformed

    private void btnPariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPariActionPerformed
        //inserire il pulsante btnPari che dice se in a,b,c ci sono solo numeri pari "TUTTI PARI!!!!"  altrimenti "non tutti pari..."

        int a, b, c;

        a = Integer.parseInt(txtA.getText());
        b = Integer.parseInt(txtB.getText());
        c = Integer.parseInt(txtC.getText());
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            txtRisultato.setText("tutti pari!!!");
        } else {
            txtRisultato.setText("non tutti pari...");
        }

     }//GEN-LAST:event_btnPariActionPerformed

    private void btnOrdinamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdinamentoActionPerformed
        int a, b, c, max;
        txtArea.setText("");
        a = Integer.parseInt(txtA.getText());
        b = Integer.parseInt(txtB.getText());
        c = Integer.parseInt(txtC.getText());
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    txtArea.append("" + a + "\n");
                    txtArea.append("" + b + "\n");
                    txtArea.append("" + c + "\n");
                } else {
                    txtArea.append("" + a + "\n");
                    txtArea.append("" + c + "\n");
                    txtArea.append("" + b + "\n");
                }
            } else {
                txtArea.append("" + c + "\n");
                txtArea.append("" + a + "\n");
                txtArea.append("" + b + "\n");
            }
        } else {
            if (b > c) {
                if (a > c) {
                    txtArea.append("" + b + "\n");
                    txtArea.append("" + a + "\n");
                    txtArea.append("" + c + "\n");
                } else {
                    txtArea.append("" + b + "\n");
                    txtArea.append("" + c + "\n");
                    txtArea.append("" + a + "\n");
                }
            } else {
                txtArea.append("" + c + "\n");
                txtArea.append("" + b + "\n");
                txtArea.append("" + a + "\n");
            }
        }
    }//GEN-LAST:event_btnOrdinamentoActionPerformed

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
            java.util.logging.Logger.getLogger(frmMulti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMulti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMulti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMulti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMulti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDadi;
    private javax.swing.JButton btnEsisteTriangolo;
    private javax.swing.JButton btnFattoriale;
    private javax.swing.JButton btnIpotenusa;
    private javax.swing.JButton btnMassimo;
    private javax.swing.JButton btnNumeroLanci;
    private javax.swing.JButton btnOrdinamento;
    private javax.swing.JButton btnPari;
    private javax.swing.JButton btnPotenza;
    private javax.swing.JButton btnSomma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtRisultato;
    // End of variables declaration//GEN-END:variables
}
