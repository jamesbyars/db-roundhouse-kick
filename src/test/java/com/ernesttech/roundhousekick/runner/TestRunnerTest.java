package com.ernesttech.roundhousekick.runner;

import com.ernesttech.roundhousekick.domain.jooq.generated.tables.records.TestsRecord;
import com.ernesttech.roundhousekick.manager.QueryExecutionManager;
import com.ernesttech.roundhousekick.manager.TestManager;
import com.ernesttech.roundhousekick.runner.comparator.ComparatorFactory;
import com.ernesttech.roundhousekick.runner.comparator.ResultComparisonProvider;
import org.jooq.Record;
import org.jooq.Result;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class TestRunnerTest {

    private TestManager testManager;

    private QueryExecutionManager queryExecutionManager;

    private ComparatorFactory comparatorFactory;

    @Autowired
    TestRunnerTest(TestManager testManager,
                   QueryExecutionManager queryExecutionManager,
                   ComparatorFactory comparatorFactory) {
        this.testManager = testManager;
        this.queryExecutionManager = queryExecutionManager;
        this.comparatorFactory = comparatorFactory;
    }

    @TestFactory
    Collection<DynamicTest> executeTests() {

        Collection<DynamicTest> dynamicTests = new ArrayList<>();

        List<TestsRecord> testCases = testManager.findAllTests();

        for (TestsRecord testsRecord : testCases) {

            Executable executable = () -> {

                ResultComparisonProvider resultComparisonProvider = comparatorFactory.getComparator(null);

                Result<Record> results = queryExecutionManager.executeQuery(testsRecord.getTest());

                assertThat(resultComparisonProvider.provideActualResult(results), resultComparisonProvider.provideMatcher(testsRecord));

            };

            DynamicTest dynamicTest = dynamicTest(testsRecord.getName(), executable);

            dynamicTests.add(dynamicTest);
        }

        return dynamicTests;
    }

}
