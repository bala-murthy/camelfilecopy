package com.learncamel.mock;

import org.apache.camel.builder.RouteBuilder;

public class copyFilesMock extends RouteBuilder {
    public void configure() throws Exception {
        from("direct:samplemockinput").
                log("Received input files header ${headers} and body is ${body}").
                to("mock:samplemockoutput");
    }
}
