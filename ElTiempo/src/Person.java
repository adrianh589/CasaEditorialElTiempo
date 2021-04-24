public class Person {
    String nombre;
    String apellido;

    Person(String nombre, String apellido){
        setNombre(nombre);
        setApellido(apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void saludar(){
        if(getNombre()==null || getApellido()==null){
            System.out.println("¡Hola!");
        }else{
            System.out.println("¡Hola "+ getNombre() + " " + getApellido()+"!" );
        }
    }
}
