package com.checkauto.dev.repository;

import com.checkauto.dev.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @author vladov
 *         06/10/2017
 */
@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByLastName(@Param("name") String name);
}
