/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package revature;

import org.junit.Assert;
import org.junit.Test;

import revature.Models.Reimbursement;
import revature.dao.reimDaoImpl;



import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AppTest {
    @Test
    public void riembersmentTester() {
        try {
            reimDaoImpl reimD = new reimDaoImpl();
            List<Reimbursement> reimbursements = reimD.getAllReim();
            Date date = new Date(2022, 2, 3);
            Date date2 = null;
            Reimbursement reimbursement = new Reimbursement(2, 99.99D, date, (Date)date2, "Testing Daos", 1, 0, 1, 1);
            List<Reimbursement> reimbursements2 = new ArrayList();
            reimbursements2.add(reimbursement);
            Assert.assertEquals((long)reimbursements2.size(), (long)reimbursements.size());
        } catch (SQLException var7) {
            var7.printStackTrace();
        }
    }
    @Test
    public void riembersmentTester2() {
        try {
            reimDaoImpl reimD = new reimDaoImpl();
            Reimbursement reimbursement = reimD.getReimById(2);
            Date date = new Date(1643889600000L);
            Date date2 = null;
            Reimbursement reimbursement2 = new Reimbursement(2, 99.99D, date, (Date)date2, "Testing Daos", 1, 0, 1, 1);
            System.out.println(reimbursement2.getSubmitted());
            Assert.assertEquals(reimbursement2.getAmount(), reimbursement.getAmount(), 2.0D);
            Assert.assertEquals((long)reimbursement2.getAuthor(), (long)reimbursement.getAuthor());
            Assert.assertEquals((long)reimbursement2.getreimid(), (long)reimbursement.getreimid());
            Assert.assertEquals(reimbursement2.getDescription(), reimbursement.getDescription());
            Assert.assertEquals(reimbursement2.getResolved(), reimbursement.getResolved());
            Assert.assertEquals((long)reimbursement2.getResolver(), (long)reimbursement.getResolver());
            Assert.assertEquals((long)reimbursement2.getStatus_ID(), (long)reimbursement.getStatus_ID());
            Assert.assertEquals((long)reimbursement2.getType_ID(), (long)reimbursement.getType_ID());
        } catch (SQLException var6) {
            var6.printStackTrace();
        }
    }
}
