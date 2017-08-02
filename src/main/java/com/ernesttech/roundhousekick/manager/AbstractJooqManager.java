package com.ernesttech.roundhousekick.manager;

import org.jooq.DSLContext;
import org.jooq.UpdatableRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AbstractJooqManager<R extends UpdatableRecord<R>> {

    @Autowired
    protected DSLContext context;

}
