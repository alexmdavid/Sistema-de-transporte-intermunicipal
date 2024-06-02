/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistra.GUI;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import sistra.TADS.Grafo;
import sistra.clases.Municipio;
import sistra.controladores.Municipio_controlador;
import sistra.logica.Controlador_general;

/**
 *
 * @author ALEX DAVID RUIDIAZ C
 */
public class Form_validar_muns_conec_mas_de_una_ruta extends javax.swing.JFrame {

    /**
     * Creates new form Form_validar_muns_conec_mas_de_una_ruta
     */
    Municipio_controlador mc;
    public Form_validar_muns_conec_mas_de_una_ruta(Municipio_controlador mc) {
        this.mc = mc;
        initComponents();
        llenar_combobox(cmb_mun_ini, mc.obtener_municipios());
        llenar_combobox(cmb_mun_fin, mc.obtener_municipios());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmb_mun_ini = new javax.swing.JComboBox<>();
        cmb_mun_fin = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmb_mun_ini, 0, 350, Short.MAX_VALUE)
                        .addComponent(cmb_mun_fin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(cmb_mun_ini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(cmb_mun_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Grafo g = mc.getMunicipios();
        Municipio mun1 = (Municipio) cmb_mun_ini.getSelectedItem();
        Municipio mun2 = (Municipio) cmb_mun_fin.getSelectedItem();
        boolean info = Controlador_general.conecta_mas_de_una_ruta(g, mun1, mun2);
        String mensaje = "";
        if(info) mensaje = "los municipios estan conectados por mas una ruta";
        else mensaje = "los municipios estan conectados directamente";
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_validar_muns_conec_mas_de_una_ruta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_validar_muns_conec_mas_de_una_ruta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_validar_muns_conec_mas_de_una_ruta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_validar_muns_conec_mas_de_una_ruta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Form_validar_muns_conec_mas_de_una_ruta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Municipio> cmb_mun_fin;
    private javax.swing.JComboBox<Municipio> cmb_mun_ini;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
    private void llenar_combobox(JComboBox<Municipio> comboBox, List<Municipio> municipios) {
        for (Municipio municipio : municipios) {
            comboBox.addItem(municipio);
        }
    }
}
