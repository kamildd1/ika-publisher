package com.ikea.publisher.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Payment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public BigInteger idPayments;
    @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
    public String firstName;

    public long price;

    public String typeOfPrice;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    public String dateAndTime;

    public String getDateAndTime(String dateAndTime) {
        String.format(this.dateAndTime, "yyyy-MM-dd'T'HH:mm:ss");
        return this.dateAndTime;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("id", idPayments);
        json.put("firstName", firstName);
        json.put("price", price);
        json.put("typeOfPrice", typeOfPrice);
        json.put("dateAndTime", getDateAndTime(dateAndTime));
        return json;
    }
}