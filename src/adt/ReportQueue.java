/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

/**
 *
 * @author Cam
 */
public class ReportQueue {
    
    private SinglyLinkedList<Object> queue;

    
    public ReportQueue() {
        queue = new SinglyLinkedList<>();
    }

    public void enqueue(Object report) {
        queue.add(report);
    }

    public Object dequeue() {

        if (queue.isEmpty()) {
            return null;
        }

        Object item = queue.get(0);
        queue.remove(0);
        return item;
    }

    public Object peek() {

        if (queue.isEmpty()) {
            return null;
        }

        return queue.get(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public String displayQueue() {
        return queue.displayList();
    }
}
