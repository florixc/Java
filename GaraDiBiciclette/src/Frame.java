
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Frame extends JFrame implements ActionListener {

    private int righe, colonne;
    private JButton btnAvviaGara;
    private Bici corsa[];
    private int numero;
    
    public Frame() {

        colonne = 1;
        

        numero = Integer.valueOf(JOptionPane.showInputDialog(this, "Inserisciil numero di ciclisti"));
        righe = numero;

        corsa = new Bici[numero];

        for (int i = 0; i < numero; i++) {
            JLabel lbl = new JLabel("Corridore " + i);
            lbl.setIcon(new ImageIcon(getClass().getResource("download.png")));
            lbl.setBounds(0, 100, 100, 100);
            add(lbl);

            Bici x = new Bici(lbl, 1500);
            corsa[i] = x;
            lbl.repaint();
        }

        //Aggiunge Graficamente il bottone
        btnAvviaGara = new JButton("AVVIA");
        add(btnAvviaGara);
        btnAvviaGara.addActionListener(this);

        //definisco cme si posizioneranno gli oggetti label sul frame
        setLayout(new GridLayout(righe + 1, colonne));
        //Occupa tutto lo schermo
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //sul click della x , termina il programma
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        for (int i = 0; i < numero; i++) {
            corsa[i].start();
        }

    }

}
