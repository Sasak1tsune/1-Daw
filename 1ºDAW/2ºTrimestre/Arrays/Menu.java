import java.util.Scanner;
public class Menu {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[]args){
        byte seleccionMenu;
        boolean salirMenu = false;
        //Programa principal
        do {
            mostrarMenu();
            seleccionMenu = entrada.nextByte();
            switch (seleccionMenu) {
                case 1:
                    System.out.println("");

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
    }
}
