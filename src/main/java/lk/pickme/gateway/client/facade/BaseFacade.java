package lk.pickme.gateway.client.facade;

import lk.pickme.gateway.client.ex.GatewayClientException;
import lk.pickme.gateway.client.component.Error;
import lk.pickme.gateway.client.component.RequestHeader;
import lk.pickme.gateway.client.config.ClientConfig;
import lk.pickme.gateway.client.enums.ActionType;
import lk.pickme.gateway.client.root.GatewayRequest;
import lk.pickme.gateway.client.root.GatewayResponse;
import lk.pickme.gateway.client.utils.HmacUtils;
import lk.pickme.gateway.client.utils.JsonHelper;
import lk.pickme.gateway.client.utils.RestClient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.KeyManagementException;

import java.util.Date;

import org.apache.commons.codec.DecoderException;

/**
 *
 * @author Dilanka Gamage
 */

public class BaseFacade {

    final ClientConfig clientConfig;

    public BaseFacade(ClientConfig clientConfig) {
        this.clientConfig = clientConfig;
    }

    protected <T> T process(Object request, ActionType actionType, Class<T> responseClazz) 
            throws IOException, NoSuchAlgorithmException, InvalidKeyException, 
            KeyManagementException, DecoderException, GatewayClientException {
        String jsonRequest = buildRequest(request, actionType);
        RequestHeader header = buildHeader(jsonRequest);
        String jsonResponse = RestClient.sendRequest(clientConfig, jsonRequest, header);
        return buildResponse(jsonResponse, responseClazz);
    }

    protected RequestHeader buildHeader(String request) 
            throws DecoderException, NoSuchAlgorithmException,
            InvalidKeyException, UnsupportedEncodingException {
        RequestHeader header = new RequestHeader();
        header.setHMAC(HmacUtils.generateHmac(clientConfig.getHmacSecret(), request));
        header.setAUTH(clientConfig.getAuthToken());
        header.setCSRF(clientConfig.getCsrfToken());
        return header;
    }

    protected String buildRequest(Object requestData, ActionType actionType) {
        GatewayRequest gatewayRequest = new GatewayRequest();
        gatewayRequest.setActionType(actionType);
        gatewayRequest.setRequestDate(new Date());
        gatewayRequest.setValidateOnly(clientConfig.isValidateOnly());
        gatewayRequest.setRequestData(requestData);
        return JsonHelper.toJson(gatewayRequest);
    }

    protected <T> T buildResponse(String rawResponse, Class<T> clazz) throws GatewayClientException {
        GatewayResponse gatewayResponse = JsonHelper.fromJson(rawResponse, GatewayResponse.class);
        Error error = gatewayResponse.getError();
        if (error != null) {
            throw new GatewayClientException(error.getText(), error);
        }
        return gatewayResponse.getResponseData(clazz);
    }
}
