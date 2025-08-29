import java.util.Scanner;

public class UtilidadesTexto {

    private static final Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    menu();
}

public static void menu() {
    int opcion;
    do {
        mostrarMenu();
        opcion = leerOpcion();

        switch(opcion) {
            case 1:
                verificarRevesDerecho();
                break;
            case 2:
                contarVocales();
                break;
            case 3:
                encriptarTexto();
                break;
            case 4:
                desencriptarTexto();
                break;
            case 5:
                System.out.println("Cerrando el programa.");
                break;
            default:
                System.out.println("Opcion no valida, por favor intente una vez más.");
        } while (opcion!=5);
        scanner.close();
    }
}

public static void mostrarMenu() {
    System.out.println("Menu Inicial");
    System.out.println("1. Verificar si una frase es Revés-Derecho.");
    System.out.println("2. Contar vocales en una frase.");
    System.out.println("3. Encriptar una frase.");
    System.out.println("4. Desencriptar una frase.");
    System.out.println("5. Salir.");
}

public static int leerOpcion() {
    System.out.println("Seleccione una opcion: ");
    int opcion = -1;
    try {
        opcion = scanner.nextInt();
        scanner.nextLine();
    } catch (Exception e) {
        System.out.println("Opcion invalida. Por favor ingresar un numero.");
        scanner.nextLine();
    } return opcion;
}

public static boolean verificarRevesDerecho() {
    System.out.println("Ingresa una frase para verificar: ");
    String fraseOriginal = scanner.nextLine();
    String fraseModificada = fraseOriginal.toLowerCase().replaceAll("\\s+", "");
    String fraseInvertida = new StringBuilder(fraseModificada).reverse().toString();

    if (fraseOriginal.equals(fraseInvertida)) {
        return true;
    } else return false;
}

public static int contarVocales() {
    System.out.println("Ingresa una frase para verificar: ");
    String frase =  scanner.nextLine().toLowerCase();

    int contadorVocales = 0;
    for (int i = 0; i < frase.length(); i++) {
        char letra = frase.charAt(i);
        if (letra == 'a' || letra == 'e'  || letra == 'i' || letra == 'o' || letra == 'u' ) {
            contadorVocales++;
        }
    }
    return contadorVocales;
}

public static void encriptarTexto() {}

public static void desencriptarTexto() {}

}
