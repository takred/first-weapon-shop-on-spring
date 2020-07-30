package takred.weaponshop.web;

import org.springframework.web.bind.annotation.*;
import takred.weaponshop.Couple;
import takred.weaponshop.entity.Weapon;
import takred.weaponshop.service.WeaponService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/")
public class WeaponController {
    private final WeaponService weaponService;

    public WeaponController(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    @GetMapping(value = "get_weapon/{id}")
    public Weapon getWeapon(@PathVariable("id") UUID id) {
        return weaponService.getWeapon(id);
    }

    @GetMapping(value = "get_all_id")
    public List<Couple> getAllId() {
        return weaponService.getAllId();
    }

    @PostMapping(value = "add_weapon")
    public String addWeapon(Weapon weapon) {
        return weaponService.addWeapon(weapon);
    }
}
