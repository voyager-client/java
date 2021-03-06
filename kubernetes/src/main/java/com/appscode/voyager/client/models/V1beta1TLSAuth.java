/*
 * Voyager
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v7.1.1
 * Contact: hello@appscode.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.appscode.voyager.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * V1beta1TLSAuth
 */

public class V1beta1TLSAuth {
  @SerializedName("errorPage")
  private String errorPage = null;

  @SerializedName("headers")
  private Map<String, String> headers = null;

  @SerializedName("secretName")
  private String secretName = null;

  @SerializedName("verifyClient")
  private String verifyClient = null;

  public V1beta1TLSAuth errorPage(String errorPage) {
    this.errorPage = errorPage;
    return this;
  }

   /**
   * Get errorPage
   * @return errorPage
  **/
  @ApiModelProperty(value = "")
  public String getErrorPage() {
    return errorPage;
  }

  public void setErrorPage(String errorPage) {
    this.errorPage = errorPage;
  }

  public V1beta1TLSAuth headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public V1beta1TLSAuth putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, String>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  public V1beta1TLSAuth secretName(String secretName) {
    this.secretName = secretName;
    return this;
  }

   /**
   * Get secretName
   * @return secretName
  **/
  @ApiModelProperty(value = "")
  public String getSecretName() {
    return secretName;
  }

  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }

  public V1beta1TLSAuth verifyClient(String verifyClient) {
    this.verifyClient = verifyClient;
    return this;
  }

   /**
   * Get verifyClient
   * @return verifyClient
  **/
  @ApiModelProperty(value = "")
  public String getVerifyClient() {
    return verifyClient;
  }

  public void setVerifyClient(String verifyClient) {
    this.verifyClient = verifyClient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1TLSAuth v1beta1TLSAuth = (V1beta1TLSAuth) o;
    return Objects.equals(this.errorPage, v1beta1TLSAuth.errorPage) &&
        Objects.equals(this.headers, v1beta1TLSAuth.headers) &&
        Objects.equals(this.secretName, v1beta1TLSAuth.secretName) &&
        Objects.equals(this.verifyClient, v1beta1TLSAuth.verifyClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorPage, headers, secretName, verifyClient);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1TLSAuth {\n");
    
    sb.append("    errorPage: ").append(toIndentedString(errorPage)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    verifyClient: ").append(toIndentedString(verifyClient)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

