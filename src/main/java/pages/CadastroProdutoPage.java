package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class CadastroProdutoPage extends BasePage {
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input")
    private WebElement txName;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")
    private WebElement txLastName;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")
    private WebElement txLogin;
    //@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[3]/div/div/div[1]/input")
    //private WebElement txConfirmLogin;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input")
    private WebElement txPassword;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]")
    private WebElement selDay;
    @FindBy(id = "month")
    private WebElement selMonth;
    @FindBy(id = "year")
    private WebElement selYear;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input")
    private WebElement rdFemale;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")
    private WebElement btnCadastrar;

    public CadastroProdutoPage informarName (String name){
        txName.sendKeys(name);
        return this;
    }
    public CadastroProdutoPage informarLastName(String lastName) {
        txLastName.sendKeys(lastName);
        return this;
    }
    public CadastroProdutoPage informarLogin (String login){
        txLogin.sendKeys(login);
        return this;
    }
    //public CadastroProdutoPage informarConfirmLogin (String ConfirmLogin){
       // txLogin.sendKeys(ConfirmLogin);
        //return this;}
    public CadastroProdutoPage informarPassword(String password) {
        txPassword.sendKeys(password);
        return this;
    }
    public CadastroProdutoPage selecionarDay(String day) {
        Select dropdown = new Select(selDay);
        dropdown.selectByVisibleText(day);
        return this;
    }
    public CadastroProdutoPage selecionarMonth (String month){
        Select dropdown = new Select(selMonth);
        dropdown.selectByVisibleText(month);
        return this;
    }
    public CadastroProdutoPage selecionarYear (String year){
        Select dropdown = new Select(selYear);
        dropdown.selectByVisibleText(year);
        return this;
    }
    public CadastroProdutoPage selecionarFemale() {
        rdFemale.click();
        return this;
    }

    public CadastroProdutoPage clicarCadastrar() {
        btnCadastrar.click();
        return this;
    }

    public String buscarResultadoCadastro(){
        return driver.getPageSource();
    }



public CadastroProdutoPage(WebDriver driver){
        super(driver);
    }
}
