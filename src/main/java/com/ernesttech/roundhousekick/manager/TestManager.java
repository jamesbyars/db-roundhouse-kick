package com.ernesttech.roundhousekick.manager;

import com.ernesttech.roundhousekick.domain.jooq.generated.tables.records.TestsRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.ernesttech.roundhousekick.domain.jooq.generated.Tables.TESTS;

@Repository
public class TestManager extends AbstractJooqManager<TestsRecord> {

    public List<TestsRecord> findAllTests() {
        return context
                .select()
                .from(TESTS)
                .fetchInto(TestsRecord.class);
    }

}