package com.workshop.mobileshop.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Data
@Getter
@Setter
@Component

public class Mobile {
    private int id;
    private String modelName;
    private String brandName;
    private String chip;
    private String display;
    private String camara;
    private String modelYear;


}
