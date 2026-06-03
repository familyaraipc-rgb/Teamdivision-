import java.util.Scanner;

public class teamwake {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("このソフト（？）は、チーム分けをする際にランダムでチーム分けをするソフト（？）です。");
		System.out.println("必要：何人で分けますか？");
		int nannninka = nextint();
		System.out.println(nannninka+"で分けます。");
		System.out.print("必要：分けるチームの数を入れてください！");
		System.out.println("分けるチームの数を答えてください。");
		int nanteamka = nextint();
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
			int ifelseint = nextint();
			switch (ifelseint) {
			case 1 -> nannninka = nannninka - keisan_amari;
			case 2 -> System.exit(0);
			}//switch文の終わり
			}//if else文の終わり
		System.out.println("チームの名前を教えてください（省略する場合は、チームA B Cと別れていき、省略する方法は、省略という名前にしてください）");
		String[] teamname = new String[nanteamka];
		int menbar1 = nanteamka;
		int menbar2 = 0;
		for (;menbar1>1; menbar1--) {
			System.out.println(menbar1 +"つ目のチームの名前");
			try {
			teamname[menbar2] = scanner.nextLine();
			} catch (Exception e) { 
				System.err.println("エラーが発生しました！終了してエラー文を表示します．");
				System.err.println(e);
			}//catch（例外処理）の終わり
			if (teamname[menbar2].equals("省略")) {
				System.out.println("チームの名前つけを省略します");
				break;
			}//if文の終わり
			menbar2++;
		}//for文の終わり
		System.out.println("次に分ける生徒に名前を付けます。また、これも省略できます。");
		String[] name = new String[nannninka];
		int menbar3 = nannninka;
		int menbar4 = 0;
		for (;menbar3>1; menbar3--) {
			System.out.println(menbar3+"つ目の人の名前（または、仮名）");
			try {
			name[menbar4] = scanner.nextLine();
			} catch (Exception e1) {
				System.err.println("エラーが発生しました！終了してエラー文を表示します．");
				System.err.println(e1);
			}
			menbar4++;
			if (name[menbar4].equals("省略")) {
				System.out.println("名前つけを省略します。");
				break;
			}//if文の終わり
		}//for文の終わり
		System.out.println("では、チーム分けを始めます。しばらくお待ちください。");
	}//mainメソットの終わり
	
	public static int nextint () {
		int nextInt = 0;
		try {
			nextInt = scanner.nextInt();
		} catch (Exception e_m) {
			System.err.println("エラーが発生しました！終了してエラー文を表示します．");
			System.err.println(e_m);
		}
		return nextInt;
	}//nextintメソットの終わり
	
	
   public void stoponetime () {
       try {
           Thread.sleep(1000); 
       }   catch (InterruptedException e) {
       }
   }
   {
   }
}
