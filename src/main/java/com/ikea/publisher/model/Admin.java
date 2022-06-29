package com.ikea.publisher.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;

import javax.persistence.Entity;
import javax.persistence.Table;

public class Admin {
    public String login;

    public String password;

    public String role;

    /**
     * Method converting data to string
     * @return String values
     */
    @Override
    public String toString() {
        return "Admin{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
