import junit.framework.TestCase;
import org.junit.Test;

public class CelularBuilderTest extends TestCase {
    @Test
    public void retornaCelular(){
        CelularBuilder celularBuilder = new CelularBuilder();
        Celular celular = celularBuilder
                .setMarca("Nokia")
                .setPreco(2000)
                .setCor("preto");

        assertNotNull(celular);
    }
}