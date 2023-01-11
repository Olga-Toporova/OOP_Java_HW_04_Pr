public class Main {
    public static void main(String[] args) {

        FamilyTree tree = new FamilyTree();
        Person pers1 = new Person("Федор", "Иванов", "03.03.1930", "03.03.2010");
        Person pers2 = new Person("Мария", "Иванова", "02.02.1961");
        Person pers3 = new Person("Иван", "Иванов", "01.01.1962");

        pers1.showInfo();
        pers2.showInfo();
        pers3.showInfo();

        System.out.println();

        tree.treePerson.add(pers1);
        tree.treePerson.add(pers2);
        tree.treePerson.add(pers3);

        pers1.addRelatives(pers2, 1, 2);
        pers1.addRelatives(pers3, 1, 2);

        pers1.printRelatives(2);

        System.out.println();

        tree.showTree(pers1, "");

        IdFamily<Integer, String> f = new IdFamily<>(14, "1800 год", "Ивановы");
        IdFamily<Integer, Integer> f2 = new IdFamily<>(14, 1800, "Ивановы");

        System.out.println();
        System.out.println(f.toString());
        System.out.println();
        System.out.println(f2.toString());
    }

}
