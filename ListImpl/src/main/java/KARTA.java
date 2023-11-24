import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

public class KARTA<K,V> implements IMap<K,V>{



    private ArrayList<K> keys = new ArrayList<>();
    private ArrayList<V> values = new ArrayList<>();

    public KARTA(){

    }
    @Override
    public void add(K key, V value) {
        keys.add(key);
        values.add(value);
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
