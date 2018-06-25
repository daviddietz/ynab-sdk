# TransactionsApi

All URIs are relative to *https://api.youneedabudget.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkCreateTransactions**](TransactionsApi.md#bulkCreateTransactions) | **POST** /budgets/{budget_id}/transactions/bulk | Bulk create transactions
[**createTransaction**](TransactionsApi.md#createTransaction) | **POST** /budgets/{budget_id}/transactions | Create new transaction
[**getTransactions**](TransactionsApi.md#getTransactions) | **GET** /budgets/{budget_id}/transactions | List transactions
[**getTransactionsByAccount**](TransactionsApi.md#getTransactionsByAccount) | **GET** /budgets/{budget_id}/accounts/{account_id}/transactions | List account transactions
[**getTransactionsByCategory**](TransactionsApi.md#getTransactionsByCategory) | **GET** /budgets/{budget_id}/categories/{category_id}/transactions | List category transactions
[**getTransactionsById**](TransactionsApi.md#getTransactionsById) | **GET** /budgets/{budget_id}/transactions/{transaction_id} | Single transaction
[**getTransactionsByPayee**](TransactionsApi.md#getTransactionsByPayee) | **GET** /budgets/{budget_id}/payees/{payee_id}/transactions | List payee transactions
[**updateTransaction**](TransactionsApi.md#updateTransaction) | **PUT** /budgets/{budget_id}/transactions/{transaction_id} | Updates an existing transaction


<a name="bulkCreateTransactions"></a>
# **bulkCreateTransactions**
> BulkResponse bulkCreateTransactions(budgetId, transactions)

Bulk create transactions

Creates multiple transactions

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.TransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

TransactionsApi apiInstance = new TransactionsApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
BulkTransactions transactions = new BulkTransactions(); // BulkTransactions | The list of Transactions to create.
try {
    BulkResponse result = apiInstance.bulkCreateTransactions(budgetId, transactions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#bulkCreateTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |
 **transactions** | [**BulkTransactions**](BulkTransactions.md)| The list of Transactions to create. |

### Return type

[**BulkResponse**](BulkResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTransaction"></a>
# **createTransaction**
> TransactionResponse createTransaction(budgetId, transaction)

Create new transaction

Creates a transaction

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.TransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

TransactionsApi apiInstance = new TransactionsApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
SaveTransactionWrapper transaction = new SaveTransactionWrapper(); // SaveTransactionWrapper | The Transaction to create.
try {
    TransactionResponse result = apiInstance.createTransaction(budgetId, transaction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#createTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |
 **transaction** | [**SaveTransactionWrapper**](SaveTransactionWrapper.md)| The Transaction to create. |

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactions"></a>
# **getTransactions**
> TransactionsResponse getTransactions(budgetId, sinceDate, type)

List transactions

Returns budget transactions

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.TransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

TransactionsApi apiInstance = new TransactionsApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
LocalDate sinceDate = new LocalDate(); // LocalDate | Only return transactions on or after this date.
String type = "type_example"; // String | Only return transactions of a certain type (i.e. 'uncategorized', 'unapproved')
try {
    TransactionsResponse result = apiInstance.getTransactions(budgetId, sinceDate, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |
 **sinceDate** | **LocalDate**| Only return transactions on or after this date. | [optional]
 **type** | **String**| Only return transactions of a certain type (i.e. &#39;uncategorized&#39;, &#39;unapproved&#39;) | [optional] [enum: uncategorized, unapproved]

### Return type

[**TransactionsResponse**](TransactionsResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactionsByAccount"></a>
# **getTransactionsByAccount**
> TransactionsResponse getTransactionsByAccount(budgetId, accountId, sinceDate)

List account transactions

Returns all transactions for a specified account

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.TransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

TransactionsApi apiInstance = new TransactionsApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
UUID accountId = new UUID(); // UUID | The ID of the Account.
LocalDate sinceDate = new LocalDate(); // LocalDate | Only return transactions on or after this date.
try {
    TransactionsResponse result = apiInstance.getTransactionsByAccount(budgetId, accountId, sinceDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getTransactionsByAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |
 **accountId** | [**UUID**](.md)| The ID of the Account. |
 **sinceDate** | **LocalDate**| Only return transactions on or after this date. | [optional]

### Return type

[**TransactionsResponse**](TransactionsResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactionsByCategory"></a>
# **getTransactionsByCategory**
> HybridTransactionsResponse getTransactionsByCategory(budgetId, categoryId, sinceDate)

List category transactions

Returns all transactions for a specified category

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.TransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

TransactionsApi apiInstance = new TransactionsApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
UUID categoryId = new UUID(); // UUID | The ID of the Category.
LocalDate sinceDate = new LocalDate(); // LocalDate | Only return transactions on or after this date.
try {
    HybridTransactionsResponse result = apiInstance.getTransactionsByCategory(budgetId, categoryId, sinceDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getTransactionsByCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |
 **categoryId** | [**UUID**](.md)| The ID of the Category. |
 **sinceDate** | **LocalDate**| Only return transactions on or after this date. | [optional]

### Return type

[**HybridTransactionsResponse**](HybridTransactionsResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactionsById"></a>
# **getTransactionsById**
> TransactionResponse getTransactionsById(budgetId, transactionId)

Single transaction

Returns a single transaction

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.TransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

TransactionsApi apiInstance = new TransactionsApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
UUID transactionId = new UUID(); // UUID | The ID of the Transaction.
try {
    TransactionResponse result = apiInstance.getTransactionsById(budgetId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getTransactionsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |
 **transactionId** | [**UUID**](.md)| The ID of the Transaction. |

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactionsByPayee"></a>
# **getTransactionsByPayee**
> HybridTransactionsResponse getTransactionsByPayee(budgetId, payeeId, sinceDate)

List payee transactions

Returns all transactions for a specified payee

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.TransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

TransactionsApi apiInstance = new TransactionsApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
UUID payeeId = new UUID(); // UUID | The ID of the Payee.
LocalDate sinceDate = new LocalDate(); // LocalDate | Only return transactions on or after this date.
try {
    HybridTransactionsResponse result = apiInstance.getTransactionsByPayee(budgetId, payeeId, sinceDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#getTransactionsByPayee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |
 **payeeId** | [**UUID**](.md)| The ID of the Payee. |
 **sinceDate** | **LocalDate**| Only return transactions on or after this date. | [optional]

### Return type

[**HybridTransactionsResponse**](HybridTransactionsResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTransaction"></a>
# **updateTransaction**
> TransactionResponse updateTransaction(budgetId, transactionId, transaction)

Updates an existing transaction

Updates a transaction

### Example
```java
// Import classes:
//import ynab.client.invoker.ApiClient;
//import ynab.client.invoker.ApiException;
//import ynab.client.invoker.Configuration;
//import ynab.client.invoker.auth.*;
//import ynab.client.api.TransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

TransactionsApi apiInstance = new TransactionsApi();
UUID budgetId = new UUID(); // UUID | The ID of the Budget.
UUID transactionId = new UUID(); // UUID | The ID of the Transaction.
SaveTransactionWrapper transaction = new SaveTransactionWrapper(); // SaveTransactionWrapper | The Transaction to update.
try {
    TransactionResponse result = apiInstance.updateTransaction(budgetId, transactionId, transaction);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransactionsApi#updateTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **budgetId** | [**UUID**](.md)| The ID of the Budget. |
 **transactionId** | [**UUID**](.md)| The ID of the Transaction. |
 **transaction** | [**SaveTransactionWrapper**](SaveTransactionWrapper.md)| The Transaction to update. |

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

