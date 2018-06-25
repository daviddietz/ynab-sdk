
# Category

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID.md) |  | 
**categoryGroupId** | [**UUID**](UUID.md) |  | 
**name** | **String** |  | 
**hidden** | **Boolean** | Whether or not the category is hidden | 
**budgeted** | [**BigDecimal**](BigDecimal.md) | Budgeted amount in current month in milliunits format | 
**activity** | [**BigDecimal**](BigDecimal.md) | Activity amount in current month in milliunits format | 
**balance** | [**BigDecimal**](BigDecimal.md) | Balance in current month in milliunits format | 
**deleted** | **Boolean** | Whether or not the category has been deleted.  Deleted categories will only be included in delta requests. | 



