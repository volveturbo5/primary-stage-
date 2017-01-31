package ajax_day01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckNameServlet extends HttpServlet {
	//存储已经注册的用户名
	HashSet<String> names;
	
	public void init() throws ServletException{
		names = new HashSet<String>();
		names.add("Tom");
		names.add("Jerry");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//获取用户提交的参数
		String name = req.getParameter("name");
		PrintWriter out = res.getWriter();
		if(name==null){
			out.println(true);//检查失败
			return ;
		}
		boolean found = names.contains(name);
		out.println(!found);
	}
	
	

}
