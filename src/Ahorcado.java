import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase scanner para ingreso de datos del usuarios
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asginaciones
        String palabrSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos:
        char[] letrasAdivinadas = new char[palabrSecreta.length()];

        // Estructura de control: Iterativa (bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            // Lineas para completar la palabra
            letrasAdivinadas[i] = '_';
        }

        // Estructura de control: interactiva (bucle)
        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabrSecreta.length() + " Letras) ");
            System.out.println("Introduce una letra, por favor");

            // Uso de la clase scanner para solicitar una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Estructura de control: interactiva (bucle)
            for (int i = 0; i < palabrSecreta.length(); i++) {
                // Estructura de control condicional
                if (palabrSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabrSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades! has adivinado la palabra secreta: " + palabrSecreta);
            }
        }
        if (!palabraAdivinada) {
            System.out.println("¡Has fallado, te quedaste sin intentos! Game Over");
        }
        scanner.close();
    }
}
