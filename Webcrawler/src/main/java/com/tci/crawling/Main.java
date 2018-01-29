package com.tci.crawling;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Crawler crawler = new Crawler("http://localhost:9000/sample_site_to_crawl/");

        System.out.print("********************* Web Crawling test With Jsoup **********************\n");

        System.out.print("################################## Web Crawling with ID ##########################################\n");

        System.out.print(crawler.searchAlgorithmWithIdDFS(203) + " \n");

        System.out.print("################################## Web Crawling with search word ##################################\n");

        System.out.print(crawler.searchAlgorithmWithWordDFS("No Fences"));

    }
}
