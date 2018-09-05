package addressBookTest;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import addressBook.Address; 
public class AddressBookAppTest {

	Object[] expectedAdds = new Object[3];
    
    @Before
    public void initInputs(){
    	expectedAdds[0] = new Address("Nats", "15000");
    	expectedAdds[1] = new Address("Kalid", "25000");
    	expectedAdds[2] = new Address("Krish", "5000");
    } 
	 @Test  
	    public void testFindMax(){  
	        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
	        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
	    }  

}


 
