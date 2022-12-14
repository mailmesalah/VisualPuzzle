/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualpuzzle;

import java.awt.event.MouseEvent;

/**
 *
 * @author Sely
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    private String getNext(String now) {
        switch (now) {
            case "+":
                return "a";
            case "a":
                return "b";
            case "b":
                return "c";
            case "c":
                return "d";
            case "d":
                return "_";
            case "_":
                return "+";
            default:
                return "+";
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b4 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b4MousePressed(evt);
            }
        });

        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b2MousePressed(evt);
            }
        });

        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b1MousePressed(evt);
            }
        });

        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b3MousePressed(evt);
            }
        });

        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b8MousePressed(evt);
            }
        });

        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b6MousePressed(evt);
            }
        });

        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b5MousePressed(evt);
            }
        });

        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b7MousePressed(evt);
            }
        });

        b12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b12MousePressed(evt);
            }
        });

        b10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b10MousePressed(evt);
            }
        });

        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b9MousePressed(evt);
            }
        });

        b11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b11MousePressed(evt);
            }
        });

        b16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b16MousePressed(evt);
            }
        });

        b14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b14MousePressed(evt);
            }
        });

        b13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b13MousePressed(evt);
            }
        });

        b15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b15MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MousePressed

        if (evt.getButton() == 3) {
            b1.setText(getNext(b1.getText()));
        } else {
            if(!b1.getText().equals("+"))
            if(b2.getText().equals("_")){
                b2.setText(b1.getText());
                b1.setText("_");
            }else if(b5.getText().equals("_")){
                b5.setText(b1.getText());
                b1.setText("_");                
            }
        }
    }//GEN-LAST:event_b1MousePressed

    private void b2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MousePressed
        if (evt.getButton() == 3) {
            b2.setText(getNext(b2.getText()));
        } else {
            if(!b2.getText().equals("+"))
            if(b1.getText().equals("_")){
                b1.setText(b2.getText());
                b2.setText("_");
            }else if(b3.getText().equals("_")){
                b3.setText(b2.getText());
                b2.setText("_");                
            }else if(b6.getText().equals("_")){
                b6.setText(b2.getText());
                b2.setText("_");                
            }
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b2MousePressed

    private void b3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MousePressed
        if (evt.getButton() == 3) {
            b3.setText(getNext(b3.getText()));
        } else {
            if(!b3.getText().equals("+"))
            if(b2.getText().equals("_")){
                b2.setText(b3.getText());
                b3.setText("_");
            }else if(b4.getText().equals("_")){
                b4.setText(b3.getText());
                b3.setText("_");                
            }else if(b7.getText().equals("_")){
                b7.setText(b3.getText());
                b3.setText("_");                
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b3MousePressed

    private void b4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MousePressed
        if (evt.getButton() == 3) {
            b4.setText(getNext(b4.getText()));
        } else {
            if(!b4.getText().equals("+"))
            if(b3.getText().equals("_")){
                b3.setText(b4.getText());
                b4.setText("_");
            }else if(b8.getText().equals("_")){
                b8.setText(b4.getText());
                b4.setText("_");                
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b4MousePressed

    private void b5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MousePressed
        if (evt.getButton() == 3) {
            b5.setText(getNext(b5.getText()));
        } else {
            if(!b5.getText().equals("+"))
            if(b1.getText().equals("_")){
                b1.setText(b5.getText());
                b5.setText("_");
            }else if(b6.getText().equals("_")){
                b6.setText(b5.getText());
                b5.setText("_");                
            }else if(b9.getText().equals("_")){
                b9.setText(b5.getText());
                b5.setText("_");                
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b5MousePressed

    private void b6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MousePressed
        if (evt.getButton() == 3) {
            b6.setText(getNext(b6.getText()));
        } else {
            if(!b6.getText().equals("+"))
            if(b2.getText().equals("_")){
                b2.setText(b6.getText());
                b6.setText("_");
            }else if(b7.getText().equals("_")){
                b7.setText(b6.getText());
                b6.setText("_");                
            }else if(b5.getText().equals("_")){
                b5.setText(b6.getText());
                b6.setText("_");                
            }else if(b10.getText().equals("_")){
                b10.setText(b6.getText());
                b6.setText("_");                
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b6MousePressed

    private void b7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MousePressed
        if (evt.getButton() == 3) {
            b7.setText(getNext(b7.getText()));
        } else {
            if(!b7.getText().equals("+"))
            if(b6.getText().equals("_")){
                b6.setText(b7.getText());
                b7.setText("_");
            }else if(b3.getText().equals("_")){
                b3.setText(b7.getText());
                b7.setText("_");                
            }else if(b11.getText().equals("_")){
                b11.setText(b7.getText());
                b7.setText("_");                
            }else if(b8.getText().equals("_")){
                b8.setText(b7.getText());
                b7.setText("_");                
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b7MousePressed

    private void b8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MousePressed
        if (evt.getButton() == 3) {
            b8.setText(getNext(b8.getText()));
        } else {
            if(!b8.getText().equals("+"))
            if(b7.getText().equals("_")){
                b7.setText(b8.getText());
                b8.setText("_");
            }else if(b4.getText().equals("_")){
                b4.setText(b8.getText());
                b8.setText("_");                
            }else if(b12.getText().equals("_")){
                b12.setText(b8.getText());
                b8.setText("_");                
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b8MousePressed

    private void b9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MousePressed
        if (evt.getButton() == 3) {
            b9.setText(getNext(b9.getText()));
        } else {
            if(!b9.getText().equals("+"))
            if(b5.getText().equals("_")){
                b5.setText(b9.getText());
                b9.setText("_");
            }else if(b13.getText().equals("_")){
                b13.setText(b9.getText());
                b9.setText("_");                
            }else if(b10.getText().equals("_")){
                b10.setText(b9.getText());
                b9.setText("_");                
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b9MousePressed

    private void b10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b10MousePressed
        if (evt.getButton() == 3) {
            b10.setText(getNext(b10.getText()));
        } else {
            if(!b10.getText().equals("+"))
            if(b6.getText().equals("_")){
                b6.setText(b10.getText());
                b10.setText("_");
            }else if(b9.getText().equals("_")){
                b9.setText(b10.getText());
                b10.setText("_");                
            }else if(b11.getText().equals("_")){
                b11.setText(b10.getText());
                b10.setText("_");                
            }else if(b14.getText().equals("_")){
                b14.setText(b10.getText());
                b10.setText("_");                
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b10MousePressed

    private void b11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b11MousePressed
        if (evt.getButton() == 3) {
            b11.setText(getNext(b11.getText()));
        } else {
            if(!b11.getText().equals("+"))
            if(b7.getText().equals("_")){
                b7.setText(b11.getText());
                b11.setText("_");
            }else if(b10.getText().equals("_")){
                b10.setText(b11.getText());
                b11.setText("_");                
            }else if(b12.getText().equals("_")){
                b12.setText(b11.getText());
                b11.setText("_");                
            }else if(b15.getText().equals("_")){
                b15.setText(b11.getText());
                b11.setText("_");                
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b11MousePressed

    private void b12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b12MousePressed
        if (evt.getButton() == 3) {
            b12.setText(getNext(b12.getText()));
        } else {
            if(!b12.getText().equals("+"))
            if(b8.getText().equals("_")){
                b8.setText(b12.getText());
                b12.setText("_");
            }else if(b11.getText().equals("_")){
                b11.setText(b12.getText());
                b12.setText("_");                
            }else if(b16.getText().equals("_")){
                b16.setText(b12.getText());
                b12.setText("_");                
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b12MousePressed

    private void b13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b13MousePressed
        if (evt.getButton() == 3) {
            b13.setText(getNext(b13.getText()));
        } else {
            if(!b13.getText().equals("+"))
            if(b9.getText().equals("_")){
                b9.setText(b13.getText());
                b13.setText("_");
            }else if(b14.getText().equals("_")){
                b14.setText(b13.getText());
                b13.setText("_");                
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b13MousePressed

    private void b14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b14MousePressed
        if (evt.getButton() == 3) {
            b14.setText(getNext(b14.getText()));
        } else {
            if(!b14.getText().equals("+"))
            if(b13.getText().equals("_")){
                b13.setText(b14.getText());
                b14.setText("_");
            }else if(b15.getText().equals("_")){
                b15.setText(b14.getText());
                b14.setText("_");                
            }else if(b10.getText().equals("_")){
                b10.setText(b14.getText());
                b14.setText("_");                
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b14MousePressed

    private void b15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b15MousePressed
        if (evt.getButton() == 3) {
            b15.setText(getNext(b15.getText()));
        } else {
            if(!b15.getText().equals("+"))
            if(b14.getText().equals("_")){
                b14.setText(b15.getText());
                b15.setText("_");
            }else if(b16.getText().equals("_")){
                b16.setText(b15.getText());
                b15.setText("_");                
            }else if(b11.getText().equals("_")){
                b11.setText(b15.getText());
                b15.setText("_");                
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b15MousePressed

    private void b16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b16MousePressed
        if (evt.getButton() == 3) {
            b16.setText(getNext(b16.getText()));
        } else {
            if(!b16.getText().equals("+"))
            if(b15.getText().equals("_")){
                b15.setText(b16.getText());
                b16.setText("_");
            }else if(b12.getText().equals("_")){
                b12.setText(b16.getText());
                b16.setText("_");                
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_b16MousePressed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    // End of variables declaration//GEN-END:variables
}
