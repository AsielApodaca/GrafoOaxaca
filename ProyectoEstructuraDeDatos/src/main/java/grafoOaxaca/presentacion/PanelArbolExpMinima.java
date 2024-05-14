/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package grafoOaxaca.presentacion;

import javax.swing.ImageIcon;

/**
 *
 * @author Oliver Valle
 */
public class PanelArbolExpMinima extends javax.swing.JPanel {

    /**
     * Creates new form PanelMatrizAdyacencia
     */
    public PanelArbolExpMinima() {
        initComponents();
        this.matrizAdyacencia.setIcon(new ImageIcon("src/main/java/imgs/arbolExpMinima.jpeg"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        matrizAdyacencia = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblMunicipios = new javax.swing.JLabel();
        municipio1 = new javax.swing.JLabel();
        municipio2 = new javax.swing.JLabel();
        municipio3 = new javax.swing.JLabel();
        municipio4 = new javax.swing.JLabel();
        municipio5 = new javax.swing.JLabel();
        municipio6 = new javax.swing.JLabel();
        municipio7 = new javax.swing.JLabel();
        municipio8 = new javax.swing.JLabel();
        municipio9 = new javax.swing.JLabel();
        municipio10 = new javax.swing.JLabel();
        municipio11 = new javax.swing.JLabel();
        municipio12 = new javax.swing.JLabel();
        municipio13 = new javax.swing.JLabel();
        municipio14 = new javax.swing.JLabel();
        municipio15 = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1358, 672));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitulo.setText("Arbol de Expansión Mínima");

        lblMunicipios.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblMunicipios.setText("MUNICIPIOS:");

        municipio1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio1.setText("15. San Antonio de la Cal");

        municipio2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio2.setText("1. Oaxaca");

        municipio3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio3.setText("2. San Juan Bautista Tuxtepec");

        municipio4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio4.setText("3. Heroica Ciudad de Juchitán de Zaragoza");

        municipio5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio5.setText("4. Santa Cruz Xoxocotlán");

        municipio6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio6.setText("5. Salina Cruz");

        municipio7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio7.setText("6. Heroica Ciudad de Huajapan de León");

        municipio8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio8.setText("7. Santa Lucía del Camino");

        municipio9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio9.setText("8. Santo Domingo Tehuantepec");

        municipio10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio10.setText("9. Santiago Pinotepa Nacional");

        municipio11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio11.setText("10. Loma Bonita");

        municipio12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio12.setText("11. Puerto Escondido");

        municipio13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio13.setText("12. Miahuatlán de Porfirio Díaz");

        municipio14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio14.setText("13. Santa María Atzompa");

        municipio15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio15.setText("14. Ciudad Ixtepec");

        lblDescripcion.setText("(Ordenados por Población)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(matrizAdyacencia, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMunicipios, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio9, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio10, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio11, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio12, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio13, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio14, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio15, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(matrizAdyacencia, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblMunicipios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblDescripcion)
                .addGap(44, 44, 44)
                .addComponent(municipio2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(municipio3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(municipio4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(municipio5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(municipio6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(municipio7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(municipio8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(municipio9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(municipio10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(municipio11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(municipio12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(municipio13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(municipio14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(municipio15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(municipio1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblMunicipios;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel matrizAdyacencia;
    private javax.swing.JLabel municipio1;
    private javax.swing.JLabel municipio10;
    private javax.swing.JLabel municipio11;
    private javax.swing.JLabel municipio12;
    private javax.swing.JLabel municipio13;
    private javax.swing.JLabel municipio14;
    private javax.swing.JLabel municipio15;
    private javax.swing.JLabel municipio2;
    private javax.swing.JLabel municipio3;
    private javax.swing.JLabel municipio4;
    private javax.swing.JLabel municipio5;
    private javax.swing.JLabel municipio6;
    private javax.swing.JLabel municipio7;
    private javax.swing.JLabel municipio8;
    private javax.swing.JLabel municipio9;
    // End of variables declaration//GEN-END:variables
}
