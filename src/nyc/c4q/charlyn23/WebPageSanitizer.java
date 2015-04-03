package nyc.c4q.charlyn23;

/**
 * Created by charlynbuchanan on 4/1/15.
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.rmi.server.ExportException;
import java.util.Scanner;

public class WebPageSanitizer {
    public static String sanitizer(String html){
        URL site = HTTP.stringToURL(html);

        String siteString = HTTP.get(site);

        while (siteString.indexOf("<script") != -1){

            int starts = siteString.indexOf("<script");

            int ends = siteString.indexOf("</script>", starts) +8;

            String cleanScript = siteString.substring(starts, ends);

            siteString = siteString.replace(cleanScript, "");
        } return siteString;




    }


    public static void main (String [] args) {

        System.out.print(sanitizer("http://www.google.com"));
    }
//Write a class called WebPageSanitizer which implements a static method called String
// sanitize(String html) which removes all script tags and the information that they
// encapsulate and returns a sanitized version of the HTML string.
//    public static String sanitize(String html){
//
//
//    }
}
