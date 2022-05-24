package com.ikea.publisher.model;

import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.InputStream;
import java.util.Date;

@Getter
@Setter
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idPayments;

    public long id;
    public String category;

    public String sex;

    public String vintage;

    public String lastName;

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("idPayments", idPayments);
        json.put("id", id);
        json.put("category", category);
        json.put("sex", sex);
        json.put("vintage", vintage);
        json.put("lastName", lastName);
        return json;
    }
}
