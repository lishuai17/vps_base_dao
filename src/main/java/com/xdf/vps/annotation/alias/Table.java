package com.xdf.vps.annotation.alias;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Table {
	
	/**
     * 数据表名称注解，默认值为类名称
     * @return
     */
    public String name() default "className";
    
//    public abstract String catalog();
//
//    public abstract String schema();


}
