package principal;

import java.util.Objects;
import java.util.Scanner;

public class Cerrojo {
    public static Scanner s = new Scanner(System.in);
    public int[] cerrojo = new int[]{0,0,0};
    public void recorrido() {
        int[] cerrojo = this.cerrojo;
        int cont = 0;
        System.out.println("¿Cual es la combianción de tres números del cerrojo?");
        System.out.println("Primer dígito:");
        int num = s.nextInt();
        if (num == this.cerrojo[0]) cont += 1;
        System.out.println("Segundo dígito");
        num = s.nextInt();
        if (num == this.cerrojo[1]) cont += 1;
        System.out.println("Tercer dígito:");
        num = s.nextInt();
        if (num == this.cerrojo[2]) cont += 1;
        if (cont == 3) {
            System.out.println("Cerradura abierta");
            System.out.println("¿Desea cambiar la combinación?");
            String respuesta = s.next();
            if (Objects.equals(respuesta, "Si") || Objects.equals(respuesta, "si") || Objects.equals(respuesta, "Sí") || Objects.equals(respuesta, "sí")) {
                cambiarCombinacion();
            }
        } else System.out.println("La combinación no es correcta");
    }

    public void cambiarCombinacion() {
        System.out.println("Escriba el primer dígito de la nueva combinación");
        int num = s.nextInt();
        this.cerrojo[0] = num;
        System.out.println("Escriba el segundo dígito de la nueva combinación");
        num = s.nextInt();
        this.cerrojo[1] = num;
        System.out.println("Escriba el tercer dígito de la nueva combinación");
        num = s.nextInt();
        this.cerrojo[2] = num;
        System.out.println("Combinación cambiada");
    }
}
