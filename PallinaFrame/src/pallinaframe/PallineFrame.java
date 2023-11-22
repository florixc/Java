package pallinaframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class PallineFrame extends JFrame implements ActionListener {

    private final static int LARGHEZZA = 600;
    private final static int ALTEZZA = 400;
    private final static int DIAMETRO_PALLINA = 50;
    private final static int VELOCITA_PALLINA = 10;
    private final static int NUMERO_PALLINE = 3;

    private JPanel pannello;
    private ArrayList<Pallina> palline;
    private JButton[] bottoni;

    public PallineFrame() {
        super("Palline");

        // Creazione del pannello
        pannello = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Pallina p : palline) {
                    g.setColor(p.getColore());
                    g.fillOval(p.getX(), p.getY(), DIAMETRO_PALLINA, DIAMETRO_PALLINA);
                }
            }
        };
        pannello.setPreferredSize(new Dimension(LARGHEZZA, ALTEZZA));
        add(pannello, BorderLayout.CENTER);

        // Creazione dei bottoni
        bottoni = new JButton[NUMERO_PALLINE];
        for (int i = 0; i < NUMERO_PALLINE; i++) {
            bottoni[i] = new JButton("Pallina " + (i + 1));
            bottoni[i].addActionListener(this);
        }

        // Aggiunta dei bottoni al pannello dei controlli
        JPanel controlli = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        for (JButton b : bottoni) {
            controlli.add(b);
        }
        add(controlli, BorderLayout.SOUTH);

        // Inizializzazione delle palline
        palline = new ArrayList<>();
        for (int i = 0; i < NUMERO_PALLINE; i++) {
            int y = new Random().nextInt(ALTEZZA - DIAMETRO_PALLINA);
            Color colore = new Color(new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256));
            //palline.add(new Pallina(colore, LARGHEZZA - DIAMETRO_PALLINA, y));
            palline.add(new Pallina());
        }

        // Impostazione delle dimensioni della finestra
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < NUMERO_PALLINE; i++) {
            if (e.getSource() == bottoni[i]) {
                if (palline.get(i).isInMovimento()) {
                    palline.get(i).stop();
                } else {
                    palline.get(i).start();
                }
                break;
            }
        }
    }


    public class Pallina extends Thread {

        private static final int DIAMETRO_PALLINA = 30;
        private static final int VELOCITA_PALLINA = 20;
        private static final int LARGHEZZA = 500;
        private static final int ALTEZZA = 400;

        private int x;
        private int y;
        private int dx;
        private Color colore;
        private boolean inMovimento;

        public Pallina() {
            x = LARGHEZZA - DIAMETRO_PALLINA;
            y = (int) (Math.random() * (ALTEZZA - DIAMETRO_PALLINA));
            dx = -2;
            colore = new Color((int) (Math.random() * 0x1000000));
            inMovimento = false;
        }

        public void avviaMovimento() {
            if (!inMovimento) {
                start();
            }
        }

        public void fermaMovimento() {
            inMovimento = false;
        }

        public Color getColore() {
            return colore;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public boolean isInMovimento() {
            return inMovimento;
        }

        public void run() {
            inMovimento = true;
            while (inMovimento) {
                x += dx;

                // Controllo dei bordi
                if (x <= 0 || x >= LARGHEZZA - DIAMETRO_PALLINA) {
                    dx = -dx;
                }

                // Ridisegno la finestra
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        pannello.repaint();
                    }
                });

                try {
                    Thread.sleep(VELOCITA_PALLINA);
                } catch (InterruptedException ex) {
                }
            }
        }

    }

    public static void main(String[] args) {
        new PallineFrame();
    }
}
