package DSA.Week1.LinkedList;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class LinkedList {
    private Node head;
    private Node tail;

    private int size;

    public void removeDuplicates() {
       Node curr = head;
        while (curr!=null){
            Node temp = curr;
            while(temp.next != null){
                if(curr.value == temp.next.value){
                    temp.next=temp.next.next;
                    size--;
                }
                else{
                    temp = temp.next;
                }
            }
            curr = curr.next;
        }

    }

    public void removeDuplicatesWithOneLoop(){
        Node curr = head;
        Node prev = null;
        Set<Integer> nodeSet = new HashSet<>();
        while(curr != null){
            if(nodeSet.contains(curr.value)){
                prev.next = curr.next;
                size--;
            }
            else{
                prev = curr;
                nodeSet.add(curr.value);
            }
            curr = curr.next;
        }
    }


    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }




    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        //set tail if it's null
        if(tail == null)
            tail=head;

        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            insertFirst(val);
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void display(){
        Node temp = head ;
        while(temp != null)
        {
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("END\n");

    }
    public void deleteByPosition(int pos){
        System.out.println("Deleting Node at pos:"+pos);
        Node temp = head;
        for (int i = 0; i <pos-1 ; i++) {
            temp = temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    public void insertAtPosition(int pos, int val){
        Node temp = head;
        for (int i = 0; i < pos ; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val,temp.next);
        temp.next = newNode;
        size++;
    }

    public void reverse(){
        Node prevNode = null;
        Node currentNode = head;
        Node nextNode = null;

        while (currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head= prevNode;
    }

    public void convertArrayToLinkedList(int [] arr){
        for(int n:arr){
            insertFirst(n);
        }
    }

}
