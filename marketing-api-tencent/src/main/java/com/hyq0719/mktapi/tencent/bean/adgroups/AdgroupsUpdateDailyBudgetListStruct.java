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

package com.hyq0719.mktapi.tencent.bean.adgroups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * 返回结构
 */
public class AdgroupsUpdateDailyBudgetListStruct {
  @SerializedName("code")
  private Long code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("message_cn")
  private String messageCn = null;

  public AdgroupsUpdateDailyBudgetListStruct code(Long code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   *
   * @return code
   */
  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public AdgroupsUpdateDailyBudgetListStruct message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   *
   * @return message
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AdgroupsUpdateDailyBudgetListStruct messageCn(String messageCn) {
    this.messageCn = messageCn;
    return this;
  }

  /**
   * Get messageCn
   *
   * @return messageCn
   */
  public String getMessageCn() {
    return messageCn;
  }

  public void setMessageCn(String messageCn) {
    this.messageCn = messageCn;
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
