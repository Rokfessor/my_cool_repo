import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AdMap<K, V> implements IMap<K, V> {
    private ArrayList<MapObj> listOfElements = new ArrayList<>();
    private MapObj<K, V> slider;
    private int indexForRemove;
    Set<K> setForGetAll = new HashSet<>();

    public AdMap() {

    }

    @Override
    public void add(K key, V value) {
        if (listOfElements.size() > 0) {
            for (int i = 0; i < listOfElements.size(); i++) {
                if (listOfElements.get(i).getKey() == key) {
                    indexForRemove = i;
                }
            }
            if (indexForRemove >= 0) {
                listOfElements.remove(indexForRemove);
            }
        }
        indexForRemove = -1;
        listOfElements.add(new MapObj<K, V>(key, value));
        setForGetAll.add(key);
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < listOfElements.size(); i++) {
            slider = listOfElements.get(i);
            if (slider.getKey() == key) {
                return slider.getValue();
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