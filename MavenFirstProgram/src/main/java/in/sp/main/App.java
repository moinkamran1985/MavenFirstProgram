package in.sp.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App
{
	public static void main(String[] args) 
	{
		
	String configuration="/in/sp/resources/application.xml";
	ApplicationContext context=new ClassPathXmlApplicationContext(configuration);
		
	Student std=context.getBean(Student.class);
	        std.display();
		
	}
	
}







   
    
    	
        		
        		
   

