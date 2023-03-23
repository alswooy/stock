package com.dayone;

import com.dayone.model.Company;
import com.dayone.scraper.Scraper;
import com.dayone.scraper.YahooFinanceScraper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


@SpringBootApplication
public class StockApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockApplication.class, args);
//
//		YahooFinanceScraper scraper = new YahooFinanceScraper();
//		var result = scraper.scrapCompanyByTicker("3");
//		System.out.println(result);





	}

}
