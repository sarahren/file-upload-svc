package com.ren.ping.fileuploadsvc.repository;

import com.ren.ping.fileuploadsvc.entity.File;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends CrudRepository<File, Long> {}
