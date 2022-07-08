/*6. Crear un programa que solicita al usuario la contraseña de su wifi, la cual es “ABC123”, 
sólo tendrá 3 intentos. Al 3 intento incorrecto, el sistema le mostrará un mensaje indicando 
que ha sido bloqueado. Si el ingreso es correcto, debe solicitarle identificar el número 
faltante en la sucesión que cumple con el siguiente patrón:
| 2 | 9 | 16 | 23 | 30 | 37 | 44 | Nuevamente solo contará con 3 intentos. 
Si el número ingresado es correcto, debe mostrar un mensaje de “Bienvenido al sistema”.*/
package practice1.g55;
import java.util.Scanner;

/**
 *
 * @author Willian Diosa Valencia
 */
public class Exercise6 {
    Scanner scannerInstance = new Scanner(System.in);
    private String wifiPassword;
    private String succession;
    private int numberAttempts = 1,numberAttempts2 = 1 ;

    public void VerifyWifiPasswordAndsuccession() {
        System.out.println("\n          CONECTARSE A LA RED WIFI");
        System.out.println("        Contraseña de la red: ");
        //Solicitamos el dato al usuario
        wifiPassword = scannerInstance.nextLine();
            
        //Validamos el dato ingresado
        while (numberAttempts < 3) {
            if (wifiPassword.equals("ABC123")) {
                System.out.println("Contraseña coincide");
                
                // Validacion de la susecion faltante
                System.out.println("\n          Identifique el numero faltante en la sucesion");
                System.out.println("        | 2 | 9 | 16 | 23 | 30 | 37 | 44 | ? | ");
                succession = scannerInstance.nextLine();
                
                while (numberAttempts2 < 3) {
                    if (succession.equals("51")) {
                        System.out.println("Bienvenido al sistema");
                        break;
                    } else {
                        System.out.println("        Numero incorrecto");
                        System.out.println("    Nuevo intento: ");
                        succession = scannerInstance.nextLine();
                        numberAttempts2++;
                        if(numberAttempts2 ==3){
                            System.out.println("Usuario bloqueado");
                        break;
                        }
                    }
                }
            break;
            } else {
                System.out.println("Contraseña incorrecta");
                System.out.println("        Nuevo intento: ");
                wifiPassword = scannerInstance.nextLine();
                numberAttempts++;
                if(numberAttempts ==3){
                    System.out.println("Usuario bloqueado");
                    break;
                }
            }
        }  
    }
}

