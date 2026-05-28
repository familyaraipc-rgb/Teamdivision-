import jp.kwebs.lib.Input;

public class teamwake {

	public static void main(String[] args) {
		System.out.println("このソフト（？）は、チーム分けをする際にランダムでチーム分けをするソフト（？）です。");
		System.out.println("必要：何人で分けますか？");
		int nannninka = 0;
		try {
		nannninka = Input.getInt("整数で答えてください");
		} catch (Exception e) {
			System.err.println("読み込み中にエラーが発生しました！アプリを終了してエラーを表示します。");
			System.err.println(e);
		}
		System.out.println(nannninka+"で分けます。");
		System.out.print("必要：分けるチームの数を入れてください！");
		int nanteamka = Input.getInt("分けるチームの数を答えてください。");
	    teamwake thisclass = new teamwake();
		System.out.print("余りがないか計算中です");
		System.out.print("・");
		thisclass.stoponetime();
		System.out.print("・");
		thisclass.stoponetime();
		System.out.print("・");
		int keisan_amari = nannninka % nanteamka;
		

	}
   public void stoponetime () {
       try {
           Thread.sleep(1000); 
       }   catch (InterruptedException e) {
       }
   }
   {
   }
}
