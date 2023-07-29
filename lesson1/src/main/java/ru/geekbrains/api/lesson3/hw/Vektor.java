package ru.geekbrains.api.lesson3.hw;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Vektor {
    private double x;
    private double y;
    private double z;

    /**
     * @return длина вектора
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }


    public double scalar(Vektor vektor2) {
        return x * vektor2.x + y * vektor2.y + z * vektor2.z;
    }

    public Vektor proizv(Vektor vektor2) {
        return new Vektor(y * vektor2.z - z * vektor2.y,
                z * vektor2.x - x * vektor2.z,
                x * vektor2.y - y * vektor2.x);
    }

    public double cos(Vektor vektor2) {
        return (scalar(vektor2)) / (length() * vektor2.length());
    }
}
