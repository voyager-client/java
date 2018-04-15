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
import com.appscode.voyager.client.models.ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule;
import com.appscode.voyager.client.models.ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPIngressBackend;
import com.appscode.voyager.client.models.ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressRule;
import com.appscode.voyager.client.models.ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressTLS;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1Affinity;
import io.kubernetes.client.models.V1LocalObjectReference;
import io.kubernetes.client.models.V1ResourceRequirements;
import io.kubernetes.client.models.V1Toleration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IngressSpec describes the Ingress the user wishes to exist.
 */
@ApiModel(description = "IngressSpec describes the Ingress the user wishes to exist.")

public class ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec {
  @SerializedName("affinity")
  private V1Affinity affinity = null;

  @SerializedName("backend")
  private ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPIngressBackend backend = null;

  @SerializedName("externalIPs")
  private List<String> externalIPs = null;

  @SerializedName("frontendRules")
  private List<ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule> frontendRules = null;

  @SerializedName("imagePullSecrets")
  private List<V1LocalObjectReference> imagePullSecrets = null;

  @SerializedName("loadBalancerSourceRanges")
  private List<String> loadBalancerSourceRanges = null;

  @SerializedName("nodeSelector")
  private Map<String, String> nodeSelector = null;

  @SerializedName("resources")
  private V1ResourceRequirements resources = null;

  @SerializedName("rules")
  private List<ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressRule> rules = null;

  @SerializedName("schedulerName")
  private String schedulerName = null;

  @SerializedName("tls")
  private List<ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressTLS> tls = null;

  @SerializedName("tolerations")
  private List<V1Toleration> tolerations = null;

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec affinity(V1Affinity affinity) {
    this.affinity = affinity;
    return this;
  }

   /**
   * If specified, the pod&#39;s scheduling constraints
   * @return affinity
  **/
  @ApiModelProperty(value = "If specified, the pod's scheduling constraints")
  public V1Affinity getAffinity() {
    return affinity;
  }

