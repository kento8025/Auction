<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">

<head>

<%-- ${pageContext.request.contextPath}
 --%>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/hoom.css">
<title>オークション</title>
<!--追加-->
<!--追加-->


</head>

<body>


	<!--タイトル-->

	<img src="../img/Title.png" alt="タイトル" width="1500" height="150">

	<!--検索欄-->


	<div id="kennsaku">
		<form id="form1" action="">
			<input id="sbox" id="s" name="s" type="text" placeholder="キーワードを入力" />
			<input id="sbtn" type="submit" value="検索" />
		</form>
	</div>

	<!--ログイン画面-->

	<div id="login">

		<form action="../LoginCheck" method="post">
			ID<input type="text" name="id"><br> password<input
				type="passWord" name="passWord"><br>
			<button class="btn-square">ログイン</button>
			<br>
		</form>

		<form action="../SignUp" method="post">
			<div>
				<button class="btn-square-so-pop">新規登録</button>
			</div>
		</form>

	</div>

	<!--メニュー表-->

	<div id="menu">

		メニュー表
		<nav>
			<ul>
				<li><a href="../ProductInput">出品する</a></li>
				<li><a href="#">気になる</a></li>
				<li><a href="../Menu">落札中</a></li>
				<li><a href="#">落札履歴</a></li>
				<li><a href="#">出品中</a></li>
				<li><a href="#">出品履歴</a></li>
			</ul>
		</nav>

	</div>

	<!--お気に入りのタグを表示-->

	<div id="tagu">

		<nav>
			<a href="../SearchResults" class="btn-circle-flat">パソコン</a> <a
				href="#" class="btn-circle-flat">BUTTON</a> <a href="#"
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

	<div id="kategori">

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

		<h1>
			<div id="medama">目玉商品</div>
		</h1>

		<span class="new"><img src="../img/kinn.jpg" alt="金塊"
			width="250" height="250"></span> <span class="new"><img
			src="../img/main01.jpg" alt="ソファー" width="250" height="250"></span> <span
			class="new"><img src="../img/hamu.jpg" alt="ハムスター" width="250"
			height="250"></span>


	</div>



	<div id="box2">

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