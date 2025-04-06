import java.util.HashSet;

public class P29 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");

        System.out.println("Colors In The HashSet:- ");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
