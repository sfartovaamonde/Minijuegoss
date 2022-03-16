package com.company;

import MinijuegoTractor.Principal;
import Tetris.Tetris;

import javax.swing.*;

public class Menu {
    boolean salir = false;
    int opcion = 0;
    String s = "si";
    String n = "no";

    public void Menu(){
        JOptionPane.showMessageDialog(null, " El menú tiene 4 opciones : " + " Las tres primeras son para los minijuegos correspondientes y" +
                " la cuarta opción es para salir del juego " + "\n" + "\n" + " Opción 1" + "\n" + "Opción 2 " + "\n" + "Opción 3" + "\n" + "Opción 4");
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(" Introduce la opción que desee "));


            switch (opcion) {

                case 1:
                    JOptionPane.showMessageDialog(null, " Has seleccionado la opción 1 ");
                    Principal.PrimerMinijuego();
                    break;


                case 2:
                    JOptionPane.showMessageDialog(null, " Has seleccionado la opción 2 ");



                case 3:
                    JOptionPane.showMessageDialog(null, " Has seleccionado la opción 3 ");
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, " FIN DEL MINIJUEGO ");
                    salir = true;
                    System.exit(0);
                    break;


                case 5:

                    break;


                default:
                    JOptionPane.showMessageDialog(null, " Solo números entre el 1 y el 4 ");
            }

        } while (salir ==false);
    }
}
