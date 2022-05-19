package generations.colecciones;

import java.util.*;

public class Colecciones {
    public static void main(String[] args) {
        //List - ArrayLIst
        //Picoparentesis < >
        List<String> miArray = new ArrayList<String>();

        //Agregar elementos
        miArray.add("Pedro");
        miArray.add("Yair");
        miArray.add("Maria");
        miArray.add(1, "Raul");

        System.out.println(miArray);
        System.out.println(miArray.size());

        //Eliminar elementos --> index o contenido
        String elemento = miArray.remove(1);
        miArray.remove("Maria");
        System.out.println(elemento);

        imprimir(miArray);

        /* TIPOS COMPUESTOS WRAPPERS -->La diferencia es que nos
        permite acceder a los metodos de la clase
         * int ==> Integer
         * boolean ==> Boolean
         * long ==> Long
         * double ==> Double
         */

        int num1 = 10;
        Integer num2 = 10;

        System.out.println(num2.getClass());

        List<Integer> miArray2 = new ArrayList<Integer>();
        miArray2.add(3);
        miArray2.add(32136546);
        miArray2.add(456);

        imprimir(miArray2);



        /* SETS
        NO acepta elementos ducplicados
        NO los guarda en un orden especifico
        La coleccion que funciona mas rapido
         */
        System.out.println("\t Set -- HashSet");
        Set<String> miSet = new HashSet<String>();
        miSet.add("Martha");
        miSet.add("Martha");
        miSet.add("Lupe");
        miSet.add("Juan");
        miSet.add("Juan");

        System.out.println(miSet);

        imprimir(miSet);

        System.out.println(miSet.contains("Juan"));

        /* MAP -- HASHMAP -- INDICE --> DICCIONARIO
         * <KEY/llave, VALUE/valor>
         * El valor de las llaves no se puede repetir
         */

        System.out.println("\t MAP -- HASHMAP -- INDICE");

        Map<String, Integer> miMap = new HashMap<String, Integer>();
        // Agregar valores
        miMap.put("Valor 1", 789);
        miMap.put("Valor 2", 780);
        miMap.put("Valor 3", 500);
        miMap.put("Valor 4", 10);

        System.out.println(miMap);
        System.out.println(miMap.values());
        System.out.println(miMap.keySet());

        // BUscar por llave
        System.out.println(miMap.get("Valor 1"));

        for(String llave : miMap.keySet()){
            System.out.println(llave + " : " + miMap.get(llave));
        }



    }

    // Imprimir los elementos de una coleccion
    public static void imprimir(Collection coleccion){
        for(Object elemento : coleccion){
            System.out.println("Elemento --> " + elemento);
        }
    }
}
