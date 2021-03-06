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
import org.joda.time.DateTime;

/**
 * V1beta1CertificateDetails
 */

public class V1beta1CertificateDetails {
  @SerializedName("accountRef")
  private String accountRef = null;

  @SerializedName("certStableURL")
  private String certStableURL = null;

  @SerializedName("certURL")
  private String certURL = null;

  @SerializedName("notAfter")
  private DateTime notAfter = null;

  @SerializedName("notBefore")
  private DateTime notBefore = null;

  @SerializedName("serialNumber")
  private String serialNumber = null;

  public V1beta1CertificateDetails accountRef(String accountRef) {
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

  public V1beta1CertificateDetails certStableURL(String certStableURL) {
    this.certStableURL = certStableURL;
    return this;
  }

   /**
   * Get certStableURL
   * @return certStableURL
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCertStableURL() {
    return certStableURL;
  }

  public void setCertStableURL(String certStableURL) {
    this.certStableURL = certStableURL;
  }

  public V1beta1CertificateDetails certURL(String certURL) {
    this.certURL = certURL;
    return this;
  }

   /**
   * Get certURL
   * @return certURL
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCertURL() {
    return certURL;
  }

  public void setCertURL(String certURL) {
    this.certURL = certURL;
  }

  public V1beta1CertificateDetails notAfter(DateTime notAfter) {
    this.notAfter = notAfter;
    return this;
  }

   /**
   * Get notAfter
   * @return notAfter
  **/
  @ApiModelProperty(value = "")
  public DateTime getNotAfter() {
    return notAfter;
  }

  public void setNotAfter(DateTime notAfter) {
    this.notAfter = notAfter;
  }

  public V1beta1CertificateDetails notBefore(DateTime notBefore) {
    this.notBefore = notBefore;
    return this;
  }

   /**
   * Get notBefore
   * @return notBefore
  **/
  @ApiModelProperty(value = "")
  public DateTime getNotBefore() {
    return notBefore;
  }

  public void setNotBefore(DateTime notBefore) {
    this.notBefore = notBefore;
  }

  public V1beta1CertificateDetails serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @ApiModelProperty(value = "")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CertificateDetails v1beta1CertificateDetails = (V1beta1CertificateDetails) o;
    return Objects.equals(this.accountRef, v1beta1CertificateDetails.accountRef) &&
        Objects.equals(this.certStableURL, v1beta1CertificateDetails.certStableURL) &&
        Objects.equals(this.certURL, v1beta1CertificateDetails.certURL) &&
        Objects.equals(this.notAfter, v1beta1CertificateDetails.notAfter) &&
        Objects.equals(this.notBefore, v1beta1CertificateDetails.notBefore) &&
        Objects.equals(this.serialNumber, v1beta1CertificateDetails.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountRef, certStableURL, certURL, notAfter, notBefore, serialNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CertificateDetails {\n");
    
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    certStableURL: ").append(toIndentedString(certStableURL)).append("\n");
    sb.append("    certURL: ").append(toIndentedString(certURL)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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

