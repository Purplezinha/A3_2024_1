package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class CadastroBaseFisica extends BasePage {
    @FindBy(id = "idBase")
    private WebElement txIdBase;
    @FindBy(id = "idUsuario")
    private WebElement txIdUsuario;
    @FindBy(id = "nomeBase")
    private WebElement txNomeBase;
    @FindBy(id = "dataCadastro")
    private WebElement txDataCadastro;
    @FindBy(id = "resposavelBase")
    private WebElement txResposBase;
    @FindBy(id = "telefoneBase")
    private WebElement txTelefoneBase;
    @FindBy(id = "celularBase")
    private WebElement txCelularBase;
    @FindBy(id = "emailBase")
    private WebElement txEmailBase;
    @FindBy(id = "sim")
    private WebElement rdSim;
    @FindBy(id = "nao")
    private WebElement rdNao;
    @FindBy(id = "cadastro")
    private WebElement btnCadastro;

    public CadastroBaseFisica informarIdBase (String idBase){
        txIdBase.sendKeys(idBase);
        return this;
    }
    public CadastroBaseFisica informarIdUsuario (String idUsuario){
        txIdUsuario.sendKeys(idUsuario);
        return this;
    }
    
    public CadastroBaseFisica informarNomeBase (String nomeBase){
        txNomeBase.sendKeys(nomeBase);
        return this;
    }
    public CadastroBaseFisica informarDataCadastro (String dataCadastro) {
        txDataCadastro.sendKeys(dataCadastro);
        return this;
    }
    public CadastroBaseFisica informarResponsavelBase (String resposanvelBase){
        txResposBase.sendKeys(responsavelBase);
        return this;
    }
    public CadastroBaseFisica informarTelefoneBase (String telefoneBase) {
        txTelefoneBase.sendKeys(telefoneBase);
        return this;
    }
    public CadastroBaseFisica informarCelularBase (String celularBase) {
        txCelularBase.sendKeys(celularBase);
        return this;
    }
    public CadastroBaseFisica informarEmailBase (String emailBase) {
        txEmailBase.sendKeys(emailBase);
        return this;
    }
    public CadastroBaseFisica selecionarSim() {
        rdSim.click();
        return this;
    }

    public CadastroBaseFisica clicarCadastro() {
        btnCadastro.click();
        return this;
    }


public CadastroBaseFisica(WebDriver driver){
        super(driver);
    }
}
