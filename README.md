# ynab-sdk

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>ynab.sdk</groupId>
    <artifactId>ynab-sdk</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "ynab.sdk:ynab-sdk:0.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/ynab-sdk-0.0.1-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import ynab.client.invoker.*;
import ynab.client.invoker.auth.*;
import ynab.client.model.*;
import ynab.client.api.AccountsApi;

import java.io.File;
import java.util.*;

public class BudgetsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: bearer
        ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
        bearer.setApiKey("YOUR API KEY");
        bearer.setApiKeyPrefix("Bearer");

        BudgetsApi budgetsApi = new BudgetsApi();
        try {
            BudgetSummaryResponse budgetSummaryResponse = budgetsApi.getBudgets();
            System.out.println(budgetSummaryResponse);
        } catch (ApiException e) {
            System.err.println("Exception when calling BudgetsApi#getGetBudgets");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.youneedabudget.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**getAccountById**](docs/AccountsApi.md#getAccountById) | **GET** /budgets/{budget_id}/accounts/{account_id} | Single account
*AccountsApi* | [**getAccounts**](docs/AccountsApi.md#getAccounts) | **GET** /budgets/{budget_id}/accounts | Account list
*BudgetsApi* | [**getBudgetById**](docs/BudgetsApi.md#getBudgetById) | **GET** /budgets/{budget_id} | Single budget
*BudgetsApi* | [**getBudgets**](docs/BudgetsApi.md#getBudgets) | **GET** /budgets | List budgets
*CategoriesApi* | [**getCategories**](docs/CategoriesApi.md#getCategories) | **GET** /budgets/{budget_id}/categories | List categories
*CategoriesApi* | [**getCategoryById**](docs/CategoriesApi.md#getCategoryById) | **GET** /budgets/{budget_id}/categories/{category_id} | Single category
*MonthsApi* | [**getBudgetMonth**](docs/MonthsApi.md#getBudgetMonth) | **GET** /budgets/{budget_id}/months/{month} | Single budget month
*MonthsApi* | [**getBudgetMonths**](docs/MonthsApi.md#getBudgetMonths) | **GET** /budgets/{budget_id}/months | List budget months
*PayeeLocationsApi* | [**getPayeeLocationById**](docs/PayeeLocationsApi.md#getPayeeLocationById) | **GET** /budgets/{budget_id}/payee_locations/{payee_location_id} | Single payee location
*PayeeLocationsApi* | [**getPayeeLocations**](docs/PayeeLocationsApi.md#getPayeeLocations) | **GET** /budgets/{budget_id}/payee_locations | List payee locations
*PayeeLocationsApi* | [**getPayeeLocationsByPayee**](docs/PayeeLocationsApi.md#getPayeeLocationsByPayee) | **GET** /budgets/{budget_id}/payees/{payee_id}/payee_locations | List locations for a payee
*PayeesApi* | [**getPayeeById**](docs/PayeesApi.md#getPayeeById) | **GET** /budgets/{budget_id}/payees/{payee_id} | Single payee
*PayeesApi* | [**getPayees**](docs/PayeesApi.md#getPayees) | **GET** /budgets/{budget_id}/payees | List payees
*ScheduledTransactionsApi* | [**getScheduledTransactionById**](docs/ScheduledTransactionsApi.md#getScheduledTransactionById) | **GET** /budgets/{budget_id}/scheduled_transactions/{scheduled_transaction_id} | Single scheduled transaction
*ScheduledTransactionsApi* | [**getScheduledTransactions**](docs/ScheduledTransactionsApi.md#getScheduledTransactions) | **GET** /budgets/{budget_id}/scheduled_transactions | List scheduled transactions
*TransactionsApi* | [**bulkCreateTransactions**](docs/TransactionsApi.md#bulkCreateTransactions) | **POST** /budgets/{budget_id}/transactions/bulk | Bulk create transactions
*TransactionsApi* | [**createTransaction**](docs/TransactionsApi.md#createTransaction) | **POST** /budgets/{budget_id}/transactions | Create new transaction
*TransactionsApi* | [**getTransactions**](docs/TransactionsApi.md#getTransactions) | **GET** /budgets/{budget_id}/transactions | List transactions
*TransactionsApi* | [**getTransactionsByAccount**](docs/TransactionsApi.md#getTransactionsByAccount) | **GET** /budgets/{budget_id}/accounts/{account_id}/transactions | List account transactions
*TransactionsApi* | [**getTransactionsByCategory**](docs/TransactionsApi.md#getTransactionsByCategory) | **GET** /budgets/{budget_id}/categories/{category_id}/transactions | List category transactions
*TransactionsApi* | [**getTransactionsById**](docs/TransactionsApi.md#getTransactionsById) | **GET** /budgets/{budget_id}/transactions/{transaction_id} | Single transaction
*TransactionsApi* | [**getTransactionsByPayee**](docs/TransactionsApi.md#getTransactionsByPayee) | **GET** /budgets/{budget_id}/payees/{payee_id}/transactions | List payee transactions
*TransactionsApi* | [**updateTransaction**](docs/TransactionsApi.md#updateTransaction) | **PUT** /budgets/{budget_id}/transactions/{transaction_id} | Updates an existing transaction
*UserApi* | [**getUser**](docs/UserApi.md#getUser) | **GET** /user | User info


## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountResponse](docs/AccountResponse.md)
 - [AccountWrapper](docs/AccountWrapper.md)
 - [AccountsResponse](docs/AccountsResponse.md)
 - [AccountsWrapper](docs/AccountsWrapper.md)
 - [BudgetDetailResponse](docs/BudgetDetailResponse.md)
 - [BudgetDetailWrapper](docs/BudgetDetailWrapper.md)
 - [BudgetSummary](docs/BudgetSummary.md)
 - [BudgetSummaryResponse](docs/BudgetSummaryResponse.md)
 - [BudgetSummaryWrapper](docs/BudgetSummaryWrapper.md)
 - [BulkIdWrapper](docs/BulkIdWrapper.md)
 - [BulkIds](docs/BulkIds.md)
 - [BulkResponse](docs/BulkResponse.md)
 - [BulkTransactions](docs/BulkTransactions.md)
 - [CategoriesResponse](docs/CategoriesResponse.md)
 - [Category](docs/Category.md)
 - [CategoryGroup](docs/CategoryGroup.md)
 - [CategoryGroupsWrapper](docs/CategoryGroupsWrapper.md)
 - [CategoryResponse](docs/CategoryResponse.md)
 - [CategoryWrapper](docs/CategoryWrapper.md)
 - [CurrencyFormat](docs/CurrencyFormat.md)
 - [DateFormat](docs/DateFormat.md)
 - [ErrorDetail](docs/ErrorDetail.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [HybridTransactionsResponse](docs/HybridTransactionsResponse.md)
 - [HybridTransactionsWrapper](docs/HybridTransactionsWrapper.md)
 - [MonthDetailResponse](docs/MonthDetailResponse.md)
 - [MonthDetailWrapper](docs/MonthDetailWrapper.md)
 - [MonthSummariesResponse](docs/MonthSummariesResponse.md)
 - [MonthSummariesWrapper](docs/MonthSummariesWrapper.md)
 - [MonthSummary](docs/MonthSummary.md)
 - [Payee](docs/Payee.md)
 - [PayeeLocation](docs/PayeeLocation.md)
 - [PayeeLocationResponse](docs/PayeeLocationResponse.md)
 - [PayeeLocationWrapper](docs/PayeeLocationWrapper.md)
 - [PayeeLocationsResponse](docs/PayeeLocationsResponse.md)
 - [PayeeLocationsWrapper](docs/PayeeLocationsWrapper.md)
 - [PayeeResponse](docs/PayeeResponse.md)
 - [PayeeWrapper](docs/PayeeWrapper.md)
 - [PayeesResponse](docs/PayeesResponse.md)
 - [PayeesWrapper](docs/PayeesWrapper.md)
 - [SaveTransaction](docs/SaveTransaction.md)
 - [SaveTransactionWrapper](docs/SaveTransactionWrapper.md)
 - [ScheduledSubTransaction](docs/ScheduledSubTransaction.md)
 - [ScheduledTransactionResponse](docs/ScheduledTransactionResponse.md)
 - [ScheduledTransactionSummary](docs/ScheduledTransactionSummary.md)
 - [ScheduledTransactionWrapper](docs/ScheduledTransactionWrapper.md)
 - [ScheduledTransactionsResponse](docs/ScheduledTransactionsResponse.md)
 - [ScheduledTransactionsWrapper](docs/ScheduledTransactionsWrapper.md)
 - [SubTransaction](docs/SubTransaction.md)
 - [TransactionResponse](docs/TransactionResponse.md)
 - [TransactionSummary](docs/TransactionSummary.md)
 - [TransactionWrapper](docs/TransactionWrapper.md)
 - [TransactionsResponse](docs/TransactionsResponse.md)
 - [TransactionsWrapper](docs/TransactionsWrapper.md)
 - [User](docs/User.md)
 - [UserResponse](docs/UserResponse.md)
 - [UserWrapper](docs/UserWrapper.md)
 - [BudgetDetail](docs/BudgetDetail.md)
 - [CategoryGroupWithCategories](docs/CategoryGroupWithCategories.md)
 - [HybridTransaction](docs/HybridTransaction.md)
 - [MonthDetail](docs/MonthDetail.md)
 - [ScheduledTransactionDetail](docs/ScheduledTransactionDetail.md)
 - [TransactionDetail](docs/TransactionDetail.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



