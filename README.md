# assg2
assg2
MyList Interface
This is an interface that defines the basic methods for a list data structure. It has the following methods:

add(E element): Adds an element to the list.
get(int index): Returns the element at the specified index.
remove(int index): Removes the element at the specified index.
size(): Returns the size of the list.
MyArrayList Class
This class implements the MyList interface and provides an implementation of the list data structure using an array. It has the following methods:

add(E element): Adds an element to the end of the list. If the array is full, it creates a new array with double the size and copies the elements from the original array.
get(int index): Returns the element at the specified index. Throws an IndexOutOfBoundsException if the index is out of bounds.
remove(int index): Removes the element at the specified index and shifts all subsequent elements to the left by one position. Throws an IndexOutOfBoundsException if the index is out of bounds.
size(): Returns the size of the list.
MyLinkedList Class
This class implements the MyList interface and provides an implementation of the list data structure using a linked list. It has the following methods:

add(E element): Adds an element to the end of the list by creating a new node and updating the tail reference. If the list is empty, it sets both the head and tail references to the new node.
get(int index): Returns the element at the specified index by traversing the list from the head. Throws an IndexOutOfBoundsException if the index is out of bounds.
remove(int index): Removes the element at the specified index by traversing the list from the head or tail depending on which is closer to the index. Throws an IndexOutOfBoundsException if the index is out of bounds.
size(): Returns the size of the list.
