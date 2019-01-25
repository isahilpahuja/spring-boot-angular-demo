package com.deloitte.angular.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author ajaykumar8
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    private String resourceName;
    private String fieldName;
    private int fieldName1;
    private Object fieldValue;

    public ResourceNotFoundException( String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
    public ResourceNotFoundException( String resourceName, int fieldName1, Object fieldValue) {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName1, fieldValue));
        this.resourceName = resourceName;
        this.fieldName1 = fieldName1;
        this.fieldValue = fieldValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }
	public int getFieldName1() {
		return fieldName1;
	}
	public void setFieldName1(int fieldName1) {
		this.fieldName1 = fieldName1;
	}
    
    
}
