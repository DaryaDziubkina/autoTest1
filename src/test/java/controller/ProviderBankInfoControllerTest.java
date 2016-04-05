package controller;

import junit.framework.TestCase;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

public class ProviderBankInfoControllerTest extends TestCase {

    public void testGetProviderInfoList() throws Exception {
        Client client = ClientBuilder.newClient().register(ProviderBankInfoController.class);
        javax.ws.rs.core.Response response = client.target("localhost:8080/api/agents/providerInfoList").request(MediaType.APPLICATION_JSON).get();
        assertEquals("сообщение", response.getStatus() == Status.OK.getStatusCode());
    }

    public void testGetBankBaseInfoList() throws Exception {
        Client client = ClientBuilder.newClient().register(ProviderBankInfoController.class);
        javax.ws.rs.core.Response response = client.target("localhost:8080/api/agents/bankBaseInfoList").request(MediaType.APPLICATION_JSON).get();
        assertEquals("сообщение", response.getStatus() == Status.OK.getStatusCode());
    }
}