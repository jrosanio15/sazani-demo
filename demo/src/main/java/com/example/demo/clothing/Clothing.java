package com.example.demo.clothing;

import jakarta.persistence.*;

@Entity
@Table(name = "clothing")
public class Clothing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    private String size;
    private int bust;
    private int waist;
    private int hip;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public int getBust() { return bust; }
    public void setBust(int bust) { this.bust = bust; }

    public int getWaist() { return waist; }
    public void setWaist(int waist) { this.waist = waist; }

    public int getHip() { return hip; }
    public void setHip(int hip) { this.hip = hip; }
}