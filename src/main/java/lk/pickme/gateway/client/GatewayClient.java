package lk.pickme.gateway.client;

import lk.pickme.gateway.client.config.ClientConfig;
import lk.pickme.gateway.client.facade.Report;
import lk.pickme.gateway.client.utils.JacksonJsonHelper;
import lk.pickme.gateway.client.utils.JsonHelper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class GatewayClient {

    private static Logger LOG = LoggerFactory.getLogger(GatewayClient.class);

    private final Report report;

    public GatewayClient(ClientConfig config) {
        this.report = new Report(config);
        LOG.debug("Json lib using: " + (config.isUseJackson() ? "JACKSON" : "GSON"));
        if (config.isUseJackson()) {
            JsonHelper.setJsonHelper(new JacksonJsonHelper());
        }
    }

    public Report report() {
        return report;
    }
}
