package org.openhab.binding.russound.rnet.internal;

public class RNetSystemConfig {

    private String connectionString;
    private int retryPolling;

    private int numControllers;
    private int zonesPer;

    public int getNumControllers() {
        return numControllers;
    }

    public void setNumControllers(int numControllers) {
        this.numControllers = numControllers;
    }

    public int getZonesPer() {
        return zonesPer;
    }

    public void setZonesPer(int zonesPer) {
        this.zonesPer = zonesPer;
    }

    public int getRetryPolling() {
        return retryPolling;
    }

    public void setRetryPolling(int retryPolling) {
        this.retryPolling = retryPolling;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String ipAddress) {
        this.connectionString = ipAddress;
    }

}