  public void setAffinity(V1Affinity affinity) {
    this.affinity = affinity;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec backend(ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPIngressBackend backend) {
    this.backend = backend;
    return this;
  }

   /**
   * A default backend capable of servicing requests that don&#39;t match any rule. At least one of &#39;backend&#39; or &#39;rules&#39; must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.
   * @return backend
  **/
  @ApiModelProperty(value = "A default backend capable of servicing requests that don't match any rule. At least one of 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.")
  public ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPIngressBackend getBackend() {
    return backend;
  }

  public void setBackend(ComGithubAppscodeVoyagerApisVoyagerV1beta1HTTPIngressBackend backend) {
    this.backend = backend;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec externalIPs(List<String> externalIPs) {
    this.externalIPs = externalIPs;
    return this;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec addExternalIPsItem(String externalIPsItem) {
    if (this.externalIPs == null) {
      this.externalIPs = new ArrayList<String>();
    }
    this.externalIPs.add(externalIPsItem);
    return this;
  }

   /**
   * externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.
   * @return externalIPs
  **/
  @ApiModelProperty(value = "externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.")
  public List<String> getExternalIPs() {
    return externalIPs;
  }

  public void setExternalIPs(List<String> externalIPs) {
    this.externalIPs = externalIPs;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec frontendRules(List<ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule> frontendRules) {
    this.frontendRules = frontendRules;
    return this;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec addFrontendRulesItem(ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule frontendRulesItem) {
    if (this.frontendRules == null) {
      this.frontendRules = new ArrayList<ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule>();
    }
    this.frontendRules.add(frontendRulesItem);
    return this;
  }

   /**
   * Frontend rules specifies a set of rules that should be applied in HAProxy frontend configuration. The set of keywords are from here https://cbonte.github.io/haproxy-dconv/1.7/configuration.html#4.1 Only frontend sections can be applied here. It is up to user to provide valid set of rules. This allows acls or other options in frontend sections in HAProxy config. Frontend rules will be mapped with Ingress Rules according to port.
   * @return frontendRules
  **/
  @ApiModelProperty(value = "Frontend rules specifies a set of rules that should be applied in HAProxy frontend configuration. The set of keywords are from here https://cbonte.github.io/haproxy-dconv/1.7/configuration.html#4.1 Only frontend sections can be applied here. It is up to user to provide valid set of rules. This allows acls or other options in frontend sections in HAProxy config. Frontend rules will be mapped with Ingress Rules according to port.")
  public List<ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule> getFrontendRules() {
    return frontendRules;
  }

  public void setFrontendRules(List<ComGithubAppscodeVoyagerApisVoyagerV1beta1FrontendRule> frontendRules) {
    this.frontendRules = frontendRules;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec imagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec addImagePullSecretsItem(V1LocalObjectReference imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<V1LocalObjectReference>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

   /**
   * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
   * @return imagePullSecrets
  **/
  @ApiModelProperty(value = "ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod")
  public List<V1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }

  public void setImagePullSecrets(List<V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec loadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
    return this;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec addLoadBalancerSourceRangesItem(String loadBalancerSourceRangesItem) {
    if (this.loadBalancerSourceRanges == null) {
      this.loadBalancerSourceRanges = new ArrayList<String>();
    }
    this.loadBalancerSourceRanges.add(loadBalancerSourceRangesItem);
    return this;
  }

   /**
   * Optional: If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature. https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
   * @return loadBalancerSourceRanges
  **/
  @ApiModelProperty(value = "Optional: If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature. https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/")
  public List<String> getLoadBalancerSourceRanges() {
    return loadBalancerSourceRanges;
  }

  public void setLoadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec nodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
   * @return nodeSelector
  **/
  @ApiModelProperty(value = "NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/")
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec resources(V1ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

   /**
   * Compute Resources required by the sidecar container.
   * @return resources
  **/
  @ApiModelProperty(value = "Compute Resources required by the sidecar container.")
  public V1ResourceRequirements getResources() {
    return resources;
  }

  public void setResources(V1ResourceRequirements resources) {
    this.resources = resources;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec rules(List<ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressRule> rules) {
    this.rules = rules;
    return this;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec addRulesItem(ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
   * @return rules
  **/
  @ApiModelProperty(value = "A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.")
  public List<ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressRule> getRules() {
    return rules;
  }

  public void setRules(List<ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressRule> rules) {
    this.rules = rules;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec schedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
    return this;
  }

   /**
   * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
   * @return schedulerName
  **/
  @ApiModelProperty(value = "If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.")
  public String getSchedulerName() {
    return schedulerName;
  }

  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec tls(List<ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressTLS> tls) {
    this.tls = tls;
    return this;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec addTlsItem(ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressTLS tlsItem) {
    if (this.tls == null) {
      this.tls = new ArrayList<ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressTLS>();
    }
    this.tls.add(tlsItem);
    return this;
  }

   /**
   * TLS is the TLS configuration. Currently the Ingress only supports a single TLS port, 443, and assumes TLS termination. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension.
   * @return tls
  **/
  @ApiModelProperty(value = "TLS is the TLS configuration. Currently the Ingress only supports a single TLS port, 443, and assumes TLS termination. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension.")
  public List<ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressTLS> getTls() {
    return tls;
  }

  public void setTls(List<ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressTLS> tls) {
    this.tls = tls;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec tolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec addTolerationsItem(V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<V1Toleration>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * If specified, the pod&#39;s tolerations.
   * @return tolerations
  **/
  @ApiModelProperty(value = "If specified, the pod's tolerations.")
  public List<V1Toleration> getTolerations() {
    return tolerations;
  }

  public void setTolerations(List<V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec comGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec = (ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec) o;
    return Objects.equals(this.affinity, comGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec.affinity) &&
        Objects.equals(this.backend, comGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec.backend) &&
        Objects.equals(this.externalIPs, comGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec.externalIPs) &&
        Objects.equals(this.frontendRules, comGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec.frontendRules) &&
        Objects.equals(this.imagePullSecrets, comGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec.imagePullSecrets) &&
        Objects.equals(this.loadBalancerSourceRanges, comGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec.loadBalancerSourceRanges) &&
        Objects.equals(this.nodeSelector, comGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec.nodeSelector) &&
        Objects.equals(this.resources, comGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec.resources) &&
        Objects.equals(this.rules, comGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec.rules) &&
        Objects.equals(this.schedulerName, comGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec.schedulerName) &&
        Objects.equals(this.tls, comGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec.tls) &&
        Objects.equals(this.tolerations, comGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec.tolerations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinity, backend, externalIPs, frontendRules, imagePullSecrets, loadBalancerSourceRanges, nodeSelector, resources, rules, schedulerName, tls, tolerations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubAppscodeVoyagerApisVoyagerV1beta1IngressSpec {\n");
    
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
    sb.append("    externalIPs: ").append(toIndentedString(externalIPs)).append("\n");
    sb.append("    frontendRules: ").append(toIndentedString(frontendRules)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    loadBalancerSourceRanges: ").append(toIndentedString(loadBalancerSourceRanges)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
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

