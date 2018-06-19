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
import io.kubernetes.client.custom.IntOrString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta1HTTPIngressBackend
 */

public class V1beta1HTTPIngressBackend {
  @SerializedName("backendRules")
  private List<String> backendRules = null;

  @SerializedName("headerRules")
  private List<String> headerRules = null;

  @SerializedName("hostNames")
  private List<String> hostNames = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rewriteRules")
  private List<String> rewriteRules = null;

  @SerializedName("serviceName")
  private String serviceName = null;

  @SerializedName("servicePort")
  private IntOrString servicePort = null;

  public V1beta1HTTPIngressBackend backendRules(List<String> backendRules) {
    this.backendRules = backendRules;
    return this;
  }

  public V1beta1HTTPIngressBackend addBackendRulesItem(String backendRulesItem) {
    if (this.backendRules == null) {
      this.backendRules = new ArrayList<String>();
    }
    this.backendRules.add(backendRulesItem);
    return this;
  }

   /**
   * Serialized HAProxy rules to apply on server backend including request, response or header rewrite. acls also can be used. https://cbonte.github.io/haproxy-dconv/1.7/configuration.html#1
   * @return backendRules
  **/
  @ApiModelProperty(value = "Serialized HAProxy rules to apply on server backend including request, response or header rewrite. acls also can be used. https://cbonte.github.io/haproxy-dconv/1.7/configuration.html#1")
  public List<String> getBackendRules() {
    return backendRules;
  }

  public void setBackendRules(List<String> backendRules) {
    this.backendRules = backendRules;
  }

  public V1beta1HTTPIngressBackend headerRules(List<String> headerRules) {
    this.headerRules = headerRules;
    return this;
  }

  public V1beta1HTTPIngressBackend addHeaderRulesItem(String headerRulesItem) {
    if (this.headerRules == null) {
      this.headerRules = new ArrayList<String>();
    }
    this.headerRules.add(headerRulesItem);
    return this;
  }

   /**
   * Header rules to modifies the header.  Deprecated: Use backendRule, will be removed.
   * @return headerRules
  **/
  @ApiModelProperty(value = "Header rules to modifies the header.  Deprecated: Use backendRule, will be removed.")
  public List<String> getHeaderRules() {
    return headerRules;
  }

  public void setHeaderRules(List<String> headerRules) {
    this.headerRules = headerRules;
  }

  public V1beta1HTTPIngressBackend hostNames(List<String> hostNames) {
    this.hostNames = hostNames;
    return this;
  }

  public V1beta1HTTPIngressBackend addHostNamesItem(String hostNamesItem) {
    if (this.hostNames == null) {
      this.hostNames = new ArrayList<String>();
    }
    this.hostNames.add(hostNamesItem);
    return this;
  }

   /**
   * Host names to forward traffic to. If empty traffic will be forwarded to all subsets instance. If set only matched hosts will get the traffic. This is an handy way to send traffic to Specific StatefulSet pod. IE. Setting [web-0] will send traffic to only web-0 host for this StatefulSet, https://kubernetes.io/docs/tasks/stateful-application/basic-stateful-set/#creating-a-statefulset
   * @return hostNames
  **/
  @ApiModelProperty(value = "Host names to forward traffic to. If empty traffic will be forwarded to all subsets instance. If set only matched hosts will get the traffic. This is an handy way to send traffic to Specific StatefulSet pod. IE. Setting [web-0] will send traffic to only web-0 host for this StatefulSet, https://kubernetes.io/docs/tasks/stateful-application/basic-stateful-set/#creating-a-statefulset")
  public List<String> getHostNames() {
    return hostNames;
  }

  public void setHostNames(List<String> hostNames) {
    this.hostNames = hostNames;
  }

  public V1beta1HTTPIngressBackend name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User can specify backend name for using it with custom acl Otherwise it will be generated
   * @return name
  **/
  @ApiModelProperty(value = "User can specify backend name for using it with custom acl Otherwise it will be generated")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1beta1HTTPIngressBackend rewriteRules(List<String> rewriteRules) {
    this.rewriteRules = rewriteRules;
    return this;
  }

  public V1beta1HTTPIngressBackend addRewriteRulesItem(String rewriteRulesItem) {
    if (this.rewriteRules == null) {
      this.rewriteRules = new ArrayList<String>();
    }
    this.rewriteRules.add(rewriteRulesItem);
    return this;
  }

   /**
   * Path rewrite rules with haproxy formatted regex.  Deprecated: Use backendRule, will be removed.
   * @return rewriteRules
  **/
  @ApiModelProperty(value = "Path rewrite rules with haproxy formatted regex.  Deprecated: Use backendRule, will be removed.")
  public List<String> getRewriteRules() {
    return rewriteRules;
  }

  public void setRewriteRules(List<String> rewriteRules) {
    this.rewriteRules = rewriteRules;
  }

  public V1beta1HTTPIngressBackend serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Specifies the name of the referenced service.
   * @return serviceName
  **/
  @ApiModelProperty(value = "Specifies the name of the referenced service.")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public V1beta1HTTPIngressBackend servicePort(IntOrString servicePort) {
    this.servicePort = servicePort;
    return this;
  }

   /**
   * Specifies the port of the referenced service.
   * @return servicePort
  **/
  @ApiModelProperty(value = "Specifies the port of the referenced service.")
  public IntOrString getServicePort() {
    return servicePort;
  }

  public void setServicePort(IntOrString servicePort) {
    this.servicePort = servicePort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1HTTPIngressBackend v1beta1HTTPIngressBackend = (V1beta1HTTPIngressBackend) o;
    return Objects.equals(this.backendRules, v1beta1HTTPIngressBackend.backendRules) &&
        Objects.equals(this.headerRules, v1beta1HTTPIngressBackend.headerRules) &&
        Objects.equals(this.hostNames, v1beta1HTTPIngressBackend.hostNames) &&
        Objects.equals(this.name, v1beta1HTTPIngressBackend.name) &&
        Objects.equals(this.rewriteRules, v1beta1HTTPIngressBackend.rewriteRules) &&
        Objects.equals(this.serviceName, v1beta1HTTPIngressBackend.serviceName) &&
        Objects.equals(this.servicePort, v1beta1HTTPIngressBackend.servicePort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backendRules, headerRules, hostNames, name, rewriteRules, serviceName, servicePort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1HTTPIngressBackend {\n");
    
    sb.append("    backendRules: ").append(toIndentedString(backendRules)).append("\n");
    sb.append("    headerRules: ").append(toIndentedString(headerRules)).append("\n");
    sb.append("    hostNames: ").append(toIndentedString(hostNames)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rewriteRules: ").append(toIndentedString(rewriteRules)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    servicePort: ").append(toIndentedString(servicePort)).append("\n");
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

