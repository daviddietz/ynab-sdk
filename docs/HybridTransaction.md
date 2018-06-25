
# HybridTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  | 
**date** | [**LocalDate**](LocalDate.md) |  | 
**amount** | [**BigDecimal**](BigDecimal.md) | The transaction amount in milliunits format | 
**cleared** | [**ClearedEnum**](#ClearedEnum) | The cleared status of the transaction | 
**approved** | **Boolean** | Whether or not the transaction is approved | 
**accountId** | [**UUID**](UUID.md) |  | 
**deleted** | **Boolean** | Whether or not the transaction has been deleted.  Deleted transactions will only be included in delta requests. | 
**type** | [**TypeEnum**](#TypeEnum) | Whether the hybrid transaction represents a regular transaction or a subtransaction | 
**accountName** | **String** |  | 


<a name="ClearedEnum"></a>
## Enum: ClearedEnum
Name | Value
---- | -----
CLEARED | &quot;cleared&quot;
UNCLEARED | &quot;uncleared&quot;
RECONCILED | &quot;reconciled&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TRANSACTION | &quot;transaction&quot;
SUBTRANSACTION | &quot;subtransaction&quot;



