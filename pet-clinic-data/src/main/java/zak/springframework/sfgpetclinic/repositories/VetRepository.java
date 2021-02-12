package zak.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zak.springframework.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
