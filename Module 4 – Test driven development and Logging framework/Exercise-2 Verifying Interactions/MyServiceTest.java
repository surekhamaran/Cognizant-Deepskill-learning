import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Inject mock into service and call the method
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 3: Verify that getData() was called on the mock
        verify(mockApi).getData();
    }
}
