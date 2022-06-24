/**
 * This package includes model for Payment
 */
package com.ikea.publisher.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import net.minidev.json.JSONObject;
import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.math.BigInteger;

/**
 * This class contains the Payment model, fields identifying the Payment
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public BigInteger idPayments;
    @OneToOne(mappedBy = "player", cascade = CascadeType.MERGE)
    public String firstName;
    public Long price;
    public String typeOfPrice;
    public String dateAndTime;

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