package hello;

import org.springframework.stereotype.Service;

@SuppressWarnings("javadoc")
@Service
public class HelloService {
	public String hello() {
		return "<html><body>Greetings from Spring Boot!</body></html>";
	}
}
