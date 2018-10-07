package info.developia.showltan.tvshows;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TvshowsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TvshowsApplication.class, args);
	}
}
