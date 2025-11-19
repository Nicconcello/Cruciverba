package cv;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

/**
 * Un JButton personalizzato che permette di disegnare un piccolo 
 * numero (indice) nell'angolo in alto a sinistra.
 */
public class CrosswordButton extends JButton {

    private String indexNumber;

    /**
     * Costruttore di default.
     */
    public CrosswordButton() {
        super();
        this.indexNumber = null;
        
        // Impostiamo un font più grande per la lettera centrale
        setFont(new Font("Arial", Font.BOLD, 20)); 
    }

    /**
     * Metodo per impostare il numero dell'indice da visualizzare.
     * @param index Il numero (come stringa) da mostrare.
     */
    public void setIndexNumber(String index) {
        this.indexNumber = index;
        repaint(); // Chiede al bottone di ridisegnarsi
    }

    /**
     * Questo è il metodo chiave. Viene chiamato ogni volta 
     * che Swing deve disegnare il bottone.
     */
    @Override
    protected void paintComponent(Graphics g) {
        // 1. Disegna prima il bottone normale (sfondo, bordo, ecc.)
        super.paintComponent(g);

        // 2. Se abbiamo un numero da mostrare, lo disegniamo sopra
        if (indexNumber != null && !indexNumber.isEmpty()) {
            
            // Usiamo Graphics2D per un disegno di qualità (antialiasing)
            Graphics2D g2 = (Graphics2D) g.create();
            
            g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
            );

            // Imposta il colore (es. nero)
            g2.setColor(Color.BLACK); 
            
            // Imposta un font piccolo per il numero
            // Puoi aggiustare "8f" (8 pixel) se è troppo grande o piccolo
            Font indexFont = getFont().deriveFont(Font.PLAIN, 9f); 
            g2.setFont(indexFont);

            // Disegna la stringa del numero alle coordinate (x, y)
            // (x=4, y=10) di solito funziona bene per l'angolo in alto a sinistra
            g2.drawString(indexNumber, 4, 10);

            // Rilascia le risorse grafiche
            g2.dispose();
        }
        
        // Nota: il testo principale del bottone (la lettera) 
        // viene disegnato da "super.paintComponent(g)"
    }
}
