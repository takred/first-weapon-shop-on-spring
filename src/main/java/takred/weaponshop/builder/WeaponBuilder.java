package takred.weaponshop.builder;

import takred.weaponshop.entity.Weapon;

import java.util.UUID;

public class WeaponBuilder {
    private String name;
    private int weight;
    private int bladeLength;
    private int bladeWidth;

    public WeaponBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public WeaponBuilder withWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public WeaponBuilder withBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
        return this;
    }

    public WeaponBuilder withBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
        return this;
    }

    public Weapon build() {
        return new Weapon(name, weight, bladeLength, bladeWidth);
    }
}
