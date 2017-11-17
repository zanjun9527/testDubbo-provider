package aka;

import org.springframework.stereotype.Service;

@Service("helloService")
public class testApiService implements testApi {
	public void sayHello() {
		System.out.println("nihoa ");
	}

}
