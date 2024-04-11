import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CadastroProdutoPage;

public class CadastroProdutoTest extends BaseTest {
    @Test
    public void validarCadastro() {
        CadastroProdutoPage page = new CadastroProdutoPage(getDriver());

        String resultadoFinal = page.informarName("Gertrudes")
                .informarLastName("da Silva")
                .informarLogin("gertrudesdasilva24@gmail.com")
                //.informarConfirmLogin("milenamakarkin@gmail.com")
                .informarPassword("Purple@2020")
                .selecionarDay("18")
                .selecionarMonth("nov")
                .selecionarYear("2002")
                .selecionarFemale()
                .clicarCadastrar()
                .buscarResultadoCadastro();
        try{
            getDriver().wait();
            Assert.assertTrue(resultadoFinal.contains("Precisamos de mais informações."));
        }
        catch (Exception e){
            System.out.println(e.toString());
        }


    }

}
