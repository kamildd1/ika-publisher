package com.ikea.publisher.model;

import com.ikea.publisher.service.storage.DataStorage;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Getter
@Setter
public class Payment {

    private DataStorage dataStorage;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
    public String firstName;

    @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
    public String lastName;

    public int price;

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("id", id);
        json.put("firstName", firstName);
        json.put("lastName", lastName);
        json.put("price", price);
        return json;
    }
    }