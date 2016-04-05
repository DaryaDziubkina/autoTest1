package controller;

import junit.framework.TestCase;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

public class ProviderBankInfoControllerTest extends TestCase {

    @Test
    public void testGetProviderInfoList() throws Exception {
        Client client = ClientBuilder.newClient().register(ProviderBankInfoController.class);
        javax.ws.rs.core.Response response = client.target("http://localhost:8080/example1/api/agents/providerInfoList").request(MediaType.APPLICATION_JSON).get();
        assertEquals("сообщение", response.getStatus() == Status.OK.getStatusCode());
    }

    @Test
    public void testGetBankBaseInfoList() throws Exception {
        Client client = ClientBuilder.newClient().register(ProviderBankInfoController.class);
        javax.ws.rs.core.Response response = client.target("http://localhost:8080/example1/api/agents/bankBaseInfoList").request(MediaType.APPLICATION_JSON).get();
        assertEquals("сообщение", response.getStatus() == Status.OK.getStatusCode());
    }
}