import java.util.ArrayList;


public class Person implements PersonInterface {
    private String name;
    private String surname;
    private String birthDate;
    private String deathDate = "по настоящее время";
    private ArrayList<Relatives> child = new ArrayList<Relatives>();


    public Person(String name, String surname, String birthDate, String deathDate) {
        this(name, surname, birthDate);
        this.deathDate = deathDate;
    }

    public Person(String name, String surname, String birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "| " + name + " " + surname + " | " + birthDate + " - " + deathDate + " |";
    }

    @Override
    public void showInfo() {
        System.out.println(toString());
    }

    @Override
    public void printRelatives(int st) {
        ArrayList<Relatives> newList = this.getChild();
        System.out.println(this.getName() + " " + this.getSurname() + ", " + this.getBirthDate() + " - " + getDeathDate());
        System.out.println("дети: ");
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i).getPers2() != this && newList.get(i).getNode2() == st) {
                System.out.println("-------------------------------------------");
                System.out.println("Имя: " + newList.get(i).getPers2().name + " " + newList.get(i).getPers2().surname + ", ");
                System.out.println("Дата рождения: " + newList.get(i).getPers2().birthDate + ". ");
            }
        }
        System.out.println("-------------------------------------------");
    }

    public void addRelatives(Person children, int st1, int st2) {
        this.child.add(new Relatives(this, children, 1, 2));
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public ArrayList<Relatives> getChild() {
        return child;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    public void setChild(ArrayList<Relatives> child) {
        this.child = child;
    }
}