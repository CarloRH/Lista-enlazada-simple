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
        eventos.addLast("LOGIN");
        eventos.addLast("SCROLL");
        eventos.addLast("LOGIN");
 
        System.out.println("Reto 2 - Limpiar lista completa");
        System.out.println("Lista antes de limpiar: " + eventos + " | size: " + eventos.size());
        try {
            int eliminados = eventos.clean();
            System.out.println("Resultado esperado - nodos eliminados: 5 | lista vacia: []  | size: 0");
            System.out.println("Resultado obtenido - nodos eliminados: " + eliminados
                    + " | lista vacia: " + eventos + " | size: " + eventos.size());
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private static void challenge4RemoveDuplicates() {
        SinglyLinkedList<String> letras = new SinglyLinkedList<>();
        letras.addLast("A");
        letras.addLast("B");
        letras.addLast("A");
        letras.addLast("C");
        letras.addLast("B");
        letras.addLast("D");
 
        System.out.println("Reto 4 - Eliminar duplicados conservando primera aparicion");
        System.out.println("Lista antes de eliminar duplicados: " + letras);
        try {
            int duplicados = letras.removeDuplicates();
            System.out.println("Resultado esperado - duplicados eliminados: 2 | lista: [A, B, C, D]");
            System.out.println("Resultado obtenido - duplicados eliminados: " + duplicados
                    + " | lista: " + letras);
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    
    
}
