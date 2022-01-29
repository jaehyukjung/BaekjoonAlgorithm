package Baekjoon;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.NoSuchElementException;

class Stack<T>{
    class Node<T>{
        private T data;
        private Node<T> next;
        public Node(T data) {
            this.data = data;
        }
    }
    private Node<T> top;

    public T pop(){
        if(top == null){
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }
    public void push(T item){
        Node<T> t = new Node<T>(item);
        t.next = top;
        top = t;
    }
    public  T peek(){
        if(top == null){
            throw new EmptyStackException();
        }
        return top.data;
    }
    public boolean isEmpty(){
        return top == null;
    }
}
class Queue<T> {
    class Node<T>{
        private T data;
        private Node<T> next;
        public  Node(T data){
            this.data = data;
        }
    }
    private Node<T> first;
    private Node<T> last;

    public void add(T item){
        Node<T> t = new Node<T>(item);

        if(last!=null){
            last.next = t;
        }
        last = t;
        if(first ==null){
            first = last;
        }
    }

    public  T remove(){
        if(first ==null){
            throw new NoSuchElementException();
        }
        T data = first.data;
        first = first.next;

        if(first == null){
            last = null;
        }
        return data;
    }
    public T peek(){
        if(first == null){
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }
}
class Graph{
    class Node{
        int data;
        LinkedList<Node> adjacent;
        boolean marked;
        Node (int data){
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<Node>();
        }
    }
    Node[] nodes;
    Graph(int size){
        nodes = new Node[size];
        for(int i =0;i<size; i++){
            nodes[i] = new Node(i);
        }
    }
    void addEdge(int i1, int i2){
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];
        if(!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }
        if(!n2.adjacent.contains(n1)){
            n2.adjacent.add(n1);
        }
    }
    void dfs(){
        dfs(0);
    }
    void dfs(int index){
        Node root = nodes[index];
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        root.marked = true;
        while(!stack.isEmpty()){
            Node r = stack.pop();
            for(Node n : r.adjacent){
                if(n.marked ==false){
                    n.marked = true;
                    stack.push(n);
                }
            }
            visit(r);
        }
    }
    void bfs(){
        bfs(0);
    }
    void bfs(int index){
        Node root = nodes[index];
        Queue<Node> queue = new Queue<>();
        queue.add(root);
        root.marked = true;
        while(!queue.isEmpty()){
            Node r = queue.remove();
            for(Node n : r.adjacent){
                if(n.marked ==false){
                    n.marked = true;
                    queue.add(n);
                }
            }
            visit(r);
        }
    }
    void visit(Node n){
        System.out.println(n.data+" ");
    }
}
public class Main_Stack {
    public static void main(String[] argv) {

    }
}
