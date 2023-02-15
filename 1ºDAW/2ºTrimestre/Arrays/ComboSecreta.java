import java.util.Scanner;
import java.util.Arrays;

public class ComboSecreta {
    static Scanner entrada = new Scanner(System.in);
    final static String VERDE = "\u001B[32m";
    final static String RESET = "\u001B[0m";
    final static String ROJO = "\u001B[31m";
    public static void main(String[] args) {
        //Defino variables
        byte seleccionMenu;
        boolean salirMenu = false;

        //Programa principal
        do {
            mostrarMenu();
            seleccionMenu = entrada.nextByte();
            switch (seleccionMenu) {
                case 1:
                    System.out.println("");
                    numeroSecreto();
                    break;
                case 0:
                    System.out.println("Seguro que quiere salir?\n(s/n)");
                    char salida = entrada.next().charAt(0);
                    salirMenu = confirmarSalida(salida);
                    break;

                default:
                    break;
            }
        } while (salirMenu == false);
    }
    public static void mostrarMenu() {
        System.out.println("1.Numero Secreto\n0.Salir");
    }
    public static boolean confirmarSalida(char x) {
        Character.toLowerCase(x);
        if (x == 's') {
            return true;
        } else {
            return false;
        }
    }
    public static void numeroSecreto() {
        boolean esCorrecto = false;
        System.out.println("Inserte la cantidad de digitos deseada");
        int tamaño = entrada.nextInt();
        int tabla[];
        tabla = new int[tamaño];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int)(Math.random() * 5 + 1);
        }
        do {
            int intentos=1;
            System.out.println("\nDigite un número entre 1 y 5, luego presione enter");
            int adivinado[];
            adivinado = new int[tamaño];
            for (int i = 0; i < tabla.length;) {
                System.out.println("Inserte el Número Nº"+(i+1));
                adivinado[i] = entrada.nextInt();
                if (adivinado[i]<1 || adivinado[i]>5){
                    System.out.println("Número no valido, debe ser entre 1 y 5");
                }else{
                    i++;
                }
            }
            for (int i = 0; i < tabla.length; i++) {
                System.out.println("El número en la posición " + (i + 1) + " debería ser ");
                igual(tabla[i], adivinado[i]);
            }
            if (Arrays.equals(tabla, adivinado) == true) {
                System.out.println("felicidades");
                System.out.println("Ha empleado "+intentos+" intentos :)");
                esCorrecto = true;
            } else {
                System.out.println("Conbinación incorrecta, intentelo de nuevo");
            }
            intentos++;
        } while (esCorrecto == false);
    }
    public static void igual(int secreto, int solucion) {
        if (solucion < 1 || solucion > 5) {
            System.out.println(ROJO+"No valido"+RESET);
        } else {
            if (secreto == solucion) {
                System.out.println(VERDE+"Correcto"+RESET);
            } else if (solucion > secreto) {
                System.out.println(ROJO+"Menor"+RESET);
            } else {
                System.out.println(ROJO+"Mayor"+RESET);
            }
        }
    }
}