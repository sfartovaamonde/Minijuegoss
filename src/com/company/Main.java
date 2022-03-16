package com.company;

import Jugador.Datos;
import MinijuegoTractor.Principal;

import javax.swing.*;

public class Main {
    //Introduccion

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, " MINIJUEGOS.SS ");


        JOptionPane.showMessageDialog(null, " Bienvenido Jugador! " + "\n" + " Este juego está dividido en 3 minijuegos," +
                " que son los siguientes :" + "\n" +
                " 1. Tractor " + "\n" + " 2. Snake " + "\n" + " 3. Tetris ");





        JOptionPane.showMessageDialog(null, " Ahora que sabe cual es cada juego, para iniciar el que usted desee," +
                " lo único que debe hacer es teclear el número que corresponde con el juego que quiere jugar " + "\n"
        );

        Menu m = new Menu();
        m.Menu();



        /*boolean salir = false;
        int opcion = 0;
        String s = "si";
        String n = "no";


            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(" Introduce la opción que desee "));

                switch (opcion) {

                    case 1:
                        JOptionPane.showMessageDialog(null, " Has seleccionado la opción 1 ");
                        Principal.PrimerMinijuego();

                    case 2:
                        JOptionPane.showMessageDialog(null, " Has seleccionado la opción 2 ");
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, " Has seleccionado la opción 3 ");
                        break;

                    case 4:

                        JOptionPane.showMessageDialog(null, " FIN DEL MINIJUEGO ");
                        System.exit(0);
                        salir = true;
                        break;


                    default:
                        JOptionPane.showMessageDialog(null, " Solo números entre el 1 y el 4 ");
                }

            } while (salir=false);


        }*/

    }
}

