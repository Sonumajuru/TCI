package com.tci.crawling;

import java.util.List;

public class DummyClass {

    /** Method getMean */
    public double getMean(List<Double> mean){

        double sum = 0;

        if (mean.isEmpty()) {
            throw new IllegalArgumentException("list is empty");
        }

        for (int i = 0; i < mean.size(); i++) {
            sum += mean.get(i);
        }
        return sum / mean.size();
    }
}
