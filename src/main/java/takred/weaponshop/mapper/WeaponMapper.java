package takred.weaponshop.mapper;

import takred.weaponshop.builder.WeaponBuilder;
import takred.weaponshop.builder.WeaponDtoBuilder;
import takred.weaponshop.dto.WeaponDto;
import takred.weaponshop.entity.Weapon;

public class WeaponMapper {

    public Weapon map(WeaponDto dto) {
        return new WeaponBuilder()
                .withName(dto.getName())
                .withWeight(dto.getWeight())
                .withBladeLength(dto.getBladeLength())
                .withBladeWidth(dto.getBladeWidth())
                .build();
    }

    public WeaponDto map(Weapon entity) {
        return new WeaponDtoBuilder()
                .withId(entity.getId())
                .withName(entity.getName())
                .withWeight(entity.getWeight())
                .withBladeLength(entity.getBladeLength())
                .withBladeWidth(entity.getBladeWidth())
                .build();

    }
}
