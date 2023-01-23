package com.gr8erkay.tutorialproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Hospital {

    @Id
    private Long id;
    private String name;
    private String address;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
