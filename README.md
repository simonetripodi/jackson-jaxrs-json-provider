## Overview

This Jackson extension adds JSON reading/writing support for JAX-RS implementations like [Jersey](http://jersey.java.net/) and [RESTeasy](http://www.jboss.org/resteasy).
This is done by class `JacksonJsonProvider` implementing `javax.ws.rs.ext.MessageBodyReader` and `javax.ws.rs.ext.MessageBodyWriter` that JAX-RS defines for pluggable support for data formats. 
`JacksonJsonProvider` (and `JacksonJaxbJsonProvider`) can then be registered with JAX-RS container to make Jackson the standard JSON reader/writer provider.

## Status

Module is fully usable -- code was refactored from Jackson 1.9 "jackson-jaxrs" component, into its own separate project (for Jackson 2.0)

## Maven dependency

To use this extension on Maven-based projects, use following dependency:

    <dependency>
      <groupId>com.fasterxml.jackson</groupId>
      <artifactId>jackson-jaxrs-json-provider</artifactId>
      <version>1.9.2</version>
    </dependency>

(or whatever version is most up-to-date at the moment)

## Usage

(to be written)