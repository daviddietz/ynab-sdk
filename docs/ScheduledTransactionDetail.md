
# ScheduledTransactionDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**dateFirst** | [**LocalDate**](LocalDate.md) | The first date for which the Scheduled Transaction was scheduled. | 
**dateNext** | [**LocalDate**](LocalDate.md) | The next date for which the Scheduled Transaction is scheduled. | 
**frequency** | [**FrequencyEnum**](#FrequencyEnum) |  | 
**amount** | [**BigDecimal**](BigDecimal.md) | The scheduled transaction amount in milliunits format | 
**accountId** | **String** |  | 
**deleted** | **Boolean** | Whether or not the scheduled transaction has been deleted.  Deleted scheduled transactions will only be included in delta requests. | 
**accountName** | **String** |  | 
**subtransactions** | [**List&lt;ScheduledSubTransaction&gt;**](ScheduledSubTransaction.md) | If a split scheduled transaction, the subtransactions. | 


<a name="FrequencyEnum"></a>
## Enum: FrequencyEnum
Name | Value
---- | -----
NEVER | &quot;never&quot;
DAILY | &quot;daily&quot;
WEEKLY | &quot;weekly&quot;
EVERYOTHERWEEK | &quot;everyOtherWeek&quot;
TWICEAMONTH | &quot;twiceAMonth&quot;
EVERY4WEEKS | &quot;every4Weeks&quot;
MONTHLY | &quot;monthly&quot;
EVERYOTHERMONTH | &quot;everyOtherMonth&quot;
EVERY3MONTHS | &quot;every3Months&quot;
EVERY4MONTHS | &quot;every4Months&quot;
TWICEAYEAR | &quot;twiceAYear&quot;
YEARLY | &quot;yearly&quot;
EVERYOTHERYEAR | &quot;everyOtherYear&quot;



