package services;

import constants.Constants;
import models.BankBaseInfo;
import models.Entity;
import models.ProviderBankInfo;
import models.ProviderInfo;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;


@Stateless
@Local
public class ProviderBankInfoService {
    private List<Entity> entityList;
    private List<models.ProviderBankInfo> providerBankInfoList;
    private List<ProviderInfo> providerInfoList;
    private List<BankBaseInfo> bankBaseInfoList;


    @PostConstruct
    private void init() {
        entityList = new ArrayList<Entity>();
        providerBankInfoList = new ArrayList<models.ProviderBankInfo>();
        providerInfoList = new ArrayList<ProviderInfo>();
        bankBaseInfoList = new ArrayList<BankBaseInfo>();
        entityList.add(new Entity() {
            {
                setId(Constants.Number.ONE);
            }
        });
        entityList.add(new Entity() {
            {
                setId(Constants.Number.TWO);
            }
        });

        providerBankInfoList.add(new models.ProviderBankInfo() {
            {
                setAgentID(Constants.Number.ONE);
                setBankID(Constants.Number.TWENTY_SEVEN);
                setProviderID(Constants.Number.ONE);
            }
        });

        providerBankInfoList.add(new models.ProviderBankInfo() {
            {
                setAgentID(Constants.Number.TWO);
                setBankID(Constants.Number.TWENTY_EIGHT);
                setProviderID(Constants.Number.TWO);
            }
        });
        providerInfoList.add(new ProviderInfo() {
            {
                setProviderID(Constants.Number.ONE);
                setRecipientAccount(Constants.Info.RECIPIENT_ACCOUNT_VALUE_1);
                setINN(Constants.Info.INN_PROVIDER_INFO_VALUE_1);
                setKPP(Constants.Info.KPP_VALUE_1);

            }
        });

        providerInfoList.add(new ProviderInfo() {
            {
                setProviderID(Constants.Number.TWO);
                setRecipientAccount(Constants.Info.RECIPIENT_ACCOUNT_VALUE_2);
                setINN(Constants.Info.INN_PROVIDER_INFO_VALUE_2);
                setKPP(Constants.Info.KPP_VALUE_2);

            }
        });

        bankBaseInfoList.add(new BankBaseInfo() {
            {
                setBankId(Constants.Number.TWENTY_SEVEN);
                setName(Constants.Info.BANK_24 + Constants.Info.CLOSED_JOINT_STOCK_COMPANY);
                setCorespondentAccount(Constants.Info.CORESPONDENT_ACCOUNT_VALUE_1);
                setINN(Constants.Info.INN_BANK_BASE_INFO_VALUE_1);
                setBIK(Constants.Info.BIK_VALUE_1);
                setAddress(Constants.Info.ADDRESS_VALUE_1);
                setClosed(false);
            }
        });

        bankBaseInfoList.add(new BankBaseInfo() {
            {
                setBankId(Constants.Number.TWENTY_EIGHT);
                setName(Constants.Info.BANK_22 + Constants.Info.CLOSED_JOINT_STOCK_COMPANY);
                setCorespondentAccount(Constants.Info.CORESPONDENT_ACCOUNT_VALUE_2);
                setINN(Constants.Info.INN_BANK_BASE_INFO__VALUE_2);
                setBIK(Constants.Info.BIK_VALUE_2);
                setAddress(Constants.Info.ADDRESS_VALUE_2);
                setClosed(false);
            }
        });
    }


    public List<ProviderInfo> getProviderInfoListAll() {
        return providerInfoList;
    }

    public List<BankBaseInfo> getBankBaseInfoList() {
        return bankBaseInfoList;
    }

    public ProviderInfo findOperatorInfo(int agentId, int providerId) {
        for (models.ProviderBankInfo providerBankInfo : providerBankInfoList) {
            if (providerBankInfo.getAgentID() == agentId) {
                if (providerBankInfo.getProviderID() == providerId) {
                    for (ProviderInfo providerInfo : providerInfoList) {
                        if (providerInfo.getProviderID() == providerId) {
                            return providerInfo;
                        }
                    }
                }
            }
        }
        return null;
    }

    public BankBaseInfo findBankInfo(int agentId, int bankId) {
        for (ProviderBankInfo providerBankInfo : providerBankInfoList) {
            if (providerBankInfo.getAgentID() == agentId) {
                if (providerBankInfo.getBankID() == bankId) {
                    for (BankBaseInfo bankBaseInfo : bankBaseInfoList) {
                        if (bankBaseInfo.getBankId() == bankId) {
                            return bankBaseInfo;
                        }
                    }
                }
            }
        }
        return null;
    }
}