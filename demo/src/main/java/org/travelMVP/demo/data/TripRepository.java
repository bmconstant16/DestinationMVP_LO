package org.travelMVP.demo.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.travelMVP.demo.models.Trip;

@Repository
public interface TripRepository extends CrudRepository<Trip, Integer> {

}
