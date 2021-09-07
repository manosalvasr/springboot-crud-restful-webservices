package com.full_crud_aws.aws_crud.repository;

import com.full_crud_aws.aws_crud.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
