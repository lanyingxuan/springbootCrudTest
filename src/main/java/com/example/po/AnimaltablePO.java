package com.example.po;

import java.util.Date;

public class AnimaltablePO {
    private Integer id;

    private String animalName;

    private String animalType;

    private Integer animalAge;

    private Integer animalLength;

    private Integer animalWeight;

    private Date starttime;

    private String ownerName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName == null ? null : animalName.trim();
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType == null ? null : animalType.trim();
    }

    public Integer getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(Integer animalAge) {
        this.animalAge = animalAge;
    }

    public Integer getAnimalLength() {
        return animalLength;
    }

    public void setAnimalLength(Integer animalLength) {
        this.animalLength = animalLength;
    }

    public Integer getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(Integer animalWeight) {
        this.animalWeight = animalWeight;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }
}