package src.main.java.InternalImplementation.HashMap;

import java.util.HashMap;

public class HashMapInternalImpl<K, V> {

    HashMap<Integer,Integer> map = new HashMap<>();
    private static final int DEFAULT_CAPACITY = 1 << 4;
    private static final int MAX_CAPACITY = 1 << 30;

    private  Entry[] hashTable;

    public HashMapInternalImpl() {
        hashTable = new Entry[DEFAULT_CAPACITY];
    }

    public HashMapInternalImpl(int capacity) {
        int tableSize = tableSizeFor(capacity);
        hashTable = new Entry[tableSize];
    }

    public int tableSizeFor(int capacity) {
        int n = capacity - 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;

        return (n<0) ? 1 : (n>=MAX_CAPACITY) ? MAX_CAPACITY : n + 1;
    }

    class Entry<K,V> {
        public K key;
        public V value;

        public Entry next;

        public Entry(K k, V v) {
            key = k;
            value = v;
        }

    }

    public void put(K key , V val) {
        // generate the hashcode for the key

        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        if(node == null) {
            Entry newNode = new Entry(key,val);
            hashTable[hashCode] = newNode;
        } else {
            Entry prevNode = node;

            while(node != null) {
                if(node.key == key || node.key.equals(key)) {
                    node.value = val;
                    return;
                }
                prevNode = node;
                node = node.next;
            }
            Entry newNode = new Entry(key,val);
            prevNode.next = newNode;
        }
    }

    public V get(K key) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        while(node != null) {

            if(node.key.equals(key)) {
                return (V) node.value;
            }

            node = node.next;
        }
        return null;
    }

    public static void main(String[] args) {
        // Initialize your custom HashMap
        // Passing 7 will trigger tableSizeFor() to round up to the next power of 2 (8)
        HashMapInternalImpl<Integer, String> myMap = new HashMapInternalImpl<>(7);

        System.out.println("--- Testing Basic Put and Get ---");
        myMap.put(1, "One");
        myMap.put(2, "Two");
        myMap.put(3, "Three");

        System.out.println("Key 1: " + myMap.get(1)); // Expected: One
        System.out.println("Key 2: " + myMap.get(2)); // Expected: Two

        System.out.println("\n--- Testing Value Update ---");
        // This will hit your short-circuiting check (node.key == key)
        myMap.put(1, "Uno");
        System.out.println("Key 1 updated: " + myMap.get(1)); // Expected: Uno

        System.out.println("\n--- Testing Missing Key ---");
        System.out.println("Key 99: " + myMap.get(99)); // Expected: null

        System.out.println("\n--- Testing Collisions ---");
        // Because the capacity is 8, key '1' goes to index 1 (1 % 8 = 1).
        // Key '9' will ALSO go to index 1 (9 % 8 = 1), causing a collision.
        // This will test your 'prevNode.next = newNode' logic.
        myMap.put(9, "Nine (Collision Node)");
        System.out.println("Key 1 (Original): " + myMap.get(1)); // Expected: Uno
        System.out.println("Key 9 (Chained): " + myMap.get(9));  // Expected: Nine (Collision Node)
    }


}
