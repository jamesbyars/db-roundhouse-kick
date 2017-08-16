package com.ernesttech.roundhousekick.runner.comparator;

import com.ernesttech.roundhousekick.domain.jooq.generated.tables.records.TestsRecord;
import org.jooq.Record;
import org.jooq.Result;

public interface ResultComparisonProvider<T> {

    T getExpected(TestsRecord testsRecord);

    T getActual(Result<Record> results);

}
