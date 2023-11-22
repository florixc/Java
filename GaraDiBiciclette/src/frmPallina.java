

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class frmPallina  extends JFrame implements ActionListener{
    JButton btnCreaPallina;
    JPanel pannello;
    public frmPallina() {
        
        getContentPane().setLayout(new BorderLayout());
        
        btnCreaPallina= new JButton("Crea la pallina");
        add(btnCreaPallina,BorderLayout.SOUTH);
        
        pannello = new JPanel();
        pannello.setBackground(Color.red);
        add(pannello,BorderLayout.CENTER);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
    
    
    }
      
}
