package com.training.microservices.app.users.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.training.microservices.commons.students.models.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
