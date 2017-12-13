package com.tci.crawling;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Crawler crawler = new Crawler();
        System.out.print("********************* Web Crawling test With Jsoup **********************");


        crawler.SearchAlgorithmDFS("Office Space");
        System.out.println("Number of pages explored: "+ crawler.PagesExployed());
        System.out.println("Search depth: "+ crawler.SearchedDepth());
        System.out.println("Time elapsed: " + crawler.TimeElasped() +"ms");
    }
}
