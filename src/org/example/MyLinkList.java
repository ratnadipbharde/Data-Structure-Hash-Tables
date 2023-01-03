package org.example;

public class MyLinkList<K> {
    private INode<K> head;
    private INode<K> tail;

    public INode<K> getHead() {
        return head;
    }

    public INode<K> getTail() {
        return tail;
    }

    public boolean isEmpty() {
        if (this.head == null && this.tail == null) {
            return true;
        } else {
            return false;
        }
    }

    public Integer getSize() {
        INode tempNode = this.head;
        Integer count = 0;
        while (tempNode != null) {
            INode<K> current = tempNode;
            tempNode = current.getNext();
            count++;
        }
        return count;
    }

    public Integer index(K key) {
        INode tempNode = this.head;
        Integer count = 0;
        while (tempNode != null) {
            INode<K> current = tempNode;
            if (key == current.getKey()) {
                break;
            }
            tempNode = current.getNext();
            count++;
        }
        return count;
    }

    public INode<K> search(K key) {
        if(this.head != null) {
            INode<K> tempNode = this.head;
            while (tempNode != null) {
                if ((tempNode.getKey().equals(key) || (this.head.getKey().equals(key)))) {
                    return tempNode;
                }
                tempNode = tempNode.getNext();
            }
        }
        return null;
    }

    public INode<K> removeFirst() {
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public void removeLast() {
        INode tempNode = this.head;
        while (tempNode != null) {
            if (tempNode.getNext() == tail) {
                tempNode.setNext(null);
            }
            tempNode = tempNode.getNext();
        }
    }

    public void add(INode<K> newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode<K> newNode) {
        if(this.head == null) {
            this.head = newNode;
        }
        if(this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void printMyNodes(String item) {
        StringBuffer myNodes = new StringBuffer(item);
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (tempNode != tail)
                myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
    public void printMyNodes(){
        System.out.println("My Nodes: "+head);
    }

    @Override
    public String toString() {
        return "MyLinkListNodes{"+head+'}';
    }
}

