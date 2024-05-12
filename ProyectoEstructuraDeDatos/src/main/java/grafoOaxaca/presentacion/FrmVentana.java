
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

/**
 *
 * @author Asiel Apodaca Monge
 */
public class FrmVentana extends JFrame{
    
    private final CardLayout cardLayout;
    private final JPanel cardPanel;
    private final JPanel buttonPanel;
    
    public FrmVentana() {
        setTitle("Grafo de Municipios De Oaxaca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1358, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        cardPanel.setPreferredSize(new Dimension(1358, 672));
        
        // Se crean los paneles (ventanas) y se añaden los paneles al panel con CardLayout
//        cardPanel.add(new GrafoJpanel(), "GrafoJpanel");
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
        JButton btn_grafo = new JButton("Mostrar grafo");
        JButton btn_arbolExpansion = new JButton("Mostrar arbol de expansión mínima");
        JButton btn_rutaCorta = new JButton("Ruta más corta");
        JButton btn_salir = new JButton("Salir");
        
        btn_grafo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVentana("GrafoJpanel");
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
        buttonPanel.add(btn_grafo);
        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(btn_arbolExpansion);
        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(btn_rutaCorta);
        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(btn_salir);
        buttonPanel.add(Box.createHorizontalGlue());
        
        btn_grafo.setVisible(true);
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

    
}
