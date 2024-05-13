
package grafoOaxaca.presentacion;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import negocios.dominioGrafo.Grafo;

/**
 *
 * @author Asiel Apodaca Monge
 */
public class FrmVentana extends JFrame{
    
    private final CardLayout cardLayout;
    private final JPanel cardPanel;
    private final JPanel buttonPanel;
    private Grafo k = new Grafo();
    
    public FrmVentana() {
        setGrafoOaxaca() ;
        setTitle("Grafo de Municipios De Oaxaca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1358, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        cardPanel.setPreferredSize(new Dimension(1358, 672));
        
        // Se crean los paneles (ventanas) y se añaden los paneles al panel con CardLayout
        cardPanel.add(new PanelGrafoOaxaca(k), "PanelGrafoOaxaca");
//        cardPanel.add(new ArbolDeExpansionMinimaJpanel(), "ArbolDeExpansionMinimaJpanel");
//        cardPanel.add(new RutaMasCortaJpanel(), "RutaMasCortaJpanel");

        // Añadir el panel con CardLayout
        getContentPane().add(cardPanel, BorderLayout.NORTH);
        
        
        // Panel para botones
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.setPreferredSize(new Dimension(1358, 129));
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        
        // Botones
        JButton btn_matriz = new JButton("Mostrar Matriz de Adyacencia");
        JButton btn_arbolExpansion = new JButton("Mostrar arbol de expansión mínima");
        JButton btn_rutaCorta = new JButton("Ruta más corta");
        JButton btn_salir = new JButton("Salir");
        
        btn_matriz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentana("PanelGrafoOaxaca");
            }
        });
        
        btn_arbolExpansion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentana("ArbolDeExpansionMinimaJpanel");
            }
        });
        
        btn_rutaCorta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentana("RutaMasCortaJpanel");
            }
        });
        
        btn_salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmVentana.this.dispose();
            }
        });
        
        // Añadir botones al panel con espacios en blanco entre ellos
        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(btn_matriz);
        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(btn_arbolExpansion);
        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(btn_rutaCorta);
        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(btn_salir);
        buttonPanel.add(Box.createHorizontalGlue());
        
        btn_matriz.setVisible(true);
        btn_arbolExpansion.setVisible(true);
        btn_rutaCorta.setVisible(true);
        btn_salir.setVisible(true);
        
        // Añadir panel de botones a la ventana
        getContentPane().add(buttonPanel, BorderLayout.SOUTH); // Se muestra en la parte inferior
        
    }
    
    /**
     * Método para mostrar un panel específico.
     * @param nombrePanel El nombre del panel que se mostrará.
     */
    public void mostrarVentana(String nombrePanel) {
        cardLayout.show(cardPanel, nombrePanel);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmVentana frmVentana = new FrmVentana();
                frmVentana.setVisible(true);
            }
        });
    }

    private void setGrafoOaxaca() {
        k.agregarVertice("1");
        k.agregarVertice("2");
        k.agregarVertice("3");
        k.agregarVertice("4");
        k.agregarVertice("5");
        k.agregarVertice("6");
        k.agregarVertice("7");
        k.agregarVertice("8");
        k.agregarVertice("9");
        k.agregarVertice("10");
        k.agregarVertice("11");
        k.agregarVertice("12");
        k.agregarVertice("13");
        k.agregarVertice("14");
        k.agregarVertice("15");
        
        k.agregarArista("1", "7", 4.6);
        k.agregarArista("1", "4", 8.7);
        k.agregarArista("1", "13", 7.2);
        k.agregarArista("1", "15", 7.9);
        k.agregarArista("2", "7", 215);
        k.agregarArista("2", "6", 390);
        k.agregarArista("2", "10", 36.6);
        k.agregarArista("3", "5", 44.8);
        k.agregarArista("3", "8", 28.5);
        k.agregarArista("3", "14", 20.8);
        k.agregarArista("4", "13", 13);
        k.agregarArista("4", "15", 6.8);
        k.agregarArista("5", "8", 17);
        k.agregarArista("5", "12", 370);
        k.agregarArista("6", "13", 167);
        k.agregarArista("6", "9", 286);
        k.agregarArista("7", "15", 5.9);
        k.agregarArista("7", "14", 255);
        k.agregarArista("8", "15", 249);
        k.agregarArista("8", "14", 40.8);
        k.agregarArista("8", "12", 296);
        k.agregarArista("9", "11", 140);
        k.agregarArista("10", "14", 274);
        k.agregarArista("11", "15", 188);
        k.agregarArista("11", "12", 146);
        k.agregarArista("12", "15", 98.9);
        k.agregarArista("14", "15", 266);
    }
    
}
