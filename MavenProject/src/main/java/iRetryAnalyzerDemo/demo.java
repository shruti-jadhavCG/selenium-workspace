package iRetryAnalyzerDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class demo implements IRetryAnalyzer{

	int initCount = 0;
	int retryCoun =3;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		
//		for (int i=0; i<=retryCoun; i++)
//		{
//			return true;
//		}
		if(initCount<retryCoun)
		{
			initCount++ ;
			return true;
		}
		return false;
	}


}
