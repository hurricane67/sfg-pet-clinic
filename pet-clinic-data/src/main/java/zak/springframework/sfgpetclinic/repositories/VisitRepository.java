package zak.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zak.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
