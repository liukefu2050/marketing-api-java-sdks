/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.hyq0719.mktapi.tencent.bean.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * AdsDeleteResponseData
 */
public class AdsDeleteResponseData {
  @SerializedName("ad_id")
  private Long adId = null;

  public AdsDeleteResponseData adId(Long adId) {
    this.adId = adId;
    return this;
  }

  /**
   * Get adId
   *
   * @return adId
   */
  public Long getAdId() {
    return adId;
  }

  public void setAdId(Long adId) {
    this.adId = adId;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
