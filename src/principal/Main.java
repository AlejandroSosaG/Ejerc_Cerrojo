package principal;

import java.awt.image.CropImageFilter;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here
        String respuesta;
        Cerrojo cerrojo = new Cerrojo();
        do {
            cerrojo.recorrido();
            System.out.println("¿Desea volver a introducir una combinación?");
            respuesta = s.next();
        } while (Objects.equals(respuesta, "Si") || Objects.equals(respuesta, "si") || Objects.equals(respuesta, "Sí") || Objects.equals(respuesta, "sí"));
    }
}