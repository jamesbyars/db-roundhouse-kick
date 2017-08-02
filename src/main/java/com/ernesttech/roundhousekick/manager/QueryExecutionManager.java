package com.ernesttech.roundhousekick.manager;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QueryExecutionManager {

    @Autowired
    protected DSLContext context;

    public Result<Record> executeQuery(final String query) {
        return context.fetch(query);
    }

}
