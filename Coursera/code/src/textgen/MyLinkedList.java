package textgen;

import java.util.AbstractList;

public class MyLinkedList<E> extends AbstractList<E> {
    LLNode<E> head;
    LLNode<E> tail;
    int size;

    public MyLinkedList() {
        this.head = new LLNode<>(null);
        this.tail = new LLNode<>(null);
        this.head.next = tail;
        this.tail.prev = head;
    }

    public boolean add(E element) {
        if (element == null) {
            throw new NullPointerException("List can't take null");
        }

        LLNode<E> newNode = new LLNode<>(element);
        newNode.prev = tail.prev;
        newNode.next = tail;
        tail.prev.next = newNode;
        tail.prev = newNode;
        this.size++;
        return true;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("MyLinkedList get method index outOfBound : " + index);
        } else {
            LLNode<E> targetNode = getNode(index);
            return targetNode.data;
        }
    }

    private LLNode<E> getNode(int index) {
        LLNode<E> currentNode = head;
        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public void add(int index, E element) {
        if (element == null) {
            throw new NullPointerException("List can't take null");
        }
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("LLNode add failed: " + index);
        }
        LLNode<E> newNode = new LLNode<>(element);
        LLNode<E> node = getNode(index);
        newNode.prev = node.prev;
        newNode.next = node;
        newNode.prev.next = newNode;
        node.prev = newNode;
        this.size++;
    }

    public int size() {
        return size;
    }

    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("LLNode remove outOfBound: " + index);
        }
        LLNode<E> targetNode = getNode(index);
        targetNode.prev.next = targetNode.next;
        targetNode.next.prev = targetNode.prev;
        this.size--;
        return targetNode.data;
    }

    public E set(int index, E element) {
        if (element == null) {
            throw new NullPointerException("List can't take null");
        }
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("LLNode set failed: " + index);
        }
        LLNode<E> node = getNode(index);
        E oldValue = node.data;
        node.data = element;
        return oldValue;
    }

    public String toString() {
        String output = "";
        LLNode<E> curNode = head;
        while (curNode != null) {
            output += curNode.toString();
            curNode = curNode.next;
        }
        return output;
    }
}

class LLNode<E> {
    LLNode<E> prev;
    LLNode<E> next;
    E data;

    public LLNode(E e, LLNode<E> prev) {
        this(e);
        this.prev = prev;
        if (prev != null) {
            prev.next = this;
        }
    }

    public LLNode(E e) {
        this.data = e;
        this.prev = null;
        this.next = null;
    }

    public String toString() {
        return "prev: " + prev + " ,data = " + data + ", next" + next + "\n";
    }
}
