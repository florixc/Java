package dado;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;

public class Dado {

	private JFrame frame;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	JLabel lblStampa;
	JLabel lblA;
	JLabel lblB;
	JLabel lblC;
	private JButton btnLanciaFinoAlBis;
	private JTextField txtN;
	private JButton btnLanciaFinoATutteDispari;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dado window = new Dado();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Dado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 453, 517);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtA = new JTextField();
		txtA.setText("txtA");
		txtA.setBounds(67, 175, 86, 20);
		frame.getContentPane().add(txtA);
		txtA.setColumns(10);

		txtB = new JTextField();
		txtB.setText("txtB");
		txtB.setBounds(178, 175, 86, 20);
		frame.getContentPane().add(txtB);
		txtB.setColumns(10);

		txtC = new JTextField();
		txtC.setText("txtC");
		txtC.setBounds(292, 175, 86, 20);
		frame.getContentPane().add(txtC);
		txtC.setColumns(10);

		lblStampa = new JLabel("clicca su lancia...");
		lblStampa.setBackground(new Color(255, 255, 0));
		lblStampa.setHorizontalAlignment(SwingConstants.CENTER);
		lblStampa.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblStampa.setBounds(41, 347, 337, 26);
		frame.getContentPane().add(lblStampa);

		JButton btnLancia = new JButton("Lancia");
		btnLancia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLanciaActionPerformed(e);
			}
		});
		btnLancia.setBounds(154, 216, 89, 23);
		frame.getContentPane().add(btnLancia);

		JButton btnLanciaFinoAlTris = new JButton("Lancia fino al tris");
		btnLanciaFinoAlTris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLanciaFinoAlTrisActionPerformed(e);
			}

		});
		btnLanciaFinoAlTris.setBounds(154, 284, 142, 23);
		frame.getContentPane().add(btnLanciaFinoAlTris);

		btnLanciaFinoAlBis = new JButton("Lancia fino al bis");
		btnLanciaFinoAlBis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLanciaFinoAlBisActionPerformed(e);
			}
		});
		btnLanciaFinoAlBis.setBounds(154, 250, 142, 23);
		frame.getContentPane().add(btnLanciaFinoAlBis);

		txtN = new JTextField();
		txtN.setText("txtN");
		txtN.setBounds(20, 389, 86, 20);
		frame.getContentPane().add(txtN);
		txtN.setColumns(10);

		JButton btnLanciaNVolte = new JButton("Lancia n volte");
		btnLanciaNVolte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLanciaNVolteActionPerformed(e);
			}
		});
		btnLanciaNVolte.setBounds(140, 388, 142, 23);
		frame.getContentPane().add(btnLanciaNVolte);

		btnLanciaFinoATutteDispari = new JButton("Lancia fino a tutte dispari");
		btnLanciaFinoATutteDispari.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLanciaFinoATutteDispari(e);
			}
		});
		btnLanciaFinoATutteDispari.setBounds(154, 313, 165, 23);
		frame.getContentPane().add(btnLanciaFinoATutteDispari);

		lblA = new JLabel("lblA");
		lblA.setIcon(new ImageIcon(Dado.class.getResource("/dado/0.jpg")));
		lblA.setBounds(10, 16, 135, 152);
		frame.getContentPane().add(lblA);

		lblB = new JLabel("lblB");
		lblB.setIcon(new ImageIcon(Dado.class.getResource("/dado/0.jpg")));
		lblB.setBounds(154, 31, 127, 123);
		frame.getContentPane().add(lblB);

		lblC = new JLabel("lblC");
		lblC.setIcon(new ImageIcon(Dado.class.getResource("/dado/0.jpg")));
		lblC.setBounds(292, 29, 127, 126);
		frame.getContentPane().add(lblC);

	}

	protected void btnLanciaFinoATutteDispari(ActionEvent e) {
		int dadoA;
		int dadoB;
		int dadoC;
		int contatore = 0;
		do {
			dadoA = (int) (Math.random() * 6) + 1;
			dadoB = (int) (Math.random() * 6) + 1;
			dadoC = (int) (Math.random() * 6) + 1;

			txtA.setText("" + dadoA);
			txtB.setText("" + dadoB);
			txtC.setText("" + dadoC);
			stampaIcone(dadoA, dadoB, dadoC);

			if (dadoA == dadoB && dadoB == dadoC)
				contatore++; // } while (!(dadoA %2 ==1 && dadoB %2 == 1 && dadoC % 2 == 1));
		} while (dadoA % 2 != 1 || dadoB % 2 != 1 || dadoC % 2 != 1);
		lblStampa.setText("Hai fatto " + contatore + " tris");
	}

	private void btnLanciaActionPerformed(ActionEvent e) {
		int dadoA = (int) (Math.random() * 6) + 1;
		int dadoB = (int) (Math.random() * 6) + 1;
		int dadoC = (int) (Math.random() * 6) + 1;

		txtA.setText("" + dadoA);
		txtB.setText("" + dadoB);
		txtC.setText("" + dadoC);
		stampaIcone(dadoA, dadoB, dadoC);

		if (dadoA == dadoB && dadoB == dadoC) {
			lblStampa.setText("TRIS!!!!");
		} else {
			if (dadoA == dadoB || dadoB == dadoC || dadoA == dadoC)
				lblStampa.setText("BIS!!!");
			else
				lblStampa.setText("Hai perso");
		}
	}

	private void btnLanciaFinoAlTrisActionPerformed(ActionEvent e) {
		int dadoA;
		int dadoB;
		int dadoC;
		int contatore = 0;
		do {
			dadoA = (int) (Math.random() * 6) + 1;
			dadoB = (int) (Math.random() * 6) + 1;
			dadoC = (int) (Math.random() * 6) + 1;
			txtA.setText("" + dadoA);
			txtB.setText("" + dadoB);
			txtC.setText("" + dadoC);
			stampaIcone(dadoA, dadoB, dadoC);

			contatore++;
			// } while (!(dadoA == dadoB && dadoB == dadoC));
		} while (dadoA != dadoB || dadoB != dadoC);
		lblStampa.setText("Hai fatto tris dopo " + contatore + " lanci");
	}

	private void btnLanciaFinoAlBisActionPerformed(ActionEvent e) {
		int dadoA;
		int dadoB;
		int dadoC;
		int contatore = 0;
		do {
			dadoA = (int) (Math.random() * 6) + 1;
			dadoB = (int) (Math.random() * 6) + 1;
			dadoC = (int) (Math.random() * 6) + 1;
			txtA.setText("" + dadoA);
			txtB.setText("" + dadoB);
			txtC.setText("" + dadoC);
			stampaIcone(dadoA, dadoB, dadoC);

			contatore++;
			// } while (!(dadoA == dadoB || dadoB == dadoC || dadoA == dadoC));
		} while (dadoA != dadoB && dadoB != dadoC && dadoA != dadoC);
		lblStampa.setText("Hai fatto bis dopo " + contatore + " lanci");
	}

	private void btnLanciaNVolteActionPerformed(ActionEvent e) {
		int n = 0;
		int contatore = 0;
		// n = Integer.valueOf(txtN.getText());
		try {
			n = Integer.parseInt(txtN.getText());
		} catch (NumberFormatException e1) {
			n = 0;
			txtN.setText("" + n);
		}
		for (int i = 0; i < n; i++) {
			int dadoA = (int) (Math.random() * 6) + 1;
			int dadoB = (int) (Math.random() * 6) + 1;
			int dadoC = (int) (Math.random() * 6) + 1;
			txtA.setText("" + dadoA);
			txtB.setText("" + dadoB);
			txtC.setText("" + dadoC);
			stampaIcone(dadoA, dadoB, dadoC);

			if (dadoA == dadoB && dadoB == dadoC)
				contatore++;
		}
		lblStampa.setText("n tris=" + contatore);
	}

	private void stampaIcone(int dadoA, int dadoB, int dadoC) {
		lblA.setIcon(new ImageIcon(Dado.class.getResource("/dado/" + dadoA + ".jpg")));
		lblB.setIcon(new ImageIcon(Dado.class.getResource("/dado/" + dadoB + ".jpg")));
		lblC.setIcon(new ImageIcon(Dado.class.getResource("/dado/" + dadoC + ".jpg")));
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}*/

	}
}
