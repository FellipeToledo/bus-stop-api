package com.azvtech.bus_stop_api.repository;

import com.azvtech.bus_stop_api.model.Stop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Fellipe Toledo
 */

@Repository
public interface StopRepository extends JpaRepository<Stop, Long> {

}
