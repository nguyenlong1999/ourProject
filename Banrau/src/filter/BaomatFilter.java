package filter;
//kiểm tra các yêu cầu trc khi cho phép truy cập vào các page
import java.io.IOException;
import java.util.List;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.taikhoan;
import request.Vaitronguoidungyeucau;
import utils.AppUtils;
import utils.Baomat;

public class BaomatFilter {

}
