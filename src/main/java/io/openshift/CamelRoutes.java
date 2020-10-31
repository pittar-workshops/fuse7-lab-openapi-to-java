package io.openshift;

import javax.annotation.Generated;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;

/**
 * Generated from OpenApi specification by Camel REST DSL generator.
 */
@Generated("org.apache.camel.generator.openapi.PathGenerator")
@Component
public final class CamelRoutes extends RouteBuilder {

    /**
     * Defines Apache Camel routes using REST DSL fluent API.
     */
    public void configure() {

        restConfiguration().component("servlet").contextPath("/");

        rest()
            .get("/products")
                .id("get_products")
                .description("Get all products.")
                .produces("application/json")
                .to("direct:get_products")
            .get("/products/{productId}")
                .id("get_product_by_id")
                .description("Get product by ID.")
                .produces("application/json")
                .param()
                    .name("productId")
                    .type(RestParamType.path)
                    .dataType("integer")
                    .required(true)
                    .description("Product ID.")
                .endParam()
                .to("direct:get_product_by_id");
    }
}
