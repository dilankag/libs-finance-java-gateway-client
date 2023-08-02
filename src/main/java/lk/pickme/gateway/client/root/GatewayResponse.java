package lk.pickme.gateway.client.root;

import lk.pickme.gateway.client.enums.ActionType;
import lk.pickme.gateway.client.enums.Version;
import lk.pickme.gateway.client.component.Error;
import lk.pickme.gateway.client.utils.JsonHelper;

import java.util.Date;

/**
 *
 * @author Dilanka Gamage
 */

public class GatewayResponse {

    private Version apiVersion;
    private String messageId;
    private Date responseDate = new Date();
    private Long timeElapsed;
    private Error error;
    private ActionType actionType;
    private Object responseData;

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

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public Long getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(Long timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public <T> T getResponseData(Class<T> clazz) {
        return JsonHelper.fromJson(JsonHelper.toJson(responseData), clazz);
    }

    public Object getResponseData() {
        return responseData;
    }

    public void setResponseData(Object responseData) {
        this.responseData = responseData;
    }

    @Override
    public String toString() {
        return JsonHelper.toJson(this);
    }

}
