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

/**
 * V1beta1ACMECertificateDetails
 */

public class V1beta1ACMECertificateDetails {
  @SerializedName("accountRef")
  private String accountRef = null;

  @SerializedName("certStableUrl")
  private String certStableUrl = null;

  @SerializedName("certUrl")
  private String certUrl = null;

  @SerializedName("domain")
  private String domain = null;

  public V1beta1ACMECertificateDetails accountRef(String accountRef) {
    this.accountRef = accountRef;
    return this;
  }

   /**
   * Get accountRef
   * @return accountRef
  **/
  @ApiModelProperty(value = "")
  public String getAccountRef() {
    return accountRef;
  }

  public void setAccountRef(String accountRef) {
    this.accountRef = accountRef;
  }

  public V1beta1ACMECertificateDetails certStableUrl(String certStableUrl) {
    this.certStableUrl = certStableUrl;
    return this;
  }

   /**
   * Get certStableUrl
   * @return certStableUrl
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCertStableUrl() {
    return certStableUrl;
  }

  public void setCertStableUrl(String certStableUrl) {
    this.certStableUrl = certStableUrl;
  }

  public V1beta1ACMECertificateDetails certUrl(String certUrl) {
    this.certUrl = certUrl;
    return this;
  }

   /**
   * Get certUrl
   * @return certUrl
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCertUrl() {
    return certUrl;
  }

  public void setCertUrl(String certUrl) {
    this.certUrl = certUrl;
  }

  public V1beta1ACMECertificateDetails domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ACMECertificateDetails v1beta1ACMECertificateDetails = (V1beta1ACMECertificateDetails) o;
    return Objects.equals(this.accountRef, v1beta1ACMECertificateDetails.accountRef) &&
        Objects.equals(this.certStableUrl, v1beta1ACMECertificateDetails.certStableUrl) &&
        Objects.equals(this.certUrl, v1beta1ACMECertificateDetails.certUrl) &&
        Objects.equals(this.domain, v1beta1ACMECertificateDetails.domain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountRef, certStableUrl, certUrl, domain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ACMECertificateDetails {\n");
    
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    certStableUrl: ").append(toIndentedString(certStableUrl)).append("\n");
    sb.append("    certUrl: ").append(toIndentedString(certUrl)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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

