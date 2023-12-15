public class Main {
    public static void main(String[] args) {
        Map<String,Integer> mapp= new Map<>();
        mapp.add("aba", 121);
        mapp.add("ga", 123);
        mapp.add("ga", 1523);
        mapp.add("gat", 1523);
        System.out.println(mapp.getAll());
        System.out.println(mapp.getSize());
        System.out.println(mapp.get("ga"));
        mapp.remove("aba");
        System.out.println(mapp.getAll());
    }
}
