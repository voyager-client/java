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
import com.appscode.voyager.client.models.V1beta1CertificateStorage;
import com.appscode.voyager.client.models.V1beta1ChallengeProvider;
import com.appscode.voyager.client.models.V1beta1LocalTypedReference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta1CertificateSpec
 */

public class V1beta1CertificateSpec {
  @SerializedName("acmeStagingURL")
  private String acmeStagingURL = null;

  @SerializedName("acmeUserSecretName")
  private String acmeUserSecretName = null;

  @SerializedName("challengeProvider")
  private V1beta1ChallengeProvider challengeProvider = null;

  @SerializedName("domains")
  private List<String> domains = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("httpProviderIngressReference")
  private V1beta1LocalTypedReference httpProviderIngressReference = null;

  @SerializedName("paused")
  private Boolean paused = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("providerCredentialSecretName")
  private String providerCredentialSecretName = null;

  @SerializedName("storage")
  private V1beta1CertificateStorage storage = null;

  public V1beta1CertificateSpec acmeStagingURL(String acmeStagingURL) {
    this.acmeStagingURL = acmeStagingURL;
    return this;
  }

   /**
   * ACME server that will be used to obtain this certificate. Deprecated
   * @return acmeStagingURL
  **/
  @ApiModelProperty(value = "ACME server that will be used to obtain this certificate. Deprecated")
  public String getAcmeStagingURL() {
    return acmeStagingURL;
  }

  public void setAcmeStagingURL(String acmeStagingURL) {
    this.acmeStagingURL = acmeStagingURL;
  }

  public V1beta1CertificateSpec acmeUserSecretName(String acmeUserSecretName) {
    this.acmeUserSecretName = acmeUserSecretName;
    return this;
  }

   /**
   * Secret contains ACMEUser information. Secret must contain a key &#x60;email&#x60; If empty tries to find an Secret via domains if not found create an ACMEUser and stores as a secret. Secrets key to be expected:  ACME_EMAIL -&gt; required, if not provided it will through error.  ACME_SERVER_URL -&gt; custom server url to generate certificates, default is lets encrypt.  ACME_USER_DATA -&gt; user data, if not found one will be created for the provided email,    and stored in the key.
   * @return acmeUserSecretName
  **/
  @ApiModelProperty(required = true, value = "Secret contains ACMEUser information. Secret must contain a key `email` If empty tries to find an Secret via domains if not found create an ACMEUser and stores as a secret. Secrets key to be expected:  ACME_EMAIL -> required, if not provided it will through error.  ACME_SERVER_URL -> custom server url to generate certificates, default is lets encrypt.  ACME_USER_DATA -> user data, if not found one will be created for the provided email,    and stored in the key.")
  public String getAcmeUserSecretName() {
    return acmeUserSecretName;
  }

  public void setAcmeUserSecretName(String acmeUserSecretName) {
    this.acmeUserSecretName = acmeUserSecretName;
  }

  public V1beta1CertificateSpec challengeProvider(V1beta1ChallengeProvider challengeProvider) {
    this.challengeProvider = challengeProvider;
    return this;
  }

   /**
   * ChallengeProvider details to verify domains
   * @return challengeProvider
  **/
  @ApiModelProperty(required = true, value = "ChallengeProvider details to verify domains")
  public V1beta1ChallengeProvider getChallengeProvider() {
    return challengeProvider;
  }

  public void setChallengeProvider(V1beta1ChallengeProvider challengeProvider) {
    this.challengeProvider = challengeProvider;
  }

  public V1beta1CertificateSpec domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public V1beta1CertificateSpec addDomainsItem(String domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<String>();
    }
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * Tries to obtain a single certificate using all domains passed into Domains. The first domain in domains is used for the CommonName field of the certificate, all other domains are added using the Subject Alternate Names extension.
   * @return domains
  **/
  @ApiModelProperty(value = "Tries to obtain a single certificate using all domains passed into Domains. The first domain in domains is used for the CommonName field of the certificate, all other domains are added using the Subject Alternate Names extension.")
  public List<String> getDomains() {
    return domains;
  }

  public void setDomains(List<String> domains) {
    this.domains = domains;
  }

