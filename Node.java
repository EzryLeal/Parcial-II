// Clase Node: Representa cada elemento de la lista enlazada
public class Node {
    int data; // Valor del nodo
    Node next; // Referencia al siguiente nodo

    // Constructor para inicializar el nodo
    public Node(int data) {
        this.data = data;
        this.next = null; // Por defecto, no tiene siguiente nodo
    }
}
