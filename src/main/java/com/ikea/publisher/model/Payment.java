package com.ikea.publisher.model;

import com.ikea.publisher.DateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;
import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Payment {

    private DateTime dateTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public BigInteger idPayments;
    @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
    public String firstName;
    public Long price;
    public String typeOfPrice;

    public LocalDateTime dateTimeActual;
    public String dateAndTime;

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("id", idPayments);
        json.put("firstName", firstName);
        json.put("price", price);
        json.put("typeOfPrice", typeOfPrice);
        json.put("dateAndTime", dateTime.getDateTime());
        return json;
    }
}