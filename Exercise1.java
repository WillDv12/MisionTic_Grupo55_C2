/*
1. Solicitarle al usuario nombre, género y edad. 
El programa debe identificar si es hombre o mujer mayor de edad.
 */
package practice1.g55;
//. 1 Libreria para solicitar por teclado
import java.util.Scanner;

/**
 *
 * @author Willian Diosa Valencia
 */
public class Exercise1 {
    //2. Crear una instancia de la libreria Scanner
    Scanner scannerInstance = new Scanner(System.in);
    //3. Definir las variables de la clase
    private String userName;
    private char gender;
    private int age;
    
    //4. Crear el metodo que solicita los datos al usuario y valida
    public void requestUserInformation(){
        System.out.println("        INFORMACION PERSONAL");
        System.out.println("    NOMBRE: ");
        userName = scannerInstance.next();
        System.out.println("    GENERO: M. Masculino F. Femenino O. Otro");
        gender = scannerInstance.next().charAt(0);
        System.out.println("    EDAD: ");
        age = scannerInstance.nextInt();
        /*
        FEMENINO
        .next() captura FEMENINO
        |F|E|M|E|N|I|N|O| Cantidad de caracteres = 8
        |0|1|2|3|4|5|6|7| .chartAt(0) = "F"
        next().chartAt(4) = "N"     captura letra
        */
        System.out.println("El usuario ingreso la siguiente informacion: " + "\nNombre: " + userName + "\nGenero: " + gender + "\nEdad: " +age );
        
        // 5. iniciamops el bloque condicional
       if (age >= 18 ){
            //Mayor de edad
            // or en python, || en java
            // and en python, && en java
           if (gender == 'f' || gender == 'F'){
               System.out.println(userName + ", Mujer mayor de edad");
           } else if (gender == 'm' || gender == 'M'){
               System.out.println(userName + ", Hombre mayor de edad");
           } else if (gender == 'o' || gender == 'O'){
               System.out.println(userName + ", Otro genero mayor de edad");
           } else {
               //Escenario de error
               System.out.println("Genero seleccionado no existe");
           }
               
       }else{
            //Menor de edad
            //Escenario de error
            if(gender != 'f' && gender != 'F' && gender != 'm' && gender != 'M' && gender != 'o' && gender != 'O'){
                System.out.println("Género seleccionado no existe.");
            }else if(gender == 'f' || gender == 'F'){
                System.out.println(userName + ", mujer menor de edad");
            }else if(gender == 'm' || gender == 'M'){
                System.out.println(userName + ", hombre menor de edad");
            }else{
                System.out.println(userName + ", otro género menor de edad");
            }
        }
    }
}

