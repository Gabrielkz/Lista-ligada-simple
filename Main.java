public class Main {
    public static void main(String[] args) {
        Lista Lista = new Lista();

        Lista.insert(3); 
        Lista.insert(7);
        Lista.insert(1);
        Lista.insert(5);

        System.out.println("Lista original:");
        Lista.display();

        int searchKey = 1;
        Node foundNode = Lista.searchByKey(searchKey);
        System.out.println("Nodo con clave " + searchKey + " encontrado: " + (foundNode != null));

        int insertKey = 7;
        int newKey = 10;
        Lista.insertAfter(insertKey, newKey);
        System.out.println("Lista después de insertar " + newKey + " después de " + insertKey + ":");
        Lista.display();

        int key1 = 5;
        int key2 = 3;
        Lista.swapNodes(key1, key2);
        System.out.println("Lista después de intercambiar nodos con claves " + key1 + " y " + key2 + ":");
        Lista.display();
    }
}