package br.com.vendas.util;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.SessionFactory;

public class ConexaoFilterHibernate {
	private SessionFactory sf;
	
		
		public void destroy() {
		}
	
		
		public void doFilter(ServletRequest servletFilter, ServletResponse servletResponse,
				FilterChain chain) throws IOException, ServletException {
			
			try {
				this.sf.getCurrentSession().beginTransaction();
				chain.doFilter(servletFilter, servletResponse);
				this.sf.getCurrentSession().getTransaction().commit();
				this.sf.getCurrentSession().close();
			} catch (Throwable ex) {
				
				try {
					if(this.sf.getCurrentSession().getTransaction().isActive()){
						this.sf.getCurrentSession().getTransaction().rollback();
					}
				} catch (Throwable t) {
					t.printStackTrace();
				}
				
				throw new ServletException(ex.getMessage());
			}
		
		}
	
		public void init(FilterConfig conf) throws ServletException {
			this.sf = HibernateUtil.getSessionFactory();
		}
}

