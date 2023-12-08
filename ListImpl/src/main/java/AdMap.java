import java.util.ArrayList;
import java.util.Set;

public class AdMap<K,V> implements IMap<K,V>{
    private ArrayList<MapObj> listOfElements = new ArrayList<>();
    private MapObj<K, V> slider;
    public AdMap(){

    }
    @Override
    public void add(K key, V value) {
        listOfElements.add(new MapObj<K, V>(key, value));
    }
    @Override
    public V get(K key) {
        for(int i = 0; i < listOfElements.size(); i++){
            slider = listOfElements.get(i);
            if(slider.getKey() == key){
                return slider.getValue();
            }
        }
        return null;
    }
    @Override
    public Set<K> getAll(){
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