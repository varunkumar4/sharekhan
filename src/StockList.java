
public enum StockList {
    UNITECH("507878","UNITECH");
    StockList(String bseCode,String nseCode){
        this.bseCode = bseCode;
        this.nseCode = nseCode;
    }
    private String bseCode;
    private String nseCode;
    public String getBseCode() {
        return bseCode;
    }
    public void setBseCode(String bseCode) {
        this.bseCode = bseCode;
    }
    public String getNseCode() {
        return nseCode;
    }
    public void setNseCode(String nseCode) {
        this.nseCode = nseCode;
    }
    
}
