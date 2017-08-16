package com.ernesttech.roundhousekick.runner.comparator;

import com.ernesttech.roundhousekick.domain.jooq.generated.tables.records.TestsRecord;
import org.hamcrest.Matcher;
import org.jooq.Record;
import org.jooq.Result;

/**
 * @param <T>
 */
public interface ResultComparisonProvider<T extends Object> {

    /**
     * Extracts expected result from test configuration
     *
     * @param testsRecord {@link TestsRecord} the test record
     * @return T the expected result
     */
    T provideExpectedResult(TestsRecord testsRecord);

    /**
     * Extracts result from test query
     *
     * @param results {@link Result<Record>} the result of test query
     * @return T the actual result
     */
    T provideActualResult(Result<Record> results);

    /**
     * Provides the {@link org.hamcrest.Matcher<T>} Matcher
     * to the assertion
     *
     * @param testsRecord {@link TestsRecord} the test record
     * @return {@link Matcher<T>} matcher for assertion
     */
    Matcher<T> provideMatcher(TestsRecord testsRecord);

}
