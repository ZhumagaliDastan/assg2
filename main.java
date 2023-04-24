// Define the MyList interface
public interface MyList<E> {
    void add(E element);
    E get(int index);
    void remove(int index);
    int size();
    // any other methods specified by the List interface
}

// Define the MyArrayList class that implements the MyList interface
public class MyArrayList<E> implements MyList<E> {
    private Object[] elements;
    private int size;

    // Constructor initializes the elements array with initial capacity of 10
    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    @Override
    public void add(E element) {
        // If the size of the array is not large enough, create a new array with double the size
        if (size == elements.length) {
            Object[] newElements = new Object[size * 2];
            // Copy over the elements from the original array
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        // Add the new element to the end of the array
        elements[size] = element;
        size++;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        // Shift all subsequent elements to the left by one position
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        // Set the last element to null and decrement the size variable
        elements[size - 1] = null;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    // Implement any other methods specified by the List interface
}

// Define the MyLinkedList class that implements the MyList interface
public class MyLinkedList<E> implements MyList<E> {
    private Node head;
    private Node tail;
    private int size;

    // Define the Node inner class
    private class Node {
        E element;
        Node next;
        Node prev;

        Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    // Constructor initializes the head and tail references to null
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void add(E element) {
        Node newNode = new Node(element, null, tail);
        // If the list is empty, set both the head and tail references to the new node
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        // Update the tail reference to the new node and increment the size variable
        tail = newNode;
        size++;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node currentNode;
        }}
        // Traverse the list from the head if the}
