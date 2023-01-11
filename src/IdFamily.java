public class IdFamily<T, E> {
    T id;
    E date;

    String family;

    IdFamily(T id, E date, String family) {
        this.id = id;
        this.date = date;
        this.family = family;
    }

    T getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Id семьи: %s\nсемья: %s\nдата основания: %s", id, family, date);
    }
}