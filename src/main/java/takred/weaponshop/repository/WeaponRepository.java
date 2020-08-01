package takred.weaponshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import takred.weaponshop.entity.Weapon;

import java.util.UUID;

public interface WeaponRepository extends JpaRepository<Weapon, UUID> {
    boolean existsByName(String name);

    Weapon findByName(String name);
}
