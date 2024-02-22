package com.workshop.mobileshop.repo;

import com.workshop.mobileshop.module.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepo extends JpaRepository<Mobile,Integer> {
}
