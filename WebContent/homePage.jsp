<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">

	<head>

		<meta charset="UTF-8">
		<link rel="stylesheet" href="css/hoom.css">
		<title>オークション</title>
		<!--追加-->


    </head>

	<body>

		<!--タイトル-->

		<img src="img/Title.png"alt="タイトル"width="1500" height="150">

		<!--検索欄-->

		<div id="kennsaku">
			<form id="form1" action="">
				<input id="sbox"  id="s" name="s" type="text" placeholder="キーワードを入力" />
				<input id="sbtn" type="submit" value="検索" />
			</form>
  		</div>

  		<!--ログイン画面-->

  		<div id="login">

  			<form>
  				ID<input type="text" name="ID"><br>
  				password<input type="password" name="pass"><br>
  				<a href="#" class="btn-square">ログイン</a><br>
  				<a href="file:///C:/Users/kento/OneDrive/%E3%83%87%E3%82%B9%E3%82%AF%E3%83%88%E3%83%83%E3%83%97/WEB%E5%88%B6%E4%BD%9C/WEB%E5%88%B6%E4%BD%9C/no2%20%E6%96%B0%E8%A6%8F%E7%99%BB%E9%8C%B2.html" class="btn-square-so-pop">新規登録</a>
  			</form>

  		</div>

  		<!--メニュー表-->

  		<div id="menu">


  			<nav>
				<ul>
					メニュー表
					<li><a href="file:///C:/Users/kento/OneDrive/%E3%83%87%E3%82%B9%E3%82%AF%E3%83%88%E3%83%83%E3%83%97/WEB%E5%88%B6%E4%BD%9C/WEB%E5%88%B6%E4%BD%9C/no7%E5%95%86%E5%93%81%E6%83%85%E5%A0%B1%E3%81%AE%E5%85%A5%E5%8A%9B.html">出品する</a></li>
					<li><a href="#">気になる</a></li>
					<li><a href="file:///C:/Users/kento/OneDrive/%E3%83%87%E3%82%B9%E3%82%AF%E3%83%88%E3%83%83%E3%83%97/WEB%E5%88%B6%E4%BD%9C/WEB%E5%88%B6%E4%BD%9C/no13%E3%83%A1%E3%83%8B%E3%83%A5%E3%83%BC.html#">落札中</a></li>
					<li><a href="#">落札履歴</a></li>
					<li><a href="#">出品中</a></li>
					<li><a href="#">出品履歴</a></li>
				</ul>
			</nav>

  		</div>

  		<!--お気に入りのタグを表示-->

  		<div id="tagu">

  			<nav>
  				<a href="file:///C:/Users/kento/OneDrive/%E3%83%87%E3%82%B9%E3%82%AF%E3%83%88%E3%83%83%E3%83%97/WEB%E5%88%B6%E4%BD%9C/WEB%E5%88%B6%E4%BD%9C/no4%E6%A4%9C%E7%B4%A2%E7%B5%90%E6%9E%9C%20-%20(%E3%83%91%E3%82%BD%E3%82%B3%E3%83%B3).html?s=" class="btn-circle-flat">パソコン</a>
  				<a href="#" class="btn-circle-flat">BUTTON</a>
  				<a href="#" class="btn-circle-flat">BUTTON</a>
  				<a href="#" class="btn-circle-flat">BUTTON</a>
  				<a href="#" class="btn-circle-flat">BUTTON</a>
  			    <a href="#" class="btn-circle-flat">BUTTON</a>
  				<a href="#" class="btn-circle-flat">BUTTON</a>
  				<a href="#" class="btn-circle-flat">BUTTON</a>
  			</nav>

  		</div>

  		<!--お知らせ-->

  		<div id ="news">

  			<nav>
				<ul>
					お知らせ
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

  		  	<nav>
				<ul>
					カテゴリ
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

			<h1><div id="medama">目玉商品</div></h1>
			<span class="new"><img src="img/kinn.jpg"alt="金塊" width="250" height="250"></span>
			<span class="new"><img src="img/main01.jpg"alt="ソファー" width="250" height="250"></span>
			<span class="new"><img src="img/hamu.jpg"alt="ハムスター" width="250" height="250"></span>


		</div>


		<div id="box2">

				<span class="text">金塊<br>
				残り時間 ○○ 現在５０万
				</span>
				<span class="text">ソファー<br>
				残り時間 ☓☓ ３万
				</span>
    			<span class="text">目玉焼き<br>
    			残り時間 △△ １０円
    			</span>

    	</div>

 	</body>
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.js">
	 	</script>

		<script>


	   $(function() {
			$('.btn-circle-flat').css({'transition': '2s' ,'transform': 'rotate(360deg)'});
			$('.btn-circle-flat').animate({'margin-Left': '35px'
		});
	   });






		</script>


<html>