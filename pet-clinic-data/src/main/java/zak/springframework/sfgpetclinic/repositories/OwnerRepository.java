package zak.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zak.springframework.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
