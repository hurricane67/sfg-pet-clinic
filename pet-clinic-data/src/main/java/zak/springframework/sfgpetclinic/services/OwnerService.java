package zak.springframework.sfgpetclinic.services;

import zak.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

   Owner findByLastName(String lastName);

}
