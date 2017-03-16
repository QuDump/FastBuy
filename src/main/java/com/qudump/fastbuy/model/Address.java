package com.qudump.fastbuy.model;

import com.sun.istack.internal.NotNull;
import lombok.NonNull;

import javax.persistence.*;

/**
 * Created by daniel on 2017/3/16.
 */
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue
    private Integer id;
    private String country;
    @NonNull
    private String province;
    @NonNull
    private String city;
    @NotNull
    private String county;
    @NonNull
    private String detailAddress;

    private Boolean isDefault = false;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "uid")
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
