package com.ernesttech.roundhousekick.runner.comparator.impl;

import com.ernesttech.roundhousekick.domain.jooq.generated.tables.records.TestsRecord;
import com.ernesttech.roundhousekick.runner.comparator.ResultComparisonProvider;
import org.jooq.Record;
import org.jooq.Result;

public class StringComparisonProvider implements ResultComparisonProvider<String> {

    @Override
    public String getExpected(TestsRecord testsRecord) {
        return null;
    }

    @Override
    public String getActual(Result<Record> results) {
        return null;
    }


}
