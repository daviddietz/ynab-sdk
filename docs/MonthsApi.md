# MonthsApi

All URIs are relative to *https://api.youneedabudget.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBudgetMonth**](MonthsApi.md#getBudgetMonth) | **GET** /budgets/{budget_id}/months/{month} | Single budget month
[**getBudgetMonths**](MonthsApi.md#getBudgetMonths) | **GET** /budgets/{budget_id}/months | List budget months


<a name="getBudgetMonth"></a>
# **getBudgetMonth**
> MonthDetailResponse getBudgetMonth(budgetId, month)

Single budget month

Returns a single budget month

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.MonthsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

MonthsApi apiInstance = new MonthsApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
LocalDate month = new LocalDate(); // LocalDate | The Budget Month.  \"current\" can also be used to specify the current calendar month (UTC).
try {
    MonthDetailResponse result = apiInstance.getBudgetMonth(budgetId, month);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonthsApi#getBudgetMonth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |
 **month** | **LocalDate**| The Budget Month.  \&quot;current\&quot; can also be used to specify the current calendar month (UTC). |

### Return type

[**MonthDetailResponse**](MonthDetailResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBudgetMonths"></a>
# **getBudgetMonths**
> MonthSummariesResponse getBudgetMonths(budgetId)

List budget months

Returns all budget months

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.MonthsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

MonthsApi apiInstance = new MonthsApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
try {
    MonthSummariesResponse result = apiInstance.getBudgetMonths(budgetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonthsApi#getBudgetMonths");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |

### Return type

[**MonthSummariesResponse**](MonthSummariesResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

