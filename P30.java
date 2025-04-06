import java.util.HashMap;

public class P30 {
    public static void main(String[] args) {
        HashMap<String, String> Students = new HashMap<>();

        Students.put("ENR001", "Alien");
        Students.put("ENR002", "Bob");
        Students.put("ENR003", "Charlie");
        Students.put("ENR004", "David");
        Students.put("ENR005", "Emma");

        System.out.println("Students Records: ");

        for (String key : Students.keySet()) {
            System.out.println("Enrollment No: " + key + " Name " + Students.get(key));
        }

        String er = "ENR003";
        System.out.println("\n Retrieving Student with Enrollment No:- " + er);
        
        if (Students.containsKey(er)) {
            System.out.println("Student Name: " + Students.get(er));
        } else {
            System.out.println("Student With Enrollment No " + er + " Not Found.");
        }
    }
}
