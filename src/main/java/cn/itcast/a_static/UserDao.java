package cn.itcast.a_static;

/**
 * 目标对象
 * @author Administrator
 *
 */
public class UserDao implements IUserDao {

	@Override
	public void save() {
		//System.out.println("开始事务");
		System.out.println("------已经保存数据！！！------");
		//System.out.println("提交事务");
	}

}
