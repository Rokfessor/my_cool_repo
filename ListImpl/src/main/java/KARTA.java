import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class KARTA<K,V> implements IMap<K,V>{

    ArrayList<Element> boxOfElements = new ArrayList<>();
    public KARTA(){

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
    public V get(K key) {
        for(Element element: boxOfElements){
            if(element.getKey() == key){
                return (V) element.getValue();
            }
        }
        return null;
    }

    @Override
    public Set<K> getAll() {//Мы так поняли :)
        Set<K> keys = new HashSet<>();
        for(Element element : boxOfElements){
            keys.add((K) element.getKey());
        }
        return keys;
    }

    @Override
    public boolean remove(K key)
    {
        Iterator<Element> elementIterator = boxOfElements.iterator();
        while (elementIterator.hasNext()){
            Element nextElement = elementIterator.next();
            if(nextElement.getKey() == key){
                elementIterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(V value) { //Мы так поняли :)
        Iterator<Element> elementIterator = boxOfElements.iterator();
        while (elementIterator.hasNext()){
            Element nextElement = elementIterator.next();
            if(nextElement.getValue() == value){
                elementIterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public int getSize() {
        return boxOfElements.size();
    }
}
/**/