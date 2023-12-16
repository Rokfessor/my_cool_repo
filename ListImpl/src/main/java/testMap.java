package my_cool_repo.ListImpl.src.main.java;

public class testMap {
    public static void main(String[] args) {
        implementsMap<String, Integer> map = new implementsMap<>();
        map.add("asd", 2);
        System.out.println(map.get("asd"));

    }
}
