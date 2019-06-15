# library_nuhunune
nuhununeの自作ライブラリ
nuhununeが作ったライブラリです、適当に使ってください。

## __それぞれのファイルの説明__
- ### Bitsearch.java
	bit全探索をします。
	#### コンストラクタ、メソッドの説明
	- コンストラクタ `BitSearch(int length,int bottom)`   
	  bit全探索で探索する個数(場合の数ではなく状態を遷移させるものの個数)、基底を設定します。2進法以外もできます。
	- `int getbit(int index)`  
	  指定した位置のbitを返します。
	- `void update(int index)`  
	  bitをN進法の数字として見たとき、値を1増やします。外側からは`update(0)`のように呼び出してください。
		
