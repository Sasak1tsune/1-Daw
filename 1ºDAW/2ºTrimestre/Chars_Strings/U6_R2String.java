import java.util.Scanner;

public class U6_R2String{
    public static void main(String[]args) {
    //Defino variables

    Scanner entrada = new Scanner(System.in);
    byte seleccionMenu;
    boolean salirMenu=false;

    //Programa principal
    do{
        mostrarMenu();
        seleccionMenu= entrada.nextByte();
        switch(seleccionMenu){
            case 1:
                leng
                break;
            case 2:
                break;
            case 3:
                break;
            case 0:
                System.out.println("Seguro que quiere salir?\n(s/n)");
                char salida = entrada.next().charAt(0);
                confirmarSalida(salida);
                break;

            default:
                break;         
        }               
    }while(salirMenu==true);
    }
public static void mostrarMenu() {
    System.out.println("____________________________________________\n* Bienvenido pibe, selecciona algúna opción*\n*                                          *\n*    Opción 1: ____________________________*\n*    Opción 2: ____________________________*\n*    Opción 3: ____________________________*\n*__________________________________________*");
}
public static boolean confirmarSalida(char x){
    Character.toLowerCase(x);
    if(x=='s'){
        return true;
    }else{
        return false;
    }
}    
}
