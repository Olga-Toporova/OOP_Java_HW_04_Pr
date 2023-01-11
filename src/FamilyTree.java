import java.util.ArrayList;

public class FamilyTree implements TreeInterface {
    ArrayList<Person> treePerson = new ArrayList<Person>();

    @Override
    public void showTree(Person tree, String pl) {
        if (tree != null) {
            System.out.println(pl + tree.getName() + " " + tree.getSurname() + " (" + tree.getBirthDate() + " - " + tree.getDeathDate() + ")");
        } else {
            System.out.println(pl);
            return;
        }
        for (int i = 0; i < tree.getChild().size(); i++) {
            showTree(tree.getChild().get(i).getPers2(), pl + "-- ");
        }
    }
}