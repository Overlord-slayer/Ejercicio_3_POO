/**
 * Está clase, su función principal es poder dar una interacción amena con el
 * usuario.
 * 
 * @author Josúe Samuel Argueta Hernández
 */
public class Interaccion {

    public Interaccion() {

    }

    /**
     * Este metodo mostrará el menú de opciones del sistema.
     */
    public void menu() {
        System.out.println("Escoja la opcion que desa seguir\n");
        System.out.println("1. Aparcar Vehiculo");
        System.out.println("2. Crear nuevo parqueo");
        System.out.println("3. Datos estadisticos");
        System.out.println("4. Salir");
    }

    /**
     * La funcion de este metodo es dar la bienvenida la usuario.
     */
    public void bienvenida() {
        System.out.println("BENVENIDO/A AL SISTEMA DE APARCAMIENTO DE VEHICULOS");
    }

    /**
     * La funcion de este metodo es darle un adios al usuario, una vez haya
     * concluido su tarea.
     */
    public void despedida() {
        System.out.println("¡Muchas gracias por preferirnos nuestro sistema!, ¡Feliz Dia!");
    }

    public void opcion_invalida() {
        System.out.println("Debe ingresar un valor segun el menu");
    }

    public void valor_invalido() {
        System.out.println("Debe ingresar un numero");
    }
}
