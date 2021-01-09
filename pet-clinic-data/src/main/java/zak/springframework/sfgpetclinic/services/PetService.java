package zak.springframework.sfgpetclinic.services;

import zak.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById (Long id);

    Pet save (Pet pet);

    Set<Pet> findAll ();
}
