import com.logger_library.managers.Log;
import com.logger_library.managers.LogManager;

public class TestClass {

	public static void main(String[] args) {
		Log log = LogManager.getLogger(TestClass.class);
		log.info("hi");

	}

}
