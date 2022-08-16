/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.filmes;

//Importando bibliotecas java JOptionPane e ImageIcon para desenvolvimento do projeto
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//============================================================

/**
 *
 * @author Admin
 */
//Declarando classe Filmes e herdando de JFrame
public class Filmes extends javax.swing.JFrame {
//============================================================
    /**
     * Creates new form Filmes
     */
    
    //Abaixo todo o método construtor
    public Filmes() {
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

        rotulo = new javax.swing.JLabel();
        check1 = new javax.swing.JCheckBox();
        check2 = new javax.swing.JCheckBox();
        check3 = new javax.swing.JCheckBox();
        check4 = new javax.swing.JCheckBox();
        check5 = new javax.swing.JCheckBox();
        check6 = new javax.swing.JCheckBox();
        check7 = new javax.swing.JCheckBox();
        ok = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rotulo.setText("Seleção de Filmes");

        check1.setText("Ação");

        check2.setText("Comédia");

        check3.setText("Comédia Romântica");

        check4.setText("Ficção");

        check5.setText("Romance");

        check6.setText("Suspense");

        check7.setText("Terror");

        ok.setText("Ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check7)
                    .addComponent(check6)
                    .addComponent(check5)
                    .addComponent(check4)
                    .addComponent(check3)
                    .addComponent(check2)
                    .addComponent(check1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ok)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar))
                    .addComponent(rotulo))
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(rotulo)
                .addGap(18, 18, 18)
                .addComponent(check1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(check7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(cancelar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //============================================================
    //Declarando o método para o acionamento do botão OK com o metodo ActionEvent
    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        
        //Importando imagem dos filmes para exibição nas CheckBoxes
        ImageIcon acao = new ImageIcon("acao.jpg");
        ImageIcon comedia = new ImageIcon("comedia.jpg");
        ImageIcon comediaromantica = new ImageIcon("comediaromantica.jpg");
        ImageIcon ficcao = new ImageIcon("ficcao.jpg");
        ImageIcon romance = new ImageIcon("romance.jpg");
        ImageIcon suspense = new ImageIcon("suspense.jpg");
        ImageIcon terror = new ImageIcon("terror.jpg");
        //============================================================
        //Definição de ação com if else para a ação de cada marcação da lista utilizando a biblioteca JOptionPane
        //para interface gráfica e exibição de imagem com o parametro OK_OPTION
        if (check1.isSelected() ==true) {
            JOptionPane.showMessageDialog(null, "","No Limite do Amanhã", JOptionPane.OK_OPTION, acao);
        } else
            if  (check2.isSelected() ==true) {
                JOptionPane.showMessageDialog(null, "","Free Guy", JOptionPane.OK_OPTION, comedia);
            } else
                if (check3.isSelected() ==true) {
                    JOptionPane.showMessageDialog(null, "","A Barraca do Beijo", JOptionPane.OK_OPTION, comediaromantica);
                } else
                    if (check4.isSelected() ==true) {
                        JOptionPane.showMessageDialog(null, "","Tomorrowland", JOptionPane.OK_OPTION, ficcao);
                    } else
                        if (check5.isSelected() ==true) {
                            JOptionPane.showMessageDialog(null, "","Por Lugares Incríveis", JOptionPane.OK_OPTION, romance);
                        } else
                            if (check6.isSelected() ==true) {
                                JOptionPane.showMessageDialog(null, "","Um Lugar Silencioso", JOptionPane.OK_OPTION, suspense);
                            } else
                                if (check7.isSelected() ==true) {
                                    JOptionPane.showMessageDialog(null, "","Invocação do Mal 3", JOptionPane.OK_OPTION, terror);
                                }
        //======================================================================================================================
        
    }//GEN-LAST:event_okActionPerformed

    //Método para definir a ação do botão cancelar, com o método ActionEvent
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        //Definindo a ação para quando pressionado, encerrar o programa por inteiro
        System.exit(0);
        //============================================================
    }//GEN-LAST:event_cancelarActionPerformed
//============================================================
    /**
     * @param args the command line arguments
     */
    //Pacote de extensão do núcleo java
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
            java.util.logging.Logger.getLogger(Filmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Filmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Filmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Filmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Filmes().setVisible(true);
            }
        });
    }
    //============================================================

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton cancelar;
    public javax.swing.JCheckBox check1;
    public javax.swing.JCheckBox check2;
    public javax.swing.JCheckBox check3;
    public javax.swing.JCheckBox check4;
    public javax.swing.JCheckBox check5;
    public javax.swing.JCheckBox check6;
    public javax.swing.JCheckBox check7;
    public javax.swing.JButton ok;
    public javax.swing.JLabel rotulo;
    // End of variables declaration//GEN-END:variables
}
