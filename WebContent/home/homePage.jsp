<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="ja">

<head>

<meta charset="UTF-8">
<!-- <link rel="stylesheet" type="text/css" href="../css/hoom.css"> -->

<style>

/*タイトル*/
#tltie {
	color: red; /*文字色指定*/
	text-align: center; /*真ん中にレイアウト指定*/
}

/*フォーム全体*/
#searchForm {
	position: relative; /*フォームの相対位置*/
	max-width: 270px; /*フォームのサイズ*/
	margin-bottom: 15px; /*フォームの下に余白*/
}
/*検索ボックス*/
#sbox {
	position: absolute; /*フォームの絶対位置*/
	left: 50px;
	top: 0;
	outline: 0; /*クリック時の青い枠線消す*/
	height: 50px; /*検索ボックスの高さ*/
	width: 620px;
	padding: 0 10px; /*テキスト位置調整*/
	border-radius: 2px 0 0 2px; /*検索ボックスの角を丸める*/
	background: #eee; /*検索ボックスの背景カラー*/
}
/*検索ボタン*/
#sbtn {
	width: 70px; /*検索ボタンの横幅*/
	height: 50px; /*検索ボタンの縦幅*/
	position: absolute; /*検索ボタンの絶対位置*/
	left: 680px; /*検索ボタンの位置調整*/
	top: 0;
	border-radius: 0 2px 2px 0; /*検索ボタンの角を丸める*/
	background: #7fbfff; /*検索ボタンの背景カラー*/
	border: none; /*検索ボタンの枠線を消す*/
	color: #fff; /*検索ボタンのテキストカラー*/
	font-weight: bold; /*検索ボタンのテキスト太字*/
	font-size: 16px; /*検索ボタンのフォントサイズ*/
}

/*検索ボタンマウスオーバー時*/
#sbtn:hover {
	color: #666; /*検索ボタンマウスオーバー時のフォントカラー*/
}

/*ログイン画面*/
#login {
	float: left;
	clear: none;
	padding-left: 1200px;
	width: 300px;
}

#login form {
	text-align: right;
}

/*ログインのボタン*/
.btn-square {
	width: 100px;
	margin: 5px;
	display: inline-block;
	padding: 0.5em 1em;
	text-decoration: none;
	background: #668ad8; /*ボタン色*/
	color: #FFF;
	border-bottom: solid 4px #627295;
	border-radius: 3px;
}

.btn-square:active {
	/*ボタンを押したとき*/
	-webkit-transform: translateY(4px);
	transform: translateY(4px); /*下に動く*/
	border-bottom: none; /*線を消す*/
}

/*新規登録*/
.btn-square-so-pop {
	width: 100px;
	margin: 5px;
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

.btn-square-so-pop:active {
	/*押したとき*/
	box-shadow: 0 0 2px rgba(0, 0, 0, 0.30);
}

/*メニュー画面*/
#menu {
	padding-top: 100px;
	list-style: none;
	width: 200px;
	float: left;
}

nav li {
	list-style: none; /*リストの・消去*/
}

a {
	text-decoration: none; /*リストの下線消去*/
}

/*メニュー装飾*/
#menu ul {
	padding: 0;
	position: relative;
}

#menu ul li {
	line-height: 1.5;
	padding: 0.5em 0.5em 0.5em 1.7em;
	list-style-type: none !important;
	background: -webkit-linear-gradient(top, 0%, whitesmoke 100%);
	/*グラデーション*/
	background: linear-gradient(to bottom, whitesmoke 0%, #dadada 100%);
	/*グラデーション*/
	text-shadow: 1px 1px 1px whitesmoke; /*文字を立体的に*/
	color: black;
}

#menu ul li:before {
	font-family: "Font Awesome 5 Free";
	content: "\f138";
	position: absolute;
	left: 0.5em; /*左端からのアイコンまでの距離*/
	color: orange; /*アイコン色*/
}

/*お気に入りのタグ表示*/
#tagu {
	width: 850px;
	padding-top: 100px;
	padding-left: 100px;
	display: inline-block;
	position: relative
}

