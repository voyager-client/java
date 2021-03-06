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
import com.appscode.voyager.client.models.V1beta1VaultStore;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1LocalObjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1CertificateStorage
 */

public class V1beta1CertificateStorage {
  @SerializedName("secret")
  private V1LocalObjectReference secret = null;

  @SerializedName("vault")
  private V1beta1VaultStore vault = null;

  public V1beta1CertificateStorage secret(V1LocalObjectReference secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @ApiModelProperty(value = "")
  public V1LocalObjectReference getSecret() {
    return secret;
  }

  public void setSecret(V1LocalObjectReference secret) {
    this.secret = secret;
  }

  public V1beta1CertificateStorage vault(V1beta1VaultStore vault) {
    this.vault = vault;
    return this;
  }

   /**
   * Get vault
   * @return vault
  **/
  @ApiModelProperty(value = "")
  public V1beta1VaultStore getVault() {
    return vault;
  }

  public void setVault(V1beta1VaultStore vault) {
    this.vault = vault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CertificateStorage v1beta1CertificateStorage = (V1beta1CertificateStorage) o;
    return Objects.equals(this.secret, v1beta1CertificateStorage.secret) &&
        Objects.equals(this.vault, v1beta1CertificateStorage.vault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secret, vault);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CertificateStorage {\n");
    
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
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

