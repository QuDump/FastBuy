package com.qudump.fastbuy.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by daniel on 2017/3/13.
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 30, nullable = false)
    private String name;
    @Column(name = "mobile", length = 11, nullable = false, unique = true)
    private String mobile;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Address> addresses;

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }
}
