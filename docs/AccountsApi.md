# AccountsApi

All URIs are relative to *https://api.youneedabudget.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountById**](AccountsApi.md#getAccountById) | **GET** /budgets/{budget_id}/accounts/{account_id} | Single account
[**getAccounts**](AccountsApi.md#getAccounts) | **GET** /budgets/{budget_id}/accounts | Account list


<a name="getAccountById"></a>
# **getAccountById**
> AccountResponse getAccountById(budgetId, accountId)

Single account

Returns a single account

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
UUID accountId = new UUID(); // UUID | The ID of the Account.
try {
    AccountResponse result = apiInstance.getAccountById(budgetId, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |
 **accountId** | [**UUID**](.md)| The ID of the Account. |

### Return type

[**AccountResponse**](AccountResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccounts"></a>
# **getAccounts**
> AccountsResponse getAccounts(budgetId)

Account list

Returns all accounts

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

AccountsApi apiInstance = new AccountsApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
try {
    AccountsResponse result = apiInstance.getAccounts(budgetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |

### Return type

[**AccountsResponse**](AccountsResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

