package com.Helpdesk.Maple3.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "account")
public class Account implements java.io.Serializable {

    @Id
    private Integer id;
    private Role role;
    private String username;
    private String password;
    private int fullName;
    private boolean status;
    private String email;
    private String phone;
    private Set<Tickets> ticketsForEmployeeId = new HashSet<Tickets>(0);
    private Set<Tickets> ticketsForUserId = new HashSet<Tickets>(0);

    public Account() {
        super();
    }

    public Account(Role role, String username, String password, int fullName, boolean status, String email, String phone) {
        this.role = role;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.status = status;
        this.email = email;
        this.phone = phone;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getFullName() {
        return fullName;
    }

    public void setFullName(int fullName) {
        this.fullName = fullName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
