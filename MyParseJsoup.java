package parseHTMLjsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;
import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by user on 09.01.2017.
 */
public class MyParseJsoup {
    public static void main(String[] args) throws Exception {
        /*
        * Enter ULR which is need to parse!
        */
//      Scanner enterURL = new Scanner(in);
//      System.out.println("Enter ULR:");
//      String baseURL = enterURL.nextLine();

        String baseURL = "https://www.yahoo.com/";
        HashSet<String> linkSetCatalog = new HashSet<>();

        try {
            Document doc = Jsoup.connect(baseURL).get();
            Elements links = doc.select("a[href]");

            for (Element link : links) {
                String linkHref = link.attr("abs:href");
                System.out.println("Link: " + linkHref);
                linkSetCatalog.add(Jsoup.connect(baseURL).get().html());
                System.out.println(linkSetCatalog.iterator().next());

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Not found");
        }
    }
}
