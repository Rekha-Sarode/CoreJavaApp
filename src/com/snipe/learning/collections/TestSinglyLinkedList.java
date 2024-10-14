package com.snipe.learning.collections;

public class TestSinglyLinkedList {
	//defining a node in singly linked list  
    class Node
    {    
        int data;    
        Node next;                
        public Node(int data) 
        {    
            this.data = data;    
            this.next = null;    
        }    
    }         

    //defining the head and tail of a singly linked list   
    public Node head = null;    
    public Node tail = null;          

    //defining insert() function to add a node to the list   
    public void insert(int data) 
    {    
        Node newNode = new Node(data);               
        if(head == null) 
        {    
            head = newNode;    
            tail = newNode;    
        }    
        else 
        {    
            tail.next = newNode;    
            tail = newNode;    
        }    
    }          

    //defining displaylist() function to display the data in the list  
    public void displaylist() 
    {    
        Node current = head;               
        if(head == null)
        {    
            System.out.println("The given list is empty");    
            return;    
        }    
        System.out.println("The data in the given list are: ");    
        while(current != null) 
        {    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
    }            

    public static void main(String[] args)
    {    
    	TestSinglyLinkedList newList = new TestSinglyLinkedList();                
        newList.insert(10);    
        newList.insert(30);   
        newList.insert(50); 
        newList.displaylist();    
    }    
}
