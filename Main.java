/**
 * プログラムのエントリポイントとなるクラス
 */
public class Main {
  public static void main(String... args) {
    /* ここから // 自分の学生証番号と名前を出力すること． */
    System.out.println("2600190228-7 出口　尚哉 <-- 各自の学生証番号と名前に書き換えましたafpkmrokrdesdekpflodae");
    /* ここまで */
    /*ああああああああああああ */

    //【基本課題】
    // Circleのインスタンスを作成し，その情報を出力せよ．
    Circle c1 = new Circle(200, 300, 100);
    /* ここから */
    System.out.println(c1.description());
    /* ここまで */

    //【発展課題】
    // Rectangle, Lineのクラスを定義し，それぞれのインスタンスを作成し，その情報を出力せよ．
    /* ここから */
    Rectangle r1 = new Rectangle(200,100,100,100);
    System.out.println(r1.description());
    Line l1 = new Line(200,100,300,0);
    System.out.println(l1.description());



    /* ここまで */
  }
}
