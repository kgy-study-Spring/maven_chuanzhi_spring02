package cn.itcast.g_pointcut;

/**
 * 目标对象
 * @author Jie.Yuan
 *
 */
public class UserDao implements IUserDao {

	@Override
	public void save() {
		System.out.println("-----核心业务：保存！！！------");		
	}

}
