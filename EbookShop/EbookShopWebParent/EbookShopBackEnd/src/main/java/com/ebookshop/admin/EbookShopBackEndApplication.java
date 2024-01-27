package com.ebookshop.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.ebookshop.common.entity", "com.ebookshop.admin.user"})
public class EbookShopBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbookShopBackEndApplication.class, args);
	}

}
