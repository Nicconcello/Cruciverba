package cv;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class cvFrame{

	public static void main(String[] args) {
		JFrame f = new JFrame("CRUCIVERBA");
		
		f.setSize(1000,600);
		f.setLocationRelativeTo(null);
		
		CrosswordButton[][] gb = new CrosswordButton[10][10];

		JPanel pannelloCruciverba = new JPanel(new GridLayout(10, 10));

		for (int riga = 0; riga < 10; riga++) {
		    for (int col = 0; col < 10; col++) {
		        
		        // 1. Crea il bottone personalizzato
		        CrosswordButton bottone = new CrosswordButton();
		        
		        
		        // 2. Controlla se questa cella è l'inizio di una parola
		        if (riga == 0 && col == 0) {
		            bottone.setIndexNumber("1");
		        }
		        if (riga == 0 && col == 2) {
		            bottone.setIndexNumber("2");
		        }
		        if (riga == 1 && col == 5) {
		            bottone.setIndexNumber("6");
		        }
		        if (riga == 0 && col == 6) {
		            bottone.setIndexNumber("3");
		        }
		        if (riga == 0 && col == 7) {
		            bottone.setIndexNumber("4");
		        }
		        if (riga == 0 && col == 8) {
		            bottone.setIndexNumber("5");
		        }
		        if (riga == 2 && col == 0) {
		            bottone.setIndexNumber("7");
		        }
		        if (riga == 2 && col == 1) {
		            bottone.setIndexNumber("8");
		        }
		        if (riga == 2 && col == 3) {
		            bottone.setIndexNumber("9");
		        }
		        if (riga == 2 && col == 4) {
		            bottone.setIndexNumber("10");
		        }
		        if (riga == 2 && col == 6) {
		            bottone.setIndexNumber("11");
		        }
		        if (riga == 3 && col == 0) {
		            bottone.setIndexNumber("12");
		        }
		        if (riga == 3 && col == 6) {
		            bottone.setIndexNumber("13");
		        }
		        if (riga == 4 && col == 1) {
		            bottone.setIndexNumber("14");
		        }
		        if (riga == 5 && col == 0) {
		            bottone.setIndexNumber("15");
		        }
		        if (riga == 5 && col == 6) {
		            bottone.setIndexNumber("16");
		        }
		        if (riga == 5 && col == 7) {
		            bottone.setIndexNumber("17");
		        }
		        if (riga == 5 && col == 8) {
		            bottone.setIndexNumber("18");
		        }
		        if (riga == 6 && col == 1) {
		            bottone.setIndexNumber("19");
		        }
		        if (riga == 6 && col == 4) {
		            bottone.setIndexNumber("20");
		        }
		        if (riga == 6 && col == 5) {
		            bottone.setIndexNumber("21");
		        }
		        if (riga == 7 && col == 0) {
		            bottone.setIndexNumber("22");
		        }
		        if (riga == 7 && col == 3) {
		            bottone.setIndexNumber("23");
		        }
		        if (riga == 7 && col == 9) {
		            bottone.setIndexNumber("24");
		        }
		        if (riga == 8 && col == 0) {
		            bottone.setIndexNumber("25");
		        }
		        if (riga == 8 && col == 2) {
		            bottone.setIndexNumber("26");
		        }
		        if (riga == 8 && col == 8) {
		            bottone.setIndexNumber("27");
		        }
		        if (riga == 9 && col == 0) {
		            bottone.setIndexNumber("28");
		        }
		        

		        gb[riga][col] = bottone;
		        pannelloCruciverba.add(bottone);
		        
		        ascoltatore a = new ascoltatore(gb);
		        gb[riga][col].addActionListener(a);
		    }
		}
		gb[0][5].setBackground(Color.BLACK);
		gb[1][1].setBackground(Color.BLACK);
		gb[4][0].setBackground(Color.BLACK);
		gb[7][2].setBackground(Color.BLACK);
		gb[1][3].setBackground(Color.BLACK);
		gb[2][5].setBackground(Color.BLACK);
		gb[1][4].setBackground(Color.BLACK);
		gb[1][9].setBackground(Color.BLACK);
		gb[3][5].setBackground(Color.BLACK);
		gb[8][6].setBackground(Color.BLACK);
		gb[3][9].setBackground(Color.BLACK);
		gb[4][7].setBackground(Color.BLACK);
		gb[4][8].setBackground(Color.BLACK);
		gb[4][9].setBackground(Color.BLACK);
		gb[5][4].setBackground(Color.BLACK);
		gb[5][5].setBackground(Color.BLACK);
		gb[5][9].setBackground(Color.BLACK);
		gb[6][0].setBackground(Color.BLACK);
		gb[6][9].setBackground(Color.BLACK);
		gb[8][3].setBackground(Color.BLACK);
		gb[8][5].setBackground(Color.BLACK);
		gb[8][7].setBackground(Color.BLACK);
		gb[9][9].setBackground(Color.BLACK);
		
		f.add(pannelloCruciverba, BorderLayout.CENTER);

		JTextArea dV = new JTextArea(20,15);
		dV.setEditable(false);
		JTextArea dO = new JTextArea(20,15);
		dO.setEditable(false);
		JScrollPane sp1 = new JScrollPane(dV);
		JScrollPane sp2 = new JScrollPane(dO);
		
		f.add(sp1, BorderLayout.WEST);
		f.add(sp2, BorderLayout.EAST);
		
		
		dV.append("VERTICALI:\n");
		dV.append("1. In che linguaggio è scritto questo codice?\n");
		dV.append("2. Il colore del cielo\n");
		dV.append("3. Sotto la Russia\n");
		dV.append("4. Agenzia Internazionale per l'Energia Atomica\n");
		dV.append("5. Leidos in borsa\n");
		dV.append("8. Muovere il primo passo\n");
		dV.append("9. Un motore che sfrutta due diverse fonti di alimentazione\n");
		dV.append("10. Olimpiadi Italiane d'Informatica\n");
		dV.append("17. Telecomunicazioni\n");
		dV.append("18. Nel pianoforte, vengono percosse dai martelletti\n");
		dV.append("20. Profondo rancore\n");
		dV.append("21. La sigla della provincia di Forlì\n");
		dV.append("22. Né tua, né sua\n");
		dV.append("24. Articolo in dialetto Romanesco\n");
		dV.append("26. Il simbolo chimico dell'Argon\n");
		
		dO.append("ORIZZONTALI:\n");
		dO.append("1. I popolari pantaloni da lavoro in tela blu\n");
		dO.append("3. Il contrario di 'bene'\n");
		dO.append("6. Parola chiave per un metodo senza 'return'\n");
		dO.append("7. Una cattiva abitudine difficile da estirpare\n");
		dO.append("11. Illumina molte vetrine dei negozi\n");
		dO.append("12. Dio dei morti nelll'antico egitto\n");
		dO.append("13. Uno dei tre stati della materia\n");
		dO.append("14. Dò fastidio, provoco nervosismo\n");
		dO.append("15. Azriel ssenza el\n");
		dO.append("16. Assistenza a lungo termine\n");
		dO.append("19. Affine allo Iodio\n");
		dO.append("22. Indica una contrapposizione\n");
		dO.append("23. Il re barbaro che pose fine all'Impero Romano d'Occidente\n");
		dO.append("25. Uno dei sette vizi capitali\n");
		dO.append("27. Il titolo che spetta a un medico\n");
		dO.append("28. Lo era, ad esempio, lo Zeppelin\n");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

}
