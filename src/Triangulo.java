/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gamep
 */
public class Triangulo extends FiguraGeometrica {

    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo(){

        super("Triangulo");

        punto1 = new Punto();
        punto2 = new Punto();
        punto3 = new Punto();

    }

    public Triangulo(Punto p1, Punto p2, Punto p3){

        super("Triangulo");

        punto1 = p1;
        punto2 = p2;
        punto3 = p3;

    }

    public Punto getPunto1(){
        return punto1;
    }

    public void setPunto1(Punto punto1){
        this.punto1 = punto1;
    }

    public Punto getPunto2(){
        return punto2;
    }

    public void setPunto2(Punto punto2){
        this.punto2 = punto2;
    }

    public Punto getPunto3(){
        return punto3;
    }

    public void setPunto3(Punto punto3){
        this.punto3 = punto3;
    }

    @Override
    public double calcularAreaFigura(){

        double base = punto1.calcularDistancia(punto2);

        double altura = punto1.calcularDistancia(punto3);

        return (base * altura) / 2;

    }

    @Override
    public boolean esRegular(){

        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        double lado3 = punto3.calcularDistancia(punto1);


        return lado1 == lado2 && lado2 == lado3;

    }

    @Override
    public String toString(){

        return "Triángulo: "
                + getNombre()
                + "\nPuntos: "
                + punto1.toString()
                + ", "
                + punto2.toString()
                + ", "
                + punto3.toString();

    }
}
