package lk.pickme.gateway.client.root;

import lk.pickme.gateway.client.enums.ActionType;
import lk.pickme.gateway.client.enums.Version;
import lk.pickme.gateway.client.utils.JsonHelper;

import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonRawValue;

/**
 *
 * @author Dilanka Gamage
 */
public class GatewayRequest {

    private Version apiVersion = Version.v2_10_0;
    private String messageId = UUID.randomUUID().toString();
    private Date requestDate = new Date();
    private boolean validateOnly = false;
    private ActionType actionType;
    private Object requestData;

    public Version getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(Version apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public boolean isValidateOnly() {
        return validateOnly;
    }

    public void setValidateOnly(boolean validateOnly) {
        this.validateOnly = validateOnly;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    @JsonRawValue
    public String getRequestData() {
        return requestData == null ? null : requestData.toString();
    }

    public void setRequestData(Object requestData) {
        this.requestData = requestData;
    }

    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }

}
