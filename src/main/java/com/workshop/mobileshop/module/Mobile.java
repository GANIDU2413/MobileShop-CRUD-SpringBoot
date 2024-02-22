package com.workshop.mobileshop.module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Component
@Entity(name = "mobile_phone") // class name eka table ekt match krnw

public class Mobile {
    @Id
    private int id;
    private String modelName;
    private String brandName;
    private String chip;
    private String display;
    private String camara;
    private String modelYear;


}
