import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MontadoraTest {

    @Test
    public void retornaNomeMontadora(){
        Montadora.getInstance() .setNomeMontadora("Fiat");
        assertEquals("Fiat", Montadora.getInstance().getNomeMontadora());
    }

    @Test
    public void retornaNomeFranquia(){
        Montadora.getInstance() .setNomeFranquia("Delta");
        assertEquals("Delta", Montadora.getInstance().getNomeFranquia());
    }

    @Test
    public void retornaEndereco(){
        Montadora.getInstance() .setEndereco("juiz de fora, Av. Brasil 123");
        assertEquals("juiz de fora, Av. Brasil 123", Montadora.getInstance().getEndereco());
    }
}