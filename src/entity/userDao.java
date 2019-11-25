package entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.User;
import util.Util;
/*
	INSERT INTO users (user_id,password,user_name,birthday,man_or_woman,mail,registration_date) VALUES ('tanaka000','test0000','田中','1998-07-05','男','mail@gmail',now());
 * */

public class userDao {

	private Connection con;

	final String INSERT_INTO_USERS = "INSERT INTO users (user_id,password,user_name,birthday,man_or_woman,mail,registration_date) VALUES (?,?,?,?,?,?,now())";
	final String SELECT_USER = "SELECT * FROM users WHERE user_id = ? AND password = ?";

	private void Setup() {

		System.out.println("接続開始");

		con = Util.getConnection();
		try {
			con.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("トランザクションエラー");
		}
	}

	public void tearDown() {
		try {
			con.rollback();
			System.out.println("開始前にロールバックします");
			System.out.println("接続終了");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void register(User user) {

		Setup();

		System.out.println("register メソッド");

		try (PreparedStatement stmt = con.prepareStatement(INSERT_INTO_USERS)) {

			stmt.setString(1, user.getId());
			stmt.setString(2, user.getPassWord());
			stmt.setString(3, user.getUserName());
			stmt.setDate(4, user.getBirthday());
			stmt.setString(5, user.getManOrWoman());
			stmt.setString(6, user.getMail());

			stmt.executeUpdate();

			System.out.println("INSERTに成功しました");
			System.out.println("接続終了");

			con.commit();

		} catch (Exception e) {
			System.out.println("INSERT失敗");
			e.printStackTrace();
			tearDown();
		}
	}

	public boolean loginCheck(String userId, String password) {

		Setup();

		try (PreparedStatement stmt = con.prepareStatement(SELECT_USER)) {

			stmt.setString(1, userId);
			stmt.setString(2, password);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			tearDown();
		}

		return false;

	}

}
