# instantiation (creating the object)
	<bean name="" class="">
	</bean>

# set the properties
	<bean name="" class="">
	 	<property name="" value="">
	</bean>
	
# set the bean name (BeanNameAware#setBeanName)
	class Employee implements BeanNameAware{
		public void setBeanName(String name){
		}
	}
	
# set bean in the BeanFactory (BeanFactoryAware#beanFactory)

# ApplicationContextAware#setApplicationContext

# BeanPostProcessor#postProcessBeforeInitialization

# InitializingBean#afterPropertiesSet

# custom init
  

# BeanPostProcessor#postProcessAfterInitialization
	<bean name="" class="" init-method="customInitMethod()">
	 	<property name="" value="">
	</bean>
	
	class Employee implements BeanNameAware{
		public void setBeanName(String name){
		}
		
		public void customInitMethod(){
		}
	}

# Bean is ready to be used


# DisposableBean#destroy()


# custom destroy method

