# BudgetsApi

All URIs are relative to *https://api.youneedabudget.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBudgetById**](BudgetsApi.md#getBudgetById) | **GET** /budgets/{budget_id} | Single budget
[**getBudgets**](BudgetsApi.md#getBudgets) | **GET** /budgets | List budgets


<a name="getBudgetById"></a>
# **getBudgetById**
> BudgetDetailResponse getBudgetById(budgetId, lastKnowledgeOfServer)

Single budget

Returns a single budget with all related entities.  This resource is effectively a full budget export.

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.BudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

BudgetsApi apiInstance = new BudgetsApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
BigDecimal lastKnowledgeOfServer = new BigDecimal(); // BigDecimal | The starting server knowledge.  If provided, only entities that have changed since last_knowledge_of_server will be included.
try {
    BudgetDetailResponse result = apiInstance.getBudgetById(budgetId, lastKnowledgeOfServer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetsApi#getBudgetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |
 **lastKnowledgeOfServer** | **BigDecimal**| The starting server knowledge.  If provided, only entities that have changed since last_knowledge_of_server will be included. | [optional]

### Return type

[**BudgetDetailResponse**](BudgetDetailResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBudgets"></a>
# **getBudgets**
> BudgetSummaryResponse getBudgets()

List budgets

Returns budgets list with summary information.

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.BudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

BudgetsApi apiInstance = new BudgetsApi();
try {
    BudgetSummaryResponse result = apiInstance.getBudgets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetsApi#getBudgets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BudgetSummaryResponse**](BudgetSummaryResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

