package com.ernesttech.roundhousekick.runner.comparator.impl;

import com.ernesttech.roundhousekick.domain.jooq.generated.tables.records.TestsRecord;
import com.ernesttech.roundhousekick.runner.comparator.ResultComparisonProvider;
import org.hamcrest.Matcher;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.stereotype.Component;

import static org.hamcrest.CoreMatchers.is;

@Component
public class StringComparisonProvider implements ResultComparisonProvider<String> {

    @Override
    public String provideExpectedResult(TestsRecord testsRecord) {
        return String.valueOf(testsRecord.getExpected());
    }

    @Override
    public String provideActualResult(Result<Record> results) {
        return String.valueOf(results.getValues(0).get(0));
    }

    @Override
    public Matcher<String> provideMatcher(TestsRecord testsRecord) {
        return is(provideExpectedResult(testsRecord));
    }

}
