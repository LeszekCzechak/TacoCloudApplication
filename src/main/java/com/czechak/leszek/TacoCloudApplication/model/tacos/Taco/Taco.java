package com.czechak.leszek.TacoCloudApplication.model.tacos.Taco;

import com.czechak.leszek.TacoCloudApplication.model.tacos.Ingredient;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Taco {
    private String id;

    private String name;

    private Date createdAt = new Date();

    private List<Ingredient> ingredients;
}
