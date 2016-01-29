package ca.airspeed.energylog.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import ca.airspeed.energylog.domain.Reading;

public interface ReadingRepository extends PagingAndSortingRepository<Reading, Long> {

}
