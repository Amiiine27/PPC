import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class TestCoup {
    private Coup cis;
    private Coup pap;
    private Coup pie;

    // ce qui est dans le setUp est execute AVANT CHAQUE TEST
    @Before
    public void setUp() throws Exception {
        cis = new Coup("ciseaux");
        pap = new Coup("papier");
        pie = new Coup("pierre");
    }

    // tests de Coup
    // -------------------------------------------------------------
    @Test
    public void constructionCoupCorrecte() throws PasCoup {
        Coup c1 = new Coup("pierre");
        assertEquals(c1.getNom(), "pierre");
        Coup c2 = new Coup("papier");
        assertEquals(c2.getNom(), "papier");
        Coup c3 = new Coup("ciseaux");
        assertEquals(c3.getNom(), "ciseaux");
    }

    @Test(expected = PasCoup.class)
    public void constructionCoupInCorrecte() throws PasCoup {
        Coup c1 = new Coup("itititti");
    }

    @Test
    public void egalite() throws PasCoup {
        assertEquals(pie, (new Coup("pierre")));
        assertEquals(pap, (new Coup("papier")));
        assertEquals(cis, (new Coup("ciseaux")));
        assertFalse(pie.equals(pap));
        assertFalse(pie.equals(cis));

    }

}
