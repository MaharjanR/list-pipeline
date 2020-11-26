import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Collection {

    public static void main(String[] args) {
        System.out.println("First project");

        List<String> names = new LinkedList<String>();

        names.add("Ritesh");
        names.addAll(Arrays.asList("Bipash","Gkesh", "Anish", "Nabin"));
        System.out.println(names);

    }
}
