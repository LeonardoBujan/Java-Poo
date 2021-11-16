/*
Crear un programa en java en el cual se pida al usuario ingresar su nombre, apellido, edad, hobbie, editor de código preferido, sistema operativo que utiliza, luego deberá mostrarse por consola los datos ingresados.
El programa deber ser subido a un repositorio de GitHub, pegar el link del ejercicio resuelto en el siguiente recuadro
 */

/**
 *
 * @author Leonardo
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private String hobbie;
    private String editorCodigo;
    private String sistemaOperativo;
    
    /* CONSTRUCTOR VACIO */
    public Usuario (){
        nombre = "";
        apellido = "";
        edad = 0;
        hobbie = "";
        editorCodigo = "";
        sistemaOperativo = "";
    }
    
    /* CONSTRUCTOR CON PARAMETROS */
    public Usuario (String nom, String ape, int ed, String hob, String edit, String sist){
        nombre = nom;
        apellido = ape;
        edad = ed;
        hobbie = hob;
        editorCodigo = edit;
        sistemaOperativo = sist;
    }
    
    /* METODOS SETTERS */
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido (String apellido){
        this.apellido = apellido;
    }
    
    public void setEdad (int edad){
        this.edad = edad;
    }
    
    public void setHobbie (String hobbie){
        this.hobbie = hobbie;
    }
    
    public void setEditorCodigo (String editorCodigo){
        this.editorCodigo = editorCodigo;
    }
    
    public void setSistemaOperativo (String sistemaOperativo){
        this.sistemaOperativo = sistemaOperativo;
    }
    
    /* METODOS GETTERS */
    public String getNombre (){
        return this.nombre;
    }
    
    public String getApellido (){
        return this.apellido;
    }
    
    public int getEdad (){
        return this.edad;
    }
    
    public String getHobbie (){
        return this.hobbie;
    }
    
    public String getEditorCodigo (){
        return this.editorCodigo;
    }
    
    public String getSistemaOperativo (){
        return this.sistemaOperativo;
    }
    
}
