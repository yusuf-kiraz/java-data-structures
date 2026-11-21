# Java Data Structures

From-scratch implementations of fundamental linear data structures in Java, built without relying on `java.util` collection classes.

## Implemented Structures

| Data Structure | File | Key Operations & Time Complexity |
| :--- | :--- | :--- |
| **Singly Linked List** | `LinkedList.java` | `addFirst` `O(1)`, `addLast` `O(n)`, `reverse` `O(n)`, `findMiddle` `O(n)` |
| **Doubly Linked List** | `DoublyLinkedList.java` | `addFirst` `O(1)`, `addLast` `O(1)`, `deleteLast` `O(1)`, `reverse` `O(n)` |
| **Array-Based Stack** | `ArrayStack.java` | `push` `O(1)`, `pop` `O(1)`, `peek` `O(1)` |
| **Linked Stack** | `LinkedStack.java` | `push` `O(1)`, `pop` `O(1)`, `peek` `O(1)` |
| **Circular Queue** | `CircularQueue.java` | `enqueue` `O(1)`, `dequeue` `O(1)` |
| **Linked Queue** | `LinkedQueue.java` | `enqueue` `O(1)`, `dequeue` `O(1)`, `deleteEven` `O(n)` |

## How to Run

Compile and run the demo from the `src` directory:

```bash
cd src
javac *.java
java Main