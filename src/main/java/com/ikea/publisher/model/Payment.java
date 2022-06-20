package com.ikea.publisher.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;
import org.springframework.data.annotation.Id;
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

    public LocalDateTime dateTime;
    public String dateAndTime;

    public Payment(int i, String test, int price, String pln, String s) {
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("id", idPayments);
        json.put("firstName", firstName);
        json.put("price", price);
        json.put("typeOfPrice", typeOfPrice);
        json.put("dateAndTime", dateAndTime);
        return json;
    }
}