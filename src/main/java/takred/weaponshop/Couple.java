package takred.weaponshop;

import lombok.Data;

import java.util.UUID;

@Data
public class Couple {
    private final String name;
    private final UUID id;

    public Couple(String name, UUID id) {
        this.name = name;
        this.id = id;
    }
}
