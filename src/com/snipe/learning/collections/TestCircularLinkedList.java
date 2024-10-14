package com.snipe.learning.collections;

public class TestCircularLinkedList {
    class Node
    {    
        int data;    
        Node next;                
        public Node(int data) 
        {    
            this.data = data;    
         }    
    }         

    public Node head = null;    
    public Node tail = null;          

    public void insert(int data) 
    {    
        Node newNode = new Node(data);               
        if(head == null) 
        {    
            head = newNode;    
            tail = newNode;
            tail.next = head; 
        }    
        else 
        {    
            tail.next = newNode;    
            tail = newNode; 
            tail.next = head; 
        }    
    }          

    public void displaylist() 
    {    
        Node current = head;               
        if(head == null)
        {    
            System.out.println("The given list is empty");    
            return;    
        }    
        System.out.println("The data in the given list are: ");  
        do{  
        	System.out.print(" "+ current.data);  
            current = current.next;  
        } while(current != head); 
    }            

    public static void main(String[] args)
    {    
    	TestCircularLinkedList newList = new TestCircularLinkedList();                
        newList.insert(10);    
        newList.insert(30);   
        newList.insert(50); 
        newList.displaylist();    
    }   	
}
