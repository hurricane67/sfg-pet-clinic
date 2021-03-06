package zak.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import zak.springframework.sfgpetclinic.model.Speciality;
import zak.springframework.sfgpetclinic.model.Vet;
import zak.springframework.sfgpetclinic.services.SpecialityService;
import zak.springframework.sfgpetclinic.services.VetService;

import java.util.Set;

@Service
    public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == 0) {
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return  super.findById(id);
    }
}
