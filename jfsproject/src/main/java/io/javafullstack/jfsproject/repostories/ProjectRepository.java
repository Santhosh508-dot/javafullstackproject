package io.javafullstack.jfsproject.repostories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.javafullstack.jfsproject.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

	@Override
	Iterable<Project> findAllById(Iterable<Long> ids);
}
