/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

/**
 *
 * @author Cam
 */
public class ActionStack {
    private SinglyLinkedList<String> stack;

    public ActionStack() {
        stack = new SinglyLinkedList<>();
    }

    public void push(String action) {
        stack.add(action);
    }

    public String pop() {
        if (stack.isEmpty()) {
            return null;
        }

        int lastIndex = stack.size() - 1;
        String lastItem = stack.get(lastIndex);
        stack.remove(lastIndex);
        return lastItem;
    }

    public String peek() {
        if (stack.isEmpty()) {
            return null;
        }

        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public String displayStack() {
        return stack.displayList();
    }
}
