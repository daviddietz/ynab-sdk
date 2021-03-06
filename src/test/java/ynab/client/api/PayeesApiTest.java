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
import ynab.client.model.PayeeResponse;
import ynab.client.model.PayeesResponse;
import java.util.List;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PayeesApi
 */
@Ignore
public class PayeesApiTest {

    private final PayeesApi api = new PayeesApi();

    
    /**
     * Single payee
     *
     * Returns single payee
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPayeeByIdTest() throws ApiException {
        String budgetId = null;
        String payeeId = null;
        PayeeResponse response = api.getPayeeById(budgetId, payeeId);

        // TODO: test validations
    }
    
    /**
     * List payees
     *
     * Returns all payees
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPayeesTest() throws ApiException {
        String budgetId = null;
        PayeesResponse response = api.getPayees(budgetId);

        // TODO: test validations
    }
    
}
