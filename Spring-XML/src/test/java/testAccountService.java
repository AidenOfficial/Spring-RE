import com.aiden.pojo.Account;
import com.aiden.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@SuppressWarnings("NewClassNamingConvention")
public class testAccountService {
    @Test
    public void testAddAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
        AccountService service = context.getBean(AccountService.class);

        Account account = new Account(1, "Aiden", 1000);
        service.addAccount(account);
        System.out.println("Added account: " + account);
    }

    @Test
    public void testUpdateAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
        AccountService service = context.getBean(AccountService.class);

        Account accountToUpdate = new Account(1, "Aiden", 2000);
        service.updateAccount(accountToUpdate);
        System.out.println("Updated account: " + accountToUpdate);
    }

    @Test
    public void testDeleteAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
        AccountService service = context.getBean(AccountService.class);

        service.deleteAccount(1);
        System.out.println("Deleted account with ID: 1");
    }

    @Test
    public void testFindByName() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
        AccountService service = context.getBean(AccountService.class);

        Account foundAccount = service.findByName("Aiden");
        System.out.println("Found account: " + foundAccount);
    }

    @Test
    public void testGetAll() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");
        AccountService service = context.getBean(AccountService.class);

        List<Account> accounts = service.getAll();
        System.out.println("All accounts:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
