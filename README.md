# Parcial-II
## Segundo Examen Parcial
## Introduccion al Proyecto Listas Enlazadas en Java
La estructura del proyecto incluye 3 archivos:
## Node.java Este almacena las clases para los nodos definiendo la estrutura de la lista
  ‎```in data: permite dar un valor al nodo‎```
  Node next: da paso al siguiente nodo
  this.next = null: finaliza la lista ya que no hay mas valores o nodos por presentar
## LinkedList.java Este contiene las clases que manejan las listas enlazadas
Contando con una serie de selecciones desde el archivo Main.java las cuales estan estructuradas en el archivo LinkedList.java tenemos
  list.add: Permite el ingreso de un valor al final de la fila
  list.addFirst: Permite el ingreso de un valor al inicio de la fila
  list.addMiddle: Permite el ingreso de un valor en cualquier posicion especifica de la lista
  list.remove: Permite remover o eliminar un valor especifico de la lista
  list.printList: Imprime la lista para poder visualizar su estado actual
  list.reverse: Esta revierte la lista iniciando por el final y finalizando por donde antes era el inicio
## Main.java Seria nuestro programa principar para poder correr en la consola, en cual permite la interaccion de usuario consola.
## Ejecucion:
Primero se compila informacion de Node.java, asi luego LinkedList.java pasa la informacion para poder finalizar en Main.java, permitiendo la ejecucion en este ultimo para la interaccion.
Proposito.
Mostrar como se contruye y manejan listas enlazadas, permitiendo al usuario interactuar, contando con una lista pre existente, y con el menu dinamico modificar y editar tal lista.
## Ejemplo del uso de la consola
En el archivo Main encontraremos long num = ....
estos numero pueden ser editados, esto para inciar con una lista fija.
Opcion 5, mostramos la lista para visualizarla y poder iniciar la modificacion
Opcion 1, 2 o 3: Estas nos dan la opcion de agregar al inicio, final o el lugar que deseemos en la lista de la consola.
Opcion 4: Permitira eliminar un valor (El primer valor de la lista) que eligamos de numeracion
Opcion 6: Revierte la lista dando vuelta a que el final ahora sera el inicio
Opcion 7: Si no sabemos si en nuestra lista ya ingresamos un valor, lo podemos buscar y dara True si se encuentra en la lista y False si no se encuentra ese valor en la lista
Opcion 8: Permite el salir del programa y finalizar.
