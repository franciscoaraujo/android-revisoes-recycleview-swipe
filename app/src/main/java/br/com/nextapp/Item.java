package br.com.nextapp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by ravi on 26/09/17.
 */
@Data
@Setter
@Getter
public class Item {
    private int id;
    private String name;
    private String description;
    private double price;
    private String thumbnail;
}
