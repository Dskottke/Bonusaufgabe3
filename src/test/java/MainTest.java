import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

   @Test
    public void checksumof12is3(){
       //given
       int value = 12;
       //when
       int actual = Main.getChecksum(12);
       //then
       assertEquals(3,actual);



    }

}