package lk.pickme.gateway.client.report.response;

import lk.pickme.gateway.client.component.DriverTripTransaction;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Dilanka Gamage
 */

public class DriverTripTransactionReportResponse extends BaseReportResponse {

    private final List<DriverTripTransaction> transactions = new ArrayList<DriverTripTransaction>();

    public List<DriverTripTransaction> getTransactions() {
        return transactions;
    }

}
