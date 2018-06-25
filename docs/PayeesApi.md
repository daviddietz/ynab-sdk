# PayeesApi

All URIs are relative to *https://api.youneedabudget.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPayeeById**](PayeesApi.md#getPayeeById) | **GET** /budgets/{budget_id}/payees/{payee_id} | Single payee
[**getPayees**](PayeesApi.md#getPayees) | **GET** /budgets/{budget_id}/payees | List payees


<a name="getPayeeById"></a>
# **getPayeeById**
> PayeeResponse getPayeeById(budgetId, payeeId)

Single payee

Returns single payee

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.PayeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

PayeesApi apiInstance = new PayeesApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
UUID payeeId = new UUID(); // UUID | The ID of the Payee.
try {
    PayeeResponse result = apiInstance.getPayeeById(budgetId, payeeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayeesApi#getPayeeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |
 **payeeId** | [**UUID**](.md)| The ID of the Payee. |

### Return type

[**PayeeResponse**](PayeeResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPayees"></a>
# **getPayees**
> PayeesResponse getPayees(budgetId)

List payees

Returns all payees

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.PayeesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

PayeesApi apiInstance = new PayeesApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
try {
    PayeesResponse result = apiInstance.getPayees(budgetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayeesApi#getPayees");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |

### Return type

[**PayeesResponse**](PayeesResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

