package com.example.journeybuddy.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Tickets")
public class Ticket {
    @Id
    @Column(name = "ticket_id", nullable = false)
    private Integer id;

    @Column(name = "ticket_name", nullable = false)
    private String ticketName;

    @Lob
    @Column(name = "valid_zones", nullable = false)
    private String validZones;

    @Lob
    @Column(name = "valid_transport_modes", nullable = false)
    private String validTransportModes;

    @Column(name = "validity_date", nullable = false)
    private LocalDate validityDate;

    @Column(name = "city", nullable = false)
    private String city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getValidZones() {
        return validZones;
    }

    public void setValidZones(String validZones) {
        this.validZones = validZones;
    }

    public String getValidTransportModes() {
        return validTransportModes;
    }

    public void setValidTransportModes(String validTransportModes) {
        this.validTransportModes = validTransportModes;
    }

    public LocalDate getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(LocalDate validityDate) {
        this.validityDate = validityDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
