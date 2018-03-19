import com.thoughtworks.bank.Account;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountTest {
  @Test

  public void getBalance() {
    Account pandey = new Account("pandey", 1234, 1000);
    assertThat(pandey.getBalance(),is(1000.0));
  }
}
