package com.tci.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Crawler {

    private static int pages;
    private static int depth;
    private static long startTime;
    private static long endTime;
    private static  long totalTime;

    Crawler() {

        startTime= System.currentTimeMillis();
        pages=0;
        depth=0;
    }

    int PagesExployed()
    {
        return pages;
    }

    int SearchedDepth()
    {
        return depth;
    }

    long TimeElasped()
    {
        return totalTime = endTime-startTime;
    }

    public static void SearchAlgorithmDFS(String Searchword) throws IOException {
        String s = "http://localhost/WebCrawler/Webcrawler/src/main/webapp/sample_site_to_crawl/catalog.php";

        Document doc;
        doc = Jsoup.connect(s).get();
        pages++;

        Elements linksToVisit = doc.getElementsByAttributeValue("class", "nav");
        //String text = "Beethoven: Complete Symphonies";
        // Elements ok = doc.getElementsByAttributeValue("alt",text);
        //System.out.println(linksToVisit);
        Elements ok = linksToVisit.get(0).getElementsByTag("li");
        ok.remove(ok.last());
        for (Element link : ok) {
            Elements bookdetail = link.getElementsByTag("a");
            doc = Jsoup.connect(s.substring(0, 76) + bookdetail.attr("href")).get();
            pages++;
            if(depth == 0){
                depth++;
            }
            Elements bookdetailpage = doc.getElementsByAttributeValue("class", "items");
            Elements books = bookdetailpage.get(0).getElementsByTag("li");
            for (Element book : books) {
                Elements details = book.getElementsByTag("a");
                doc = Jsoup.connect(s.substring(0, 76) + details.attr("href")).get();
                pages++;
                String name = doc.getElementsByTag("img").attr("alt");
                if(depth == 1)
                {
                    depth++;
                }
                if(Searchword.equals(name)){

                    Elements detailspage = doc.getElementsByAttributeValue("class", "media-details");
                    System.out.println(detailspage.get(0));
                    endTime=System.currentTimeMillis();
                    return;
                }
                if(books.last().equals(book)){
                    depth=0;
                    endTime=System.currentTimeMillis();
                }
            }
        }
    }
}
