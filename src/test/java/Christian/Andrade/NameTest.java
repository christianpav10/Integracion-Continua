package Christian.Andrade;

import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {
private Name name;
@Test
    public void numberOfCharacter(){
    this.name=new Name("Pajaro");
    assertEquals(6,this.name.numberOfCharacter());

    }
    @Test
    public void changeWord(){
    this.name=new Name("GUITARRA");
    assertEquals("ARRATIUG",this.name.changeWord());

    }
}