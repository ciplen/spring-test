package com.example.springtest;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HalloController}.
 */
@Generated
public class HalloController__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'halloController'.
   */
  public static BeanDefinition getHalloControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HalloController.class);
    beanDefinition.setInstanceSupplier(HalloController::new);
    return beanDefinition;
  }
}
