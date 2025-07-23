package _04_testng;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class P164_CustomListener3 implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		// When <suite> tag starts
		System.out.println("onStart: before suite starts");
	}

	@Override
	public void onFinish(ISuite suite) {
		// When <suite> tag completes
		System.out.println("onFinish: after suite completes");
	}
}