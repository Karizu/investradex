package com.boarding_labs.investradex.util.entities;

public class LiquidModel {
    private Integer nr;
    private Integer x;
    private String act;
    private String sector;
    private String rate;
    private String code;
    private String candle;
    private String candlesDaily;
    private Double chg;
    private Double o;
    private Double h;
    private Double l;
    private String wmy;
    private String vToday;
    private Integer te;
    private Integer ty;
    private String win;
    private String fB;
    private String frg;
    private Integer bid;
    private String dcs;

    public LiquidModel(Integer nr, Integer x, String act, String sector, String rate, String code, String candle, String candlesDaily, Double chg, Double o, Double h, Double l, String wmy, String vToday, Integer te, Integer ty, String win, String fB, String frg, Integer bid, String dcs) {
        this.nr = nr;
        this.x = x;
        this.act = act;
        this.sector = sector;
        this.rate = rate;
        this.code = code;
        this.candle = candle;
        this.candlesDaily = candlesDaily;
        this.chg = chg;
        this.o = o;
        this.h = h;
        this.l = l;
        this.wmy = wmy;
        this.vToday = vToday;
        this.te = te;
        this.ty = ty;
        this.win = win;
        this.fB = fB;
        this.frg = frg;
        this.bid = bid;
        this.dcs = dcs;
    }


    public Integer getNr() {
        return nr;
    }

    public void setNr(Integer nr) {
        this.nr = nr;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCandle() {
        return candle;
    }

    public void setCandle(String candle) {
        this.candle = candle;
    }

    public String getCandlesDaily() {
        return candlesDaily;
    }

    public void setCandlesDaily(String candlesDaily) {
        this.candlesDaily = candlesDaily;
    }

    public Double getChg() {
        return chg;
    }

    public void setChg(Double chg) {
        this.chg = chg;
    }

    public Double getO() {
        return o;
    }

    public void setO(Double o) {
        this.o = o;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Double getL() {
        return l;
    }

    public void setL(Double l) {
        this.l = l;
    }

    public String getWmy() {
        return wmy;
    }

    public void setWmy(String wmy) {
        this.wmy = wmy;
    }

    public String getvToday() {
        return vToday;
    }

    public void setvToday(String vToday) {
        this.vToday = vToday;
    }

    public Integer getTe() {
        return te;
    }

    public void setTe(Integer te) {
        this.te = te;
    }

    public Integer getTy() {
        return ty;
    }

    public void setTy(Integer ty) {
        this.ty = ty;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public String getfB() {
        return fB;
    }

    public void setfB(String fB) {
        this.fB = fB;
    }

    public String getFrg() {
        return frg;
    }

    public void setFrg(String frg) {
        this.frg = frg;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getDcs() {
        return dcs;
    }

    public void setDcs(String dcs) {
        this.dcs = dcs;
    }
}
