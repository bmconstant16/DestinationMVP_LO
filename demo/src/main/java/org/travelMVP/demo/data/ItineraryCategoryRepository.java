package org.travelMVP.demo.data;

import org.springframework.data.repository.CrudRepository;
import org.travelMVP.demo.models.ItineraryCategory;

public interface ItineraryCategoryRepository extends CrudRepository<ItineraryCategory, Integer> {
}
