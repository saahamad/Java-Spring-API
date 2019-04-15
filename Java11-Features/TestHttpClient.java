
import java.net.*;
import java.net.http.*;
import java.io.*;

class TestHttpClient{

public static void main(String args[])throws Exception{

	HttpClient client = HttpClient.newHttpClient();
	HttpRequest request = HttpRequest.newBuilder()
	.uri(URI.create("https://access.redhat.com"))
	.GET()
	.header("User-Agent", "Java 11")
	.header("content-type", "application/text")
	.build();

	try {
		HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
		if (response.statusCode() == 200) {
		new FileWriter("/home/saahamad/Desktop/redhatdata.html").write(response.body());
		System.out.println("Data written to the file");
		} else {
		System.out.println("In try ...Something wrong there!");
		}
	} catch (IOException e) {
		System.out.println("In catch ... Something wrong here!"+e);
	}
   }
}
