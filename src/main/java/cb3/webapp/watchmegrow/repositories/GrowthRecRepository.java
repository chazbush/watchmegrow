package cb3.webapp.watchmegrow.repositories;

import org.springframework.data.repository.CrudRepository;

import cb3.webapp.watchmegrow.models.GrowthRecord;

public interface GrowthRecRepository extends CrudRepository<GrowthRecord, Long>{

}
