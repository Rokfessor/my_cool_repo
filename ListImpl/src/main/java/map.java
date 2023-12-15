import java.util.ArrayList;
import java.util.Set;

public class map<K, V> implements IMap<K, V> {
    ArrayList<KeyValue> kv = new ArrayList<>();
    int size = kv.size();
    @Override
    public void add(K key, V value) {
        boolean keyExists = false;
        for (KeyValue i: kv) {
            if (i.getKey().equals(key)) {
                i.setValue(value);
                keyExists = true;
            }
        }
        if (!keyExists) {
            kv.add(new KeyValue<K, V>(key, value));
            size++; }
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public Set<K> getAll() {
        return null;
    }

    @Override
    public boolean remove(K key) {
        return false;
    }

    @Override
    public boolean removeAll(V value) {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
