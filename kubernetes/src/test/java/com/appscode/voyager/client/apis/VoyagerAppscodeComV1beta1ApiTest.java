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


package com.appscode.voyager.client.apis;

import com.appscode.voyager.client.ApiException;
import io.kubernetes.client.models.V1APIResourceList;
import io.kubernetes.client.models.V1Status;
import com.appscode.voyager.client.models.V1beta1Certificate;
import com.appscode.voyager.client.models.V1beta1CertificateList;
import com.appscode.voyager.client.models.V1beta1Ingress;
import com.appscode.voyager.client.models.V1beta1IngressList;
import org.junit.Test;
import org.junit.Ignore;
import io.kubernetes.client.models.V1DeleteOptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VoyagerAppscodeComV1beta1Api
 */
@Ignore
public class VoyagerAppscodeComV1beta1ApiTest {

    private final VoyagerAppscodeComV1beta1Api api = new VoyagerAppscodeComV1beta1Api();

    
    /**
     * 
     *
     * create a Certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedCertificateTest() throws ApiException {
        String namespace = null;
        V1beta1Certificate body = null;
        String pretty = null;
        V1beta1Certificate response = api.createNamespacedCertificate(namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create an Ingress
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedIngressTest() throws ApiException {
        String namespace = null;
        V1beta1Ingress body = null;
        String pretty = null;
        V1beta1Ingress response = api.createNamespacedIngress(namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of Certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionNamespacedCertificateTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionNamespacedCertificate(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of Ingress
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionNamespacedIngressTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionNamespacedIngress(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a Certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedCertificateTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteNamespacedCertificate(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete an Ingress
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedIngressTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteNamespacedIngress(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIResourcesTest() throws ApiException {
        V1APIResourceList response = api.getAPIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind Certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCertificateForAllNamespacesTest() throws ApiException {
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1CertificateList response = api.listCertificateForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind Ingress
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listIngressForAllNamespacesTest() throws ApiException {
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1IngressList response = api.listIngressForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind Certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedCertificateTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1CertificateList response = api.listNamespacedCertificate(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind Ingress
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedIngressTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1IngressList response = api.listNamespacedIngress(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified Certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedCertificateTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        V1beta1Certificate response = api.patchNamespacedCertificate(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified Ingress
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedIngressTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        V1beta1Ingress response = api.patchNamespacedIngress(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified Certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedCertificateTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        V1beta1Certificate response = api.readNamespacedCertificate(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified Ingress
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedIngressTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        V1beta1Ingress response = api.readNamespacedIngress(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified Certificate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedCertificateTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1beta1Certificate body = null;
        String pretty = null;
        V1beta1Certificate response = api.replaceNamespacedCertificate(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified Ingress
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedIngressTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1beta1Ingress body = null;
        String pretty = null;
        V1beta1Ingress response = api.replaceNamespacedIngress(name, namespace, body, pretty);

        // TODO: test validations
    }
    
}
