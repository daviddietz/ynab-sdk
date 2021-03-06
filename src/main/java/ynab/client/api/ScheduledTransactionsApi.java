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

import ynab.client.invoker.ApiCallback;
import ynab.client.invoker.ApiClient;
import ynab.client.invoker.ApiException;
import ynab.client.invoker.ApiResponse;
import ynab.client.invoker.Configuration;
import ynab.client.invoker.Pair;
import ynab.client.invoker.ProgressRequestBody;
import ynab.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import ynab.client.model.ErrorResponse;
import ynab.client.model.ScheduledTransactionResponse;
import ynab.client.model.ScheduledTransactionsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScheduledTransactionsApi {
    private ApiClient apiClient;

    public ScheduledTransactionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ScheduledTransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getScheduledTransactionById
     * @param budgetId The ID of the Budget. (required)
     * @param scheduledTransactionId The ID of the Scheduled Transaction. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getScheduledTransactionByIdCall(String budgetId, String scheduledTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/budgets/{budget_id}/scheduled_transactions/{scheduled_transaction_id}"
            .replaceAll("\\{" + "budget_id" + "\\}", apiClient.escapeString(budgetId.toString()))
            .replaceAll("\\{" + "scheduled_transaction_id" + "\\}", apiClient.escapeString(scheduledTransactionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "bearer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getScheduledTransactionByIdValidateBeforeCall(String budgetId, String scheduledTransactionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'budgetId' is set
        if (budgetId == null) {
            throw new ApiException("Missing the required parameter 'budgetId' when calling getScheduledTransactionById(Async)");
        }
        
        // verify the required parameter 'scheduledTransactionId' is set
        if (scheduledTransactionId == null) {
            throw new ApiException("Missing the required parameter 'scheduledTransactionId' when calling getScheduledTransactionById(Async)");
        }
        

        com.squareup.okhttp.Call call = getScheduledTransactionByIdCall(budgetId, scheduledTransactionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Single scheduled transaction
     * Returns a single scheduled transaction
     * @param budgetId The ID of the Budget. (required)
     * @param scheduledTransactionId The ID of the Scheduled Transaction. (required)
     * @return ScheduledTransactionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ScheduledTransactionResponse getScheduledTransactionById(String budgetId, String scheduledTransactionId) throws ApiException {
        ApiResponse<ScheduledTransactionResponse> resp = getScheduledTransactionByIdWithHttpInfo(budgetId, scheduledTransactionId);
        return resp.getData();
    }

    /**
     * Single scheduled transaction
     * Returns a single scheduled transaction
     * @param budgetId The ID of the Budget. (required)
     * @param scheduledTransactionId The ID of the Scheduled Transaction. (required)
     * @return ApiResponse&lt;ScheduledTransactionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ScheduledTransactionResponse> getScheduledTransactionByIdWithHttpInfo(String budgetId, String scheduledTransactionId) throws ApiException {
        com.squareup.okhttp.Call call = getScheduledTransactionByIdValidateBeforeCall(budgetId, scheduledTransactionId, null, null);
        Type localVarReturnType = new TypeToken<ScheduledTransactionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Single scheduled transaction (asynchronously)
     * Returns a single scheduled transaction
     * @param budgetId The ID of the Budget. (required)
     * @param scheduledTransactionId The ID of the Scheduled Transaction. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getScheduledTransactionByIdAsync(String budgetId, String scheduledTransactionId, final ApiCallback<ScheduledTransactionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getScheduledTransactionByIdValidateBeforeCall(budgetId, scheduledTransactionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ScheduledTransactionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getScheduledTransactions
     * @param budgetId The ID of the Budget. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getScheduledTransactionsCall(String budgetId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/budgets/{budget_id}/scheduled_transactions"
            .replaceAll("\\{" + "budget_id" + "\\}", apiClient.escapeString(budgetId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "bearer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getScheduledTransactionsValidateBeforeCall(String budgetId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'budgetId' is set
        if (budgetId == null) {
            throw new ApiException("Missing the required parameter 'budgetId' when calling getScheduledTransactions(Async)");
        }
        

        com.squareup.okhttp.Call call = getScheduledTransactionsCall(budgetId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List scheduled transactions
     * Returns all scheduled transactions
     * @param budgetId The ID of the Budget. (required)
     * @return ScheduledTransactionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ScheduledTransactionsResponse getScheduledTransactions(String budgetId) throws ApiException {
        ApiResponse<ScheduledTransactionsResponse> resp = getScheduledTransactionsWithHttpInfo(budgetId);
        return resp.getData();
    }

    /**
     * List scheduled transactions
     * Returns all scheduled transactions
     * @param budgetId The ID of the Budget. (required)
     * @return ApiResponse&lt;ScheduledTransactionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ScheduledTransactionsResponse> getScheduledTransactionsWithHttpInfo(String budgetId) throws ApiException {
        com.squareup.okhttp.Call call = getScheduledTransactionsValidateBeforeCall(budgetId, null, null);
        Type localVarReturnType = new TypeToken<ScheduledTransactionsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List scheduled transactions (asynchronously)
     * Returns all scheduled transactions
     * @param budgetId The ID of the Budget. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getScheduledTransactionsAsync(String budgetId, final ApiCallback<ScheduledTransactionsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getScheduledTransactionsValidateBeforeCall(budgetId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ScheduledTransactionsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
