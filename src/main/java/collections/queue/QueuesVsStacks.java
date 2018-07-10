package collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuesVsStacks {

    //Stacks and Queue both are non-primitive data structures

    //The main difference between them is Stack uses LIFO and Queue uses FIFO

    //Stack has only one end open for pushing and popping the data elements and Queue
    // has both ends open for enqueuing and dequeuing the data elements

    //Key operation supported by any Stack implementation are push() and pop() which is
    // used to add and retrieve an element from Stack, pop() not only retrieves elements
    // but also removes it from stack

    //Queue has two main operations, offer() and poll() used to add and retrieve objects from Queue
    //Also Queue has add and remove operation inherited from Collection

    //In Queue, offer() returns false if it's not able to add and elements while add()
    //throws RuntimeException when fails to add elements, same for poll() that returns null if
    // the queue is empty and remove() throws unchecked exception.

    //Queue implementation generally don't allow null, but linkedList is and exception

    //Head and tail of Queue are also referred as front and rear of the queue

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        stack.push("hola ");
        stack.push("soy ");
        stack.push("yo");

        queue.offer("hola ");
        queue.offer("soy ");
        queue.offer("yo");

        System.out.println("-------- Stack --------");

        while (!stack.empty()){
            System.out.println(stack.pop());
        }

        //Iterates each element ignoring the stack flow
        stack.forEach(item -> System.out.println(item));

        System.out.println("-------- Queue --------");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }




}
