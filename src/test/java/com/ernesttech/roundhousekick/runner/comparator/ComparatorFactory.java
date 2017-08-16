package com.ernesttech.roundhousekick.runner.comparator;

import com.ernesttech.roundhousekick.runner.comparator.impl.StringComparisonProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComparatorFactory {

    @Autowired
    private StringComparisonProvider stringComparisonProvider;

    public ResultComparisonProvider getComparator(String type) {
        return stringComparisonProvider;
    }

}
