import java.sql.*;
public class Gradation {
	static Connection con;
	static Statement sql;
	static ResultSet res;
	public Connection getConnection() {
		try {
			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
			con = DriverManager.getConnection(
					"jdbc:microsoft:sqlserver://localhost:1433;"
							+ "DatabaseName=db_jdbc", "sa", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		Gradation c = new Gradation();
		con = c.getConnection();
		try {
			sql = con.createStatement();
			res = sql.executeQuery("select * from tb_stu");
			while (res.next()) {
				String id = res.getString("id");
				String name = res.getString("name");
				String sex = res.getString("sex");
				String brithday = res.getString("brithday");
				System.out.print("编号：" + id);
				System.out.print(" 姓名" + name);
				System.out.print(" 性别:" + sex);
				System.out.println(" 生日：" + brithday);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
