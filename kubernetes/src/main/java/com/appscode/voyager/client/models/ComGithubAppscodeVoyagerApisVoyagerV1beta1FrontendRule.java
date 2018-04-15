/*
 * voyager-server
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * Contact: hello@appscode.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.appscode.voyager.client.models;

import java.util.Objects;
import com.appscode.voyager.client.models.ComGithubAppscodeVoyagerApisVoyagerV1beta1AuthOption;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.custom.IntOrString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule
 */

public class ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule {
  @SerializedName("auth")
  private ComGithubAppscodeVoyagerApisVoyagerV1beta1AuthOption auth = null;

  @SerializedName("port")
  private IntOrString port = null;

  @SerializedName("rules")
  private List<String> rules = null;

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule auth(ComGithubAppscodeVoyagerApisVoyagerV1beta1AuthOption auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @ApiModelProperty(value = "")
  public ComGithubAppscodeVoyagerApisVoyagerV1beta1AuthOption getAuth() {
    return auth;
  }

  public void setAuth(ComGithubAppscodeVoyagerApisVoyagerV1beta1AuthOption auth) {
    this.auth = auth;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule port(IntOrString port) {
    this.port = port;
    return this;
  }

   /**
   * Port indicates the frontend port where HAProxy is listening for connection
   * @return port
  **/
  @ApiModelProperty(value = "Port indicates the frontend port where HAProxy is listening for connection")
  public IntOrString getPort() {
    return port;
  }

  public void setPort(IntOrString port) {
    this.port = port;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule rules(List<String> rules) {
    this.rules = rules;
    return this;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule addRulesItem(String rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<String>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Serialized rules
   * @return rules
  **/
  @ApiModelProperty(value = "Serialized rules")
  public List<String> getRules() {
    return rules;
  }

  public void setRules(List<String> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule comGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule = (ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule) o;
    return Objects.equals(this.auth, comGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule.auth) &&
        Objects.equals(this.port, comGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule.port) &&
        Objects.equals(this.rules, comGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, port, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule {\n");
    
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
