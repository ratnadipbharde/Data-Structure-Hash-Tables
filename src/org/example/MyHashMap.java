package org.example;

public class MyHashMap<K,V> {
    MyLinkList<K> myLinkList;

    public MyHashMap() {
        this.myLinkList = new MyLinkList<>();
    }

    public V get(K key) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkList.search(key);
        if(myMapNode == null) return null;
        else return myMapNode.getValue();
    }

    public void add(K key, V value) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkList.search(key);
        if(myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            this.myLinkList.append(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "MyHashMap{" + myLinkList +'}';
    }
}
