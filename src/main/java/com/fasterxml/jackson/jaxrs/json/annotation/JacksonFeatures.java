package com.fasterxml.jackson.jaxrs.json.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.SerializationConfig;

/**
 * Annotation that can be used enable and/or disable various
 * features for <code>ObjectReader</code>s and <code>ObjectWriter</code>s.
 */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@com.fasterxml.jackson.annotation.JacksonAnnotation
public @interface JacksonFeatures
{
    /**
     * Deserialization features to enable.
     */
    public DeserializationConfig.Feature[] deserializationEnable() default { };

    /**
     * Deserialization features to disable.
     */
    public DeserializationConfig.Feature[] deserializationDisable() default { };
    
    /**
     * Serialization features to enable.
     */
    public SerializationConfig.Feature[] serializationEnable() default { };

    /**
     * Serialization features to disable.
     */
    public SerializationConfig.Feature[] serializationDisable() default { };
}
