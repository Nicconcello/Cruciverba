package cv;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ascoltatore implements ActionListener {
    private CrosswordButton[][] b;

    public ascoltatore(CrosswordButton[][] b) {
        this.b = b;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        // 1. Capisci QUALE bottone è stato premuto
        JButton bottoneCliccato = (JButton) e.getSource();
        String letteraCorretta = null;

        if(bottoneCliccato == b[0][0]) {
            letteraCorretta = "J";
        } else if(bottoneCliccato == b[1][0]) {
            letteraCorretta = "A";
        } else if(bottoneCliccato == b[2][0]) {
            letteraCorretta = "V";
        } else if(bottoneCliccato == b[3][0]) {
        	letteraCorretta = "A";
        } else if(bottoneCliccato == b[0][1]) {
        	letteraCorretta = "E";
        } else if(bottoneCliccato == b[0][2]) {
        	letteraCorretta = "A";
        } else if(bottoneCliccato == b[0][3]) {
        	letteraCorretta = "N";
        } else if(bottoneCliccato == b[0][4]) {
        	letteraCorretta = "S";
        } else if(bottoneCliccato == b[1][2]) {
        	letteraCorretta = "Z";
        } else if(bottoneCliccato == b[2][2]) {
        	letteraCorretta = "Z";
        } else if(bottoneCliccato == b[3][2]) {
        	letteraCorretta = "U";
        } else if(bottoneCliccato == b[4][2]) {
        	letteraCorretta = "R";
        } else if(bottoneCliccato == b[5][2]) {
        	letteraCorretta = "R";
        } else if(bottoneCliccato == b[6][2]) {
        	letteraCorretta = "O";
        } else if(bottoneCliccato == b[0][6]) {
        	letteraCorretta = "M";
        } else if(bottoneCliccato == b[0][7]) {
        	letteraCorretta = "A";
        } else if(bottoneCliccato == b[0][8]) {
        	letteraCorretta = "L";
        } else if(bottoneCliccato == b[0][9]) {
        	letteraCorretta = "E";
        } else if(bottoneCliccato == b[2][1]) {
        	letteraCorretta = "I";
        } else if(bottoneCliccato == b[2][3]) {
        	letteraCorretta = "I";
        } else if(bottoneCliccato == b[2][4]) {
        	letteraCorretta = "O";
        } else if(bottoneCliccato == b[1][5]) {
        	letteraCorretta = "V";
        } else if(bottoneCliccato == b[1][6]) {
        	letteraCorretta = "O";
        } else if(bottoneCliccato == b[1][7]) {
        	letteraCorretta = "I";
        } else if(bottoneCliccato == b[1][8]) {
        	letteraCorretta = "D";
        } else if(bottoneCliccato == b[3][1]) {
        	letteraCorretta = "N";
        } else if(bottoneCliccato == b[3][3]) {
        	letteraCorretta = "B";
        } else if(bottoneCliccato == b[3][4]) {
        	letteraCorretta = "I";
        } else if(bottoneCliccato == b[4][1]) {
        	letteraCorretta = "I";
        } else if(bottoneCliccato == b[5][1]) {
        	letteraCorretta = "Z";
        } else if(bottoneCliccato == b[6][1]) {
        	letteraCorretta = "I";
        } else if(bottoneCliccato == b[7][1]) {
        	letteraCorretta = "A";
        } else if(bottoneCliccato == b[8][1]) {
        	letteraCorretta = "R";
        } else if(bottoneCliccato == b[9][1]) {
        	letteraCorretta = "E";
        } else if(bottoneCliccato == b[2][6]) {
        	letteraCorretta = "N";
        } else if(bottoneCliccato == b[3][6]) {
        	letteraCorretta = "G";
        } else if(bottoneCliccato == b[4][6]) {
        	letteraCorretta = "O";
        } else if(bottoneCliccato == b[5][6]) {
        	letteraCorretta = "L";
        } else if(bottoneCliccato == b[6][6]) {
        	letteraCorretta = "I";
        } else if(bottoneCliccato == b[7][6]) {
        	letteraCorretta = "A";
        } else if(bottoneCliccato == b[2][7]) {
        	letteraCorretta = "E";
        } else if(bottoneCliccato == b[2][8]) {
        	letteraCorretta = "O";
        } else if(bottoneCliccato == b[2][9]) {
        	letteraCorretta = "N";
        } else if(bottoneCliccato == b[3][7]) {
        	letteraCorretta = "A";
        } else if(bottoneCliccato == b[3][8]) {
        	letteraCorretta = "S";
        } else if(bottoneCliccato == b[4][3]) {
        	letteraCorretta = "R";
        } else if(bottoneCliccato == b[4][4]) {
        	letteraCorretta = "I";
        } else if(bottoneCliccato == b[4][5]) {
        	letteraCorretta = "T";
        } else if(bottoneCliccato == b[5][0]) {
        	letteraCorretta = "A";
        } else if(bottoneCliccato == b[5][3]) {
        	letteraCorretta = "I";
        } else if(bottoneCliccato == b[5][7]) {
        	letteraCorretta = "T";
        } else if(bottoneCliccato == b[5][8]) {
        	letteraCorretta = "C";
        } else if(bottoneCliccato == b[6][1]) {
        	letteraCorretta = "I";
        } else if(bottoneCliccato == b[6][3]) {
        	letteraCorretta = "D";
        } else if(bottoneCliccato == b[6][4]) {
        	letteraCorretta = "O";
        } else if(bottoneCliccato == b[6][5]) {
        	letteraCorretta = "F";
        } else if(bottoneCliccato == b[6][7]) {
        	letteraCorretta = "L";
        } else if(bottoneCliccato == b[6][8]) {
        	letteraCorretta = "O";
        } else if(bottoneCliccato == b[7][0]) {
        	letteraCorretta = "M";
        } else if(bottoneCliccato == b[7][3]) {
        	letteraCorretta = "O";
        } else if(bottoneCliccato == b[7][4]) {
        	letteraCorretta = "D";
        } else if(bottoneCliccato == b[7][5]) {
        	letteraCorretta = "O";
        } else if(bottoneCliccato == b[7][7]) {
        	letteraCorretta = "C";
        } else if(bottoneCliccato == b[7][8]) {
        	letteraCorretta = "R";
        } else if(bottoneCliccato == b[7][9]) {
        	letteraCorretta = "E";
        } else if(bottoneCliccato == b[8][0]) {
        	letteraCorretta = "I";
        } else if(bottoneCliccato == b[8][2]) {
        	letteraCorretta = "A";
        } else if(bottoneCliccato == b[8][4]) {
        	letteraCorretta = "I";
        } else if(bottoneCliccato == b[8][8]) {
        	letteraCorretta = "D";
        } else if(bottoneCliccato == b[8][9]) {
        	letteraCorretta = "R";
        } else if(bottoneCliccato == b[9][0]) {
        	letteraCorretta = "A";
        } else if(bottoneCliccato == b[9][2]) {
        	letteraCorretta = "R";
        } else if(bottoneCliccato == b[9][3]) {
        	letteraCorretta = "E";
        } else if(bottoneCliccato == b[9][4]) {
        	letteraCorretta = "O";
        } else if(bottoneCliccato == b[9][5]) {
        	letteraCorretta = "N";
        } else if(bottoneCliccato == b[9][6]) {
        	letteraCorretta = "A";
        } else if(bottoneCliccato == b[9][7]) {
        	letteraCorretta = "V";
        } else if(bottoneCliccato == b[9][8]) {
        	letteraCorretta = "E";
        } 










        
        // 3. Apri il popup SOLO se è una cella da riempire
        // (Se è un blocco nero, letteraCorretta rimarrà null e non accadrà nulla)
        if (letteraCorretta != null) {
            JFrame ris = new JFrame("RISPOSTA");
            ris.setSize(200, 100);
            ris.setLocationRelativeTo(null);

            JTextField txt = new JTextField("");
            ris.add(txt, BorderLayout.CENTER);

            JButton s = new JButton("SEND");
            ascoltaSend as = new ascoltaSend(txt, letteraCorretta, ris, bottoneCliccato);
            s.addActionListener(as);

            ris.add(s, BorderLayout.SOUTH);

            ris.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ris.setVisible(true);
        }
    }
}
