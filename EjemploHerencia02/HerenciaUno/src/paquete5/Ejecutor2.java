package paquete5;

import paquete4.EstudiantePresencial;

public class Ejecutor2 {
    public static void main(String[] args) {
        String nombre= "frank";
        String apellido = " Sarango";
        String identidad = "112354";
        int edad =  21;
        int numCreditos = 5;
        double costoCreditos = 30.00;

        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identidad, edad);
        estPresencial.calcularMatriculaPresencial();

        System.out.println(estPresencial);
    }
}
