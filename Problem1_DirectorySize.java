import java.util.*;
class Item {
    String name;
    int size;
    boolean isFile;
    List<Item> children = new ArrayList<>();
    Item(String name, int size, boolean isFile) {
        this.name = name;
        this.size = size;
        this.isFile = isFile;
    }
    void add(Item item) {
        children.add(item);
    }
}
public class Problem1_DirectorySize {
    static int getSize(Item item) {
        // Base case: If the item is a file
        if (item.isFile) {
            return item.size;
        }
        // Recursive case: Calculate the size of all children
        int total = 0;
        for (Item child : item.children) {
            total += getSize(child);
        }
        return total;
    }
    public static void main(String[] args) {
        Item project = new Item("project", 0, false);
        Item src = new Item("src", 0, false);
        src.add(new Item("main.java", 100, true));
        src.add(new Item("utils.java", 50, true));
        Item docs = new Item("docs", 0, false);
        docs.add(new Item("readme.txt", 10, true));
        Item guides = new Item("guides", 0, false);
        guides.add(new Item("setup.pdf", 200, true));
        docs.add(guides);
        project.add(src);
        project.add(docs);
        project.add(new Item("config.xml", 20, true));
        System.out.println("Total directory size: " + getSize(project) + " KB");
    }
}
