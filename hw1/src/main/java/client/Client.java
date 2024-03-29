package client;

import java.util.ArrayList;
import java.util.List;


public class Client {

    public static List<List<String>> rows  = new ArrayList<>();
    private static Integer MAXTHS = 256;
    private static Integer MAXSKI = 50000;
    private static Integer MAXLIFT = 60;
    private static Integer MINLIFT = 5;
    private static Integer DEFLIFT = 40;
    private static Integer MAXRUN = 20;
    private static Integer DEFRUN = 10;
    private static Double div = 0.1;
    private static Double div8 = 0.8;



    private Integer numThreads;
    private Integer numSkiers;
    private Integer numLifts = DEFLIFT;
    private Integer numRuns = DEFRUN;
    private String httpAdd;
    private Integer successReq;

    public Client(Integer numThreads, Integer numSkiers, Integer numLifts,
                  Integer numRuns, String addr) throws Exception {
        if (!valid(numThreads, numSkiers, numLifts, numRuns)) {
            throw new Exception("Invalid Input For Client.Client");
        }
        this.numThreads = numThreads;
        this.numSkiers = numSkiers;
        this.numLifts = numLifts;
        this.numRuns = numRuns;
        this.httpAdd = addr;
    }

    public Client(Integer numThreads, Integer numSkiers, String addr) throws Exception {
        this(numThreads, numSkiers, DEFLIFT, DEFRUN, addr);
    }


    public String getHttpAdd() {
        return httpAdd;
    }

    private boolean valid(Integer numThreads, Integer numSkiers, Integer numLifts,
                          Integer numRuns) {
        return true;
                //numThreads <= MAXTHS && numSkiers <= MAXSKI && MINLIFT <= numLifts && numLifts<= MAXLIFT && numRuns < MAXRUN;
    }

    public Integer getNumThreads() {
        return numThreads;
    }

    public Integer getNumSkiers() {
        return numSkiers;
    }

    public void setNumSkiers(Integer numSkiers) {
        this.numSkiers = numSkiers;
    }

    public Integer getNumRuns() {
        return numRuns;
    }

    public Integer getNumLifts() {
        return numLifts;
    }

    public Integer getSuccessReq() {
        return successReq;
    }

    public void addSuccessReq() {
        successReq++;
    }
}
