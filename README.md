# library_nuhunune
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
	 作ったライブラリのうちメソッド単体のもので、算術関係と思われるお遊び系のものを集めます。これから内容は増えていくと思われます。
	 #### コンストラクタ、メソッドの説明
	 - `static String primeFactrization(int input)`  
	   入力された数を素数の積に分解し、文字列で返します。素数大富豪などに使うことを想定しています。  
	   __例__  
	   入力: 94564759742  
	   出力:"94564759742=2x17x19x59x1361x1823"
  
- ### __PQueue.java__
	 優先度付きQueueですが、オブジェクトをそのオブジェクトの整数型フィールドやメソッドの整数型戻り値をもとに並び替えることができます。本体はPQueueクラスで、MyQueueクラスは使用例です。MyQueueクラスのようにPQueueを継承して使ってください。Tは総称型です。
	 #### コンストラクタ、メソッドの説明
	 - コンストラクタ  
	   継承したクラスのコンストラクタでnumsに配列を代入してください。
	 - `abstract long get(T obj)`  
	   オブジェクトから取り出す値の設定をします。継承したクラスで実装する際に、引数のキャスト、取り出す値(優先度の基準にする値)の設定をしてください。
	 - `void add(T obj)`  
	   オブジェクトを追加します。
	 - `T peek()`  
	   Queue内で、基準にしている値が最も小さいオブジェクトを返します。削除は行いません。
	 - `T poll()`  
	   Queue内で、基準にしている値が最も小さいオブジェクトを返します。取り出した値はQueueから削除します。
	 - `void remove()`  
	   値を返さないpollです。必要なのかは知りません。
	 - `int size()`  
	   Queueの要素数を返します。
	   
- ### __Mods.java__
	 剰余を取ることがよくある演算をするメソッドを集めました。
	 #### コンストラクタ、メソッドの説明
	 - コンストラクタ`Mods(int length,int mod)`  
	   lengthは扱う階乗をn!としたときの、nの最大値です。正の整数を渡してください。modはそのまんまです。十分に大きい素数を渡してください。
	 - `int modSum(int a,int b)`  
	   (a+b)%modで、正のものを返します。
	 - `int modMult(int a,int b)`  
	   (axb)%modを返します。
	 - `int modPow(int a,int b)`  
	   a^bをmodで割った余りを返します。繰り返し二乗法を使用しています。
	 - `int modDivide(int a,int b)`  
	   bの逆元を用いてa/bを返します。剰余を取らない本来の値において、a%b==0となるのが前提です。
	 - `int modNCR(int n,int r)`  
	   nCr(二項係数)をmodで割った余りを返します。
