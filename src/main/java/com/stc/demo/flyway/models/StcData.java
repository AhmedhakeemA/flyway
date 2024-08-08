package com.stc.demo.flyway.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "stc_data")
public class StcData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String mobile;

}
