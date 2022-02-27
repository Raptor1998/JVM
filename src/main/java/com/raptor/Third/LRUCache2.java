package com.raptor.Third;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 * @author raptor
 * @description LRUCache2
 * @date 2022/2/27 16:45
 */
public class LRUCache2 {
    private HashMap<Integer, Node> hashMap;
    private int cacheSize;
    private DoubleLinkedList<Integer, Integer> doubleLinkedList;

    //构造一个数据节点  作为数据载体
    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> prev;
        Node<K, V> next;

        public Node() {
            this.prev = null;
            this.next = null;
        }

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node<K, V> getPrev() {
            return prev;
        }

        public void setPrev(Node<K, V> prev) {
            this.prev = prev;
        }

        public Node<K, V> getNext() {
            return next;
        }

        public void setNext(Node<K, V> next) {
            this.next = next;
        }
    }

    //双向队列   类似AQS
    static class DoubleLinkedList<K, V> {
        Node<K, V> head;
        Node<K, V> tail;

        //头尾加点  指向
        public DoubleLinkedList() {
            head = new Node<>();
            tail = new Node<>();
            head.next = tail;
            tail.prev = head;
        }

        public void addHead(Node<K, V> node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }


        public void remove(Node<K, V> node) {
            node.next.prev = node.prev;
            node.prev.next = node.next;
            node.prev = null;
            node.next = null;
        }

        public Node getTail() {
            return tail.prev;
        }
    }

    private int capacity;

    public LRUCache2(int capacity) {
        this.cacheSize = capacity;
        this.hashMap = new HashMap<>();
        this.doubleLinkedList = new DoubleLinkedList<>();
    }

    public int get(int key) {
        if (hashMap.containsKey(key) == false) {
            return -1;
        }
        Node<Integer, Integer> node = hashMap.get(key);
        doubleLinkedList.remove(node);
        doubleLinkedList.addHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        //update
        if (hashMap.containsKey(key)) {
            Node<Integer, Integer> node = hashMap.get(key);
            node.value = value;
            hashMap.put(key, node);

            doubleLinkedList.remove(node);
            doubleLinkedList.addHead(node);
        } else {
            // insert
            if (hashMap.size() == cacheSize) {
                Node tail = doubleLinkedList.getTail();
                hashMap.remove(tail.key);
                doubleLinkedList.remove(tail);
            }
            Node<Integer, Integer> newNode = new Node<>(key, value);
            hashMap.put(key, newNode);
            doubleLinkedList.addHead(newNode);
        }
    }

    public static void main(String[] args) {
        LRUCache2 lRUCache = new LRUCache2(2);
        lRUCache.put(1, 1); // 缓存是 {1=1}
        System.out.println(lRUCache.hashMap.keySet());
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        System.out.println(lRUCache.hashMap.keySet());
        lRUCache.get(1);    // 返回 1
        System.out.println(lRUCache.hashMap.keySet());
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        System.out.println(lRUCache.hashMap.keySet());
        lRUCache.get(2);    // 返回 -1 (未找到)
        System.out.println(lRUCache.hashMap.keySet());
        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        System.out.println(lRUCache.hashMap.keySet());
        lRUCache.get(1);    // 返回 -1 (未找到)
        System.out.println(lRUCache.hashMap.keySet());
        lRUCache.get(3);    // 返回 3
        System.out.println(lRUCache.hashMap.keySet());
        lRUCache.get(4);    // 返回 4
        System.out.println(lRUCache.hashMap.keySet());
    }
}
