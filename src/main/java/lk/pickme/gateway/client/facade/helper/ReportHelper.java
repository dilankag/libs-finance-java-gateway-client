package lk.pickme.gateway.client.facade.helper;

import lk.pickme.gateway.client.report.request.DriverTripSummaryReportRequest;
import lk.pickme.gateway.client.ex.GatewayDataFormatException;
import lk.pickme.gateway.client.ex.GatewayRequiredDataException;
import lk.pickme.gateway.client.validate.DriverTripSummaryReportValidator;
import lk.pickme.gateway.client.validate.IValidator;

/**
 *
 * @author Dilanka Gamage
 */

public class ReportHelper {

    private final IValidator driverTripSummaryValidator = new DriverTripSummaryReportValidator();

    public void validate(DriverTripSummaryReportRequest reportRequest) throws GatewayRequiredDataException, GatewayDataFormatException {
        driverTripSummaryValidator.validateRequiredFields(reportRequest);
        driverTripSummaryValidator.validateDataFormat(reportRequest);
    }

}
