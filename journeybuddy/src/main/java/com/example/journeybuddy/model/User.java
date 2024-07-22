package com.example.journeybuddy.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @Column(name = "user_id", nullable = false)
    private Integer id;

    @Column(name = "email", nullable = false)
    private Integer email;

    @Column(name = "password_hash", nullable = false)
    private Integer passwordHash;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "preferred_currency", nullable = false)
    private Language preferredCurrency;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "preferred_language", nullable = false)
    private Language preferredLanguage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmail() {
        return email;
    }

    public void setEmail(Integer email) {
        this.email = email;
    }

    public Integer getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(Integer passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Language getPreferredCurrency() {
        return preferredCurrency;
    }

    public void setPreferredCurrency(Language preferredCurrency) {
        this.preferredCurrency = preferredCurrency;
    }

    public Language getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(Language preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

}
