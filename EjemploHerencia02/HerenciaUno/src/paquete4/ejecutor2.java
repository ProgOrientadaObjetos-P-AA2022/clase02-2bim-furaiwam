package paquete4;

public class ejecutor2 {
    public static void main(String[] args) {
        String nombre= "frank";
        String apellido = " Sarango";
        String identidad = "112354";
        int edad = 21;

        EstudiantePresencial est = new EstudiantePresencial(nombre,apellido, identidad, edad, numCreditos, costoCreditos);

        est.obtenerNumeroCreditos();
        est.obtenerCostoCredito();
        est.obtenerMatriculaPresencial();

        System.out.println(est);
    }
}
