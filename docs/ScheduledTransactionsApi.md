# ScheduledTransactionsApi

All URIs are relative to *https://api.youneedabudget.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getScheduledTransactionById**](ScheduledTransactionsApi.md#getScheduledTransactionById) | **GET** /budgets/{budget_id}/scheduled_transactions/{scheduled_transaction_id} | Single scheduled transaction
[**getScheduledTransactions**](ScheduledTransactionsApi.md#getScheduledTransactions) | **GET** /budgets/{budget_id}/scheduled_transactions | List scheduled transactions


<a name="getScheduledTransactionById"></a>
# **getScheduledTransactionById**
> ScheduledTransactionResponse getScheduledTransactionById(budgetId, scheduledTransactionId)

Single scheduled transaction

Returns a single scheduled transaction

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.ScheduledTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

ScheduledTransactionsApi apiInstance = new ScheduledTransactionsApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
UUID scheduledTransactionId = new UUID(); // UUID | The ID of the Scheduled Transaction.
try {
    ScheduledTransactionResponse result = apiInstance.getScheduledTransactionById(budgetId, scheduledTransactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledTransactionsApi#getScheduledTransactionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |
 **scheduledTransactionId** | [**UUID**](.md)| The ID of the Scheduled Transaction. |

### Return type

[**ScheduledTransactionResponse**](ScheduledTransactionResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getScheduledTransactions"></a>
# **getScheduledTransactions**
> ScheduledTransactionsResponse getScheduledTransactions(budgetId)

List scheduled transactions

Returns all scheduled transactions

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.ScheduledTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

ScheduledTransactionsApi apiInstance = new ScheduledTransactionsApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
try {
    ScheduledTransactionsResponse result = apiInstance.getScheduledTransactions(budgetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledTransactionsApi#getScheduledTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |

### Return type

[**ScheduledTransactionsResponse**](ScheduledTransactionsResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

