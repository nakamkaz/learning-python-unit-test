public class Main{

	public static void main(String... args ){
		PubFieldClass pfc = new PubFieldClass();
		PubFieldClass pfc2 = new PubFieldClass("onamae",99);

		pfc.name="changename";
		pfc.age=30;
		System.out.println("pfc: name= "+pfc.name+", age= "+ pfc.age);

		pfc2.name="pfc2change";
		pfc2.age++;
		System.out.println("pfc2: name= "+pfc2.name+", age= "+ pfc2.age);

		PrivFieldClass vfc = new PrivFieldClass();

		// PrivFieldClassのname,ageがprivateなので次の行はコンパイルは通らない
		/*	
	       	System.out.println("priv: name= "+vfc.name+", age= "+ vfc.age);
		*/
		// 次のようにgetName(),getAge()から取り出す
	       	System.out.println("priv: name= "+vfc.getName()+", age= "+ vfc.getAge());
		 vfc.setName("aaaaaa");
		 vfc.setAge(150);
	       	System.out.println("priv: name= "+vfc.getName()+", age= "+ vfc.getAge());
		/*
		 * クラスで定義したメソッドを介してのみクラスのインスタンスの値を参照したり変更したりさせる。
		 * メソッドを用意しなければクラス外からこれらの変数を触れない。
		 * */
	}

}

/**
 * 同パッケージ内でフィールドが公開されているクラス
 * */
class PubFieldClass {
	String name = "defaultname";
	int age = 20;
	public PubFieldClass(){

	}
	public PubFieldClass(String name,int age){
	this.name=name;
	this.age=age;	
	}
}

/**
 * 同パッケージ内にてフィールドを隠しているクラス
 * */

class PrivFieldClass {
	private String name = "default_private";
	private int age =20;
	public PrivFieldClass(){
	}
	public PrivFieldClass(String name, int age){
	this.name=name;
	this.age=age;
	}
	String getName(){
		return this.name;
	}
	int getAge(){
		return this.age;
	}
	void setName(String name){
		this.name=name;
	}
	void setAge(int age){
		this.age=age;
	}
}
