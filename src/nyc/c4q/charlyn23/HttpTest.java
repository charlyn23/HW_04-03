package nyc.c4q.charlyn23;

/**
 * Created by charlynbuchanan on 4/1/15.
 */
import java.net.URL;
import java.util.Scanner;

/**
 * Created by samuel on 2015-03-22.
 */
public class HttpTest {

    public static final String
            URL = "http://en.wikipedia.org/wiki/Web_scraping";

    public static void main(String[] args) {
       URL url = HTTP.stringToURL("http://en.wikipedia.org/wiki/Web_scraping");
        System.out.println(HTTP.get(url));
        String webText = HTTP.get(url);


        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //URL url = HTTP.stringToURL(input);

        //System.out.println(document);
    }
//    public static String substring(String webText, String start, String end) {
//
//        String ">" = start;
//        String "<" =  end;
//        String result = "";
//
//        for (int i = 0; i < webText.length(); i++) {
//            webText.startsWith("<");
//        }
//        return result;
//    }

}
