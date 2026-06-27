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
        void insertEnd(int data){
            if(head == null){
                insertBeginning(data);
            }
            Node newNode = new Node(data);
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        void insertMid(int index , int data){
            if(index < 0 ){
                System.out.println("Invalid index");
                return;
            }
            if(index == 0){
                insertBeginning(data);
                return;
            }
            Node temp = head;
            for (int i = 0; i < index -1 ; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        void delete(int data){
            Node temp = head;
            if (head.data == data){
                head = head.next;
                return;
            }
            while (temp.next != null && temp.next.data != data){
                temp = temp.next;
            }
            if (temp.next == null){
                System.out.println("Invalid index");
                return;
            }
            temp.next = temp.next.next;
        }

        void Display(){
            Node temp = head;
            System.out.print("Head->");
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
            list.insertEnd(0);
            list.insertMid(0,3);
            list.delete(1);
            list.Display();

        }
    }