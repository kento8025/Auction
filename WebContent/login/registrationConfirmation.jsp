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

<style>
h3 {
	color: red;
	margin: auto;
	padding: 50px;
	width: 25%;
}

#box1 {
	padding-top: 100px;
	margin: auto;
	width: 150px;
}

#button {
	margin: auto;
	width: 10%;
	height: 10px:
}

/
s
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

#img {

}

#text {

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




</head>

<body>


	<!--ホームリンクタイトル画像-->

	<a href="../hoomPege"> <img src="../img/Title.png" alt="タイトル"
		width="200" height="80"></a>
	<br>


	<div id="box1">

		<form>



			<h2>お客様情報</h2>
			<br> 名前<br> 〇〇 ✖✖ <br> <br> <br> 生年月日<br>
			1999年 1月 １日 <br> <br> 性別 <br> 男 <br> <br>

			メールアドレス <br> sample＠address <br> <br> <br>
			<h2>会員情報</h2>
			<br> ID <br> 123654789<br> <br> password <br>
			123456897<br> <br> <br>


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











