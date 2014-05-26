package javawebservicecaller;

import hellojava.*;
//import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Date;
import java.util.List;
import java.util.Calendar;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.*;
import java.net.MalformedURLException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;

import org.apache.axis.configuration.FileProvider;
import org.xml.sax.SAXException;

import java.rmi.RemoteException;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

public class JavaWebserviceCaller
{
	public JavaWebserviceCaller()
	{
		
	}
	
	public String invokeRemoteFuc() 
	{
		try
		{
			String url = "http://localhost/JavaCom/JavaCom.asmx";
			java.net.URL portAddress = new java.net.URL(url);
			JavaCom wsService = new JavaComLocator();
			JavaComSoap_PortType client = wsService.getJavaComSoap(portAddress);
			String str = "123";
			return client.sayHelloToJava("yaodi");
		    //return str;
			
		}
		catch(RemoteException ex)
		{
			
		}
		catch(MalformedURLException ex)
		{
			//ex.printStackTrace();
			//throw new DevTrackRepositoryConnectException(ex.getMessage(), ex);
		}
		catch(ServiceException ex)
		{
			//ex.printStackTrace();
			//throw new ServiceException(ex.getMessage(), ex);
		}
		finally{
			//soapServiceLock.unlock();
		}
		return null;
	}
	
	public String methoda() throws MyException
	{
		String aa = "";
		String abb = "";
		String acc  = "";
		
 		return "shenghai";
	}
	
	public String methodb()
	{
		try
		{
			return methoda();
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
			return "";
		}
	}
	//java.lang.String s = "http://localhost/JavaCom";
	//URL portAddress;

	public static void main(String[] args) 
	{ 
		
		JavaWebserviceCaller test = new JavaWebserviceCaller();
		//String result = test.invokeRemoteFuc();
		//System.out.println(result);
		System.out.println(test.methodb());

	} 
}




