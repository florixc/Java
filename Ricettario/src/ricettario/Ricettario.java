package ricettario;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class Ricettario {
	private ArrayList<Ricetta> listaRicette;
	private JFrame frame;
	private JTextField txtIdRicetta;
	private JTextField txtNome;
	private JTextField txtTempistica;
	private JTextField txtCategoria;
	private JTextArea txtIngredienti;
	private JTextArea txtProcedimento;
	private JTextArea txtStampa;
	private JButton btnSalva;
	private JButton btnAvanti;
	private JButton btnIndietro;
	private JButton btnStampa;
	private int iAttuale;
	private JButton btnCerca;
	private JButton btnSalvaStampa;
	private JButton btnApriStampa;
	private JButton btnStampaXML;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ricettario window = new Ricettario();
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
	public Ricettario() {
		listaRicette = new ArrayList<Ricetta>();
		iAttuale = 0;
		initialize();
		btnAvanti.setEnabled(false);
		btnIndietro.setEnabled(false);

		JButton btnCancella = new JButton("btnCancella");
		btnCancella.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCancellaActionPerformed(e);
			}
		});
		btnCancella.setBounds(142, 331, 89, 23);
		frame.getContentPane().add(btnCancella);

		btnCerca = new JButton("btnCerca");
		btnCerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCercaActionPerformed(e);
			}
		});
		btnCerca.setBounds(167, 36, 89, 23);
		frame.getContentPane().add(btnCerca);

		JButton btnRicettaCasuale = new JButton("btnRicettaCasuale");
		btnRicettaCasuale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnRicettaCasualeActionPerformed(e);
			}
		});
		btnRicettaCasuale.setBounds(282, 297, 159, 23);
		frame.getContentPane().add(btnRicettaCasuale);

		btnSalvaStampa = new JButton("btnSalvaStampa");
		btnSalvaStampa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSalvaStampaActionPerformed(e);
			}
		});
		btnSalvaStampa.setBounds(359, 378, 135, 23);
		frame.getContentPane().add(btnSalvaStampa);

		btnApriStampa = new JButton("btnApriStampa");
		btnApriStampa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnApriStampaActionPerformed(e);
			}
		});
		btnApriStampa.setBounds(228, 378, 121, 23);
		frame.getContentPane().add(btnApriStampa);
		
		btnStampaXML = new JButton("btnStampaXML");
		btnStampaXML.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStampaXMLActionPerformed(e);
			}
		});
		btnStampaXML.setBounds(20, 403, 121, 23);
		frame.getContentPane().add(btnStampaXML);

	}

	private void btnStampaXMLActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	private void btnApriStampaActionPerformed(ActionEvent e) {
		txtStampa.setText("");
		try {
			FileReader fileReader = new FileReader("Ricettario .txt");
			int data = fileReader.read();
			while (data != -1) {
				txtStampa.append("" + (char) data);
				data = fileReader.read();
			}
		} catch (IOException ex) {
			System.out.println("problemuccio");
		}
	}

	private void btnSalvaStampaActionPerformed(ActionEvent e) {
		// FileWriter fileWriter = new FileWriter("c:\\prova\\Ricettario.txt", true);
		try {
			FileWriter fileWriter = new FileWriter("Ricettario .txt", false);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.print(txtStampa.getText());
			printWriter.close();
			fileWriter.close();
		} catch (IOException ex) {
			System.out.println("problemuccio");
		}
	}

	private void btnRicettaCasualeActionPerformed(ActionEvent e) {
		iAttuale = (int) (Math.random() * listaRicette.size());
		caricaRicetta(iAttuale);
		abilitaAvantiIndietro(iAttuale);
		txtStampa.setText("Ricetta Casuale TROVATA!!!!");
	}

	private void btnCercaActionPerformed(ActionEvent e) {
		int idRicetta = Integer.parseInt(txtIdRicetta.getText());
		boolean trovato = false;
		for (int i = 0; i < listaRicette.size(); i++) {
			Ricetta ricetta = listaRicette.get(i);
			if (ricetta.getIdRicetta() == idRicetta) {
				trovato = true;
				iAttuale = i;
				break;
			}
		}
		if (trovato) {
			caricaRicetta(iAttuale);
			abilitaAvantiIndietro(iAttuale);
			txtStampa.setText("TROVATA!!!!");
		} else
			txtStampa.setText("Non TROVATA!!!!");

	}

	private void btnCancellaActionPerformed(ActionEvent e) {
		int i = 0;

		if (iAttuale > 0)
			i = iAttuale - 1;
		else if (listaRicette.size() > 0)
			i = iAttuale + 1;
		caricaRicetta(i);
		listaRicette.remove(iAttuale);
		txtStampa.setText("cancellato!");
		iAttuale = i;
		abilitaAvantiIndietro(i);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 551, 476);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("idRicetta");
		lblNewLabel.setBounds(20, 40, 67, 14);
		frame.getContentPane().add(lblNewLabel);

		txtIdRicetta = new JTextField();
		txtIdRicetta.setText("txtIdRicetta");
		txtIdRicetta.setBounds(97, 37, 60, 20);
		frame.getContentPane().add(txtIdRicetta);
		txtIdRicetta.setColumns(10);

		JLabel lblNome = new JLabel("nome");
		lblNome.setBounds(20, 68, 67, 14);
		frame.getContentPane().add(lblNome);

		txtNome = new JTextField();
		txtNome.setText("txtNome");
		txtNome.setColumns(10);
		txtNome.setBounds(97, 65, 86, 20);
		frame.getContentPane().add(txtNome);

		JLabel lblIngredienti = new JLabel("ingredienti");
		lblIngredienti.setBounds(20, 100, 67, 14);
		frame.getContentPane().add(lblIngredienti);

		txtIngredienti = new JTextArea();
		txtIngredienti.setText("txtIngredienti");
		txtIngredienti.setBounds(97, 96, 145, 39);
		frame.getContentPane().add(txtIngredienti);

		JLabel lblTempistica = new JLabel("tempistica");
		lblTempistica.setBounds(20, 149, 67, 14);
		frame.getContentPane().add(lblTempistica);

		txtTempistica = new JTextField();
		txtTempistica.setText("txtTempistica");
		txtTempistica.setColumns(10);
		txtTempistica.setBounds(97, 146, 86, 20);
		frame.getContentPane().add(txtTempistica);

		JLabel lblProcedimento = new JLabel("procedimento");
		lblProcedimento.setBounds(20, 191, 67, 14);
		frame.getContentPane().add(lblProcedimento);

		txtProcedimento = new JTextArea();
		txtProcedimento.setText("txtProcedimento");
		txtProcedimento.setBounds(97, 191, 145, 39);
		frame.getContentPane().add(txtProcedimento);

		JLabel lblCategoria = new JLabel("categoria");
		lblCategoria.setBounds(20, 247, 67, 14);
		frame.getContentPane().add(lblCategoria);

		txtCategoria = new JTextField();
		txtCategoria.setText("txtCategoria");
		txtCategoria.setColumns(10);
		txtCategoria.setBounds(97, 244, 86, 20);
		frame.getContentPane().add(txtCategoria);

		txtStampa = new JTextArea();
		txtStampa.setText("txtStampa");
		txtStampa.setBounds(282, 22, 221, 265);
		frame.getContentPane().add(txtStampa);
		/*
		 * JScrollPane scrollPane = new JScrollPane(txtStampa); frame.add(scrollPane);
		 * JPanel panel = new JPanel(); panel.add(scrollPane);
		 */

		JButton btnNuovo = new JButton("btnNuovo");
		btnNuovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNuovoActionPerformed(e);
			}
		});
		btnNuovo.setBounds(20, 297, 89, 23);
		frame.getContentPane().add(btnNuovo);

		btnSalva = new JButton("btnSalva");
		btnSalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSalvaActionPerformed(e);
			}
		});
		btnSalva.setBounds(119, 297, 89, 23);
		frame.getContentPane().add(btnSalva);

		btnAvanti = new JButton("btnAvanti");
		btnAvanti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAvantiActionPerformed(e);
			}
		});
		btnAvanti.setBounds(413, 331, 106, 23);
		frame.getContentPane().add(btnAvanti);

		btnIndietro = new JButton("btnIndietro");
		btnIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIndietroActionPerformed(e);
			}
		});
		btnIndietro.setBounds(270, 331, 106, 23);
		frame.getContentPane().add(btnIndietro);

		btnStampa = new JButton("btnStampa");
		btnStampa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStampaActionPerformed(e);
			}
		});
		btnStampa.setBounds(20, 331, 111, 23);
		frame.getContentPane().add(btnStampa);

		/*
		 * JScrollPane scrollPane = new JScrollPane(); scrollPane.setBounds(282, 133, 2,
		 * 2); frame.getContentPane().add(scrollPane);
		 */

	}

	private void caricaRicetta(int i) {
		Ricetta ricetta = listaRicette.get(i);
		txtIdRicetta.setText(ricetta.getIdRicetta() + "");
		txtNome.setText(ricetta.getNome());
		txtIngredienti.setText(ricetta.getIngredienti());
		txtTempistica.setText(ricetta.getTempistica() + "");
		txtProcedimento.setText(ricetta.getProcedimento());
		txtCategoria.setText(ricetta.getCategoria());
	}

	private void abilitaAvantiIndietro(int i) {
		btnAvanti.setEnabled(true);
		btnIndietro.setEnabled(true);
		if (i == listaRicette.size() - 1) {
			btnAvanti.setEnabled(false);
			btnIndietro.setEnabled(true);
		}
		if (i == 0) {
			btnAvanti.setEnabled(true);
			btnIndietro.setEnabled(false);
		}
		if (listaRicette.size() < 2) {
			btnAvanti.setEnabled(false);
			btnIndietro.setEnabled(false);
		}
	}

	private void btnIndietroActionPerformed(ActionEvent e) {
		iAttuale = iAttuale - 1;
		caricaRicetta(iAttuale);
		abilitaAvantiIndietro(iAttuale);

	}

	private void btnAvantiActionPerformed(ActionEvent e) {
		iAttuale = iAttuale + 1;
		caricaRicetta(iAttuale);
		abilitaAvantiIndietro(iAttuale);
	}

	private void btnStampaActionPerformed(ActionEvent e) {
		txtStampa.setText("lista completa\n");
		for (int i = 0; i < listaRicette.size(); i++) {
			Ricetta ricetta = listaRicette.get(i);
			txtStampa.append(ricetta.toString() + "\n");
		}
	}

	private void btnSalvaActionPerformed(ActionEvent e) {
		int idRicetta = Integer.parseInt(txtIdRicetta.getText());
		String nome = txtNome.getText();
		String ingredienti = txtIngredienti.getText();
		int tempistica = Integer.parseInt(txtTempistica.getText());
		String procedimento = txtProcedimento.getText();
		String categoria = txtCategoria.getText();
		Ricetta ricetta = new Ricetta(idRicetta, nome, ingredienti, tempistica, procedimento, categoria);
		listaRicette.add(ricetta);
		txtStampa.setText("salvata la nuova ricetta\n");
		txtStampa.append(ricetta.toString());
		iAttuale = listaRicette.size() - 1; // l'ultima ricetta inserita

		if (listaRicette.size() > 1) {
			btnAvanti.setEnabled(false);
			btnIndietro.setEnabled(true);
		}
	}

	private void btnNuovoActionPerformed(ActionEvent e) {
		txtIdRicetta.setText("");
		txtNome.setText("");
		txtIngredienti.setText("");
		txtTempistica.setText("");
		txtProcedimento.setText("");
		txtCategoria.setText("");

		txtStampa.setText("inserisci la nuova ricetta");
	}
}
