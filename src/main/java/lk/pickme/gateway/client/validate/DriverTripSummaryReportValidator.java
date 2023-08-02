package lk.pickme.gateway.client.validate;

import lk.pickme.gateway.client.report.request.DriverTripSummaryReportRequest;
import lk.pickme.gateway.client.component.Error;
import lk.pickme.gateway.client.ex.GatewayDataFormatException;
import lk.pickme.gateway.client.ex.GatewayRequiredDataException;

/**
 *
 * @author Dilanka Gamage
 */

public class DriverTripSummaryReportValidator implements IValidator<DriverTripSummaryReportRequest> {

    /**
     * The following are the required fields for Payment-init call; processAt
     */
    @Override
    public void validateRequiredFields(DriverTripSummaryReportRequest reportRequest) throws GatewayRequiredDataException {
        if (reportRequest == null) {
            throw new GatewayRequiredDataException(new Error(null, "Report request should not be null."));
        } else if (reportRequest.getDriverId() == null) {
            throw new GatewayRequiredDataException(new Error(null, "Driver id should not be null."));
        }
    }

    @Override
    public void validateDataFormat(DriverTripSummaryReportRequest reportRequest) throws GatewayDataFormatException {
    }
}
