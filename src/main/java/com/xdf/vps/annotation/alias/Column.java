package com.xdf.vps.annotation.alias;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Column{
	
	public String name() default "";
	
	public boolean unique() default false;
	
	public boolean nullable() default true;

}
