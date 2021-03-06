
# ExternalAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Unique ID |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was created |  [optional]
**name** | **String** | Name |  [optional]
**updatedAt** | [**DateTime**](DateTime.md) | ISO 8601 timestamp when the resource was updated |  [optional]
**provider** | **String** | The cloud provider this account is for |  [optional]
**team** | [**Team**](Team.md) | Associated Team |  [optional]
**teamId** | **Integer** | Associated Team ID |  [optional]
**scanIntervals** | [**List&lt;ScanInterval&gt;**](ScanInterval.md) | Associated Scan Intervals |  [optional]
**disabledSignatures** | [**List&lt;Signature&gt;**](Signature.md) | Associated Disabled Signatures |  [optional]
**suppressions** | [**List&lt;Suppression&gt;**](Suppression.md) | Associated Suppressions |  [optional]
**suppressionIds** | **List&lt;Integer&gt;** | Associated Suppressions IDs |  [optional]
**azureGroup** | [**AzureGroup**](AzureGroup.md) | Associated Azure Group |  [optional]
**credentials** | [**ExternalAccountAmazonIam**](ExternalAccountAmazonIam.md) | Associated Credentials |  [optional]



