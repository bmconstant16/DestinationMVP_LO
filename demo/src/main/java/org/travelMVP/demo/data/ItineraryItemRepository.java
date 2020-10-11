package org.travelMVP.demo.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.travelMVP.demo.models.ItineraryItem;

@Repository
public interface ItineraryItemRepository extends CrudRepository<ItineraryItem, Integer> {

}
