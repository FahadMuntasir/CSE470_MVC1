/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Withdraw_Amount;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sheik
 */
public class Withdraw_AmountTest {
    
    public Withdraw_AmountTest() {
    }
    Withdraw_Amount w;
    @Before
    public void setUp() {
        w = new Withdraw_Amount("133");
    }
    @Test
    public void testWithraw() throws SQLException {
        assertEquals(9000,w.Withraw(1000, "Withdraw"));
    }
    
}
