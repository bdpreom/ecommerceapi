package com.foreni.ecommerce.dto.checkout;

public class StripeResponse {
    //@author : shadman sakib khan

    private String sessionId;

    public StripeResponse(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
