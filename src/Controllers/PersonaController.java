package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserscion .
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] personas) {
        for (int i=0;i<personas.length;i++){
            Persona aux=personas[i];
            int j=i-1;
            while (j>0 && personas[j].getEdad()>aux.getEdad()) {
                personas[j+1]=personas[j];
                j--;
            }

        }
        

    }

    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
    public int buscarPorEdad(Persona[] personas, int edad) {
        int bajo=0;
        int alto=personas.length-1;
        while (bajo<alto) {
            int central=(bajo+alto)/2;
            int edadmedio=personas[central].getEdad();
            if(edadmedio==edad){
                return central;
            }else if (edad<edadmedio){
                alto=central-1;
                
            }else{
                bajo=central+1;
            }
            
            
        }
        return -1;
    }
}
