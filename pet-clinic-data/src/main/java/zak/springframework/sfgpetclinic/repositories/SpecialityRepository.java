package zak.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zak.springframework.sfgpetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
