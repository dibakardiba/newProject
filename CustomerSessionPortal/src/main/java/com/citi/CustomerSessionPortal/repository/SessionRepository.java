package com.citi.CustomerSessionPortal.repository;

import com.citi.CustomerSessionPortal.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

}
