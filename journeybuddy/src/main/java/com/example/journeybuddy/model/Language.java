package com.example.journeybuddy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"Language\"")
public class Language {
    @Id
    @Column(name = "langugage_id", nullable = false, length = 3)
    private String langugageId;

    @Column(name = "\"language\"", nullable = false)
    private String language;

    public String getLangugageId() {
        return langugageId;
    }

    public void setLangugageId(String langugageId) {
        this.langugageId = langugageId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
