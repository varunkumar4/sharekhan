import java.util.ArrayList;

import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTableBody;
import com.gargoylesoftware.htmlunit.html.HtmlTableCell;
import com.gargoylesoftware.htmlunit.html.HtmlTableRow;


public class PageProcessor {

    public static ArrayList<Stock> rediffPageListProcessor(HtmlPage page, int size){
        ArrayList<Stock> stocksList = new ArrayList<Stock>();
        HtmlDivision leftContainer = (HtmlDivision) page
                .getElementById("leftcontainer");
        DomNodeList<DomNode> node = leftContainer.getChildNodes();

        DomNode domNode1 = node.get(6);
        DomNodeList<DomNode> tableDOM = domNode1.getChildNodes();

        HtmlTableBody tableBody = (HtmlTableBody) tableDOM.get(1);
        int rowNumber =0;
        for (final HtmlTableRow row : tableBody.getRows()) {
            // System.out.println("Found row"+row.asXml());
            Stock stock = new Stock();
            int i=0;
            rowNumber++;
            if(rowNumber>size && size != -1)
                break;
            for (final HtmlTableCell cell : row.getCells()) {
               
                if (i==0) {                        
                    String xmlString = cell.asXml();
                    int start = xmlString.indexOf("href=");
                    int end = xmlString.indexOf("\">");
                    stock.setRediffURL(xmlString.substring(start + 6, end));
                    stock.setName(cell.asText());
                }
                if(i == 2)
                    stock.setPrevCloseValue(cell.asText());
                if(i == 3)
                    stock.setCurrentMarketPrice(cell.asText());
                if(i==4)
                    stock.setPercentChange(cell.asText());
                i++;                        
            }
            stocksList.add(stock);
        }
        
        return getCodes(stocksList);
    }
   
    private static ArrayList<Stock> getCodes(ArrayList<Stock> stocksList){
        for(Stock stock : stocksList){
            System.out.println(stock.getRediffURL());
        }
        return null;
    }
    
    public static void tipzPageProcessor(){
        
    }
}
