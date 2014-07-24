import java.util.ArrayList;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTableBody;
import com.gargoylesoftware.htmlunit.html.HtmlTableCell;
import com.gargoylesoftware.htmlunit.html.HtmlTableRow;

public class WebsiteCrawler {
    final WebClient webClient = new WebClient();
    {
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(false);
    }

    public ArrayList<Stock> getListOfStocks() {
        ArrayList<Stock> listOfStocks = new ArrayList<Stock>();
        return listOfStocks;
    }

    private ArrayList<Stock> getRediffBSEGainers(int size) {        
        try {
            final HtmlPage page = webClient
                    .getPage(Websites.REDIFFBSEDAILYGAINERS.getUrl());
            return PageProcessor.rediffPageListProcessor(page,size);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }        
    }
    
    private ArrayList<Stock> getRediffBSELosers(int size) {        
        try {
            final HtmlPage page = webClient
                    .getPage(Websites.REDIFFBSEDAILYLOSERS.getUrl());
            return PageProcessor.rediffPageListProcessor(page,size);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }        
    }
    
    private ArrayList<Stock> getRediffNSEGainers(int size) {        
        try {
            final HtmlPage page = webClient
                    .getPage(Websites.REDIFFNSEDAILYGAINERS.getUrl());
            return PageProcessor.rediffPageListProcessor(page,size);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }        
    }
    
    private ArrayList<Stock> getRediffNSELosers(int size) {        
        try {
            final HtmlPage page = webClient
                    .getPage(Websites.REDIFFNSEDAILYLOSERS.getUrl());
            return PageProcessor.rediffPageListProcessor(page,size);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }        
    }
    
 
     ArrayList<Stock> getTipzLimits(ArrayList<Stock> stocksList){
        try {
            final HtmlPage page = webClient
                    .getPage(Websites.NSESTOCKTIPZ.getUrl()+"526881");
           System.out.println(page.asText());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
        return null;
    }
    
    public static void main(String[] args) {
        //new WebsiteCrawler().getRediffBSEGainers(5);
        //new WebsiteCrawler().getRediffBSELosers(5);
        new WebsiteCrawler().getTipzLimits(new ArrayList<Stock>());
    }

}
