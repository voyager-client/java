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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1PodAffinityTerm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)
 */
@ApiModel(description = "The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)")

public class V1WeightedPodAffinityTerm {
  @SerializedName("podAffinityTerm")
  private V1PodAffinityTerm podAffinityTerm = null;

  @SerializedName("weight")
  private Integer weight = null;

  public V1WeightedPodAffinityTerm podAffinityTerm(V1PodAffinityTerm podAffinityTerm) {
    this.podAffinityTerm = podAffinityTerm;
    return this;
  }

   /**
   * Required. A pod affinity term, associated with the corresponding weight.
   * @return podAffinityTerm
  **/
  @ApiModelProperty(required = true, value = "Required. A pod affinity term, associated with the corresponding weight.")
  public V1PodAffinityTerm getPodAffinityTerm() {
    return podAffinityTerm;
  }

  public void setPodAffinityTerm(V1PodAffinityTerm podAffinityTerm) {
    this.podAffinityTerm = podAffinityTerm;
  }

  public V1WeightedPodAffinityTerm weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
   * @return weight
  **/
  @ApiModelProperty(required = true, value = "weight associated with matching the corresponding podAffinityTerm, in the range 1-100.")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1WeightedPodAffinityTerm v1WeightedPodAffinityTerm = (V1WeightedPodAffinityTerm) o;
    return Objects.equals(this.podAffinityTerm, v1WeightedPodAffinityTerm.podAffinityTerm) &&
        Objects.equals(this.weight, v1WeightedPodAffinityTerm.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podAffinityTerm, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1WeightedPodAffinityTerm {\n");
    
    sb.append("    podAffinityTerm: ").append(toIndentedString(podAffinityTerm)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

