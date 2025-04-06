import java.util.ArrayList;
import java.util.LinkedList;

public class P28 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        LinkedList<String> list2 = new LinkedList<String>();

        list1.add("Monday");
        list1.add("Tuesday");
        list1.add("Wednesday");
        list1.add("Thursday");
        list1.add("Friday");
        list1.add("Saturday");
        list1.add("Sunday");

        list2.add("January");
        list2.add("February");
        list2.add("March");
        list2.add("April");
        list2.add("May");
        list2.add("June");
        list2.add("August");
        list2.add("September");
        list2.add("October");
        list2.add("November");
        list2.add("December");

        for (String day : list1) {
            System.out.println(day);
        }
        System.out.println(" ");

        for (String month : list2) {
            System.out.println(month);
        }
    }
}
