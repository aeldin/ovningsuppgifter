package FilesDemo;

import java.io.Serializable;

public record Cake(int id, String name, int price) implements Serializable {
}
