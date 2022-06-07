package com.ikea.publisher.model;

import com.ikea.publisher.service.storage.DataStorage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Payment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idPayments;
    @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
    public String firstName;

    @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
    public String lastName;
    public long price;

    public String club;

    public Payment() {

    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("id", idPayments);
        json.put("firstName", firstName);
        json.put("lastName", lastName);
        json.put("club", club);
        json.put("price", price);
        return json;
    }
}