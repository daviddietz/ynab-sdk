
# TransactionDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**date** | [**LocalDate**](LocalDate.md) |  | 
**amount** | [**BigDecimal**](BigDecimal.md) | The transaction amount in milliunits format | 
**cleared** | [**ClearedEnum**](#ClearedEnum) | The cleared status of the transaction | 
**approved** | **Boolean** | Whether or not the transaction is approved | 
**accountId** | **String** |  | 
**deleted** | **Boolean** | Whether or not the transaction has been deleted.  Deleted transactions will only be included in delta requests. | 
**accountName** | **String** |  | 
**subtransactions** | [**List&lt;SubTransaction&gt;**](SubTransaction.md) | If a split transaction, the subtransactions. | 


<a name="ClearedEnum"></a>
## Enum: ClearedEnum
Name | Value
---- | -----
CLEARED | &quot;cleared&quot;
UNCLEARED | &quot;uncleared&quot;
RECONCILED | &quot;reconciled&quot;



