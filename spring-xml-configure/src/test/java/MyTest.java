import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

public class MyTest {
    @Test
    public void test(){
        //创建一个IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //使用getBean获取bean
        //参数为bean的id, classType为可选参数,默认获取的为object类型
        User user1 = context.getBean("user1",User.class);
        User user2 = (User) context.getBean("user2");

        System.out.println(user1.getName());
        System.out.println(user2.getAddress().getAddress());
    }
}
