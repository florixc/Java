

import javax.swing.JLabel;


public class Bici extends Thread{
    private JLabel lbl;
    private int lung;
    
    public Bici(JLabel lb, int lunghezza) {
        lbl = lb;
        lung = lunghezza ;
    }

    @Override
    public void run() {
        int a=lbl.getBounds().x;
        int velocita= (int) (Math.random()*40+10);
        
        while(lbl.getBounds().x < lung){
            try {
                sleep(velocita);
                a=lbl.getBounds().x+1;
                lbl.setBounds(a, lbl.getBounds().y, lbl.getWidth(), lbl.getHeight() );
                if(lbl.getBounds().x %100 ==0  ) velocita= (int) (Math.random()*40+10);
            } catch (Exception ex) {
                System.out.println("errore");    
            }
        }
        System.out.println("Il " + lbl.getText() + " e' arrivato al traguardo");
    }
    
    
    
    
}
