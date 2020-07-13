

import java.awt.EventQueue;
import javax.swing.JFrame;


public class Pacman extends JFrame {
 
        
    public Pacman() {
        
        initUI();
     
       

    }
    
    private void initUI() {
        
        add(new Tablero());
        
        setTitle("Pacman???");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setResizable(false); //para "anular" el boton de maximizar
        setLocationRelativeTo(null);





    }
   
     

  

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            Pacman ex = new Pacman();

            ex.setVisible(true);

  
        });
   }
  }

  