
# ScheduledSubTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  | 
**scheduledTransactionId** | [**UUID**](UUID.md) |  | 
**amount** | [**BigDecimal**](BigDecimal.md) | The scheduled subtransaction amount in milliunits format | 
**deleted** | **Boolean** | Whether or not the scheduled subtransaction has been deleted.  Deleted scheduled subtransactions will only be included in delta requests. | 



