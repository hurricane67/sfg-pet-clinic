package zak.springframework.sfgpetclinic.services.map;

import zak.springframework.sfgpetclinic.model.Specialty;
import zak.springframework.sfgpetclinic.services.SpecialtyService;

import java.util.Set;

public class SpecialtyServiceMap extends AbstractMapService<Specialty,Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }




}
