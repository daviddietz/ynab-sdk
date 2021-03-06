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
import org.threeten.bp.LocalDate;
import ynab.client.model.MonthDetailResponse;
import ynab.client.model.MonthSummariesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonthsApi {
    private ApiClient apiClient;

    public MonthsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MonthsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getBudgetMonth
     * @param budgetId The ID of the Budget. (required)
     * @param month The Budget Month.  \&quot;current\&quot; can also be used to specify the current calendar month (UTC). (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBudgetMonthCall(String budgetId, LocalDate month, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/budgets/{budget_id}/months/{month}"
            .replaceAll("\\{" + "budget_id" + "\\}", apiClient.escapeString(budgetId))
            .replaceAll("\\{" + "month" + "\\}", apiClient.escapeString(month.toString()));

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
    private com.squareup.okhttp.Call getBudgetMonthValidateBeforeCall(String budgetId, LocalDate month, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'budgetId' is set
        if (budgetId == null) {
            throw new ApiException("Missing the required parameter 'budgetId' when calling getBudgetMonth(Async)");
        }
        
        // verify the required parameter 'month' is set
        if (month == null) {
            throw new ApiException("Missing the required parameter 'month' when calling getBudgetMonth(Async)");
        }
        

        com.squareup.okhttp.Call call = getBudgetMonthCall(budgetId, month, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Single budget month
     * Returns a single budget month
     * @param budgetId The ID of the Budget. (required)
     * @param month The Budget Month.  \&quot;current\&quot; can also be used to specify the current calendar month (UTC). (required)
     * @return MonthDetailResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MonthDetailResponse getBudgetMonth(String budgetId, LocalDate month) throws ApiException {
        ApiResponse<MonthDetailResponse> resp = getBudgetMonthWithHttpInfo(budgetId, month);
        return resp.getData();
    }

    /**
     * Single budget month
     * Returns a single budget month
     * @param budgetId The ID of the Budget. (required)
     * @param month The Budget Month.  \&quot;current\&quot; can also be used to specify the current calendar month (UTC). (required)
     * @return ApiResponse&lt;MonthDetailResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MonthDetailResponse> getBudgetMonthWithHttpInfo(String budgetId, LocalDate month) throws ApiException {
        com.squareup.okhttp.Call call = getBudgetMonthValidateBeforeCall(budgetId, month, null, null);
        Type localVarReturnType = new TypeToken<MonthDetailResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Single budget month (asynchronously)
     * Returns a single budget month
     * @param budgetId The ID of the Budget. (required)
     * @param month The Budget Month.  \&quot;current\&quot; can also be used to specify the current calendar month (UTC). (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBudgetMonthAsync(String budgetId, LocalDate month, final ApiCallback<MonthDetailResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getBudgetMonthValidateBeforeCall(budgetId, month, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MonthDetailResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getBudgetMonths
     * @param budgetId The ID of the Budget. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getBudgetMonthsCall(String budgetId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/budgets/{budget_id}/months"
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
    private com.squareup.okhttp.Call getBudgetMonthsValidateBeforeCall(String budgetId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'budgetId' is set
        if (budgetId == null) {
            throw new ApiException("Missing the required parameter 'budgetId' when calling getBudgetMonths(Async)");
        }
        

        com.squareup.okhttp.Call call = getBudgetMonthsCall(budgetId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List budget months
     * Returns all budget months
     * @param budgetId The ID of the Budget. (required)
     * @return MonthSummariesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MonthSummariesResponse getBudgetMonths(String budgetId) throws ApiException {
        ApiResponse<MonthSummariesResponse> resp = getBudgetMonthsWithHttpInfo(budgetId);
        return resp.getData();
    }

    /**
     * List budget months
     * Returns all budget months
     * @param budgetId The ID of the Budget. (required)
     * @return ApiResponse&lt;MonthSummariesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MonthSummariesResponse> getBudgetMonthsWithHttpInfo(String budgetId) throws ApiException {
        com.squareup.okhttp.Call call = getBudgetMonthsValidateBeforeCall(budgetId, null, null);
        Type localVarReturnType = new TypeToken<MonthSummariesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List budget months (asynchronously)
     * Returns all budget months
     * @param budgetId The ID of the Budget. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBudgetMonthsAsync(String budgetId, final ApiCallback<MonthSummariesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getBudgetMonthsValidateBeforeCall(budgetId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MonthSummariesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
