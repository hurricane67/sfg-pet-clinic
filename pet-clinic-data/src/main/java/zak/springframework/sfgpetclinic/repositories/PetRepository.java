package zak.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zak.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
