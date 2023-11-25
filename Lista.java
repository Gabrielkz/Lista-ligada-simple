class Lista {
    private Node head;

    public Lista() {
        this.head = null;
    }
    // Método para insertar un nuevo nodo al principio de la lista
    
    public void insert(int key) {
        Node newNode = new Node(key);
        newNode.next = head;
        head = newNode;
    }
    // Método para mostrar los elementos de la lista

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.key + " ");
            current = current.next;
        }
        System.out.println();
    }
    // Método para buscar un nodo por el valor de su campo clave y devolver una referencia

    public Node searchByKey(int key) {
        Node current = head;
        while (current != null) {
            if (current.key == key) {
                return current;
            }
            current = current.next;
        }
        return null; // Nodo no encontrado
    }
    // Método para buscar un nodo por su campo clave e insertar un nuevo nodo después de él

    public void insertAfter(int key, int newKey) {
        Node current = searchByKey(key);
        if (current != null) {
            Node newNode = new Node(newKey);
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("Nodo con clave " + key + " no encontrado.");
        }
    }
    // Método para intercambiar un nodo por otro buscado

    public void swapNodes(int key1, int key2) {
        if (key1 == key2) {
            System.out.println("Las claves son iguales, no se puede intercambiar el mismo nodo.");
            return;
        }

        Node prev1 = null, curr1 = head;
        while (curr1 != null && curr1.key != key1) {
            prev1 = curr1;
            curr1 = curr1.next;
        }

        Node prev2 = null, curr2 = head;
        while (curr2 != null && curr2.key != key2) {
            prev2 = curr2;
            curr2 = curr2.next;
        }

        if (curr1 == null || curr2 == null) {
            System.out.println("Una o ambas claves no fueron encontradas.");
            return;
        }

        // Si el nodo 1 no es el primer nodo en la lista
        if (prev1 != null) {
            prev1.next = curr2;
        } else {
            head = curr2;
        }

        // Si el nodo 2 no es el primer nodo en la lista
        if (prev2 != null) {
            prev2.next = curr1;
        } else {
            head = curr1;
        }

        // Intercambiar los punteros next
        Node temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;
    }
}