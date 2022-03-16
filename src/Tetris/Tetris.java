package Tetris;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Tetris extends JFrame {

    JLabel barraDeEstado;


    public Tetris() {
        
        public static void SegundoMinijuego(){
        
        JFrame ventana = new JFrame("Tetris"); // Creo una ventana llamada jueguito
        Juego jueguito = new Juego(); // Creo un objeto llamado jueguito
        ventana.add(jueguito); // Añadimos a la ventana el juego
        ventana.setSize(1300,400); // Establecemos un tamaño
         juego.setLocationRelativeTo(null);
         juego.setVisible(true);
        barraDeEstado = new JLabel(" 0");
        add(barraDeEstado, BorderLayout.SOUTH);
        tablero tablero = new tablero(this);
        add(tablero);
        tablero.empezar();

        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public JLabel getBarraDeEstado() {
            return barraDeEstado;
            
        }
    }
}

