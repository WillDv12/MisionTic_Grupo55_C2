/*7. Crear un programa que solicite al usuario su nombre y una letra a buscar dentro de su nombre. 
El sistema debe mostrar un mensaje que indique la cantidad de caracteres que tiene su nombre y la 
cantidad de ocurrencias de la letra que ingresó. Ejemplo:
              Nombre: Alejandra
              Letra a buscar: a
              Cantidad de ocurrencias: 3
Importante: el sistema debe de contar la letra independiente de que se encuentre en mayúscula o 
minúscula. Puedes revisar la siguiente referencia:
https://www.delftstack.com/es/howto/java/count-characters-in-a-string-java/#:~:text=La%20pr%C3%A1ctica%20m%C3%A1s%20com%C3%BAn%20para,longitud%20total%20de%20esta%20cadena.
*/
package practice1.g55;
import java.util.Scanner;
/**
 *
 * @author Willian Diosa Valencia
 */
public class Exercise7 {
    Scanner scannerInstance = new Scanner(System.in);
    String name;
    char letter;
    int counter = 0 ;
    
    public void nameLetter() {
        
        // Solicita la informacion al usuario
        System.out.println("\n  Introduce tu nombre");
        name = scannerInstance.nextLine();
        System.out.println("\n  Introduce la letra a buscar");
        letter = scannerInstance.nextLine().charAt(0);
        
        // combierte String y caracter a minuscula
        
        name = name.toLowerCase();
        letter = Character.toLowerCase(letter);
        
        // a partir del ciclo for se recorre el String
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)== letter ){
            counter ++; // aumenta el contador con cada coincidencia
            }
        }
        if (counter != 0) {
            System.out.println("El caracter "+ "'" + letter + "'" + " se repite " + counter + " veces");
            }else{
            System.out.println("El caracter no se encuentra en este texto");
        }
    }
}

