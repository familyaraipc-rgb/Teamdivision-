import java.util.Scanner;

public class teamwake {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("このソフト（？）は、チーム分けをする際にランダムでチーム分けをするソフト（？）です。");
		System.out.println("必要：何人で分けますか？");
		int nannninka = 0;
		try {
		nannninka = scanner.nextInt();
		} catch (Exception e) {
			System.err.println("読み込み中にエラーが発生しました！アプリを終了してエラーを表示します。");
			System.err.println(e);
		}
		System.out.println(nannninka+"で分けます。");
		System.out.print("必要：分けるチームの数を入れてください！");
		System.out.println("分けるチームの数を答えてください。");
		int nanteamka = 0;
		try {
		nanteamka = scanner.nextInt();
		} catch (Exception e1) {
			System.err.println("エラーが発生しました！終了してエラー文を表示します．");
			System.err.println(e1);
			
		}//catch（例外処理）の終わり
	    teamwake thisclass = new teamwake();
		System.out.print("余りがないか計算中です");
		System.out.print("・");
		thisclass.stoponetime();
		System.out.print("・");
		thisclass.stoponetime();
		System.out.print("・");
		int keisan_amari = nannninka % nanteamka;
		if (keisan_amari == 0) {
			System.out.println("分けるチームと人数に余りはありませんでした。");
		} else {//if文の終わりとelse文の初め
			System.out.println("分けるチームと人数にあまり" + keisan_amari + "が出ました。");
			System.out.println(keisan_amari +"の人は、どうしますか？　１：その人はぬかす　２：一回これで終了して、考え直す　３：小数点で表す");
			int ifelseint = scanner.nextInt();
			switch (ifelseint) {
			case 1 -> nannninka = nannninka - keisan_amari;
			}//switch文の終わり
			}//if else文の終わり
		
	}//mainメソットの終わり
	
   public void stoponetime () {
       try {
           Thread.sleep(1000); 
       }   catch (InterruptedException e) {
       }
   }
   {
   }
}
