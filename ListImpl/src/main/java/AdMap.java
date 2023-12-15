import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AdMap<K, V> implements IMap<K, V> {
    private ArrayList<MapObj> listOfElements = new ArrayList<>();
    private int indexForRemove;
    Set<K> setForGetAll = new HashSet<>();
    ArrayList<Integer> listOfIndexForRemoveAll = new ArrayList<>();

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
                    indexForRemove = i;
                }
            }
            if (indexForRemove >= 0) {
                listOfElements.remove(indexForRemove);
                setForGetAll.remove(key);
                return true;
            }
        }
        indexForRemove = -1;
        return false;
    }

    @Override
    public boolean removeAll(V value) {
        if (listOfElements.size() > 0) {
            for (int i = 0; i < listOfElements.size(); i++) {
                if (listOfElements.get(i).getValue() == value) {
                    listOfIndexForRemoveAll.add(i);
                    setForGetAll.remove(listOfElements.get(i).getKey());
                }
            }
            if (listOfIndexForRemoveAll.size() > 0) {
                for (int j = 0; j < listOfIndexForRemoveAll.size(); j++) {
                    listOfElements.remove(listOfIndexForRemoveAll.get(j));
                }
                listOfIndexForRemoveAll.clear();
                return true;
            }
        }
        return false;
    }

    @Override
    public int getSize() {
        return listOfElements.size();
    }
}