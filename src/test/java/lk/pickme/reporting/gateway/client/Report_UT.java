package lk.pickme.reporting.gateway.client;

import lk.pickme.gateway.client.GatewayClient;
import lk.pickme.gateway.client.report.request.DriverProfileReportRequest;
import lk.pickme.gateway.client.report.request.DriverTripSummaryReportRequest;
import lk.pickme.gateway.client.report.request.DriverTripTransactionReportRequest;
import lk.pickme.gateway.client.report.request.PeopleProfileReportRequest;
import lk.pickme.gateway.client.config.ClientConfig;
import lk.pickme.gateway.client.ex.GatewayClientException;

import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Dilanka Gamage
 */

public class Report_UT {

    private static final Logger LOG = LoggerFactory.getLogger(Report_UT.class);

    @Test
    public void test_driverProfile() {
        DriverProfileReportRequest reportRequest = new DriverProfileReportRequest();
        reportRequest.setDriverId(223L);
        reportRequest.setWithDriverTripSummary(true);
        reportRequest.setWithoutEmptyDriverTripSummary(true);
        GatewayClient client = new GatewayClient(buildConfig());
        try {
            client.report().driverProfile(reportRequest);
        } catch (GatewayClientException ex) {
            LOG.error("ERROR - " + ex.getMessage());
        }
    }

    @Test
    public void test_peopleProfile() {
        PeopleProfileReportRequest reportRequest = new PeopleProfileReportRequest();
        reportRequest.setPeopleId(223L);
        reportRequest.setWithDriverTripSummary(true);
        reportRequest.setWithoutEmptyDriverTripSummary(true);
        GatewayClient client = new GatewayClient(buildConfig());
        try {
            client.report().peopleProfile(reportRequest);
        } catch (GatewayClientException ex) {
            LOG.error("ERROR - " + ex.getMessage());
        }
    }

    @Test
    public void test_driverTripSummary() {
        DriverTripSummaryReportRequest reportRequest = new DriverTripSummaryReportRequest();
        reportRequest.setDriverId(223L);
        GatewayClient client = new GatewayClient(buildConfig());
        try {
            client.report().driverTripSummary(reportRequest);
        } catch (GatewayClientException ex) {
            LOG.error("ERROR - " + ex.getMessage());
        }
    }

    @Test
    public void test_driverTripTransaction() {
        DriverTripTransactionReportRequest reportRequest = new DriverTripTransactionReportRequest();
        reportRequest.setDriverId(223L);
        reportRequest.setWithDriverProfile(true);
        GatewayClient client = new GatewayClient(buildConfig());
        try {
            client.report().driverTripTransaction(reportRequest);
        } catch (GatewayClientException ex) {
            LOG.error("ERROR - " + ex.getMessage());
        }
    }

    private ClientConfig buildConfig() {
        ClientConfig config = new ClientConfig();
        config.setServiceEndpoint("http://146.148.110.253:8080/proxy/finance/reporting");
        config.setHmacSecret("keep-this-secret");
        return config;
    }

}