.btn-circle-flat {
	display: inline-block; /*要素が横並びになる*/
	text-decoration: none; /*リストの下線消去*/
	background: #87befd; /*背景賞指定*/
	color: #FFF; /*文字色指定*/
	width: 140px;
	height: 140px; /*縦幅*/
	line-height: 140px; /*行の高さ指定*/
	margin: 20px;
	border-radius: 50%; /*円の丸み*/
	text-align: center; /*テキスト真ん中にレイアウト*/
	overflow: hidden; /*要素の収まり、はみ出したら非表示*/
	transition: 1000ms linear;
}

.btn-circle-flat:hover {
	background: #668ad8; /*マウス操作時の色指定*/
}

/*お知らせ*/
#news {
	margin-top: 100px;
	padding-right: 60px;
	float: right;
	clear: none;
	width: 250px;
	height: 350px;
	text-align: center;
	background-color: #999999;
	border-radius: 10px;
}

/*カテゴリ*/
#category {
	float: left;
	width: 200px;
}

#category ul {
	padding: 0;
	position: relative;
}

#category ul li {
	color: black;
	border-left: solid 8px orange; /*左側の線*/
	background: whitesmoke; /*背景色*/
	margin-bottom: 5px; /*下のバーとの余白*/
	line-height: 1.5;
	border-radius: 0 15px 15px 0; /*右側の角だけ丸く*/
	padding: 0.5em;
	list-style-type: none !important;
}

/*目玉商品*/

/*画像全体をブロック*/
#box1 {
	display: inline-block;
	padding-left: 200px;
	width: 800px;
	height: 350px;
}

#medama {
	text-align: center;
}

.new {
	float: left;
	margin: 5px;
	clear: none;
}

#textFeaturedProducts {
	display: inline-block;
	padding-left: 200px;
	width: 800px;
	height: 350px
}

.text {
	float: left;
	margin: 5px;
	width: 250px;
	height: 100px;
	clear: none;
	text-align: center;
}
</style>



<title>オークション</title>


</head>

