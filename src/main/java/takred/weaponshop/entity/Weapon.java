package takred.weaponshop.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Data
@Table(name = "weapons")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Weapon {
    @Id
    @EqualsAndHashCode.Include
    private UUID id = UUID.randomUUID();
    private String name;
    private int weight;
    private int bladeLength;
    private int bladeWidth;

    public Weapon() {
    }

    public Weapon(String name, int weight, int bladeLength, int bladeWidth) {
        this.name = name;
        this.weight = weight;
        this.bladeLength = bladeLength;
        this.bladeWidth = bladeWidth;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }
}
