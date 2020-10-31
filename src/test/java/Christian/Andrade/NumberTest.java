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
    @Test
    public void substractNumbers(){
        this.number=new Number(4,2);
        assertEquals(2,this.number.substractNumbers());

    }
    @Test
    public void multiplyNumbers(){
        this.number=new Number(1,1);
        assertEquals(1,this.number.multiplyNumbers());

    }
}