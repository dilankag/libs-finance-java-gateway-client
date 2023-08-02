package lk.pickme.gateway.client.facade;

import lk.pickme.gateway.client.facade.helper.ReportHelper;
import lk.pickme.gateway.client.report.request.DriverProfileReportRequest;
import lk.pickme.gateway.client.report.request.DriverTripSummaryReportRequest;
import lk.pickme.gateway.client.report.request.DriverTripTransactionReportRequest;
import lk.pickme.gateway.client.report.request.PeopleProfileReportRequest;

import lk.pickme.gateway.client.report.response.DriverProfileReportResponse;
import lk.pickme.gateway.client.report.response.DriverTripSummaryReportResponse;
import lk.pickme.gateway.client.report.response.DriverTripTransactionReportResponse;
import lk.pickme.gateway.client.report.response.PeopleProfileReportResponse;

import lk.pickme.gateway.client.config.ClientConfig;
import lk.pickme.gateway.client.enums.ActionType;
import lk.pickme.gateway.client.ex.GatewayClientException;

/**
 *
 * @author Dilanka Gamage
 */

public final class Report extends BaseFacade {

    private static final String FAILED_MESSAGE = "Failed to process report request. ";
    private static final ReportHelper REPORT_HELPER = new ReportHelper();

    public Report(ClientConfig clientConfig) {
        super(clientConfig);
    }

    public PeopleProfileReportResponse peopleProfile(PeopleProfileReportRequest reportRequest) throws GatewayClientException {
        try {
            return process(reportRequest, ActionType.PEOPLE_PROFILE, PeopleProfileReportResponse.class);
        } catch (GatewayClientException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new GatewayClientException(FAILED_MESSAGE + ex.getMessage(), ex);
        }
    }

    public DriverProfileReportResponse driverProfile(DriverProfileReportRequest reportRequest) throws GatewayClientException {
        try {
            return process(reportRequest, ActionType.DRIVER_PROFILE, DriverProfileReportResponse.class);
        } catch (GatewayClientException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new GatewayClientException(FAILED_MESSAGE + ex.getMessage(), ex);
        }
    }

    public DriverTripTransactionReportResponse driverTripTransaction(DriverTripTransactionReportRequest reportRequest) throws GatewayClientException {
        try {
            return process(reportRequest, ActionType.DRIVER_TRIP_TRANSACTION, DriverTripTransactionReportResponse.class);
        } catch (GatewayClientException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new GatewayClientException(FAILED_MESSAGE + ex.getMessage(), ex);
        }
    }

    public DriverTripSummaryReportResponse driverTripSummary(DriverTripSummaryReportRequest reportRequest) throws GatewayClientException {
        try {
            REPORT_HELPER.validate(reportRequest);
            return process(reportRequest, ActionType.DRIVER_TRIP_SUMMARY, DriverTripSummaryReportResponse.class);
        } catch (GatewayClientException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new GatewayClientException(FAILED_MESSAGE + ex.getMessage(), ex);
        }
    }
}
