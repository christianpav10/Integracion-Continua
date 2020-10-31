package Christian.Andrade;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {
private Number number;

    @Test
    public void addNumbers(){
        this.number=new Number(1,2);
        assertEquals(3,this.number.addNumbers());
        
    }
}