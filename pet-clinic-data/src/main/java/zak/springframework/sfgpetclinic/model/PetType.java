package zak.springframework.sfgpetclinic.model;

import java.io.Serializable;

public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
