package su.arth.Services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by salimhanov on 11.02.2015.
 */
public class Connection {

    public static void connection(){
        try {
            URL url = new URL("http://arth1.su/status");
            URLConnection urlConnection = url.openConnection();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
