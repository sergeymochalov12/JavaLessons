package ru.geekbrains.api.lesson5.cw.ex1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Item {
    private String name;
    private String country;
    private Integer volume;
}