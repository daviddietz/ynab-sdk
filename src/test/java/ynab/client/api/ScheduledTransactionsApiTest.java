/*
 * YNAB API Endpoints
 * Our API uses a REST based design, leverages the JSON data format, and relies upon HTTPS for transport. We respond with meaningful HTTP response codes and if an error occurs, we include error details in the response body.  API Documentation is at https://api.youneedabudget.com
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ynab.client.api;

import ynab.client.invoker.ApiException;
import ynab.client.model.ErrorResponse;
import ynab.client.model.ScheduledTransactionResponse;
import ynab.client.model.ScheduledTransactionsResponse;
import java.util.List;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScheduledTransactionsApi
 */
@Ignore
public class ScheduledTransactionsApiTest {

    private final ScheduledTransactionsApi api = new ScheduledTransactionsApi();

    
    /**
     * Single scheduled transaction
     *
     * Returns a single scheduled transaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScheduledTransactionByIdTest() throws ApiException {
        String budgetId = null;
        String scheduledTransactionId = null;
        ScheduledTransactionResponse response = api.getScheduledTransactionById(budgetId, scheduledTransactionId);

        // TODO: test validations
    }
    
    /**
     * List scheduled transactions
     *
     * Returns all scheduled transactions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getScheduledTransactionsTest() throws ApiException {
        String budgetId = null;
        ScheduledTransactionsResponse response = api.getScheduledTransactions(budgetId);

        // TODO: test validations
    }
    
}
