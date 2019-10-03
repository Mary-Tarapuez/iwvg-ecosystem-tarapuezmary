package practica;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
    private User user1;

    private User user2;

    @BeforeEach
    void before() {
        user1 = new User(3, "verdana", "Font family");
        user2= new User(123456789, "Maricela", "Tarapuez");
    }

    @Test
    public void testFullName() {
        String valor = user1.fullName();
        Assert.assertEquals("Verdana Font family", valor);
    }

    @Test
    public void testGetNumber() {
        int number = user1.getNumber();
        Assert.assertEquals(3, number);
    }

    @Test
    public void testGetName() {
        String name = user1.getName();
        Assert.assertEquals("Verdana", name);
    }

    @Test
    public void testGetFamilyName() {
        String familyName = user1.getFamilyName();
        Assert.assertEquals("Font family", familyName);
    }

    @Test
    public void testNameMayuscula() {
        String name = user1.nameMayuscula();
        Assert.assertEquals("VERDANA", name);
    }

    @Test
    public void testFullInfo(){
        String fullinfo = user2.fullInfo();
        Assert.assertEquals("MARICELA TARAPUEZ-123456789", fullinfo);

    }

}