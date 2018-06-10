package Repositories;

import org.springframework.data.repository.CrudRepository;

import cb3.webapp.watchmegrow.models.Baby;

public interface BabyRepository extends CrudRepository<Baby, Long> {

}
