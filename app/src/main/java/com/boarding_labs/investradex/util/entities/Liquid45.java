
package com.boarding_labs.investradex.util.entities;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Liquid45 implements Serializable
{

    @SerializedName("Nr")
    @Expose
    private Integer nr;
    @SerializedName("X")
    @Expose
    private Integer x;
    @SerializedName("Act")
    @Expose
    private String act;
    @SerializedName("Sector")
    @Expose
    private String sector;
    @SerializedName("Rate")
    @Expose
    private String rate;
    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("Candle")
    @Expose
    private String candle;
    @SerializedName("CandlesDaily")
    @Expose
    private String candlesDaily;
    @SerializedName("Chg_")
    @Expose
    private Double chg;
    @SerializedName("O_")
    @Expose
    private Double o;
    @SerializedName("H_")
    @Expose
    private Double h;
    @SerializedName("L_")
    @Expose
    private Double l;
    @SerializedName("Wmy_")
    @Expose
    private String wmy;
    @SerializedName("VToday")
    @Expose
    private String vToday;
    @SerializedName("Te_")
    @Expose
    private Integer te;
    @SerializedName("Ty_")
    @Expose
    private Integer ty;
    @SerializedName("Win_")
    @Expose
    private String win;
    @SerializedName("FB")
    @Expose
    private String fB;
    @SerializedName("Frg")
    @Expose
    private String frg;
    @SerializedName("Bid_")
    @Expose
    private Integer bid;
    @SerializedName("Dcs")
    @Expose
    private String dcs;
    private final static long serialVersionUID = -6222914726417547912L;

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

    public String getVToday() {
        return vToday;
    }

    public void setVToday(String vToday) {
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

    public String getFB() {
        return fB;
    }

    public void setFB(String fB) {
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
