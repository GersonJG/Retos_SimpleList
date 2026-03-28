package umg.edu.gt.listasenlazadas.retos;

import umg.edu.gt.listasenlazadas.simple.SinglyLinkedList;

/**
 * Laboratorio de retos para obligar a extender el codigo base de las estructuras.
 *
 * Cada reto depende de un metodo nuevo que debe implementarse directamente
 * en la clase de estructura correspondiente.
 */
public final class LinkedListChallenges {

    private LinkedListChallenges() {
    }

    public static void run() {
        System.out.println("=== RETOS DE IMPLEMENTACION ===");
        challenge1CountOccurrences();
        System.out.println();
        challenge2Clean();
        System.out.println();
        challenge3ReverseInPlace();
        System.out.println();
        challenge4RemoveDuplicates();
        System.out.println();
    }

    private static void challenge1CountOccurrences() {
        SinglyLinkedList<String> eventos = new SinglyLinkedList<>();
        eventos.addLast("LOGIN");
        eventos.addLast("CLICK");
        eventos.addLast("LOGIN");
        eventos.addLast("SCROLL");
        eventos.addLast("LOGIN");

        System.out.println("Reto 1 - Analitica de eventos (lista simple)");
        System.out.println("Eventos: " + eventos);
        try {
            int totalLogins = eventos.countOccurrences("LOGIN");
            System.out.println("Resultado esperado para LOGIN: 3");
            System.out.println("Resultado obtenido: " + totalLogins);
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }
        
        eventos.clean();
        System.out.println("Eventos: " + eventos + " size: " + eventos.size());
        
        System.out.println();
    }
    
    private static void challenge2Clean() {
        SinglyLinkedList<String> eventos = new SinglyLinkedList<>();
        eventos.addLast("LOGIN");
        eventos.addLast("CLICK");
        eventos.addLast("SCROLL");

        System.out.println("Reto 2 - Limpiar lista");
        System.out.println("Antes: " + eventos + " size: " + eventos.size());
        int eliminados = eventos.clean();
        System.out.println("Nodos eliminados: " + eliminados);
        System.out.println("Despues: " + eventos + " size: " + eventos.size());
    }

    private static void challenge3ReverseInPlace() {
        SinglyLinkedList<Integer> numeros = new SinglyLinkedList<>();
        numeros.addLast(2);
        numeros.addLast(4);
        numeros.addLast(5);
        numeros.addLast(6);

        System.out.println("Reto 3 - Invertir lista");
        System.out.println("Antes: " + numeros);
        numeros.reverseInPlace();
        System.out.println("Despues: " + numeros);
        System.out.println("Resultado esperado: [6, 5, 4, 2]");
    }

    private static void challenge4RemoveDuplicates() {
        SinglyLinkedList<String> letras = new SinglyLinkedList<>();
        letras.addLast("A");
        letras.addLast("B");
        letras.addLast("A");
        letras.addLast("C");
        letras.addLast("B");
        letras.addLast("D");

        System.out.println("Reto 4 - Eliminar duplicados");
        System.out.println("Antes: " + letras);
        int duplicados = letras.removeDuplicates();
        System.out.println("Duplicados eliminados: " + duplicados);
        System.out.println("Despues: " + letras);
        System.out.println("Resultado esperado: [A, B, C, D]");
    }


}
