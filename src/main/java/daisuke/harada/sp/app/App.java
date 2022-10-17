package daisuke.harada.sp.app;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        System.out.println( "Hello World!" );

//        WireMock wireMock1 = new WireMock("1st.remote.host", 8000);
//        WireMock wireMock2 = new WireMock("https", "2nd.remote.host", 8001);

        WireMockConfiguration wireMockConfiguration = wireMockConfig().port(8080);

        WireMockServer wireMockServer = new WireMockServer(wireMockConfiguration); //No-args constructor will start on port 8080, no HTTPS
        wireMockServer.start();

// Do some stuff

//

//        WireMock.configureFor(8080);
//        WireMock.reset();
//
//// Finish doing stuff
//
//        wireMockServer.stop();

    }
}
