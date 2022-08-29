package com.spring.pet.clinic.model;

import java.time.LocalDate;

public class Pet {
    PetType petType;
    Owner owner;
    LocalDate birthdate;

    public Pet(PetType petType, Owner owner, LocalDate birthdate) {
        this.petType = petType;
        this.owner = owner;
        this.birthdate = birthdate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
