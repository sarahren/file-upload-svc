package com.ren.ping.fileuploadsvc.repository;

import com.ren.ping.fileuploadsvc.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
