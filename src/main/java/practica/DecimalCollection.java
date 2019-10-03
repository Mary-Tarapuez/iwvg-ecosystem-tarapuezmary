package practica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecimalCollection {

    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        this.validateIsNullOrEmpty();
        return this.collection.stream().mapToDouble(Double::doubleValue).sum();
    }

    public double media() {
        double sum1 = sum();
        double list = this.collection.size();
        return sum1 / list;
    }

    private void validateIsNullOrEmpty() {
        if ((this.collection == null) || this.collection.isEmpty()) {
            throw new ArithmeticException("Null or Empty collection");
        }
    }

    public double higher() {
        this.validateIsNullOrEmpty();
        return Collections.max(this.collection);

    }

    public double multiplicar() {
        this.validateIsNullOrEmpty();
        double result = 1.0;
        for (double valor : this.collection) {

            result = valor * result;
        }
        return result;
    }
}