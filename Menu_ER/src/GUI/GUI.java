/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import expresiones_Regulares.exp_R;

/**
 *
 * @author ar90w
 */
public class GUI extends javax.swing.JFrame {

    public String seleccionado;
    public String textoAvalidar;
    exp_R ER = new exp_R();

    /**
     * Creates new form GUIER
     */
    public GUI() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboMenu = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTexto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButtonValidar = new javax.swing.JButton();
        jLabeLVALIDACION = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("MENÚ EXPRESIONES REGULARES");

        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("2. El conjunto de todas las cadenas que coinciden con palabras que contengan  solo números enteros positivos de hasta tres dígitos");

        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("1. El conjunto de todas las cadenas que coinciden con palabras que contienen  exactamente tres letras");

        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("3. El conjunto de todas las cadenas que coinciden con palabras que contengan  solo direcciones de correo electrónico validas.");

        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("4. El conjunto de todas las cadenas que coinciden con palabras que contengan  solo números de teléfono en formato nacional (México) (por ejemplo,  +5231124623676):");

        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText("5. El conjunto de todas las cadenas que coinciden con palabras que contengan  solo cadenas con 3 letras minúsculas.");

        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("6. El conjunto de todas las cadenas que coinciden con palabras que comienzan  con una vocal y terminan con una consonante.");

        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setText("7. El conjunto de todas las cadenas que coinciden con números decimales  (positivos o negativos) con hasta dos decimales.");

        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setText("8. El conjunto de todas las cadenas que coinciden con URLs que comiencen  con \"http://\" o https://");

        jLabel10.setForeground(new java.awt.Color(255, 255, 51));
        jLabel10.setText("9. El conjunto de todas las cadenas que coinciden con fechas en formato  \"dd/mm/aaaa\".");

        jLabel11.setForeground(new java.awt.Color(255, 255, 51));
        jLabel11.setText("10.El conjunto de todas las cadenas que coinciden con palabras que contienen  solo letras y números, sin espacios ni caracteres especiales");

        jLabel12.setForeground(new java.awt.Color(255, 255, 51));
        jLabel12.setText("11.El conjunto de todas las cadenas que coinciden con palabras que comienzan  con una letra mayúscula seguida de letras minúsculas.");

        jLabel13.setForeground(new java.awt.Color(255, 255, 51));
        jLabel13.setText("12.El conjunto de todas las cadenas que coinciden con cadenas que contienen  exactamente cinco caracteres alfanuméricos. ");

        jLabel14.setForeground(new java.awt.Color(255, 255, 51));
        jLabel14.setText("13.El conjunto de todas las cadenas que coinciden con palabras que contienen  exactamente cuatro letras y terminan con \"ing\"");

        jLabel15.setForeground(new java.awt.Color(255, 255, 51));
        jLabel15.setText("14.El conjunto de todas las cadenas que coinciden con direcciones MAC en  formato \"XX:XX:XX:XX:XX:XX\"");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 51));
        jLabel16.setText("Elige una opción");

        jComboMenu.setBackground(new java.awt.Color(255, 0, 255));
        jComboMenu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboMenu.setForeground(new java.awt.Color(255, 255, 51));
        jComboMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));
        jComboMenu.setToolTipText("Seleccione una Opcion de las de Arriba pls ☺");
        jComboMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMenuActionPerformed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Diseño sin título.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Diseño sin título (1).png"))); // NOI18N

        jTexto.setBackground(new java.awt.Color(255, 0, 255));
        jTexto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTexto.setForeground(new java.awt.Color(255, 255, 51));
        jTexto.setToolTipText("Introduzca su cadena aqui");

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 51));
        jLabel19.setText("Introduzca su cadena");

        jButtonValidar.setBackground(new java.awt.Color(255, 0, 255));
        jButtonValidar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButtonValidar.setForeground(new java.awt.Color(255, 255, 51));
        jButtonValidar.setText("VALIDAR");
        jButtonValidar.setToolTipText("Valide su cadena");
        jButtonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarActionPerformed(evt);
            }
        });

        jLabeLVALIDACION.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabeLVALIDACION.setForeground(new java.awt.Color(255, 255, 51));
        jLabeLVALIDACION.setText("ES VALIDO????");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboMenu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTexto))
                .addGap(73, 73, 73)
                .addComponent(jButtonValidar)
                .addGap(18, 18, 18)
                .addComponent(jLabeLVALIDACION, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(254, 254, 254))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonValidar)
                    .addComponent(jLabeLVALIDACION))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboMenuActionPerformed
        seleccionado = jComboMenu.getSelectedItem().toString();

    }//GEN-LAST:event_jComboMenuActionPerformed

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        textoAvalidar = jTexto.getText();
        switch (Integer.parseInt(seleccionado)) {
            case 1:
                jLabeLVALIDACION.setText(ER.expresion_Regular1(textoAvalidar));
                break;
            case 2:
                jLabeLVALIDACION.setText(ER.expresion_Regular2(textoAvalidar));
                break;
            case 3:
                jLabeLVALIDACION.setText(ER.expresion_Regular3(textoAvalidar));
                break;
            case 4:
                jLabeLVALIDACION.setText(ER.expresion_Regular4(textoAvalidar));
                break;
            case 5:
                jLabeLVALIDACION.setText(ER.expresion_Regular5(textoAvalidar));
                break;
            case 6:
                jLabeLVALIDACION.setText(ER.expresion_Regular6(textoAvalidar));
                break;
            case 7:
                jLabeLVALIDACION.setText(ER.expresion_Regular7(textoAvalidar));
                break;
            case 8:
                jLabeLVALIDACION.setText(ER.expresion_Regular8(textoAvalidar));
                break;
            case 9:
                jLabeLVALIDACION.setText(ER.expresion_Regular9(textoAvalidar));
                break;
            case 10:
                jLabeLVALIDACION.setText(ER.expresion_Regular10(textoAvalidar));
                break;
            case 11:
                jLabeLVALIDACION.setText(ER.expresion_Regular11(textoAvalidar));
                break;
            case 12:
                jLabeLVALIDACION.setText(ER.expresion_Regular12(textoAvalidar));
                break;
            case 13:
                jLabeLVALIDACION.setText(ER.expresion_Regular13(textoAvalidar));
                break;
            case 14:
                jLabeLVALIDACION.setText(ER.expresion_Regular14(textoAvalidar));
                break;
            default:
                jLabeLVALIDACION.setText("Tipo de validación no soportado");
        }

    }//GEN-LAST:event_jButtonValidarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JComboBox<String> jComboMenu;
    private javax.swing.JLabel jLabeLVALIDACION;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTexto;
    // End of variables declaration//GEN-END:variables
}
