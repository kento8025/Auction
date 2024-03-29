<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- 商品情報入力-->

<html lang="ja">

<head>

<meta charset="UTF-8">
<link rel="stylesheet" href="../../css/zixyouhou.css">
<title></title>


<style>
]
#box {
	margin: auto;
	padding-top: 50px;
	width: 15%;
}

#text {
	width: 300px;
}

/*ラジオボタン装飾*/
.cp_ipradio {
	width: 600px;
	-webkit-box-sizing: border-box;
	box-sizing: border-box;
}

.cp_ipradio:before, .cp_ipradio:after {
	-webkit-box-sizing: inherit;
	box-sizing: inherit;
}

.cp_ipradio .box {
	width: 90%;
	margin: 2em auto;
	text-align: left;
	border: 1px solid white;
	border-radius: 3px;
	background: #ffffff;
}

.cp_ipradio input[type=radio] {
	display: none;
}

.cp_ipradio label:focus, .cp_ipradio label:hover, .cp_ipradio label:active,
	.cp_ipradio input:checked+label {
	color: #ff0000;
}

.cp_ipradio label:focus:before, .cp_ipradio label:hover:before,
	.cp_ipradio label:active:before, .cp_ipradio input:checked+label:before
	{
	border-color: #ff0000;
	background: #ffffff;
}

.cp_ipradio label {
	font-size: 1em;
	font-weight: bold;
	line-height: 1;
	position: relative;
	display: block;
	overflow: hidden;
	padding: 1em 1em 1em 3em;
	cursor: pointer;
	-webkit-transition: all 0.15s ease;
	transition: all 0.15s ease;
	white-space: nowrap;
	text-overflow: ellipsis;
	background: #ffffff;
}

.cp_ipradio label:before {
	position: absolute;
	top: 1em;
	left: 1em;
	width: 10px;
	height: 10px;
	content: '';
	border: 0.2em solid #cccccc;
	border-radius: 50%;
}

.cp_ipradio input:checked+label:before {
	border-color: #ff0000;
	background: #ff0000;
}

.cp_ipradio input:disabled+label {
	cursor: not-allowed;
	color: rgba(0, 0, 0, 0.5);
	background: #efefef;
}

.cp_ipradio input:disabled+label:hover {
	border-color: rgba(0, 0, 0, 0.1);
}

.cp_ipradio input:disabled+label:before {
	border-color: #ffffff;
	background: #ffffff;
}

/*新規登録*/
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

.btn-square-so-pop:active {
	/*押したとき*/
	box-shadow: 0 0 2px rgba(0, 0, 0, 0.30);
}
</style>

</head>

<!--ホームリンクタイトル画像-->

<a href="../../hoomPege"> <img src="../../img/Title.png" alt="タイトル"
	width="200" height="80"></a>
<br>


		<form action="../../ContentConfirmation" method="post" enctype="multipart/form-data">



<div id="box">

	<h1>商品情報入力</h1>

	<br> <br>

	<!--画像-->

	画像のアップロード<br>

	<input type="file" name="file" /><br />

	<br> <br>

	<!--商品名-->

	商品名 <br> <input type="text" name = "productName"> <br> <br>

	<!--カテゴリ-->

	カテゴリ <br> <select name="category">
		<option value="">-</option>
		<option value="パソコン">パソコン</option>
		<option value="本">本</option>
		<option value="サンプル">サンプル</option>
		<option value="サンプル">サンプル</option>
		<option value="サンプル">サンプル</option>
		<option value="サンプル">サンプル</option>
		<option value="サンプル">サンプル</option>
		<option value="サンプル">サンプル</option>

	</select> <br> <br>


	<!--商品の状態-->

	商品の状態<br> <select name="productStatus">
		<option value="">-</option>
		<option value="新品">新品</option>
		<option value="中古">中古</option>
	</select> <br> <br>


	<!--説明-->

	説明
	<div id="text">
		<textarea cols="50" rows="10" name = "description"></textarea>
	</div>


	<!--発送元の地域-->

	発送元の地域<br> <select name="shippingOrigin">
		<option value="" selected>--</option>
		<option value="北海道">北海道</option>
		<option value="青森県">青森県</option>
		<option value="岩手県">岩手県</option>
		<option value="宮城県">宮城県</option>
		<option value="秋田県">秋田県</option>
		<option value="山形県">山形県</option>
		<option value="福島県">福島県</option>
		<option value="茨城県">茨城県</option>
		<option value="栃木県">栃木県</option>
		<option value="群馬県">群馬県</option>
		<option value="埼玉県">埼玉県</option>
		<option value="千葉県">千葉県</option>
		<option value="東京都">東京都</option>
		<option value="神奈川県">神奈川県</option>
		<option value="新潟県">新潟県</option>
		<option value="富山県">富山県</option>
		<option value="石川県">石川県</option>
		<option value="福井県">福井県</option>
		<option value="山梨県">山梨県</option>
		<option value="長野県">長野県</option>
		<option value="岐阜県">岐阜県</option>
		<option value="静岡県">静岡県</option>
		<option value="愛知県">愛知県</option>
		<option value="三重県">三重県</option>
		<option value="滋賀県">滋賀県</option>
		<option value="京都府">京都府</option>
		<option value="大阪府">大阪府</option>
		<option value="兵庫県">兵庫県</option>
		<option value="奈良県">奈良県</option>
		<option value="和歌山県">和歌山県</option>
		<option value="鳥取県">鳥取県</option>
		<option value="島根県">島根県</option>
		<option value="岡山県">岡山県</option>
		<option value="広島県">広島県</option>
		<option value="山口県">山口県</option>
		<option value="徳島県">徳島県</option>
		<option value="香川県">香川県</option>
		<option value="愛媛県">愛媛県</option>
		<option value="高知県">高知県</option>
		<option value="福岡県">福岡県</option>
		<option value="佐賀県">佐賀県</option>
		<option value="長崎県">長崎県</option>
		<option value="熊本県">熊本県</option>
		<option value="大分県">大分県</option>
		<option value="宮崎県">宮崎県</option>
		<option value="鹿児島県">鹿児島県</option>
		<option value="沖縄県">沖縄県</option>
	</select> <br> <br>


	<!--送料負担-->

	送料負担

	<div class="cp_ipradio">
		<div class="box">
			<input type="radio" id="radio1" name="postage" value = "出品者" />
			<label for="radio1">出品者</label>

				<input type="radio" id="radio2" name="postage" value = "落札者" />
		     <label for="radio2">落札者</label>
		</div>
	</div>

	<!--配送方法-->

	配送方法<br>

	<div class="cp_ipradio">
		<div class="box">
			<input type="radio" id="radio3" name="shipping_method" value = "クロネコ 小型BOX 100円" />
			<label for="radio3">クロネコ 小型BOX 100円 </label>
			<input type="radio"id="radio4" name="shipping_method" value = "シロネコ 中型BOX 500円" />
			<label for="radio4">シロネコ 中型BOX 500円</label>
			 <input type="radio" id="radio5" name="shipping_method" value = "ミケネコ 大型BOX 2000円" />
			 <label for="radio5">ミケネコ 大型BOX 2000円</label>
		</div>
	</div>



	<!--発送までの日数-->

	オークションの期間<br> <input type="text" name = "exhibition_period">日 <br> <br>


	<!--価格-->

	価格<br> <input type="text" name= "price">円 <br> <br>


	<!--登録ボタン-->

	<button class="btn-square-so-pop">出品する</button>

		</div>


	</form>




<body>



</body>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.js">

</script>
</html>