class MyHashMap {

    private static final int SIZE = 10007; // prime bucket count spreads keys evenly

    private static class Node {
        int key, value;
        Node next;
        Node(int key, int value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private final Node[] buckets = new Node[SIZE];

    private int index(int key) {
        return key % SIZE; // keys are non-negative in this problem
    }

    public void put(int key, int value) {
        int i = index(key);
        for (Node n = buckets[i]; n != null; n = n.next) {
            if (n.key == key) {      // key exists -> update
                n.value = value;
                return;
            }
        }
        buckets[i] = new Node(key, value, buckets[i]); // new key -> prepend
    }

    public int get(int key) {
        for (Node n = buckets[index(key)]; n != null; n = n.next) {
            if (n.key == key) return n.value;
        }
        return -1;
    }

    public void remove(int key) {
        int i = index(key);
        Node prev = null;
        for (Node n = buckets[i]; n != null; prev = n, n = n.next) {
            if (n.key == key) {
                if (prev == null) buckets[i] = n.next;
                else prev.next = n.next;
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */