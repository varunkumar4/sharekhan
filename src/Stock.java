import java.util.ArrayList;


public class Stock {

    String nseCode;
    String bseCode;
    String nseLabel;
    String bseLabel;
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    String prevCloseValue;
    String currentMarketPrice;
    String percentChange;
    public String getPercentChange() {
        return percentChange;
    }
    public void setPercentChange(String percentChange) {
        this.percentChange = percentChange;
    }
    public String getCurrentMarketPrice() {
        return currentMarketPrice;
    }
    public void setCurrentMarketPrice(String currentMarketPrice) {
        this.currentMarketPrice = currentMarketPrice;
    }
    public String getPrevCloseValue() {
        return prevCloseValue;
    }
    public void setPrevCloseValue(String prevCloseValue) {
        this.prevCloseValue = prevCloseValue;
    }
    String beta;
    String volume;
    String daysHigh;
    String daysLow;
    String yearHigh;
    String yearLow;
    ArrayList<String> Last5Bids;
    ArrayList<String> Last5Offers;
    String rediffURL;
    
    public String getRediffURL() {
        return rediffURL;
    }
    public void setRediffURL(String rediffURL) {
        this.rediffURL = rediffURL;
    }
    public String getNseCode() {
        return nseCode;
    }
    public void setNseCode(String nseCode) {
        this.nseCode = nseCode;
    }
    public String getBseCode() {
        return bseCode;
    }
    public void setBseCode(String bseCode) {
        this.bseCode = bseCode;
    }
    public String getNseLabel() {
        return nseLabel;
    }
    public void setNseLabel(String nseLabel) {
        this.nseLabel = nseLabel;
    }
    public String getBseLabel() {
        return bseLabel;
    }
    public void setBseLabel(String bseLabel) {
        this.bseLabel = bseLabel;
    }
    public String getBeta() {
        return beta;
    }
    public void setBeta(String beta) {
        this.beta = beta;
    }
    public String getVolume() {
        return volume;
    }
    public void setVolume(String volume) {
        this.volume = volume;
    }
    public String getDaysHigh() {
        return daysHigh;
    }
    public void setDaysHigh(String daysHigh) {
        this.daysHigh = daysHigh;
    }
    public String getDaysLow() {
        return daysLow;
    }
    public void setDaysLow(String daysLow) {
        this.daysLow = daysLow;
    }
    public String getYearHigh() {
        return yearHigh;
    }
    public void setYearHigh(String yearHigh) {
        this.yearHigh = yearHigh;
    }
    public String getYearLow() {
        return yearLow;
    }
    public void setYearLow(String yearLow) {
        this.yearLow = yearLow;
    }
    public ArrayList<String> getLast5Bids() {
        return Last5Bids;
    }
    public void setLast5Bids(ArrayList<String> last5Bids) {
        Last5Bids = last5Bids;
    }
    public ArrayList<String> getLast5Offers() {
        return Last5Offers;
    }
    public void setLast5Offers(ArrayList<String> last5Offers) {
        Last5Offers = last5Offers;
    }
    @Override
    public String toString() {
      return this.name+":"+this.currentMarketPrice+":"+this.percentChange+":"+this.rediffURL;
    }
}
