package networking;
 
import java.io.*;
 
 
import java.net.*;
import java.net.URL;

public class NetWorking{

    void openUrl() {
        try {

            URL url = new URL("https://www.example.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void httpUrlExample() {
        String urlString = "https://jsonplaceholder.typicode.com/posts/1";

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            
            System.out.println("Response Code: " + responseCode);
            System.out.println("Response Message: " + connection.getResponseMessage());
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            System.out.println("Response Content: ");
            System.out.println(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
public   void inetAddressExample() {
        try {
            
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host IP Address: " + localHost.getHostAddress());
            System.out.println("Local Host Name: " + localHost.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        NetWorking ur = new NetWorking();
        ur.inetAddressExample();
    }
}
