/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gamep
 */
public class SuperficiePlana {

    private FiguraGeometrica figura;

    public SuperficiePlana(FiguraGeometrica figura) {
        this.figura = figura;
    }

    public double calcularAreaSuperficie() {
        return figura.calcularAreaFigura();
    }

    public void mostrarInformacion() {
        System.out.println("Figura: " + figura.getNombre());
        System.out.println("Área: " + calcularAreaSuperficie());
    }
}
