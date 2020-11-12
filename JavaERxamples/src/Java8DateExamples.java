import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.TimeZone;

public class Java8DateExamples {
	static Instant in = Instant.now();

	public static void main(String[] args) {
		System.out.println(in);
		LocalDate date = LocalDate.now();
		Clock c = Clock.system(ZoneId.systemDefault());
		TimeZone.getDefault();
		System.out.println("Date: " + date);
		System.out.println("Clock: " + c);
	}

}
