package com.ikea.publisher.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    public String login;

    public String password;

    public String role;


    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("login", login);
        json.put("password", password);
        json.put("role", role);
        return json;
    }
}
