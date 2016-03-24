package controller;

import constants.Constants;
import models.BankBaseInfo;
import models.ProviderInfo;
import services.ProviderBankInfoService;

import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;


@Path("/agents")
public class ProviderBankInfoController {

    @EJB
    private ProviderBankInfoService providerBankInfoService;

    private JsonArrayBuilder builder = Json.createArrayBuilder();

    @Path("/providerInfoList")
    @GET
    @Produces("application/json")
    public JsonArray getProviderInfoList() {
        try {
            List<ProviderInfo> providerInfoListAll = providerBankInfoService.getProviderInfoListAll();
            for (ProviderInfo providerInfo : providerInfoListAll) {
                builder.add(Json.createObjectBuilder().add(Constants.ProviderBankInfoFields.RECIPIENT_ACCOUNT,
                        providerInfo.getRecipientAccount()));
                builder.add(Json.createObjectBuilder().add(Constants.ProviderBankInfoFields.INN, providerInfo.getINN()));
                builder.add(Json.createObjectBuilder().add(Constants.ProviderBankInfoFields.KPP, providerInfo.getKPP()));
            }
        } catch (Exception e) {
            builder.add(Json.createObjectBuilder().add(Constants.Error.ERROR, Constants.Error.ERROR_VALUE));
        }
        return builder.build();
    }

    @Path("/bankBaseInfoList")
    @GET
    @Produces("application/json")
    public JsonArray getBankBaseInfoList() {
        try {
            List<BankBaseInfo> bankBaseInfoList = providerBankInfoService.getBankBaseInfoList();
            for (BankBaseInfo bankBaseInfo : bankBaseInfoList) {
                builder.add(Json.createObjectBuilder().add(Constants.BankBaseInfoFields.BANK_ID,
                        bankBaseInfo.getBankId()));
                builder.add(Json.createObjectBuilder().add(Constants.BankBaseInfoFields.NAME, bankBaseInfo.getName()));
                builder.add(Json.createObjectBuilder().add(Constants.BankBaseInfoFields.CORESPONDENT_ACCOUNT,
                        bankBaseInfo.getCorespondentAccount()));
                builder.add(Json.createObjectBuilder().add(Constants.BankBaseInfoFields.ADDRESS, bankBaseInfo.getAddress()));
                builder.add(Json.createObjectBuilder().add(Constants.BankBaseInfoFields.IS_CLOSED, bankBaseInfo.isClosed()));
                builder.add(Json.createObjectBuilder().add(Constants.BankBaseInfoFields.INN, bankBaseInfo.getINN()));
                builder.add(Json.createObjectBuilder().add(Constants.BankBaseInfoFields.BIK, bankBaseInfo.getBIK()));
            }
        } catch (Exception e) {
            builder.add(Json.createObjectBuilder().add(Constants.Error.ERROR, Constants.Error.ERROR_VALUE));
        }
        return builder.build();
    }

    @Path("/{agentId}/providerInfo/providers/{providerId}")
    @GET
    @Produces("application/json")
    public JsonArray getProviderBankInfo(@PathParam("agentId") int agentId, @PathParam("providerId") int providerId) {
        try {
            ProviderInfo providerInfo = providerBankInfoService.findOperatorInfo(agentId, providerId);
            builder.add(Json.createObjectBuilder().add(Constants.ProviderBankInfoFields.RECIPIENT_ACCOUNT,
                    providerInfo.getRecipientAccount()));
            builder.add(Json.createObjectBuilder().add(Constants.ProviderBankInfoFields.INN, providerInfo.getINN()));
            builder.add(Json.createObjectBuilder().add(Constants.ProviderBankInfoFields.KPP, providerInfo.getKPP()));
        } catch (Exception e) {
            builder.add(Json.createObjectBuilder().add(Constants.Error.ERROR, Constants.Error.ERROR_VALUE));
        }
        return builder.build();
    }

    @Path("/{agentId}/bankBaseInfo/banks/{bankId}")
    @GET
    @Produces("application/json")
    public JsonArray getBankBaseInfo(@PathParam("agentId") int agentId, @PathParam("bankId") int bankId) {
        try {
            BankBaseInfo bankBaseInfo = providerBankInfoService.findBankInfo(agentId, bankId);
            builder.add(Json.createObjectBuilder().add(Constants.BankBaseInfoFields.BANK_ID, bankBaseInfo.getBankId()));
            builder.add(Json.createObjectBuilder().add(Constants.BankBaseInfoFields.NAME, bankBaseInfo.getName()));
            builder.add(Json.createObjectBuilder().add(Constants.BankBaseInfoFields.CORESPONDENT_ACCOUNT,
                    bankBaseInfo.getCorespondentAccount()));
            builder.add(Json.createObjectBuilder().add(Constants.BankBaseInfoFields.ADDRESS, bankBaseInfo.getAddress()));
            builder.add(Json.createObjectBuilder().add(Constants.BankBaseInfoFields.IS_CLOSED, bankBaseInfo.isClosed()));
            builder.add(Json.createObjectBuilder().add(Constants.BankBaseInfoFields.INN, bankBaseInfo.getINN()));
            builder.add(Json.createObjectBuilder().add(Constants.BankBaseInfoFields.BIK, bankBaseInfo.getBIK()));
        } catch (Exception e) {
            builder.add(Json.createObjectBuilder().add(Constants.Error.ERROR, Constants.Error.ERROR_VALUE));
        }
        return builder.build();
    }
}


