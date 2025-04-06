import java.util.Scanner;

// Clase Main: Prueba interactiva de la lista enlazada
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int option;

        long num = 202200202;
        String  numString = String.valueOf(num);
        for (char c: numString.toCharArray()){
            list.add(Character.getNumericValue(c));

        }
        
        do {
            // Menú interactivo
            System.out.println("\n--- Menú de Lista Enlazada ---");
            System.out.println("1. Agregar al final");
            System.out.println("2. Agregar al inicio");
            System.out.println("3. Agregar en una posición específica");
            System.out.println("4. Eliminar un valor");
            System.out.println("5. Imprimir la lista");
            System.out.println("6. Revertir la lista");
            System.out.println("7. Buscar un valor en la lista");
            System.out.println("8. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingresa el valor a agregar: ");
                    int dataEnd = scanner.nextInt();
                    list.add(dataEnd);
                    System.out.println("valor agregado al final.");
                    break;

                case 2:
                    System.out.print("Ingresa el valor a agregar: ");
                    int dataStart = scanner.nextInt();
                    list.addFirst(dataStart);
                    System.out.println("Valor agregado al inicio.");
                    break;

                case 3:
                    System.out.print("Ingresa el valor a agregar: ");
                    int dataMiddle = scanner.nextInt();
                    System.out.print("Ingresa la posición: ");
                    int position = scanner.nextInt();
                    list.addMiddle(dataMiddle, position);
                    System.out.println("Valor agregado en la posición " + position + ".");
                    break;

                case 4:
                    System.out.print("Ingresa el valor a eliminar: ");
                    int dataRemove = scanner.nextInt();
                    list.remove(dataRemove);
                    System.out.println("valor eliminado.");
                    break;

                case 5:
                    System.out.println("Impresion de Lista:");
                    list.printList();
                    break;

                case 6:
                    list.reverse();
                    System.out.println("Lista revertida.");
                    break;

                case 7:
                    System.out.print("Ingresa el valor a buscar: ");
                    int dataSearch = scanner.nextInt();
                    boolean found = list.contains(dataSearch);
                    System.out.println("¿El valor está en la lista? " + found);
                    break;

                case 8:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (option != 8);

        scanner.close();
    }
}
