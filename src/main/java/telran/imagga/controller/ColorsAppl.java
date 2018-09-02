package telran.imagga.controller;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import telran.imagga.dto.Collors;

public class ColorsAppl {
	public static void main(String[] args) {
	RestTemplate restTemplate = new RestTemplate();
	HttpHeaders headers = new HttpHeaders();
	headers.add("Authorization",
			"Basic YWNjX2RmYWI2ZWFkMjYwNTI4MTozNTU5Yjg3OTg2ZDA3NGM5ODVkM2U4Y2Y1MmU1ZjJmMA==");
	HttpEntity<String> requestEntity = new HttpEntity<>(headers);
	String url = "https://api.imagga.com/v1/colors";
	UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
			.queryParam("url", "https://24smi.org/public/media/235x307/person/2017/12/22/4sqqykgn04bo-cheburashka.jpg");
	//String endpoints = "?url=https://24smi.org/public/media/235x307/person/2017/12/22/4sqqykgn04bo-cheburashka.jpg";
	ResponseEntity<Collors> response = restTemplate.exchange(builder.build().encode().toUri(),
			HttpMethod.GET,requestEntity, Collors.class);
	System.out.println(response.getBody());


}
}
