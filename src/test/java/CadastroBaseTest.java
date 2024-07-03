import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CadastroBaseFisica;

public class CadastroBaseTest extends BaseTest {
    @Test
    public void validarCadastro() {
        CadastroBaseTest page = new CadastroBaseTest(getDriver());

        String resultadoFinal = page.informarIdBase("01")
                .informarIdUsuario("333")
                .informarNomeBase("Armazém")
                .informarDataCadastro("23/05/2024")
                .informarResponsavelBase("Milena")
                .informarTelefoneBase("40028922")
                .informarCelularBase("707707070")
                .informarEmailBase("milenamakarkin@gmail.com")
                .selecionarSim()
                .clicarCadastro()
                //.buscarResultadoCadastro();
        try{
            getDriver().wait();
            Assert.assertTrue(resultadoFinal.contains("Base cadastrada com sucesso!"));
        }
        catch (Exception e){
            System.out.println(e.toString());
        }


    }

}
