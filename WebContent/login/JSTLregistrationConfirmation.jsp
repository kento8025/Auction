<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!--新規登録確認-->

<html lang="ja">

<head>

<meta charset="UTF-8">
<link rel="stylesheet" href="../css/sinnki.css">
<link rel="stylesheet" href="../css/kakuninn.css">
<title></title>


</head>

<body>


	<!--ホームリンクタイトル画像-->

	<a href="../hoomPege"> <img src="../img/Title.png" alt="タイトル"
		width="200" height="80"></a>
	<br>


	<div id="box1">

		<form>



			<h2>お客様情報</h2>
			<br> 名前<br> ${requestScope.name} <br> <br> <br>
			生年月日<br> ${requestScope.year}年 ${requestScope.month}月
			${requestScope.day}日 <br> <br> 性別 <br>
			${requestScope.manOrWoman} <br> <br> メールアドレス <br>
			${requestScope.mail} <br> <br> <br>
			<h2>会員情報</h2>
			<br> ID <br> ${requestScope.id}<br> <br> password
			<br> ・・・・・・・・<br> <br> <br>


		</form>

	</div>

	<div id="button">

		<div id="newButton">

			<form action="../RegisTration" method="post">
				<div>
					<button class="btn-square-so-pop">新規登録</button>
				</div>
			</form>
		</div>

		<div id="editButton">

			<form action="../SignUp" method="post">
				<div>
					<button class="btn-square-so-opo">編集する</button>
				</div>
			</form>


		</div>

	</div>

</body>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.js">
</script>



</html>











