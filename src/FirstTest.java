import com.gargoylesoftware.htmlunit.CookieManager;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;


public class FirstTest {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        homePage();
      //  tipzPage();
    }
    
    public static void tipzPage() throws Exception{
        final WebClient webClient = new WebClient();
        CookieManager cookieMan = new CookieManager();
        cookieMan = webClient.getCookieManager();
        cookieMan.setCookiesEnabled(true);
        webClient.getOptions().setUseInsecureSSL(true);
        final HtmlPage page = webClient.getPage("http://www.tipz.in/nse/tips.aspx?s=DLF");
        System.out.println(page.asText());
    }
        
    public static void homePage() throws Exception{
        final WebClient webClient = new WebClient();
   //     WebClient webClient = new WebClient();
        CookieManager cookieMan = new CookieManager();
        cookieMan = webClient.getCookieManager();
        cookieMan.setCookiesEnabled(true);
        webClient.getOptions().setUseInsecureSSL(true);
        final HtmlPage page = webClient.getPage("https://newtrade.sharekhan.com/rmmweb/lbw/login/login.jsp");
        //System.out.println(page.getAttributes().getNamedItem("leftContainer"));
        //System.out.println(page.getWebResponse());
        
        final HtmlForm form = (HtmlForm) page.getFormByName("f1");

        final HtmlTextInput loginId = form.getInputByName("login_id");
        loginId.setValueAttribute("allamvarun");
        

        final HtmlPasswordInput membershippwd = form.getInputByName("br_pwd");
        membershippwd.setValueAttribute("Kumar$00");
        

        final HtmlPasswordInput transactionpwd = form.getInputByName("tr_pwd");
        transactionpwd.setValueAttribute("Varun$00");
        
     //   HtmlButton button = form.getButtonByName("LOGIN");
    //    System.out.println(form.getAcceptAttribute());
        System.out.println(form.getActionAttribute());
        final HtmlSubmitInput button = form.getInputByValue("LOGIN");
  //      System.out.println(form.getWebRequest(new SubmittableElement));
       // System.out.println(form.getOnSubmitAttribute());
       // System.out.println(form.getOnClickAttribute());
        //page.
       HtmlPage loggedinpage = button.click();
        System.out.println(loggedinpage.asXml());
      //   Assert.assertEquals("HtmlUnit - Welcome to HtmlUnit", page.getTitleText());
    //
    //        final String pageAsXml = page.asXml();
    //        //System.out.println(pageAsXml);
    //        //Assert.assertTrue(pageAsXml.contains("<body class=\"composite\">"));
    //
    //        final String pageAsText = page.asText();
        //Assert.assertTrue(pageAsText.contains("Support for the HTTP and HTTPS protocols"));

        webClient.closeAllWindows();
    }

}
