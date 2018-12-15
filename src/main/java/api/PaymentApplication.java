package api;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;



@SpringBootApplication
public class PaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
	}
	
	@Autowired
	private DataSource dataSource;

	@Autowired
	private ResourceLoader resourceLoader;

	@Value("${spring.jpa.properties.hibernate.dialect}")
	private String HIBERNATE_DIALECT;

	@Value("${spring.jpa.show-sql}")
	private String HIBERNATE_SHOW_SQL;
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() throws IOException {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setMappingLocations(loadResources());
		sessionFactoryBean.setDataSource(dataSource);
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect", HIBERNATE_DIALECT);
		hibernateProperties.put("hibernate.show_sql", HIBERNATE_SHOW_SQL);
		sessionFactoryBean.setHibernateProperties(hibernateProperties);
		return sessionFactoryBean;
	}
	
	public Resource[] loadResources() {
		Resource[] resources = null;
		try {
			String hbnXml = "classpath:/hibernate/*.hbm.xml";
			resources = ResourcePatternUtils.getResourcePatternResolver(resourceLoader).getResources(hbnXml);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resources;
	}
	
}


