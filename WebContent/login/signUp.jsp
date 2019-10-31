<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!--新規登録-->

<html lang="ja">

<head>

<meta charset="UTF-8">
<link rel="stylesheet" href="../css/sinnki.css">
<title>新規登録</title>


</head>


<body>

	<!--ホームリンクタイトル画像-->

	<a href="../hoomPege"> <img src="../img/Title.png" alt="タイトル"
		width="200" height="80"></a>
	<br>

	<div id="box1">

		<form action="RegistrationConfirmation" method="post">


			<h2>お客様情報</h2>
			<br> 名前 <br> <input type="text" name="name"> <br>
			<br> 生年月日<br>

			 <select id="year"  name="year"><option value="0">----</option></select>年
			<select id="month" name="month"><option value="0">--</option></select>月
			<select id="day" name="day"><option value="0">--</option></select>日​ <br> <br>
			<font color="red">${requestScope.birthdayError}</font><br><br>

			性別 <br> <input type="radio" name="manOrWoman" value="男">男
			<input type="radio" name="manOrWoman" value="女">女 <br> <br>

			メールアドレス <br> <input type="text" name="mail"><br>
			<font color="red">${requestScope.mailError}</font><br> <br> <br>

			<h2>会員情報</h2>

			<br> ID <br> <input type="text" name="id"><br>

			<br> password <br>パスワードは半角英小文字と数字を組み合わせた8文字以上<br>
			<input type="passWord" name="passWord"><br>
				<font color="red">${requestScope.passWordError}</font><br>
			<br> <br>

			<button class="btn-square-so-pop">新規登録</button>

		</form>

	</div>



</body>


<script>
	var time = new Date();
	var year = time.getFullYear();
	for (var i = year; i >= 1900; i--) {
		createOptionElements(i, 'year');
	}
	for (var i = 1; i <= 12; i++) {
		createOptionElements(i, 'month');
	}
	for (var i = 1; i <= 31; i++) {
		createOptionElements(i, 'day');
	}

	function createOptionElements(num, parentId) {
		var doc = document.createElement('option');
		doc.value = doc.innerHTML = num;
		document.getElementById(parentId).appendChild(doc);
	}
</script>



</html>











