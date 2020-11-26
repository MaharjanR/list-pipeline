import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Collection {

    public static void main(String[] args) {
        System.out.println("First project");

        List<String> names = new ArrayList<String>();

        names.add("Ritesh");
        names.addAll(Arrays.asList("Bipash","Gkesh", "Anish", "Nabin"));
        System.out.println(names);

        System.out.println("Testing jenkins in ec2");
        System.out.println("Testing for 2nd time");

    }
}
