
# SubTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  | 
**transactionId** | [**UUID**](UUID.md) |  | 
**amount** | [**BigDecimal**](BigDecimal.md) | The subtransaction amount in milliunits format | 
**deleted** | **Boolean** | Whether or not the subtransaction has been deleted.  Deleted subtransactions will only be included in delta requests. | 



