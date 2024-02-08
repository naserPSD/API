package sofenportfolio1.web.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sofenportfolio1.web.app.repositories.UserRepo;

@SpringBootTest
class Demo5ApplicationTests {
@Autowired
	private UserRepo userRepo;
	@Test
	void contextLoads() {
	}
	@Test
	public void repoTest() {
String className = this.userRepo.getClass().getName();
String packageName = this.userRepo.getClass().getPackageName();
System.out.println(className);
System.out.println(packageName);
	}
}