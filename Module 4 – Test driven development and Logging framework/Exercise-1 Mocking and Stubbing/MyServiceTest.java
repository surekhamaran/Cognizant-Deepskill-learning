import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create mock for ExternalApi
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub method to return mock data
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject mock into service and test
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Assertion
        assertEquals("Mock Data", result);
    }
}
