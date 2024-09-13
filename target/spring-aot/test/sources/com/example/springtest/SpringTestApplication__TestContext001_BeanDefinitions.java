package com.example.springtest;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link SpringTestApplication}.
 */
@Generated
public class SpringTestApplication__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'springTestApplication'.
   */
  public static BeanDefinition getSpringTestApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringTestApplication.class);
    beanDefinition.setTargetType(SpringTestApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(SpringTestApplication.class);
    beanDefinition.setInstanceSupplier(SpringTestApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
