package my_cool_repo.ListImpl.src.main.java;
import java.util.HashSet;
import java.util.Set;


public class implementsMap<K, V> implements IMap<K, V> {
    Set<basePair> map = new HashSet<>();


    @Override
    public void add(K key, V value) {
        basePair element = new basePair (key, value);
        map.add(element);

    }

    @Override
    public V get(K key) {
        for(basePair elementOfMap: map){
            if(elementOfMap.key.equals(key)){
                return (V) elementOfMap.value;
            }
        }
        return null;
    }

    @Override
    public Set<K> getAll() {
        Set map1 = new HashSet<>();
        for (basePair elementOfMap : map) {
            map1.add(elementOfMap.value);
        }
        return map1;
    }
    @Override
    public boolean remove(K key) {
        Set<basePair> map1 = new HashSet<>();

        for (basePair elementOfMap : map) {
            if (!elementOfMap.key.equals(key)) {
                map1.add(elementOfMap);
            }

        }
        if (map1.size() == map.size()) {
            return false;
        }
        map=map1;
        return true;
    }

    @Override
    public boolean removeAll(V value) {
        if(map.isEmpty()){
            return false;
        }
        Set<basePair> map1 = new HashSet<>();
        map=map1;
        return false;
    }

    @Override
    public int getSize() {

        return map.size();
    }
}
