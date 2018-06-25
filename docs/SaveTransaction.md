
# SaveTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | [**UUID**](UUID.md) |  | 
**date** | [**LocalDate**](LocalDate.md) |  | 
**amount** | [**BigDecimal**](BigDecimal.md) | The transaction amount in milliunits format | 
**cleared** | [**ClearedEnum**](#ClearedEnum) | The cleared status of the transaction |  [optional]
**approved** | **Boolean** | Whether or not the transaction is approved.  If not supplied, transaction will be unapproved by default. |  [optional]


<a name="ClearedEnum"></a>
## Enum: ClearedEnum
Name | Value
---- | -----
CLEARED | &quot;cleared&quot;
UNCLEARED | &quot;uncleared&quot;
RECONCILED | &quot;reconciled&quot;



