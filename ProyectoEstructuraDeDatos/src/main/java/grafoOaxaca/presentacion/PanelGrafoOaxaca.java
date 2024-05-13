/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package grafoOaxaca.presentacion;

import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import negocios.dominioGrafo.Arista;
import negocios.dominioGrafo.Grafo;
import negocios.dominioGrafo.Vertice;

/**
 *
 * @author Oliver Valle
 */
public class PanelGrafoOaxaca extends javax.swing.JPanel {
    
    private int inicio = 0 ;
    private int fin = 0 ;
    private Grafo grafo ;
    List<Vertice> camino = new LinkedList() ;
    /**
     * Creates new form PanelGrafoOaxaca
     */
    public PanelGrafoOaxaca(Grafo grafo) {
        initComponents();
        this.grafo = grafo ;
        background.setIcon(new ImageIcon("src/main/java/imgs/background.jpeg"));
        setDefaultIcons();
    }

    public void setDefaultIcons() {
        node_1.setIcon(new ImageIcon("src/main/java/imgs/node_1.jpeg"));
        node_2.setIcon(new ImageIcon("src/main/java/imgs/node_2.jpeg"));
        node_3.setIcon(new ImageIcon("src/main/java/imgs/node_3.jpeg"));
        node_4.setIcon(new ImageIcon("src/main/java/imgs/node_4.jpeg"));
        node_5.setIcon(new ImageIcon("src/main/java/imgs/node_5.jpeg"));
        node_6.setIcon(new ImageIcon("src/main/java/imgs/node_6.jpeg"));
        node_7.setIcon(new ImageIcon("src/main/java/imgs/node_7.jpeg"));
        node_8.setIcon(new ImageIcon("src/main/java/imgs/node_8.jpeg"));
        node_9.setIcon(new ImageIcon("src/main/java/imgs/node_9.jpeg"));
        node_10.setIcon(new ImageIcon("src/main/java/imgs/node_10.jpeg"));
        node_11.setIcon(new ImageIcon("src/main/java/imgs/node_11.jpeg"));
        node_12.setIcon(new ImageIcon("src/main/java/imgs/node_12.jpeg"));
        node_13.setIcon(new ImageIcon("src/main/java/imgs/node_13.jpeg"));
        node_14.setIcon(new ImageIcon("src/main/java/imgs/node_14.jpeg"));
        node_15.setIcon(new ImageIcon("src/main/java/imgs/node_15.jpeg"));
    }
    
