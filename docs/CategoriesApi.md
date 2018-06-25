# CategoriesApi

All URIs are relative to *https://api.youneedabudget.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategories**](CategoriesApi.md#getCategories) | **GET** /budgets/{budget_id}/categories | List categories
[**getCategoryById**](CategoriesApi.md#getCategoryById) | **GET** /budgets/{budget_id}/categories/{category_id} | Single category


<a name="getCategories"></a>
# **getCategories**
> CategoriesResponse getCategories(budgetId)

List categories

Returns all categories grouped by category group.

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.CategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

CategoriesApi apiInstance = new CategoriesApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
try {
    CategoriesResponse result = apiInstance.getCategories(budgetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |

### Return type

[**CategoriesResponse**](CategoriesResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCategoryById"></a>
# **getCategoryById**
> CategoryResponse getCategoryById(budgetId, categoryId)

Single category

Returns a single category

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.CategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

CategoriesApi apiInstance = new CategoriesApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
UUID categoryId = new UUID(); // UUID | The ID of the Category.
try {
    CategoryResponse result = apiInstance.getCategoryById(budgetId, categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getCategoryById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |
 **categoryId** | [**UUID**](.md)| The ID of the Category. |

### Return type

[**CategoryResponse**](CategoryResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

