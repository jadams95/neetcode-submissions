class LRUCache {
    private final int capacity;
    private final Map<Integer, Integer> map = new HashMap<>(); // key -> value
    private final List<Integer> order = new LinkedList<>();    // keys, front = most recent, back = least recent
 
    public LRUCache(int capacity) {
        this.capacity = capacity; // nothing to pre-fill; the cache starts empty
    }
 
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
 
        markRecent(key);
        return map.get(key);
    }
 
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            // Existing key: drop its old spot in the order list
            order.remove(Integer.valueOf(key));
        } else if (map.size() == capacity) {
            // Full: evict the least recently used key from the back
            int lru = order.remove(order.size() - 1);
            map.remove(lru);
        }
 
        map.put(key, value);
        order.add(0, key);
    }
 
    private void markRecent(int key) {
        // Integer.valueOf matters: order.remove(key) with a plain int
        // would call remove(int index) and delete by POSITION, not value.
        order.remove(Integer.valueOf(key));
        order.add(0, key);
    }
}
