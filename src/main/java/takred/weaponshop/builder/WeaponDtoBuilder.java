package takred.weaponshop.builder;

import takred.weaponshop.dto.WeaponDto;
import takred.weaponshop.entity.Weapon;

import java.util.UUID;

public class WeaponDtoBuilder {
    private UUID id;
    private String name;
    private int weight;
    private int bladeLength;
    private int bladeWidth;

    public WeaponDtoBuilder withId(UUID id) {
        this.id = id;
        return this;
    }

    public WeaponDtoBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public WeaponDtoBuilder withWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public WeaponDtoBuilder withBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
        return this;
    }

    public WeaponDtoBuilder withBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
        return this;
    }

    public WeaponDto build() {
        return new WeaponDto(id ,name, weight, bladeLength, bladeWidth);
    }
}