<body>


	<!--タイトル-->

	<img src="img/Title.png" alt="タイトル" width="1500" height="150">

	<!--検索欄-->


	<form id="searchForm" action="SearchResults">
		<input id="sbox" id="s" name="search" type="text"
			placeholder="キーワードを入力" /> <input id="sbtn" type="submit" value="検索" />
	</form>


	<!--ログイン画面-->


	<c:choose>

		<c:when test="${sessionScope.user.userRank eq '1'}">

		<div id="login">

				<h2>管理者${sessionScope.user.userName}さん</h2>
			<br>

			<form action="LoginCheck" method="post">

				ID<input type="text" name="id" value='${sessionScope.user.id}'><br>
				password<input type="passWord" name="passWord"

					value='${sessionScope.user.passWord}'><br>
				<button class="btn-square">ログイン</button>
				<br>
				<button class="btn-square" name = "logout" value= "out">ログアウト</button>

			</form>

		</div>


		</c:when>
		<c:when test="${sessionScope.user.userRank eq '2'}">


			<div id="login">

				<h2>ようこそ！${sessionScope.user.userName}さん</h2>

				<br>

			<form action="LoginCheck" method="post">

				ID<input type="text" name="id" value='${sessionScope.user.id}'><br>
				password<input type="passWord" name="passWord"

					value='${sessionScope.user.passWord}'><br>
				<button class="btn-square">ログイン</button>
				<br>
				<button class="btn-square" name = "logout" value= "out">ログアウト</button>


				<br>
			</form>

			</div>
		</c:when>
		<c:otherwise>

			<div id="login">

				<form action="LoginCheck" method="post">

					ID<input type="text" name="id" value='${sessionScope.user.id}'><br>
					password<input type="passWord" name="passWord"

						value='${sessionScope.user.passWord}'><br>
					<button class="btn-square">ログイン</button>

					<br>
				</form>

				<form action="SignUp" method="post">
					<div>
						<button class="btn-square-so-pop">新規登録</button>
					</div>
				</form>

			</div>

		</c:otherwise>
	</c:choose>



	<%-- <div id="login">

		<form action="LoginCheck" method="post">
			ID<input type="text" name="id" value='${sessionScope.user.id}'><br>
			password<input type="passWord" name="passWord"
				value='${sessionScope.user.passWord}'><br>
			<button class="btn-square">ログイン</button>
			<br>
		</form>

		<form action="SignUp" method="post">
			<div>
				<button class="btn-square-so-pop">新規登録</button>
			</div>
		</form>

	</div> --%>

	<!--メニュー表-->

	<div id="menu">

		メニュー表
		<nav>
			<ul>
				<li><a href="ProductInput">出品する</a></li>
				<li><a href="#">気になる</a></li>
				<li><a href="Menu">落札中</a></li>
				<li><a href="#">落札履歴</a></li>
				<li><a href="#">出品中</a></li>
				<li><a href="#">出品履歴</a></li>
			</ul>
		</nav>

	</div>

	<!--お気に入りのタグを表示-->

	<div id="tagu">

		<nav>
			<a href="SearchResults" class="btn-circle-flat">パソコン</a> <a href="#"
				class="btn-circle-flat">BUTTON</a> <a href="#"
				class="btn-circle-flat">BUTTON</a> <a href="#"
				class="btn-circle-flat">BUTTON</a> <a href="#"
				class="btn-circle-flat">BUTTON</a> <a href="#"
				class="btn-circle-flat">BUTTON</a> <a href="#"
				class="btn-circle-flat">BUTTON</a> <a href="#"
				class="btn-circle-flat">BUTTON</a>
		</nav>

	</div>

	<!--お知らせ-->

	<div id="news">

		お知らせ
		<nav>
			<ul>
				<li><a href="#">メンテナンスのお知らせ</a></li>
				<li><a href="#">通信障害</a></li>
				<li><a href="#">サイトの利用規約変更</a></li>
				<li><a href="#">サンプル</a></li>
				<li><a href="#">サンプル</a></li>
				<li><a href="#">サンプル</a></li>
				<li><a href="#">サンプル</a></li>
				<li><a href="#">サンプル</a></li>
				<li><a href="#">サンプル</a></li>
			</ul>
		</nav>

	</div>


	<!--カテゴリ一覧-->

	<div id="category">

		カテゴリ
		<nav>
			<ul>
				<li><a href="#">本</a></li>
				<li><a href="#">パソコン</a></li>
				<li><a href="#">スポーツ</a></li>
				<li><a href="#">サンプル</a></li>
				<li><a href="#">サンプル</a></li>
				<li><a href="#">サンプル</a></li>
				<li><a href="#">サンプル</a></li>
				<li><a href="#">サンプル</a></li>
				<li><a href="#">サンプル</a></li>
				<li><a href="#">サンプル</a></li>
				<li><a href="#">サンプル</a></li>
				<li><a href="#">サンプル</a></li>

			</ul>
		</nav>

	</div>

	<!--目玉商品-->

	<div id="box1">


		<div id="featuredProducts">
			<h1>目玉商品</h1>

			<span class="new"><img src="img/kinn.jpg" alt="金塊" width="250"
				height="250"></span> <span class="new"><img
				src="img/main01.jpg" alt="ソファー" width="250" height="250"></span> <span
				class="new"><img src="img/hamu.jpg" alt="ハムスター" width="250"
				height="250"></span>

		</div>

	</div>



	<div id="textFeaturedProducts">

		<span class="text">金塊<br> 残り時間 ○○ 現在５０万
		</span> <span class="text">ソファー<br> 残り時間 ☓☓ ３万
		</span> <span class="text">目玉焼き<br> 残り時間 △△ １０円
		</span>

	</div>

</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.js">

</script>

<script>
	$(function() {
		$('.btn-circle-flat').css({
			'transition' : '2s',
			'transform' : 'rotate(360deg)'
		});
		$('.btn-circle-flat').animate({
			'margin-Left' : '35px'
		});
	});
</script>


</html>