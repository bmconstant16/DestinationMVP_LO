package org.travelMVP.demo.data;

import org.springframework.data.repository.CrudRepository;
import org.travelMVP.demo.models.AbstractEntity;
import org.travelMVP.demo.models.Companion;

public interface CompanionRepository extends CrudRepository<Companion, Integer> {

}
