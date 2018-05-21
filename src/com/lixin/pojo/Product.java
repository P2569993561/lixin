package com.lixin.pojo;

import java.util.Date;

public class Product {
    private Long id;

    private String name;

    private String sellpoint;

    private Long price;

    private Integer number;

    private String onemenu;

    private String twomenu;

    private String image;

    private Long cid;

    private Byte status;

    private Date credted;

    private Date updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSellpoint() {
        return sellpoint;
    }

    public void setSellpoint(String sellpoint) {
        this.sellpoint = sellpoint == null ? null : sellpoint.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getOnemenu() {
        return onemenu;
    }

    public void setOnemenu(String onemenu) {
        this.onemenu = onemenu == null ? null : onemenu.trim();
    }

    public String getTwomenu() {
        return twomenu;
    }

    public void setTwomenu(String twomenu) {
        this.twomenu = twomenu == null ? null : twomenu.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCredted() {
        return credted;
    }

    public void setCredted(Date credted) {
        this.credted = credted;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}