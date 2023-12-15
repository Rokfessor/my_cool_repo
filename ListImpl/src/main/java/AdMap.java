import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AdMap<K, V> implements IMap<K, V> {
    private ArrayList<MapObj> listOfElements = new ArrayList<>();

    public AdMap() {

    }

    @Override
    public void add(K key, V value) {
        if (listOfElements.size() > 0) {
            remove(key);
        }
        listOfElements.add(new MapObj<K, V>(key, value));
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < listOfElements.size(); i++) {
            if (listOfElements.get(i).getKey() == key) {
                return (V) listOfElements.get(i).getValue();
            }
        }
        return null;
    }

    @Override
    public Set<K> getAll() {
        Set<K> setForGetAll = new HashSet<>();
        for (int i = 0; i < listOfElements.size(); i++) {
            setForGetAll.add((K) listOfElements.get(i).getKey());
        }
        return setForGetAll;
    }

    @Override
    public boolean remove(K key) {
        if (listOfElements.size() > 0) {
            for (int i = 0; i < listOfElements.size(); i++) {
                if (listOfElements.get(i).getKey() == key) {
                    listOfElements.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(V value) {
        boolean flag = false;
        if (listOfElements.size() > 0) {
            for (int i = 0; i < listOfElements.size(); i++) {
                if (listOfElements.get(i).getValue() == value) {
                    flag = true;
                    listOfElements.remove(i);
                    i--;
                }
            }
        }
        return flag;
    }

    @Override
    public int getSize() {
        return listOfElements.size();
    }
}