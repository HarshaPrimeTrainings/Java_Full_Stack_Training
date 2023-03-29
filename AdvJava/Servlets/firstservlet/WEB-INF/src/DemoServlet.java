import javax.servlet.*;


public class DemoServlet implements Servlet{
	ServletConfig config;
	
	public void init(ServletConfig config){
		System.out.println("Init Method");
		this.config = config;
	}
	
	public void service(ServletRequest req, ServletResponse res){
		System.out.println("Service Method");
	}
	
	public ServletConfig getServletConfig(){
		System.out.println("ServletConfig Method");
		return config;
	}
	
	public String getServletInfo(){
		System.out.println("ServletInfo Method");
		return "Demo Servlet";
	}
	
	public void destroy(){
		System.out.println("Destroy Method");
	}
	
}