package org.datafx.controller.context.resource;

import java.lang.annotation.Annotation;

import org.datafx.controller.context.ViewContext;

public interface AnnotatedControllerResourceType<S extends Annotation, T> {

	T getResource(S annotation, Class<T> resourceClass, ViewContext<?> context);
	
	Class<S> getSupportedAnnotation();
}
