package data.extraction;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;


/*
 * http://stackoverflow.com/questions/26509971/spring-batch-jpapagingitemreader-why-some-rows-are-not-read
 */
public class App {
	public static void main(String[] args) {

		String[] springConfig  = 
			{	"classpath:spring/batch/config/database.xml", 
				"classpath:spring/batch/config/context.xml",
				"classpath:spring/batch/jobs/job-report.xml" 
			};
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(springConfig);
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("reportJob");

		try {

			JobExecution execution = jobLauncher.run(job, new JobParameters());
			System.out.println("Exit Status : " + execution.getStatus());

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Done");

	}
}
