package takred.weaponshop.service;

import org.springframework.stereotype.Service;
import takred.weaponshop.Couple;
import takred.weaponshop.WeaponName;
import takred.weaponshop.builder.WeaponBuilder;
import takred.weaponshop.builder.WeaponDtoBuilder;
import takred.weaponshop.dto.WeaponDto;
import takred.weaponshop.entity.Weapon;
import takred.weaponshop.mapper.WeaponMapper;
import takred.weaponshop.repository.WeaponRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class WeaponService {
    private final WeaponRepository weaponRepository;

    public WeaponService(WeaponRepository weaponRepository) {
        this.weaponRepository = weaponRepository;
    }

    @PostConstruct
    public void createWeaponIfNotExists() {
        saveIfNotExists(new Weapon("Меч1", 1, 1, 1));
        saveIfNotExists(new Weapon("Меч2", 2, 2, 2));
        saveIfNotExists(new Weapon("Меч3", 3, 3, 3));
        saveIfNotExists(new Weapon("Двуручный меч1", 11, 11, 11));
        saveIfNotExists(new Weapon("Двуручный меч2", 22, 22, 22));
        saveIfNotExists(new Weapon("Двуручный меч3", 33, 33, 33));
        saveIfNotExists(new Weapon("Двуручный меч4", 44, 44, 44));
        saveIfNotExists(new Weapon("Меч4", 4, 4, 4));
    }

    public WeaponDto getWeaponById(UUID id) {
        if (weaponRepository.existsById(id)) {
            Weapon weapon = weaponRepository.findById(id).get();
            return new WeaponMapper().map(weapon);
        }
        return null;
    }

    public WeaponDto getWeaponByName(WeaponName name) {
        if (weaponRepository.existsByName(name.getName())) {
            Weapon weapon = weaponRepository.findByName(name.getName());
            return new WeaponMapper().map(weapon);
        }
        return null;
    }

    public List<Couple> getAllId() {
        List<Couple> couples = new ArrayList<>();
        List<Weapon> weapons = weaponRepository.findAll();

        for (int i = 0; i < weapons.size(); i++) {
            Weapon weapon = weapons.get(i);
            couples.add(new Couple(weapon.getName(), weapon.getId()));
        }
        return couples;
    }

    public String addWeapon(WeaponDto weaponDto) {
        Weapon weapon = new WeaponMapper().map(weaponDto);
        if (!weaponRepository.existsByName(weapon.getName())) {
            weaponRepository.save(weapon);
            return "Оружие успешно добавлено.";
        }
        return "Оружие с таким названием уже есть.";
    }

    public void saveIfNotExists(Weapon weapon) {
        if (!weaponRepository.existsByName(weapon.getName())) {
            weaponRepository.save(weapon);
        }
    }
}
