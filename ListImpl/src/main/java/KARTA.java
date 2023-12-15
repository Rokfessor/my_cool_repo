import java.util.ArrayList;
import java.util.Set;

public class KARTA2<K,V> implements IMap<K,V>{

    ArrayList<Element> boxOfElements = new ArrayList<>();
    public KARTA2(){

    }
    @Override
    public void add(K key, V value) {
        boolean flag = true;
        for(Element element: boxOfElements){
            if(element.getKey() == key){
                element.setValue(value);
                flag = false;
                break;
            }
        }
        if(flag){
            boxOfElements.add(new Element<K,V>(key, value));
        }
    }

    @Override
    public V get(K key) {return null;}

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