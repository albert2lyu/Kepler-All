package com.kepler.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标记后方法指定异常将被Collector判断为正常返回(For Method)
 * 
 * @author kim 2015年12月15日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface QuietMethod {

	public Class<? extends Throwable>[] quiet();
}
