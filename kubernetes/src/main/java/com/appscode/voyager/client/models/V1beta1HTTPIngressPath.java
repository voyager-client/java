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
import com.appscode.voyager.client.models.V1beta1HTTPIngressBackend;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * HTTPIngressPath associates a path regex with a backend. Incoming urls matching the path are forwarded to the backend.
 */
@ApiModel(description = "HTTPIngressPath associates a path regex with a backend. Incoming urls matching the path are forwarded to the backend.")

public class V1beta1HTTPIngressPath {
  @SerializedName("backend")
  private V1beta1HTTPIngressBackend backend = null;

  @SerializedName("path")
  private String path = null;

  public V1beta1HTTPIngressPath backend(V1beta1HTTPIngressBackend backend) {
    this.backend = backend;
    return this;
  }

   /**
   * Backend defines the referenced service endpoint to which the traffic will be forwarded to.
   * @return backend
  **/
  @ApiModelProperty(value = "Backend defines the referenced service endpoint to which the traffic will be forwarded to.")
  public V1beta1HTTPIngressBackend getBackend() {
    return backend;
  }

  public void setBackend(V1beta1HTTPIngressBackend backend) {
    this.backend = backend;
  }

  public V1beta1HTTPIngressPath path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path is a extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional \&quot;path\&quot; part of a URL as defined by RFC 3986. Paths must begin with a &#39;/&#39;. If unspecified, the path defaults to a catch all sending traffic to the backend.
   * @return path
  **/
  @ApiModelProperty(value = "Path is a extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional \"path\" part of a URL as defined by RFC 3986. Paths must begin with a '/'. If unspecified, the path defaults to a catch all sending traffic to the backend.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1HTTPIngressPath v1beta1HTTPIngressPath = (V1beta1HTTPIngressPath) o;
    return Objects.equals(this.backend, v1beta1HTTPIngressPath.backend) &&
        Objects.equals(this.path, v1beta1HTTPIngressPath.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backend, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1HTTPIngressPath {\n");
    
    sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

