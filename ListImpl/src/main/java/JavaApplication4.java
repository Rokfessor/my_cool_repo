package javaapplication4;

public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        MyMap<Integer, String> map = new MyMap<>();
        map.add(12, "gdfg");
        map.add(-4, "dfvbdfbdfb");
        map.add(227, "fgfgg");
        map.print();
        System.out.println(map.remove(-4));
        map.print();
        map.add(6, "gg");
        map.add(0, "gga");
        map.add(2, "gg");
        map.print();
        System.out.println(map.get(12));
        System.out.println(map.getAll());
        System.out.println(map.getSize());
        System.out.println(map.removeAll("gg"));
        map.print();
    }
    
}
