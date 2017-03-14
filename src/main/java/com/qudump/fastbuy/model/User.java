package com.qudump.fastbuy.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by daniel on 2017/3/13.
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", length = 30, nullable = false)
    private String name;
    @Column(name = "mobile", length = 11, nullable = false, unique = true)
    private String mobilePhone;
    @Column(name = "address", length = 50)
    private String address;

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
        this.name = name;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
