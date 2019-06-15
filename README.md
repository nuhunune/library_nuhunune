# library_nuhunune
nuhununeの自作ライブラリ
nuhununeが作ったライブラリです、適当に使ってください。

## __それぞれのファイルの説明__
- ### __README.md__
	 これです。
- ### __Bitsearch.java__
	bit全探索をします。
	#### コンストラクタ、メソッドの説明
	- コンストラクタ `BitSearch(int length,int bottom)`   
	  bit全探索で探索する個数(場合の数ではなく状態を遷移させるものの個数)、基底を設定します。2進法以外もできます。
	- `int getbit(int index)`  
	  指定した位置のbitを返します。
	- `void update(int index)`  
	  bitをN進法の数字として見たとき、値を1増やします。外側からは`update(0)`のように呼び出してください。		

- ### __UnionFind.java__
	UnionFind木です。カプセル化しました。
	#### コンストラクタ、メソッドの説明
	- コンストラクタ `UnionFind(int length)`  
	  木の頂点数を設定します。
	- `void makeSame(int x, int y)`  
	  指定した二つの要素を同じグループにします。
	- `boolean isSame(int x, int y)`  
	  指定した2つの要素が同じグループにあるかを返します。
	- `int getLength()`  
	  木にあるグループの数を返します。
	  
- ### __MyMath.java__
	 作ったライブラリのうちメソッド単体のもので、算術関係と思われるものを集めました。これから内容は増えていくと思われます。
	 - `static String primeFactrization(int input)`  
	   入力された数を素数の積に分解し、文字列で返します。素数大富豪などに使うことを想定しています。  
	   __例__  
	   入力:94564759742  
	   出力:"94564759742=2x17x19x59x1361x1823"
