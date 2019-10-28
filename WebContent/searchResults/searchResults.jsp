
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ja">

<head>

<meta charset="UTF-8">
<link rel="stylesheet" href="../css/kennsakuhonn.css">
<title>検索結果(パソコン)</title>


</head>


<body>

	<!--ホームリンクタイトル画像-->

	<a href="../hoomPege"> <img src="../img/Title.png" alt="タイトル"
		width="200" height="80"></a>
	<br>




	<div id="block1">
		<!--検索欄-->

		<div id="kennsaku">
			<form id="form1">
				<input id="sbox" id="s" name="s" type="text" placeholder="キーワードを入力" />
				<input id="sbtn" type="submit" value="検索" />
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

	</div>


	<div id=block2>

		<br> ○○の検索結果<br> ☓☓件 <br> <br>



		<div>


			<!--対象商品　チェックボックス-->

			対象商品


			<div class="cp_ipcheck">
				<ul>
					<li class="list_item"><label> <input type="checkbox"
							class="option-input05" checked /> 送料無料
					</label></li>
					<li class="list_item"><label> <input type="checkbox"
							class="option-input05" /> 新着
					</label></li>
					<li class="list_item"><label> <input type="checkbox"
							class="option-input05" /> 匿名配送
					</label>
					<li class="list_item"><label> <input type="checkbox"
							class="option-input05" /> コンビニ受け取り
					</label></li>
				</ul>
			</div>

			<!--カテゴリ-->


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


			<!--価格 ラジオボタン-->

			表示価格
			<div class="cp_ipradio">
				<div class="box">
					<input type="radio" id="radio1" name="cpipr01" /> <label
						for="radio1">～1000</label> <input type="radio" id="radio2"
						name="cpipr01" /> <label for="radio2">～3000</label> <input
						type="radio" id="radio3" name="cpipr01" /> <label for="radio3">～10000</label>
					<input type="radio" id="radio4" name="cpipr01" /> <label
						for="radio4">10000以上</label>
				</div>
			</div>


			<!--状態　ラジオボタン-->

			商品状態
			<div class="cp_ipradio">
				<div class="box">
					<input type="radio" id="radio5" name="cpipr02" /> <label
						for="radio5">新品</label> <input type="radio" id="radio6"
						name="cpipr02" /> <label for="radio6">中古</label>
				</div>
			</div>

		</div>

	</div>


	<div id="block3">



		<h1>オークション</h1>
		<br> <br> <br>


		<!--商品並びの起点-->

		<h2>パソコン</h2>
		<div class="q1">
			<a
				href="../ExhibitPurchase">
				<img src="../img/MAC.jpg" alt="タイトル" width="200" height="200">
			</a><br>
		</div>
		<div class=q2>
			現在○○円<br> 入札回数△△ 残り時間○○日
		</div>
		<br> 商品情報<br> サンプルサンプルサンプルサンプルサンプルサンプルサンプルサンプル



		<!--コピペで増やせる-->

		<div id="q3">
			<h2>パソコン</h2>
			<br>
			<div class="q1">
				<img src="../img/pc1.jpg" alt="タイトル" width="200" height="200"></a><br>
			</div>
			<div class=q2>
				現在○○円<br> 入札回数△△ 残り時間○○日
			</div>
			<br> 商品情報<br> サンプルサンプルサンプルサンプルサンプルサンプルサンプルサンプル
		</div>

		<div id="q3">
			<h2>パソコン</h2>
			<br>
			<div class="q1">
				<img src="../img/pc1.jpg" alt="タイトル" width="200" height="200"></a><br>
			</div>
			<div class=q2>
				現在○○円<br> 入札回数△△ 残り時間○○日
			</div>
			<br> 商品情報<br> サンプルサンプルサンプルサンプルサンプルサンプルサンプルサンプル
		</div>

		<div id="q3">
			<h2>パソコン</h2>
			<br>
			<div class="q1">
				<img src="../img/pc1.jpg" alt="タイトル" width="200" height="200"></a><br>
			</div>
			<div class=q2>
				現在○○円<br> 入札回数△△ 残り時間○○日
			</div>
			<br> 商品情報<br> サンプルサンプルサンプルサンプルサンプルサンプルサンプルサンプル
		</div>

		<div id="q3">
			<h2>パソコン</h2>
			<br>
			<div class="q1">
				<img src="../img/pc1.jpg" alt="タイトル" width="200" height="200"></a><br>
			</div>
			<div class=q2>
				現在○○円<br> 入札回数△△ 残り時間○○日
			</div>
			<br> 商品情報<br> サンプルサンプルサンプルサンプルサンプルサンプルサンプルサンプル
		</div>



	</div>



</body>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.js">

</script>
</html>