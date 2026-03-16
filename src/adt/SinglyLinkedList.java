/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

/**
 *
 * @author Cam
 */
public class SinglyLinkedList<T> {
    
    private Node<T> head;
    
    public SinglyLinkedList(){
        head = null;
    }
    
    public void add(T data){
        Node<T> newNode = new Node<>(data);
        
        if(head == null){
            head = newNode;
        }else{
            Node<T> current = head;
            
            while(current.getNext() != null){
                current = current.getNext();
            }
            
            current.setNext(newNode);
        }
    }
    
    public boolean remove(int index){
        if(head == null || index < 0){
            return false;
        }
        if(index ==0){
            head = head.getNext();
            return true;
        }
        
        Node<T> current = head;
        int count = 0;
        
        while(current.getNext() != null){
            if(count == index - 1){
                current.setNext(current.getNext().getNext());
                return true;
            }
            
            current = current.getNext();
            count++;
        }
        return false;
    }   
    
    public T get(int index){
        Node<T> current = head;
        int count = 0;
        
        while(current != null){
            if(count == index){
                return current.getData();
            }
            
            current = current.getNext();
            count++;
        }
        
        return null;
    }
    
    public int size(){
        int count = 0;
        Node<T> current = head;
        
        while(current != null){
            count++;
            current = current.getNext();
        }
        
        return count;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public String displayList(){
        String output = "";
        Node<T> current = head;
        
        while(current != null){
            output += current.getData().toString() + "\n";
            current = current.getNext();
        }
        return output;
    }
}
