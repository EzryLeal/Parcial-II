// Clase LinkedList: Contiene métodos para gestionar la lista enlazada
public class LinkedList {
    Node head; // Referencia al primer nodo de la lista

    // Constructor para inicializar una lista vacía
    public LinkedList() {
        this.head = null;
    }

    // Método para agregar un nodo al final de la lista
    public void add(int data) {
        Node newNode = new Node(data); // Crear un nuevo nodo
        if (head == null) {
            head = newNode; // Si la lista está vacía, el nuevo nodo es la cabeza
        } else {
            Node current = head;
            while (current.next != null) { // Recorrer la lista hasta el último nodo
                current = current.next;
            }
            current.next = newNode; // Agregar el nuevo nodo al final
        }
    }

    // Método para agregar un nodo al inicio de la lista
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // El nuevo nodo apunta a la antigua cabeza
        head = newNode; // El nuevo nodo se convierte en la cabeza
    }

    // Método para agregar un nodo en una posición específica
    public void addMiddle(int data, int position) {
        Node newNode = new Node(data);
        if (head == null || position <= 0) { // Si la posición es inválida, agregar al inicio
            addFirst(data);
            return;
        }

        Node current = head;
        int count = 0;

        while (current != null && count < position - 1) { // Moverse a la posición deseada
            current = current.next;
            count++;
        }

        if (current != null) {
            newNode.next = current.next; // Insertar el nuevo nodo
            current.next = newNode;
        }
    }

    // Método para eliminar un nodo con un valor específico
    public void remove(int data) {
        if (head == null) return; // Si la lista está vacía, no hacer nada

        if (head.data == data) { // Si el nodo a eliminar es la cabeza
            head = head.next; // Cambiar la cabeza
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next; // Recorrer hasta encontrar el nodo
        }

        if (current.next != null) {
            current.next = current.next.next; // Saltar el nodo eliminado
        }
    }

    // Método para imprimir los valores de la lista
    public void printList() {
        Node current = head;
        while (current != null) { // Recorrer y mostrar cada nodo
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Final");
    }

    // Método para invertir el orden de la lista
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Guardar referencia al siguiente nodo
            current.next = prev; // Cambiar la dirección del enlace
            prev = current; // Mover prev hacia adelante
            current = next; // Mover current hacia adelante
        }
        head = prev; // La nueva cabeza será el último nodo original
    }

    // Método para verificar si un valor está en la lista
    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) { // Comparar cada nodo
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
