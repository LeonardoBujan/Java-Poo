/**
 *
 * @author Leonardo Buján
 */

/* Programa Java para leer datos de varios tipos usando la clase Scanner */
import java.util.Scanner;

public class UsuarioMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Declaración de variables para capturar el ingreso de datos desde el teclado */
        String nombre;
        String apellido;
        int edad;
        String hobbie;
        String editCodigo;
        String sistOperat;
        
        Scanner sc = new Scanner (System.in);
        Usuario persona = new Usuario();
        
        /* Solicitar el ingreso de datos por teclado */
        System.out.println("Ingresa tu nombre:");        
        nombre = sc.nextLine();
        
        System.out.println("Ingresa tu apellido:");
        apellido = sc.nextLine();
        
        System.out.println("Ingresa tu edad:");
        edad = sc.nextInt();
        
        System.out.println("Ingresa tu hobbie:");
        hobbie = sc.next();
        
        System.out.println("Ingresa tu editor de código preferido:");
        editCodigo = sc.next();
        
        System.out.println("Ingresa el Sistema Operativo que usas:");
        sistOperat = sc.next();
        
        sc.close();
        
        /* Setear los datos ingresados a cada atributo de la clase Usuario */
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setEdad(edad);
        persona.setHobbie(hobbie);
        persona.setEditorCodigo(editCodigo);
        persona.setSistemaOperativo(sistOperat);
        
        /* Mostrar por consola los datos ingresados */
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad() + " años");
        System.out.println("Hobbie: " + persona.getHobbie());
        System.out.println("Editor de código preferido: " + persona.getEditorCodigo());
        System.out.println("Sistema Operativo: " + persona.getSistemaOperativo());
    }    
}
