import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AdMap<K, V> implements IMap<K, V> {
    private ArrayList<MapObj> listOfElements = new ArrayList<>();
    Set<K> setForGetAll = new HashSet<>();

    public AdMap() {

    }

    @Override
    public void add(K key, V value) {
        if (listOfElements.size() > 0) {
            remove(key);
        }
        listOfElements.add(new MapObj<K, V>(key, value));
        setForGetAll.add(key);
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
        return setForGetAll;
    }


    @Override
    public boolean remove(K key) {
        if (listOfElements.size() > 0) {
            for (int i = 0; i < listOfElements.size(); i++) {
                if (listOfElements.get(i).getKey() == key) {
                    listOfElements.remove(i);
                    break;
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(V value) {
        if (listOfElements.size() > 0) {
            for (int i = 0; i < listOfElements.size(); i++) {
                if (listOfElements.get(i).getValue() == value) {
                    listOfElements.remove(i);
                    i--;
                }
            }
        }
        return false;
    }

    @Override
    public int getSize() {
        return listOfElements.size();
    }
}