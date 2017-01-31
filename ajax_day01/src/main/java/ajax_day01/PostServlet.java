package ajax_day01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		//解决post协议编码问题
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		String name = req.getParameter("name");
		res.getWriter().println("Hello"+name);
	}
	

}
