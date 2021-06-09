package faris.springframework.farispetclinic.services;

import faris.springframework.farispetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}
