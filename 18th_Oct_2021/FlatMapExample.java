import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> diagrams = Arrays.asList("circle", "Square", "rectangle");
        List<String> lines = Arrays.asList("straight", "curves", "zig-zag");
        List<List<String>> shapes = new ArrayList<>();

        shapes.add(diagrams);
        shapes.add(lines);
        System.out.println(shapes);
        List<String> l1 = shapes.stream().flatMap(plist -> plist.stream()).collect(Collectors.toList());
        System.out.println(l1);
    }

}
