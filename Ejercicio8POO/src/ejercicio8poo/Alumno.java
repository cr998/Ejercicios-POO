/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8poo;

/**
 *
 * @author Daniel
 */
public class Alumno extends Persona {

    private double nota;

    public Alumno(double nota, int edad) {
        super(edad);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nota=" + nota + '}';
    }

    public boolean asiste() {

        int falta = MetodosSueltos.generarNumero(0, 100);

        if (falta < 50) {
            return false;
        } else {
            return true;
        }
    }

}
