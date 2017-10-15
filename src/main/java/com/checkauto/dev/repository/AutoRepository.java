package com.checkauto.dev.repository;

import com.checkauto.dev.domain.Auto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author vladov
 *         06/10/2017
 */
@RepositoryRestResource
public interface AutoRepository extends CrudRepository<Auto, Long> {
}
