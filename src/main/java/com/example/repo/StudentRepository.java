package com.example.repo;

import com.example.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sith
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, String> {}
