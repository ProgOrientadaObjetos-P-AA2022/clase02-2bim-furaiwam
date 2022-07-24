package paquete4;

public class ejecutor2 {
    public static void main(String[] args) {
        String nombre= "frank";
        String apellido = " Sarango";
        String identificacion = "112354";
        int edad = 21;

        EstudiantePresencial estPrese = new EstudiantePresencial(
                nombre, apellido, identificacion, edad);

        estPrese.obtenerNumeroCreditos();
        estPrese.obtenerCostoCredito();
        estPrese.obtenerMatriculaPresencial();

        System.out.println(estPrese);
    }
}
