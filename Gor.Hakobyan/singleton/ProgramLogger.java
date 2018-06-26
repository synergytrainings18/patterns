package singleton;

/**
 * @author by Gor.Hakobyan on 26-Jun-18.
 */
public final class ProgramLogger {
	private static ProgramLogger programLogger;
	private static String logFile = "This is log file. \n\n";

	public static synchronized ProgramLogger getProgramLogger() {
		if (programLogger == null) {
			programLogger = new ProgramLogger();
		}
		return programLogger;
	}

	private ProgramLogger() {

	}

	public void addLogInfo(String logInfo) {
		logFile += logInfo + "\n";
	}

	public void showLog() {
		System.out.println(logFile);
	}

	public static void main(String[] args) {
		//hashcode is equals
		System.out.println(ProgramLogger.getProgramLogger().toString());
		System.out.println(ProgramLogger.getProgramLogger().toString());
		System.out.println(ProgramLogger.getProgramLogger().toString());
		System.out.println(ProgramLogger.getProgramLogger().toString());

		System.out.println("\n------------------------------------------------\n");

		ProgramLogger.getProgramLogger().addLogInfo("First log");
		ProgramLogger.getProgramLogger().addLogInfo("Second log");
		ProgramLogger.getProgramLogger().addLogInfo("Third log");
		ProgramLogger.getProgramLogger().showLog();
	}
}
