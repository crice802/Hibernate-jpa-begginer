package com.test.project.HibernateJPABegginer;

import com.test.hib.controller.FindUser_Hql;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		FindUser_Hql u = new FindUser_Hql();
		u.findUser();
		u.findUserSelect();
		u.getRecordbyId();
		u.getmaxSalary();
		u.NamedQueryExample();
	}
}
