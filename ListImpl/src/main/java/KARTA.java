import java.util.ArrayList;
import java.util.Set;

public class KARTA<K,V> implements IMap<K,V>{

    ArrayList<Element> mips = new ArrayList<>();
    public KARTA(){

    }
    @Override
    public void add(K key, V value) {
        boolean flag = true;
        for(Element i: mips){
            if(i.getKey() == key){
                i.setValue(value);
                flag = false;
                break;
            }
        }
        if(flag){
            mips.add(new Element<K,V>(key, value));
        }
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
/* mips.size();
* Iterator<String> iterator = countryHashSet.iterator();
    while (iterator.hasNext()) {
        mInfoTextView.setText(mInfoTextView.getText() + iterator.next()
                + ", ");
    }*/