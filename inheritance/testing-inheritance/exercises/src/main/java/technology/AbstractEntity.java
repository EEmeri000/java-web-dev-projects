package technology;

public class AbstractEntity {
    private static int idCounter = 0;
    private int id;

    AbstractEntity() {
        this.id = ++idCounter;
    }

    int getId() {
        return id;
    }
}
