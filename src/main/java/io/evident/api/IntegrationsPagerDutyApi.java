package io.evident.api;

import io.evident.EspSdk.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import io.evident.models.IntegrationPagerDuty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface IntegrationsPagerDutyApi {
  /**
   * Create a Pager Duty Integration
   * 
   * @param apiKey The API Key for the PagerDuty Integration (required)
   * @param externalAccountIds External accounts for integration (required)
   * @param name Name of the integration (required)
   * @param include Related objects that can be included in the response:  integration See Including Objects for more information. (optional)
   * @param allHighRisk Send all high risk alerts (optional)
   * @param allLowRisk Send all low risk alerts (optional)
   * @param allMediumRisk Send all medium risk alerts (optional)
   * @param customSignatureIds Custom signatures for integration (optional)
   * @param sendUpdates This feature enables the integration to send alerts when they are updated. When disabled, alerts will only be sent when they are initially created. When enabled, alerts will additionally be sent when a change is made such as the alert ending. An alert may end for multiple reasons. (optional)
   * @param sendWhenSuppressed Send notifications for suppressed alerts (optional)
   * @param signatureIds Signatures for integration (optional)
   * @param statuses Only send alerts that have the status in this list. Valid values are fail, warn, error, pass, info (optional)
   * @return Call&lt;IntegrationPagerDuty&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @POST("api/v2/integrations/pager_duty.json_api")
  Call<IntegrationPagerDuty> create(
    @retrofit2.http.Field("api_key") String apiKey, @retrofit2.http.Field("external_account_ids") List<Integer> externalAccountIds, @retrofit2.http.Field("name") String name, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("all_high_risk") Boolean allHighRisk, @retrofit2.http.Field("all_low_risk") Boolean allLowRisk, @retrofit2.http.Field("all_medium_risk") Boolean allMediumRisk, @retrofit2.http.Field("custom_signature_ids") List<Integer> customSignatureIds, @retrofit2.http.Field("send_updates") Boolean sendUpdates, @retrofit2.http.Field("send_when_suppressed") Boolean sendWhenSuppressed, @retrofit2.http.Field("signature_ids") List<Integer> signatureIds, @retrofit2.http.Field("statuses") List<String> statuses
  );

  /**
   * Show a single Pager Duty Integration
   * 
   * @param integrationId The ID of the integration (required)
   * @param include Related objects that can be included in the response:  integration See Including Objects for more information. (optional)
   * @return Call&lt;IntegrationPagerDuty&gt;
   */
  
  @Headers({
  	"Content-Type:application/vnd.api+json" 
  })
  @GET("api/v2/integrations/{integration_id}/pager_duty.json_api")
  Call<IntegrationPagerDuty> show(
    @retrofit2.http.Path("integration_id") Integer integrationId, @retrofit2.http.Query("include") String include
  );

  /**
   * Update a Pager Duty Integration
   * 
   * @param integrationId The ID of the integration (required)
   * @param include Related objects that can be included in the response:  integration See Including Objects for more information. (optional)
   * @param allHighRisk Send all high risk alerts (optional)
   * @param allLowRisk Send all low risk alerts (optional)
   * @param allMediumRisk Send all medium risk alerts (optional)
   * @param apiKey The API Key for the PagerDuty Integration (optional)
   * @param customSignatureIds Custom signatures for integration (optional)
   * @param externalAccountIds External accounts for integration (optional)
   * @param name Name of the integration (optional)
   * @param sendUpdates This feature enables the integration to send alerts when they are updated. When disabled, alerts will only be sent when they are initially created. When enabled, alerts will additionally be sent when a change is made such as the alert ending. An alert may end for multiple reasons. (optional)
   * @param sendWhenSuppressed Send notifications for suppressed alerts (optional)
   * @param signatureIds Signatures for integration (optional)
   * @param statuses Only send alerts that have the status in this list. Valid values are fail, warn, error, pass, info (optional)
   * @return Call&lt;IntegrationPagerDuty&gt;
   */
  
  @retrofit2.http.FormUrlEncoded
  @PATCH("api/v2/integrations/{integration_id}/pager_duty.json_api")
  Call<IntegrationPagerDuty> update(
    @retrofit2.http.Path("integration_id") Integer integrationId, @retrofit2.http.Query("include") String include, @retrofit2.http.Field("all_high_risk") Boolean allHighRisk, @retrofit2.http.Field("all_low_risk") Boolean allLowRisk, @retrofit2.http.Field("all_medium_risk") Boolean allMediumRisk, @retrofit2.http.Field("api_key") String apiKey, @retrofit2.http.Field("custom_signature_ids") List<Integer> customSignatureIds, @retrofit2.http.Field("external_account_ids") List<Integer> externalAccountIds, @retrofit2.http.Field("name") String name, @retrofit2.http.Field("send_updates") Boolean sendUpdates, @retrofit2.http.Field("send_when_suppressed") Boolean sendWhenSuppressed, @retrofit2.http.Field("signature_ids") List<Integer> signatureIds, @retrofit2.http.Field("statuses") List<String> statuses
  );

}
