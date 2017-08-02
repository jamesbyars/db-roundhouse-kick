/**
 * This class is generated by jOOQ
 */
package com.ernesttech.roundhousekick.domain.jooq.generated.tables.records;


import com.ernesttech.roundhousekick.domain.jooq.generated.tables.Tests;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.8.3"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TestsRecord extends UpdatableRecordImpl<TestsRecord> implements Record6<UUID, String, String, String, String, String> {

    private static final long serialVersionUID = 1466861045;

    /**
     * Setter for <code>public.tests.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tests.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.tests.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tests.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.tests.test</code>.
     */
    public void setTest(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tests.test</code>.
     */
    public String getTest() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.tests.expected</code>.
     */
    public void setExpected(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.tests.expected</code>.
     */
    public String getExpected() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.tests.failure_message</code>.
     */
    public void setFailureMessage(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.tests.failure_message</code>.
     */
    public String getFailureMessage() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.tests.test_set</code>.
     */
    public void setTestSet(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.tests.test_set</code>.
     */
    public String getTestSet() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Tests.TESTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tests.TESTS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Tests.TESTS.TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Tests.TESTS.EXPECTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Tests.TESTS.FAILURE_MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Tests.TESTS.TEST_SET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getExpected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFailureMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTestSet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestsRecord value1(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestsRecord value3(String value) {
        setTest(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestsRecord value4(String value) {
        setExpected(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestsRecord value5(String value) {
        setFailureMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestsRecord value6(String value) {
        setTestSet(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestsRecord values(UUID value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TestsRecord
     */
    public TestsRecord() {
        super(Tests.TESTS);
    }

    /**
     * Create a detached, initialised TestsRecord
     */
    public TestsRecord(UUID id, String name, String test, String expected, String failureMessage, String testSet) {
        super(Tests.TESTS);

        set(0, id);
        set(1, name);
        set(2, test);
        set(3, expected);
        set(4, failureMessage);
        set(5, testSet);
    }
}
