package app.coe.com.myapplication.model;

public class Res {


    /**
     * returnCode : 0000
     * returnMessage : Success.
     * info : {"paymentUrl":{"web":"https://sandbox-web-pay.line.me/web/payment/wait?transactionReserveId=aW9KN3ZGQVUzT093TU9WWklDK3l1UlM2dHVaZklxaW94ZXFMRlcyK01jQk1wRzNxOEY0LzFxTVFLWmdYSkF6dA&locale=th_LP","app":"line://pay/payment/aW9KN3ZGQVUzT093TU9WWklDK3l1UlM2dHVaZklxaW94ZXFMRlcyK01jQk1wRzNxOEY0LzFxTVFLWmdYSkF6dA"},"transactionId":2019020600044691700,"paymentAccessToken":"819637660039"}
     */

    private String returnCode;
    private String returnMessage;
    private InfoBean info;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public static class InfoBean {
        /**
         * paymentUrl : {"web":"https://sandbox-web-pay.line.me/web/payment/wait?transactionReserveId=aW9KN3ZGQVUzT093TU9WWklDK3l1UlM2dHVaZklxaW94ZXFMRlcyK01jQk1wRzNxOEY0LzFxTVFLWmdYSkF6dA&locale=th_LP","app":"line://pay/payment/aW9KN3ZGQVUzT093TU9WWklDK3l1UlM2dHVaZklxaW94ZXFMRlcyK01jQk1wRzNxOEY0LzFxTVFLWmdYSkF6dA"}
         * transactionId : 2019020600044691700
         * paymentAccessToken : 819637660039
         */

        private PaymentUrlBean paymentUrl;
        private long transactionId;
        private String paymentAccessToken;

        public PaymentUrlBean getPaymentUrl() {
            return paymentUrl;
        }

        public void setPaymentUrl(PaymentUrlBean paymentUrl) {
            this.paymentUrl = paymentUrl;
        }

        public long getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(long transactionId) {
            this.transactionId = transactionId;
        }

        public String getPaymentAccessToken() {
            return paymentAccessToken;
        }

        public void setPaymentAccessToken(String paymentAccessToken) {
            this.paymentAccessToken = paymentAccessToken;
        }

        public static class PaymentUrlBean {
            /**
             * web : https://sandbox-web-pay.line.me/web/payment/wait?transactionReserveId=aW9KN3ZGQVUzT093TU9WWklDK3l1UlM2dHVaZklxaW94ZXFMRlcyK01jQk1wRzNxOEY0LzFxTVFLWmdYSkF6dA&locale=th_LP
             * app : line://pay/payment/aW9KN3ZGQVUzT093TU9WWklDK3l1UlM2dHVaZklxaW94ZXFMRlcyK01jQk1wRzNxOEY0LzFxTVFLWmdYSkF6dA
             */

            private String web;
            private String app;

            public String getWeb() {
                return web;
            }

            public void setWeb(String web) {
                this.web = web;
            }

            public String getApp() {
                return app;
            }

            public void setApp(String app) {
                this.app = app;
            }
        }
    }
}
