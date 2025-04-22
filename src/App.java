
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26),

        };

        ViewConsole v = new ViewConsole();
        v.printPersonsArray(personas);
        System.out.println("Arreglo ordenado: ");
        PersonaController ordenar = new PersonaController();
        ordenar.ordenarPorEdad(personas);
        v.printPersonsArray(personas);

        PersonaController pC = new PersonaController();
        pC.buscarPorEdad(personas, 29);
        System.out.println("Edad encontrada");



        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    }
}
