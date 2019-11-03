import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {

    private int capacity;
    private Map<Integer, Integer> LRUMap;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.LRUMap = new LinkedHashMap<Integer, Integer>();
    }

    public int get(int key) {
        if (this.LRUMap.containsKey(key)) {
            put(key, this.LRUMap.get(key));
            return this.LRUMap.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (this.LRUMap.containsKey(key)) {
            this.LRUMap.remove(key);
        }
        this.LRUMap.put(key, value);
        while (this.LRUMap.size() > this.capacity) {
            Map.Entry<Integer, Integer> entry = this.LRUMap.entrySet().iterator().next();
            this.LRUMap.remove(entry.getKey());
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */