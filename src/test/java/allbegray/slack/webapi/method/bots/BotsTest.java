package allbegray.slack.webapi.method.bots;

import allbegray.slack.SlackClientFactory;
import allbegray.slack.type.Bot;
import allbegray.slack.webapi.SlackWebApiClient;
import org.junit.Before;

/**
 * Created by allbegray on 2016-06-14.
 */
public class BotsTest {

    private String token = "your slack web api token";
    private SlackWebApiClient webApiClient;

    @Before
    public void setup() {
        webApiClient = SlackClientFactory.createWebApiClient(token);
    }

    //@Test
    public void infoTest() {
        Bot bot = webApiClient.getBotInfo("B1GGB3U5R");
        System.out.println(bot);
    }

}
