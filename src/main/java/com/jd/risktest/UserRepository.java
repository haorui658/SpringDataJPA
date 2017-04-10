package com.jd.risktest;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Map;

public interface UserRepository extends JpaRepository<SpringDataUser, Long> {

   List<SpringDataUser> findAll(Map filters);

 //   Page<SpringDataUser> findAll(Map filters, Pageable pageable);
}
