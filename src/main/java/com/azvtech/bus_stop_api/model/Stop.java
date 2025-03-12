package com.azvtech.bus_stop_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Fellipe Toledo
 */

@Data
@Entity
public class Stop {
    @Id
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;

}
