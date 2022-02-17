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

package com.hyq0719.mktapi.tencent.bean.wechat_funds;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * WechatFundsGetResponseData
 */
public class WechatFundsGetResponseData {
  @SerializedName("list")
  private List<WechatFundsGetListStruct> list = null;

  @SerializedName("memo")
  private Memo memo = null;

  public WechatFundsGetResponseData list(List<WechatFundsGetListStruct> list) {
    this.list = list;
    return this;
  }

  public WechatFundsGetResponseData addListItem(WechatFundsGetListStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<WechatFundsGetListStruct>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   *
   * @return list
   */
  public List<WechatFundsGetListStruct> getList() {
    return list;
  }

  public void setList(List<WechatFundsGetListStruct> list) {
    this.list = list;
  }

  public WechatFundsGetResponseData memo(Memo memo) {
    this.memo = memo;
    return this;
  }

  /**
   * Get memo
   *
   * @return memo
   */
  public Memo getMemo() {
    return memo;
  }

  public void setMemo(Memo memo) {
    this.memo = memo;
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