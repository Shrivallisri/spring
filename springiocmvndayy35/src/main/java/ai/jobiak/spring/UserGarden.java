package ai.jobiak.spring;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class UserGarden {

		public static void main(String[] args) {
			
			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
			System.out.println(context.containsBean("garden"));
			Garden ref= (Garden) context.getBean("garden");
			System.out.println(ref);
			// TODO Auto-generated method stub

		}

	}


