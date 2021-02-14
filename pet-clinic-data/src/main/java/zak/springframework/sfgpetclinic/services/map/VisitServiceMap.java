package zak.springframework.sfgpetclinic.services.map;

import zak.springframework.sfgpetclinic.model.Visit;
import zak.springframework.sfgpetclinic.services.VisitService;

import java.util.Set;

public class VisitServiceMap extends AbstractMapService<Visit,Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
     @Override
    public Visit save(Visit object) {
        if(object.getPet()==null || object.getPet().getId()==null ||
            object.getPet().getOwner()==null || object.getPet().getOwner().getId()== null){
            throw new RuntimeException("invalid visit");
        }
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

}