  public V1beta1CertificateSpec email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Deprecated
   * @return email
  **/
  @ApiModelProperty(value = "Deprecated")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public V1beta1CertificateSpec httpProviderIngressReference(V1beta1LocalTypedReference httpProviderIngressReference) {
    this.httpProviderIngressReference = httpProviderIngressReference;
    return this;
  }

   /**
   * This is the ingress Reference that will be used if provider is http Deprecated
   * @return httpProviderIngressReference
  **/
  @ApiModelProperty(value = "This is the ingress Reference that will be used if provider is http Deprecated")
  public V1beta1LocalTypedReference getHttpProviderIngressReference() {
    return httpProviderIngressReference;
  }

  public void setHttpProviderIngressReference(V1beta1LocalTypedReference httpProviderIngressReference) {
    this.httpProviderIngressReference = httpProviderIngressReference;
  }

  public V1beta1CertificateSpec paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * Indicates that the certificate is paused.
   * @return paused
  **/
  @ApiModelProperty(value = "Indicates that the certificate is paused.")
  public Boolean isPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public V1beta1CertificateSpec provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Following fields are deprecated and will removed in future version. https://github.com/appscode/voyager/pull/506 Deprecated. DNS Provider.
   * @return provider
  **/
  @ApiModelProperty(value = "Following fields are deprecated and will removed in future version. https://github.com/appscode/voyager/pull/506 Deprecated. DNS Provider.")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public V1beta1CertificateSpec providerCredentialSecretName(String providerCredentialSecretName) {
    this.providerCredentialSecretName = providerCredentialSecretName;
    return this;
  }

   /**
   * ProviderCredentialSecretName is used to create the acme client, that will do needed processing in DNS. Deprecated
   * @return providerCredentialSecretName
  **/
  @ApiModelProperty(value = "ProviderCredentialSecretName is used to create the acme client, that will do needed processing in DNS. Deprecated")
  public String getProviderCredentialSecretName() {
    return providerCredentialSecretName;
  }

  public void setProviderCredentialSecretName(String providerCredentialSecretName) {
    this.providerCredentialSecretName = providerCredentialSecretName;
  }

  public V1beta1CertificateSpec storage(V1beta1CertificateStorage storage) {
    this.storage = storage;
    return this;
  }

   /**
   * Storage backend to store the certificates currently, kubernetes secret and vault.
   * @return storage
  **/
  @ApiModelProperty(value = "Storage backend to store the certificates currently, kubernetes secret and vault.")
  public V1beta1CertificateStorage getStorage() {
    return storage;
  }

  public void setStorage(V1beta1CertificateStorage storage) {
    this.storage = storage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CertificateSpec v1beta1CertificateSpec = (V1beta1CertificateSpec) o;
    return Objects.equals(this.acmeStagingURL, v1beta1CertificateSpec.acmeStagingURL) &&
        Objects.equals(this.acmeUserSecretName, v1beta1CertificateSpec.acmeUserSecretName) &&
        Objects.equals(this.challengeProvider, v1beta1CertificateSpec.challengeProvider) &&
        Objects.equals(this.domains, v1beta1CertificateSpec.domains) &&
        Objects.equals(this.email, v1beta1CertificateSpec.email) &&
        Objects.equals(this.httpProviderIngressReference, v1beta1CertificateSpec.httpProviderIngressReference) &&
        Objects.equals(this.paused, v1beta1CertificateSpec.paused) &&
        Objects.equals(this.provider, v1beta1CertificateSpec.provider) &&
        Objects.equals(this.providerCredentialSecretName, v1beta1CertificateSpec.providerCredentialSecretName) &&
        Objects.equals(this.storage, v1beta1CertificateSpec.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acmeStagingURL, acmeUserSecretName, challengeProvider, domains, email, httpProviderIngressReference, paused, provider, providerCredentialSecretName, storage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CertificateSpec {\n");
    
    sb.append("    acmeStagingURL: ").append(toIndentedString(acmeStagingURL)).append("\n");
    sb.append("    acmeUserSecretName: ").append(toIndentedString(acmeUserSecretName)).append("\n");
    sb.append("    challengeProvider: ").append(toIndentedString(challengeProvider)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    httpProviderIngressReference: ").append(toIndentedString(httpProviderIngressReference)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    providerCredentialSecretName: ").append(toIndentedString(providerCredentialSecretName)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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

