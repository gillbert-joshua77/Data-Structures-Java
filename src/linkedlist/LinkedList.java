package linkedlist;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next= null;
    }
}

class LinkedList{
    Node head =null;
    void insertBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String [] args){
        LinkedList list = new LinkedList();
        list.insertBeginning(1);
        list.insertBeginning(2);
    }
}