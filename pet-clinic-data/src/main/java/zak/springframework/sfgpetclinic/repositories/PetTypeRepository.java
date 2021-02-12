package zak.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zak.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
