package takred.weaponshop.dto;

import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.UUID;

@Value
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class WeaponDto {
    @EqualsAndHashCode.Include
    private final UUID id;
    private final String name;
    private final int weight;
    private final int bladeLength;
    private final int bladeWidth;


    public WeaponDto(UUID id, String name, int weight, int bladeLength, int bladeWidth) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.bladeLength = bladeLength;
        this.bladeWidth = bladeWidth;
    }
}
