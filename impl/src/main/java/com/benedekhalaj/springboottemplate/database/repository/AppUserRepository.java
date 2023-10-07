package com.benedekhalaj.springboottemplate.database.repository;

import com.benedekhalaj.springboottemplate.database.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, UUID> {

}
