package com.ernesttech.roundhousekick.cucumber.steps;

import com.ernesttech.roundhousekick.domain.jooq.generated.tables.records.TestsRecord;
import com.ernesttech.roundhousekick.manager.QueryExecutionManager;
import com.ernesttech.roundhousekick.manager.TestManager;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.jooq.Record;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collections;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class Steps {

    @Mock
    private TestManager testManager;

    @Mock
    private QueryExecutionManager queryExecutionManager;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Given("^I have a test that expects a value of \"([^\"]*)\"$")
    public void iHaveATestThatExpectsAValueOf(String expectedValue) throws Throwable {

        TestsRecord testsRecord = new TestsRecord();
        testsRecord.setExpected(expectedValue);

        when(testManager.findAllTests())
                .thenReturn(Collections.singletonList(testsRecord));

        when(queryExecutionManager.executeQuery(anyString()))
                .thenReturn(null);



    }

    @When("^I execute my test case$")
    public void iExecuteMyTestCase() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I see that the result of the query is \"([^\"]*)\"$")
    public void iSeeThatTheResultOfTheQueryIs(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
