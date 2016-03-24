package constants;


public class Constants {

    public static class Number{
        public static final int ONE = 1;
        public static final int TWO = 2;
        public static final int TWENTY_SEVEN = 27;
        public static final int TWENTY_EIGHT = 28;
    }

    public static class Info{
        public static final String RECIPIENT_ACCOUNT_VALUE_1 = "40702810200000078965";
        public static final String RECIPIENT_ACCOUNT_VALUE_2 = "40402810200000038969";
        public static final String INN_PROVIDER_INFO_VALUE_1 = "132654978";
        public static final String INN_PROVIDER_INFO_VALUE_2 = "132654976";
        public static final String KPP_VALUE_1 = "97854612";
        public static final String KPP_VALUE_2 = "97654614";
        public static final String BANK_24 = "VTB 24";
        public static final String BANK_22 = "VTB 22";
        public static final String CLOSED_JOINT_STOCK_COMPANY = "Closed Joint-Stock Company";
        public static final String CORESPONDENT_ACCOUNT_VALUE_1 = "301018100000000716";
        public static final String CORESPONDENT_ACCOUNT_VALUE_2 = "301018100000006516";
        public static final String INN_BANK_BASE_INFO_VALUE_1 = "1234567890";
        public static final String INN_BANK_BASE_INFO__VALUE_2 = "1234561890";
        public static final String BIK_VALUE_1 = "1234567890";
        public static final String BIK_VALUE_2 = "1234567866";
        public static final String ADDRESS_VALUE_1 = "St. Petrburg";
        public static final String ADDRESS_VALUE_2 = "Moscow";
    }

    public static class ProviderBankInfoFields {
        public static final String RECIPIENT_ACCOUNT = "providerInfo:operatorInfo:recipientAccount";
        public static final String INN = "INN";
        public static final String KPP = "KPP";
    }

    public static class BankBaseInfoFields {
        public static final String BANK_ID = "bankId";
        public static final String NAME = "name";
        public static final String CORESPONDENT_ACCOUNT = "correspondentAccount";
        public static final String ADDRESS = "address";
        public static final String IS_CLOSED = "isClosed";
        public static final String INN = "INN";
        public static final String BIK = "BIK";

    }

    public static class Error{
        public static final String ERROR = "Error";
        public static final String ERROR_VALUE = "not found";
    }
}
