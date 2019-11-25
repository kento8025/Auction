<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>

<!--新規登録確認-->

<html lang="ja">

<head>

<meta charset="UTF-8">
<link rel="stylesheet" href="../css/sinnki.css">
<link rel="stylesheet" href="../css/kakuninn.css">

<style>
h3 {
	color: red;
	margin: auto;
	padding: 50px;
	width: 25%;
}

#inputInformation {
	padding-top: 100px;
	margin: auto;
	width: 150px;
}

#button {
	margin: auto;
	width: 10%;
	height: 10px:
}

#newButton {width; 5%;height; 5
	px:
}

#editButton {width; 5%;height; 5
	px:
}

/*新規登録*/
.btn-square-so-pop {
	width: 80px;
	margin: 5px;
	position: relative;
	display: inline-block;
	padding: 0.25em 0.5em;
	text-decoration: none;
	text-align: center;
	color: #FFF;
	background: #fd9535; /*色*/
	border-radius: 4px; /*角の丸み*/
	box-shadow: inset 0 2px 0 rgba(255, 255, 255, 0.2), inset 0 -2px 0
		rgba(0, 0, 0, 0.05);
	font-weight: bold;
	border: solid 2px #d27d00; /*線色*/
}

.btn-square-so-pop:active {
	/*押したとき*/
	box-shadow: 0 0 2px rgba(0, 0, 0, 0.30);
}

#block1 {
	width: 40%;
	margin: auto;
}

/*出品する*/
.btn-square-so-pop {
	margin: auto;
	text-align: center;
	width: 80px;
	position: relative;
	display: inline-block;
	padding: 0.25em 0.5em;
	text-decoration: none;
	color: #FFF;
	background: #fd9535; /*色*/
	border-radius: 4px; /*角の丸み*/
	box-shadow: inset 0 2px 0 rgba(255, 255, 255, 0.2), inset 0 -2px 0
		rgba(0, 0, 0, 0.05);
	font-weight: bold;
	border: solid 2px #d27d00; /*線色*/
}

/*編集する*/
.btn-square-so-opo {
	margin: auto;
	text-align: center;
	width: 80px;
	position: relative;
	display: inline-block;
	padding: 0.25em 0.5em;
	text-decoration: none;
	color: #FFF;
	background: #2548e4; /*色*/
	border-radius: 4px; /*角の丸み*/
	box-shadow: inset 0 2px 0 rgba(255, 255, 255, 0.2), inset 0 -2px 0
		rgba(0, 0, 0, 0.05);
	font-weight: bold;
	border: solid 2px #2548e4; /*線色*/
}
</style>



<title></title>


</head>

<body>


	<!--ホームリンクタイトル画像-->

	<a href="../hoomPege"> <img src="../img/Title.png" alt="タイトル"
		width="200" height="80"></a>
	<br>


	<div id="inputInformation">

		<form action="../RegisTration" method="post">

			<h2>お客様情報</h2>
			<br> 名前<br> <input type="text" name="userName"
				value="${fn:escapeXml(user.userName)}" readonly> <br> <br>
			<br> 生年月日<br> <select id="year" name="year">
			<option value="${fn:escapeXml(user.year)}">${fn:escapeXml(user.year)}</option>
			</select>年
			<select id="month" name="month"><option
					value="${fn:escapeXml(user.month)}">${fn:escapeXml(user.month)}</option></select>月
			<select id="day" name="day"><option
					value="${fn:escapeXml(user.day)}">${fn:escapeXml(user.day)}</option></select>日


			<br> <br> 性別 <br> <input type="text" name="manOrWoman"
				value="${fn:escapeXml(user.manOrWoman)}" readonly> <br>
			<br> メールアドレス <br> <input type="text" name="mail"
				value="${fn:escapeXml(user.mail)}" readonly> <br> <br>
			<br>


			<h2>会員情報</h2>
			<br> ID <br> <input type="text" name="id"
				value="${fn:escapeXml(user.id)}" readonly> <br> <br>

			password <br> <input type="passWord" name="passWord"
				value="${fn:escapeXml(user.passWord)}"></input> <br> <br>
			<br>



				<div id="newButton">


					<button class="btn-square-so-pop">新規登録</button>

				</div>



		</form>

		<div id="editButton">

			<form action="../SignUp" method="post">
				<div>
					<button class="btn-square-so-opo">編集する</button>
				</div>
			</form>


		</div>


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