    public void setCamino() {
        String stringInicio = String.valueOf(inicio) ;
        String stringFin = String.valueOf(fin) ;
        Vertice origen = grafo.encontrarVertice(stringInicio);
        Vertice destino = grafo.encontrarVertice(stringFin);
        camino = grafo.dijkstra(origen, destino) ;
        List<Arista> caminoAristas = grafo.caminoAristas(camino) ;
        lblDistancia.setText(lblDistancia.getText() + " " + grafo.distancia(caminoAristas) + "km");
        camino.remove(0) ;
        camino.remove(camino.size() - 1) ;
        
        if (camino.contains(grafo.encontrarVertice("1"))) {
            node_1.setIcon(new ImageIcon("src/main/java/imgs/node_mid_1.jpeg"));
        } 
        if(camino.contains(grafo.encontrarVertice("2"))) {
            node_2.setIcon(new ImageIcon("src/main/java/imgs/node_mid_2.jpeg"));
        }
        if(camino.contains(grafo.encontrarVertice("3"))) {
            node_3.setIcon(new ImageIcon("src/main/java/imgs/node_mid_3.jpeg"));
        }
        if(camino.contains(grafo.encontrarVertice("4"))) {
            node_4.setIcon(new ImageIcon("src/main/java/imgs/node_mid_4.jpeg"));
        }
        if(camino.contains(grafo.encontrarVertice("5"))) {
            node_5.setIcon(new ImageIcon("src/main/java/imgs/node_mid_5.jpeg"));
        }
        if(camino.contains(grafo.encontrarVertice("6"))) {
            node_6.setIcon(new ImageIcon("src/main/java/imgs/node_mid_6.jpeg"));
        } 
        if(camino.contains(grafo.encontrarVertice("7"))) {
            node_7.setIcon(new ImageIcon("src/main/java/imgs/node_mid_7.jpeg"));
        }
        if(camino.contains(grafo.encontrarVertice("8"))) {
            node_8.setIcon(new ImageIcon("src/main/java/imgs/node_mid_8.jpeg"));
        } 
        if(camino.contains(grafo.encontrarVertice("9"))) {
            node_9.setIcon(new ImageIcon("src/main/java/imgs/node_mid_9.jpeg"));
        }
        if(camino.contains(grafo.encontrarVertice("10"))) {
            node_10.setIcon(new ImageIcon("src/main/java/imgs/node_mid_10.jpeg"));
        } 
        if(camino.contains(grafo.encontrarVertice("11"))) {
            node_11.setIcon(new ImageIcon("src/main/java/imgs/node_mid_11.jpeg"));
        }
        if(camino.contains(grafo.encontrarVertice("12"))) {
            node_12.setIcon(new ImageIcon("src/main/java/imgs/node_mid_12.jpeg"));
        }
        if(camino.contains(grafo.encontrarVertice("13"))) {
            node_13.setIcon(new ImageIcon("src/main/java/imgs/node_mid_13.jpeg"));
        }
        if(camino.contains(grafo.encontrarVertice("14"))) {
            node_14.setIcon(new ImageIcon("src/main/java/imgs/node_mid_14.jpeg"));
        }
        if(camino.contains(grafo.encontrarVertice("15"))) {
            node_15.setIcon(new ImageIcon("src/main/java/imgs/node_mid_15.jpeg"));
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

        lblDistancia = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        node_1 = new javax.swing.JLabel();
        node_2 = new javax.swing.JLabel();
        node_3 = new javax.swing.JLabel();
        node_4 = new javax.swing.JLabel();
        node_5 = new javax.swing.JLabel();
        node_6 = new javax.swing.JLabel();
        node_7 = new javax.swing.JLabel();
        node_8 = new javax.swing.JLabel();
        node_9 = new javax.swing.JLabel();
        node_10 = new javax.swing.JLabel();
        node_11 = new javax.swing.JLabel();
        node_12 = new javax.swing.JLabel();
        node_13 = new javax.swing.JLabel();
        node_14 = new javax.swing.JLabel();
        node_15 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
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
        setPreferredSize(new java.awt.Dimension(1358, 672));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDistancia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDistancia.setText("DISTANCIA:");
        add(lblDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 150, 30));

        btnReiniciar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReiniciar.setText("Reiniciar Ruta");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 130, 50));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitulo.setText("RUTA MÁS CORTA");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 300, 60));

        node_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                node_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                node_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                node_1MouseExited(evt);
            }
        });
        add(node_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 50, 50));

        node_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                node_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                node_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                node_2MouseExited(evt);
            }
        });
        add(node_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 50, 50));

        node_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                node_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                node_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                node_3MouseExited(evt);
            }
        });
        add(node_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 50, 50));

        node_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                node_4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                node_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                node_4MouseExited(evt);
            }
        });
        add(node_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 50, 50));

        node_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                node_5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                node_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                node_5MouseExited(evt);
            }
        });
        add(node_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 50, 50));

        node_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                node_6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                node_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                node_6MouseExited(evt);
            }
        });
        add(node_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 50, 50));

        node_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                node_7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                node_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                node_7MouseExited(evt);
            }
        });
        add(node_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 50, 50));

        node_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                node_8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                node_8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                node_8MouseExited(evt);
            }
        });
        add(node_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 50, 50));

        node_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                node_9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                node_9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                node_9MouseExited(evt);
            }
        });
        add(node_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 50, 50));

        node_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                node_10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                node_10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                node_10MouseExited(evt);
            }
        });
        add(node_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 50, 50));

        node_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                node_11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                node_11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                node_11MouseExited(evt);
            }
        });
        add(node_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 50, 50));

        node_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                node_12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                node_12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                node_12MouseExited(evt);
            }
        });
        add(node_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 50, 50));

        node_13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                node_13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                node_13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                node_13MouseExited(evt);
            }
        });
        add(node_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 50, 50));

        node_14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                node_14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                node_14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                node_14MouseExited(evt);
            }
        });
        add(node_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 50, 50));

        node_15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                node_15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                node_15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                node_15MouseExited(evt);
            }
        });
        add(node_15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 50, 50));
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1008, 672));

        lblMunicipios.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblMunicipios.setText("MUNICIPIOS:");
        add(lblMunicipios, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 50, 220, 50));

        municipio1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio1.setText("15. San Antonio de la Cal");
        add(municipio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 580, 220, 20));

        municipio2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio2.setText("1. Oaxaca");
        add(municipio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 160, 220, 20));

        municipio3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio3.setText("2. San Juan Bautista Tuxtepec");
        add(municipio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 190, 220, 20));

        municipio4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio4.setText("3. Heroica Ciudad de Juchitán de Zaragoza");
        add(municipio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 220, 320, 20));

        municipio5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio5.setText("4. Santa Cruz Xoxocotlán");
        add(municipio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 250, 220, 20));

        municipio6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio6.setText("5. Salina Cruz");
        add(municipio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 280, 220, 20));

        municipio7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio7.setText("6. Heroica Ciudad de Huajapan de León");
        add(municipio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 310, 300, 20));

        municipio8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio8.setText("7. Santa Lucía del Camino");
        add(municipio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 340, 220, 20));

        municipio9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio9.setText("8. Santo Domingo Tehuantepec");
        add(municipio9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 370, 230, 20));

        municipio10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio10.setText("9. Santiago Pinotepa Nacional");
        add(municipio10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 400, 220, 20));

        municipio11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio11.setText("10. Loma Bonita");
        add(municipio11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 430, 220, 20));

        municipio12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio12.setText("11. Puerto Escondido");
        add(municipio12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 460, 220, 20));

        municipio13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio13.setText("12. Miahuatlán de Porfirio Díaz");
        add(municipio13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 490, 220, 20));

        municipio14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio14.setText("13. Santa María Atzompa");
        add(municipio14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 520, 220, 20));

        municipio15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        municipio15.setText("14. Ciudad Ixtepec");
        add(municipio15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 550, 220, 20));

        lblDescripcion.setText("(Ordenados por Población)");
        add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void node_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_1MouseClicked
        if (inicio == 0) {
            inicio = 1 ;
            node_1.setIcon(new ImageIcon("src/main/java/imgs/node_start_1.jpeg"));
        } else if(fin == 0) {
            if(inicio != 1) {
                fin = 1 ;
                node_1.setIcon(new ImageIcon("src/main/java/imgs/node_end_1.jpeg"));
                setCamino() ;
            } else {
                JOptionPane.showConfirmDialog(this, "Selecciona otro grafo de destino", "Grafo repetido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE) ;
            }
        }
    }//GEN-LAST:event_node_1MouseClicked

    private void node_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_1MouseEntered
        if((inicio != 1 && fin == 0) || (inicio == 0&& fin != 1) || ((inicio != 1 && fin != 1) && !camino.contains((grafo.encontrarVertice("1"))))) {
            node_1.setIcon(new ImageIcon("src/main/java/imgs/node_select_1.jpeg"));
        }
    }//GEN-LAST:event_node_1MouseEntered

    private void node_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_1MouseExited
        if((inicio != 1 && fin == 0) || (inicio == 0&& fin != 1) || ((inicio != 1 && fin != 1) && !camino.contains((grafo.encontrarVertice("1"))))) {
            node_1.setIcon(new ImageIcon("src/main/java/imgs/node_1.jpeg"));
        }
    }//GEN-LAST:event_node_1MouseExited

    private void node_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_2MouseClicked
        if (inicio == 0) {
            inicio = 2 ;
            node_2.setIcon(new ImageIcon("src/main/java/imgs/node_start_2.jpeg"));
        } else if(fin == 0) {
            if(inicio != 2) {
                fin = 2 ;
                node_2.setIcon(new ImageIcon("src/main/java/imgs/node_end_2.jpeg"));
                setCamino() ;
            } else {
                JOptionPane.showConfirmDialog(this, "Selecciona otro grafo de destino", "Grafo repetido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE) ;
            }
        }
    }//GEN-LAST:event_node_2MouseClicked

    private void node_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_2MouseEntered
        if((inicio != 2 && fin == 0) || (inicio == 0&& fin != 2) || ((inicio != 2 && fin != 2) && !camino.contains((grafo.encontrarVertice("2"))))) {
            node_2.setIcon(new ImageIcon("src/main/java/imgs/node_select_2.jpeg"));
        }
    }//GEN-LAST:event_node_2MouseEntered

    private void node_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_2MouseExited
        if((inicio != 2 && fin == 0) || (inicio == 0&& fin != 2) || ((inicio != 2 && fin != 2) && !camino.contains((grafo.encontrarVertice("2"))))) {
            node_2.setIcon(new ImageIcon("src/main/java/imgs/node_2.jpeg"));
        }
    }//GEN-LAST:event_node_2MouseExited

    private void node_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_3MouseClicked
        if (inicio == 0) {
            inicio = 3 ;
            node_3.setIcon(new ImageIcon("src/main/java/imgs/node_start_3.jpeg"));
        } else if(fin == 0) {
            if(inicio != 3) {
                fin = 3 ;
                node_3.setIcon(new ImageIcon("src/main/java/imgs/node_end_3.jpeg"));
                setCamino() ;
            } else {
                JOptionPane.showConfirmDialog(this, "Selecciona otro grafo de destino", "Grafo repetido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE) ;
            }
        }
    }//GEN-LAST:event_node_3MouseClicked

    private void node_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_3MouseEntered
        if((inicio != 3 && fin == 0) || (inicio == 0&& fin != 3) || ((inicio != 3 && fin != 3) && !camino.contains((grafo.encontrarVertice("3"))))) {
            node_3.setIcon(new ImageIcon("src/main/java/imgs/node_select_3.jpeg"));
        }
    }//GEN-LAST:event_node_3MouseEntered

    private void node_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_3MouseExited
        if((inicio != 3 && fin == 0) || (inicio == 0&& fin != 3) || ((inicio != 3 && fin != 3) && !camino.contains((grafo.encontrarVertice("3"))))) {
            node_3.setIcon(new ImageIcon("src/main/java/imgs/node_3.jpeg"));
        }
    }//GEN-LAST:event_node_3MouseExited

    private void node_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_4MouseClicked
        if (inicio == 0) {
            inicio = 4 ;
            node_4.setIcon(new ImageIcon("src/main/java/imgs/node_start_4.jpeg"));
        } else if(fin == 0) {
            if(inicio != 4) {
                fin = 4 ;
                node_4.setIcon(new ImageIcon("src/main/java/imgs/node_end_4.jpeg"));
                setCamino() ;
            } else {
                JOptionPane.showConfirmDialog(this, "Selecciona otro grafo de destino", "Grafo repetido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE) ;
            }
        }
    }//GEN-LAST:event_node_4MouseClicked

    private void node_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_4MouseEntered
        if((inicio != 4 && fin == 0) || (inicio == 0&& fin != 4) || ((inicio != 4 && fin != 4) && !camino.contains((grafo.encontrarVertice("4"))))) {
            node_4.setIcon(new ImageIcon("src/main/java/imgs/node_select_4.jpeg"));
        }
    }//GEN-LAST:event_node_4MouseEntered

    private void node_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_4MouseExited
        if((inicio != 4 && fin == 0) || (inicio == 0&& fin != 4) || ((inicio != 4 && fin != 4) && !camino.contains((grafo.encontrarVertice("4"))))) {
            node_4.setIcon(new ImageIcon("src/main/java/imgs/node_4.jpeg"));
        }
    }//GEN-LAST:event_node_4MouseExited

    private void node_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_5MouseClicked
        if (inicio == 0) {
            inicio = 5 ;
            node_5.setIcon(new ImageIcon("src/main/java/imgs/node_start_5.jpeg"));
        } else if(fin == 0) {
            if(inicio != 5) {
                fin = 5 ;
                node_5.setIcon(new ImageIcon("src/main/java/imgs/node_end_5.jpeg"));
                setCamino() ;
            } else {
                JOptionPane.showConfirmDialog(this, "Selecciona otro grafo de destino", "Grafo repetido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE) ;
            }
        }
    }//GEN-LAST:event_node_5MouseClicked

    private void node_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_5MouseEntered
        if((inicio != 5 && fin == 0) || (inicio == 0&& fin != 5) || ((inicio != 5 && fin != 5) && !camino.contains((grafo.encontrarVertice("5"))))) {
            node_5.setIcon(new ImageIcon("src/main/java/imgs/node_select_5.jpeg"));
        }
    }//GEN-LAST:event_node_5MouseEntered

    private void node_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_5MouseExited
        if((inicio != 5 && fin == 0) || (inicio == 0&& fin != 5) || ((inicio != 5 && fin != 5) && !camino.contains((grafo.encontrarVertice("5"))))) {
            node_5.setIcon(new ImageIcon("src/main/java/imgs/node_5.jpeg"));
        }
    }//GEN-LAST:event_node_5MouseExited

    private void node_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_6MouseClicked
        if (inicio == 0) {
            inicio = 6 ;
            node_6.setIcon(new ImageIcon("src/main/java/imgs/node_start_6.jpeg"));
        } else if(fin == 0) {
            if(inicio != 6) {
                fin = 6 ;
                node_6.setIcon(new ImageIcon("src/main/java/imgs/node_end_6.jpeg"));
                setCamino() ;
            } else {
                JOptionPane.showConfirmDialog(this, "Selecciona otro grafo de destino", "Grafo repetido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE) ;
            }
        }
    }//GEN-LAST:event_node_6MouseClicked

    private void node_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_6MouseEntered
        if((inicio != 6 && fin == 0) || (inicio == 0&& fin != 6) || ((inicio != 6 && fin != 6) && !camino.contains((grafo.encontrarVertice("6"))))) {
            node_6.setIcon(new ImageIcon("src/main/java/imgs/node_select_6.jpeg"));
        }
    }//GEN-LAST:event_node_6MouseEntered

    private void node_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_6MouseExited
        if((inicio != 6 && fin == 0) || (inicio == 0&& fin != 6) || ((inicio != 6 && fin != 6) && !camino.contains((grafo.encontrarVertice("6"))))) {
            node_6.setIcon(new ImageIcon("src/main/java/imgs/node_6.jpeg"));
        }
    }//GEN-LAST:event_node_6MouseExited

    private void node_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_7MouseClicked
        if (inicio == 0) {
            inicio = 7 ;
            node_7.setIcon(new ImageIcon("src/main/java/imgs/node_start_7.jpeg"));
        } else if(fin == 0) {
            if(inicio != 7) {
                fin = 7 ;
                node_7.setIcon(new ImageIcon("src/main/java/imgs/node_end_7.jpeg"));
                setCamino() ;
            } else {
                JOptionPane.showConfirmDialog(this, "Selecciona otro grafo de destino", "Grafo repetido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE) ;
            }
        }
    }//GEN-LAST:event_node_7MouseClicked

    private void node_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_7MouseEntered
        if((inicio != 7 && fin == 0) || (inicio == 0&& fin != 7) || ((inicio != 7 && fin != 7) && !camino.contains((grafo.encontrarVertice("7"))))) {
            node_7.setIcon(new ImageIcon("src/main/java/imgs/node_select_7.jpeg"));
        }
    }//GEN-LAST:event_node_7MouseEntered

    private void node_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_7MouseExited
        if((inicio != 7 && fin == 0) || (inicio == 0&& fin != 7) || ((inicio != 7 && fin != 7) && !camino.contains((grafo.encontrarVertice("7"))))) {
            node_7.setIcon(new ImageIcon("src/main/java/imgs/node_7.jpeg"));
        }
    }//GEN-LAST:event_node_7MouseExited

    private void node_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_8MouseClicked
        if (inicio == 0) {
            inicio = 8 ;
            node_8.setIcon(new ImageIcon("src/main/java/imgs/node_start_8.jpeg"));
        } else if(fin == 0) {
            if(inicio != 8) {
                fin = 8 ;
                node_8.setIcon(new ImageIcon("src/main/java/imgs/node_end_8.jpeg"));
                setCamino() ;
            } else {
                JOptionPane.showConfirmDialog(this, "Selecciona otro grafo de destino", "Grafo repetido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE) ;
            }
        }
    }//GEN-LAST:event_node_8MouseClicked

    private void node_8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_8MouseEntered
        if((inicio != 8 && fin == 0) || (inicio == 0&& fin != 8) || ((inicio != 8 && fin != 8) && !camino.contains((grafo.encontrarVertice("8"))))) {
            node_8.setIcon(new ImageIcon("src/main/java/imgs/node_select_8.jpeg"));
        }
    }//GEN-LAST:event_node_8MouseEntered

    private void node_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_8MouseExited
        if((inicio != 8 && fin == 0) || (inicio == 0&& fin != 8) || ((inicio != 8 && fin != 8) && !camino.contains((grafo.encontrarVertice("8"))))) {
            node_8.setIcon(new ImageIcon("src/main/java/imgs/node_8.jpeg"));
        }
    }//GEN-LAST:event_node_8MouseExited

    private void node_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_9MouseClicked
        if (inicio == 0) {
            inicio = 9 ;
            node_9.setIcon(new ImageIcon("src/main/java/imgs/node_start_9.jpeg"));
        } else if(fin == 0) {
            if(inicio != 9) {
                fin = 9 ;
                node_9.setIcon(new ImageIcon("src/main/java/imgs/node_end_9.jpeg"));
                setCamino() ;
            } else {
                JOptionPane.showConfirmDialog(this, "Selecciona otro grafo de destino", "Grafo repetido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE) ;
            }
        }
    }//GEN-LAST:event_node_9MouseClicked

    private void node_9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_9MouseEntered
        if((inicio != 9 && fin == 0) || (inicio == 0&& fin != 9) || ((inicio != 9 && fin != 9) && !camino.contains((grafo.encontrarVertice("9"))))) {
            node_9.setIcon(new ImageIcon("src/main/java/imgs/node_select_9.jpeg"));
        }
    }//GEN-LAST:event_node_9MouseEntered

    private void node_9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_9MouseExited
        if((inicio != 9 && fin == 0) || (inicio == 0&& fin != 9) || ((inicio != 9 && fin != 9) && !camino.contains((grafo.encontrarVertice("9"))))) {
            node_9.setIcon(new ImageIcon("src/main/java/imgs/node_9.jpeg"));
        }
    }//GEN-LAST:event_node_9MouseExited

    private void node_10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_10MouseClicked
        if (inicio == 0) {
            inicio = 10 ;
            node_10.setIcon(new ImageIcon("src/main/java/imgs/node_start_10.jpeg"));
        } else if(fin == 0) {
            if(inicio != 10) {
                fin = 10 ;
                node_10.setIcon(new ImageIcon("src/main/java/imgs/node_end_10.jpeg"));
                setCamino() ;
            } else {
                JOptionPane.showConfirmDialog(this, "Selecciona otro grafo de destino", "Grafo repetido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE) ;
            }
        }
    }//GEN-LAST:event_node_10MouseClicked

    private void node_10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_10MouseEntered
        if((inicio != 10 && fin == 0) || (inicio == 0&& fin != 10) || ((inicio != 10 && fin != 10) && !camino.contains((grafo.encontrarVertice("10"))))) {
            node_10.setIcon(new ImageIcon("src/main/java/imgs/node_select_10.jpeg"));
        }
    }//GEN-LAST:event_node_10MouseEntered

    private void node_10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_10MouseExited
        if((inicio != 10 && fin == 0) || (inicio == 0&& fin != 10) || ((inicio != 10 && fin != 10) && !camino.contains((grafo.encontrarVertice("10"))))) {
            node_10.setIcon(new ImageIcon("src/main/java/imgs/node_10.jpeg"));
        }
    }//GEN-LAST:event_node_10MouseExited

    private void node_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_11MouseClicked
        if (inicio == 0) {
            inicio = 11 ;
            node_11.setIcon(new ImageIcon("src/main/java/imgs/node_start_11.jpeg"));
        } else if(fin == 0) {
            if(inicio != 11) {
                fin = 11 ;
                node_11.setIcon(new ImageIcon("src/main/java/imgs/node_end_11.jpeg"));
                setCamino() ;
            } else {
                JOptionPane.showConfirmDialog(this, "Selecciona otro grafo de destino", "Grafo repetido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE) ;
            }
        }
    }//GEN-LAST:event_node_11MouseClicked

    private void node_11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_11MouseEntered
        if((inicio != 11 && fin == 0) || (inicio == 0&& fin != 11) || ((inicio != 11 && fin != 11) && !camino.contains((grafo.encontrarVertice("11"))))) {
            node_11.setIcon(new ImageIcon("src/main/java/imgs/node_select_11.jpeg"));
        }
    }//GEN-LAST:event_node_11MouseEntered

    private void node_11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_11MouseExited
        if((inicio != 11 && fin == 0) || (inicio == 0&& fin != 11) || ((inicio != 11 && fin != 11) && !camino.contains((grafo.encontrarVertice("11"))))) {
            node_11.setIcon(new ImageIcon("src/main/java/imgs/node_11.jpeg"));
        }
    }//GEN-LAST:event_node_11MouseExited

    private void node_12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_12MouseClicked
        if (inicio == 0) {
            inicio = 12 ;
            node_12.setIcon(new ImageIcon("src/main/java/imgs/node_start_12.jpeg"));
        } else if(fin == 0) {
            if(inicio != 12) {
                fin = 12 ;
                node_12.setIcon(new ImageIcon("src/main/java/imgs/node_end_12.jpeg"));
                setCamino() ;
            } else {
                JOptionPane.showConfirmDialog(this, "Selecciona otro grafo de destino", "Grafo repetido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE) ;
            }
        }
    }//GEN-LAST:event_node_12MouseClicked

    private void node_12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_12MouseEntered
        if((inicio != 12 && fin == 0) || (inicio == 0&& fin != 12) || ((inicio != 12 && fin != 12) && !camino.contains((grafo.encontrarVertice("12"))))) {
            node_12.setIcon(new ImageIcon("src/main/java/imgs/node_select_12.jpeg"));
        }
    }//GEN-LAST:event_node_12MouseEntered

    private void node_12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_12MouseExited
        if((inicio != 12 && fin == 0) || (inicio == 0&& fin != 12) || ((inicio != 12 && fin != 12) && !camino.contains((grafo.encontrarVertice("12"))))) {
            node_12.setIcon(new ImageIcon("src/main/java/imgs/node_12.jpeg"));
        }
    }//GEN-LAST:event_node_12MouseExited

    private void node_13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_13MouseClicked
        if (inicio == 0) {
            inicio = 13 ;
            node_13.setIcon(new ImageIcon("src/main/java/imgs/node_start_13.jpeg"));
        } else if(fin == 0) {
            if(inicio != 13) {
                fin = 13 ;
                node_13.setIcon(new ImageIcon("src/main/java/imgs/node_end_13.jpeg"));
                setCamino() ;
            } else {
                JOptionPane.showConfirmDialog(this, "Selecciona otro grafo de destino", "Grafo repetido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE) ;
            }
        }
    }//GEN-LAST:event_node_13MouseClicked

    private void node_13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_13MouseEntered
        if((inicio != 13 && fin == 0) || (inicio == 0&& fin != 13) || ((inicio != 13 && fin != 13) && !camino.contains((grafo.encontrarVertice("13"))))) {
            node_13.setIcon(new ImageIcon("src/main/java/imgs/node_select_13.jpeg"));
        }
    }//GEN-LAST:event_node_13MouseEntered

    private void node_13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_13MouseExited
        if((inicio != 13 && fin == 0) || (inicio == 0&& fin != 13) || ((inicio != 13 && fin != 13) && !camino.contains((grafo.encontrarVertice("13"))))) {
            node_13.setIcon(new ImageIcon("src/main/java/imgs/node_13.jpeg"));
        }
    }//GEN-LAST:event_node_13MouseExited

    private void node_14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_14MouseClicked
        if (inicio == 0) {
            inicio = 14 ;
            node_14.setIcon(new ImageIcon("src/main/java/imgs/node_start_14.jpeg"));
        } else if(fin == 0) {
            if(inicio != 14) {
                fin = 14 ;
                node_14.setIcon(new ImageIcon("src/main/java/imgs/node_end_14.jpeg"));
                setCamino() ;
            } else {
                JOptionPane.showConfirmDialog(this, "Selecciona otro grafo de destino", "Grafo repetido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE) ;
            }
        }
    }//GEN-LAST:event_node_14MouseClicked

    private void node_14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_14MouseEntered
        if((inicio != 14 && fin == 0) || (inicio == 0&& fin != 14) || ((inicio != 14 && fin != 14) && !camino.contains((grafo.encontrarVertice("14"))))) {
            node_14.setIcon(new ImageIcon("src/main/java/imgs/node_select_14.jpeg"));
        }
    }//GEN-LAST:event_node_14MouseEntered

    private void node_14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_14MouseExited
        if((inicio != 14 && fin == 0) || (inicio == 0&& fin != 14) || ((inicio != 14 && fin != 14) && !camino.contains((grafo.encontrarVertice("14"))))) {
            node_14.setIcon(new ImageIcon("src/main/java/imgs/node_14.jpeg"));
        }
    }//GEN-LAST:event_node_14MouseExited

    private void node_15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_15MouseClicked
        if (inicio == 0) {
            inicio = 15 ;
            node_15.setIcon(new ImageIcon("src/main/java/imgs/node_start_15.jpeg"));
        } else if(fin == 0) {
            if(inicio != 15) {
                fin = 15 ;
                node_15.setIcon(new ImageIcon("src/main/java/imgs/node_end_15.jpeg"));
                setCamino() ;
            } else {
                JOptionPane.showConfirmDialog(this, "Selecciona otro grafo de destino", "Grafo repetido", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE) ;
            }
        }
    }//GEN-LAST:event_node_15MouseClicked

    private void node_15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_15MouseEntered
        if((inicio != 15 && fin == 0) || (inicio == 0&& fin != 15) || ((inicio != 15 && fin != 15) && !camino.contains((grafo.encontrarVertice("15"))))) {
            node_15.setIcon(new ImageIcon("src/main/java/imgs/node_select_15.jpeg"));
        }
    }//GEN-LAST:event_node_15MouseEntered

    private void node_15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_node_15MouseExited
        if((inicio != 15 && fin == 0) || (inicio == 0&& fin != 15) || ((inicio != 15 && fin != 15) && !camino.contains((grafo.encontrarVertice("15"))))) {
            node_15.setIcon(new ImageIcon("src/main/java/imgs/node_15.jpeg"));
        }
    }//GEN-LAST:event_node_15MouseExited

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        setDefaultIcons() ;
        inicio = 0 ;
        fin = 0 ;
        camino = new LinkedList() ;
        lblDistancia.setText("Distancia:");
    }//GEN-LAST:event_btnReiniciarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDistancia;
    private javax.swing.JLabel lblMunicipios;
    private javax.swing.JLabel lblTitulo;
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
    private javax.swing.JLabel node_1;
    private javax.swing.JLabel node_10;
    private javax.swing.JLabel node_11;
    private javax.swing.JLabel node_12;
    private javax.swing.JLabel node_13;
    private javax.swing.JLabel node_14;
    private javax.swing.JLabel node_15;
    private javax.swing.JLabel node_2;
    private javax.swing.JLabel node_3;
    private javax.swing.JLabel node_4;
    private javax.swing.JLabel node_5;
    private javax.swing.JLabel node_6;
    private javax.swing.JLabel node_7;
    private javax.swing.JLabel node_8;
    private javax.swing.JLabel node_9;
    // End of variables declaration//GEN-END:variables
}
