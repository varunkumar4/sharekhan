public enum Websites {
    REDIFFBSEDAILYGAINERS("http://money.rediff.com/gainers/bse/daily/groupa"), REDIFFBSEDAILYLOSERS(
            "http://money.rediff.com/losers/bse/daily/groupa"), REDIFFNSEDAILYGAINERS(
            "http://money.rediff.com/gainers/nse/daily/nifty"), REDIFFNSEDAILYLOSERS(
            "http://money.rediff.com/losers/nse/daily"), NSESTOCKTIPZ(
            "http://www.tipz.in/nse/tips.aspx?s="), BSESTOCKTIPZ(
            "http://www.tipz.in/bse/tips.aspx?s=");

    private String url;

    Websites(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
