/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gamep
 */
public class Punto {

    private int coordenada_x;
    private int coordenada_y;


    public Punto() {
        coordenada_x = 0;
        coordenada_y = 0;
    }


    public Punto(int x, int y) {
        coordenada_x = x;
        coordenada_y = y;
    }


    public int getCoordenadaX() {
        return coordenada_x;
    }


    public void setCoordenadaX(int x) {
        coordenada_x = x;
    }


    public int getCoordenadaY() {
        return coordenada_y;
    }


    public void setCoordenadaY(int y) {
        coordenada_y = y;
    }

    public double calcularDistancia() {

        return Math.sqrt(
                Math.pow(coordenada_x,2)
                +
                Math.pow(coordenada_y,2)
        );

    }

    public double calcularDistancia(Punto otroPunto){

        return Math.sqrt(
                Math.pow(otroPunto.coordenada_x - coordenada_x,2)
                +
                Math.pow(otroPunto.coordenada_y - coordenada_y,2)
        );

    }

    @Override
    public String toString(){

        return "El punto tiene las siguientes coordenadas: ("
                + coordenada_x + "," + coordenada_y + ")";

    }

}
