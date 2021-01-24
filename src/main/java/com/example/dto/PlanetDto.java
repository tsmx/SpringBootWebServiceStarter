package com.example.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanetDto {
    
    @JsonProperty("id")
    private String id;
    
    @JsonProperty("englishName")
    private String name;
    
    @JsonProperty("density")
    private Double density;
    
    @JsonProperty("gravity")
    private Double gravity;
    
    @JsonProperty("discoveredBy")
    private String discorveredBy;
    
    @JsonProperty("discoveryDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date discoveryDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }

    public Double getGravity() {
        return gravity;
    }

    public void setGravity(Double gravity) {
        this.gravity = gravity;
    }

    public String getDiscorveredBy() {
        return discorveredBy;
    }

    public void setDiscorveredBy(String discorveredBy) {
        this.discorveredBy = discorveredBy;
    }

    public Date getDiscoveryDate() {
        return discoveryDate;
    }

    public void setDiscoveryDate(Date discoveryDate) {
        this.discoveryDate = discoveryDate;
    }
    
    public PlanetDto() {
    }
}
