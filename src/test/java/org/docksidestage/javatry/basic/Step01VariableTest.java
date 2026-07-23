/*
 * Copyright 2019-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.javatry.basic;

import java.math.BigDecimal;

import org.docksidestage.unit.PlainTestCase;

/**
 * The test of variable. <br>
 * Operate exercise as javadoc. If it's question style, write your answer before test execution. <br>
 * (javadocの通りにエクササイズを実施。質問形式の場合はテストを実行する前に考えて答えを書いてみましょう)
 * @author jflute
 * @author yuto.nakamura
 */
public class Step01VariableTest extends PlainTestCase {

    // ===================================================================================
    //                                                                      Local Variable
    //                                                                      ==============
    /**
     * What string is sea variable at the method end? <br>
     * (メソッド終了時の変数 sea の中身は？)
     */
    public void test_variable_basic() { // example, so begin from the next method
        String sea = "mystic";
        log(sea); // your answer? => mystic
    }

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_variable_initial() {
        String sea = "mystic";
        Integer land = 8;
        //int land = 8;
        String piari = null;
        String dstore = "mai";
        sea = sea + land + piari + ":" + dstore;

        //land = land + piari; 流石にダメだった
        //sea = land + piari + ":" + dstore;
        //sea = land + 9;
        //sea = land + "9";
        log(sea); // your answer? => mystic8:mai
    }
    // TODO jflute 次回1on1で余談のし忘れをする (2026/07/23)

    //nullは反映されないと思っていたのでびっくり
    //そもそも異なる型同士で計算可能なのはなぜ？裏でto_string的なのが走ってる？
    //足し算の最初が Int でも正常に動作した(53行目) → 結果を入れる変数がStringなら全て文字列の結合として計算される？
    //54行目はダメで55行目は"89"になったので、どこかにStringが含まれてないと文字列の結合と見做されないのかも
    // done nakamura [ふぉろー] まさしく裏で toString() が実行されています by jflute (2026/07/16)
    // +演算子は、Stringがあったら他の型はそこにひきずりこまれていきます。
    // "+" の意味がStringに優先されると言う感じですね。文字列連結するぞと。

    //Integerって何者？intとは違うの？(intにしても同じ結果が出力された）
    //調べた結果：
    //int:早い、nullが入らない、プリテミティブ（←これもなに？？？）
    //Integer:nullが入る、クラス型（？）、メソッドが使える（？)、int を包むオブジェクト（？）
    // done nakamura [読み物課題] Java Beginner's Hint - プリミティブ型とラッパー型 by jflute (2026/07/16)
    // https://dbflute.seasar.org/ja/manual/topic/programming/java/beginners.html#primitivewrapper
    // #1on1: 使い分け、ケースバイケースになる。nullを防ぐ手段、nullを許容する手段、として (2026/07/23)

    //クラス：設計図　こういう物を作れますよという定義　String,Integerなど Cの構造体に関数を持たせられるような感じ
    //オブジェクト：クラスから作られた実体 Integer land の landの方はオブジェクトへの参照を持ってる（Cのポインタみたいな感じ）
    //プリミティブ：値を直接持つ型 int double char など
    //メソッド：List　to_String　など
    // done nakamura [ふぉろー] オブジェクトとインスタンスがニアリーイコールみたいな感じでよく使われます by jflute (2026/07/16)
    // "Cの構造体に関数を持たせられるような感じ" という表現は本当に素晴らしい。
    // #1on1: 広義と狭義のオブジェクトという言葉。実体を主張したい場合はインスタンス。 (2026/07/23)
    // 一軒家の例。インスタンスの理解、mysticインスタンス、onemanインスタンス。
    // インスタンス変数は、それぞれのインスタンスごとに独立した空間として存在している。
    // 変数とインスタンスの関係性を把握しよう。test_variable_reassigned_basic()を見ながら解説。
    // BigDecimalのインスタンス何個エクササイズやった。
    // add()のコードリーディングもしました。
    // プログラムをパッと見て、インスタンスをイメージできるようになろう。

    //to 久保さん:調べるごとにさらに気になることが出てきてしまい、発散しすぎてしまうように感じるのですが、どのように要点を絞ると良いでしょうか？
    // done nakamura [へんじ] 好奇心旺盛なのは素晴らしい笑。確かに60分という制約もありますからね... by jflute (2026/07/16)
    // でも気になる時にインプットした方が効率良いというのもありますし、いま時間使った分、後のjavatryはサクッと進めるので、
    // 発散しすぎはそこまで気にしなくても良いとは思います。
    // さすがにキリがないって思ったら、自分用メモで、「#later 後でxxxを調べたい」とか目印を付けておくとか。
    // #later で検索すれば後で調べようと思ったことを一覧化できるので。

    // #1on1: コード上の保留コメントのやり方のお話 (2026/07/23)
    // TODO nakamura DBFlute な IntelliJ 補完テンプレート by jflute (2026/07/23)
    // https://dbflute.seasar.org/ja/manual/topic/friends/intellij/index.html#dbflutelivetemplate

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_variable_reassigned_basic() {
        String sea = "mystic"; // 1丁目1番地 => seaが指し示す
        String land = "oneman"; // 2丁目2番地 => landが指し示す
        sea = land; // seaの紙に書かれた1丁目1番地を消して、2丁目2番地に書き換える
        // #1on1: ↑ここはアドレスをコピーしただけのイメージ。この時点でseaとlandは同じインスタンスを指し示す。 (2026/07/23)
        // 質問: "mystic" はいつ削除されるのか？ → Javaの都合で、どこかのタイミングで削除される。
        // ガベージコレクションのタイミング。参照されなくなったインスタンスを一気に削除。
        land = land + "'s dreams"; // "'s dreams" は3丁目3番地、"oneman's dreams" は4丁目4番地
        log(sea); // your answer? => oneman
    }

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_variable_reassigned_int() {
        int sea = 94;
        int land = 415;
        sea = land;
        land++;
        log(sea); // your answer? => 415
        // #1on1: プリミティヴ型の簡単な紹介 (2026/07/23)
        // Pythonの数値が限界なし話 from なかむらさん
    }

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_variable_reassigned_BigDecimal() {
        BigDecimal sea = new BigDecimal(94); // 1
        BigDecimal land = new BigDecimal(415); // 2
        sea = land;
        sea = land.add(new BigDecimal(1)); // 3, 4
        sea.add(new BigDecimal(1)); // 5, 6
        //sea = sea.add(new BigDecimal(1));
        log(sea); // your answer? => 417
    }
    //417になると思ってたのに、98行,99行目どちらかが足し算になってない..?
    //コメントアウトして試したところ、99行目が加算になってないようだった

    //そもそもBigDecimalって何？
    //10進数で計算する、誤差のない少数。immutable（変更不可） オブジェクト
    //"+"はプリミティブ型用なので、代わりに add を使う！ 中身は不変なので、新しい値が返される
    //99行目が加算になってないのは、addが中身を変えるメソッドじゃないからだ！！
    // done nakamura [いいね] yes, そういうことです。 by jflute (2026/07/16)

    //100行目を試したところ、普通に加算された。あれ？immutableじゃないの？
    //調べた結果：seaという変数自体は可変 seaが参照しているBigDecimalオブジェクト本体は不変
    //オブジェクトの値が変更されたのではなく、seaが参照するオブジェクトが変わった
    // done nakamura [いいね] yes, yes, そういうことです。 by jflute (2026/07/16)
    // 自分自分のインスタンスの状態は変わってなく、seaという変数が指し示すインスタンスが差し変わっただけと。
    // この違いを理解するのはとても重要です。
    // #1on1: immutableとは？ (不変な) (2026/07/23)
    // o immutableなクラス(インスタンス) (デフォルト)
    // o immutableな変数
    //
    // immutableのメリットは？
    // o (デフォルト)安全であることが保証されている (後出し) by jflute
    // o 変数のimmutableは読みやすくなるイメージ、変化を追わなくて良い、可読性 by なかむらさん
    //   ↑インスタンスでも同じかなと by jflute
    //   読み飛ばすこともできるケースも by jflute
    // 「安全イコール可読性の典型例」
    //
    // immutableのデメリットは？
    // o 
    // TODO jflute 次回1on1でimmutableの続き (2026/07/23)

    //BigDecimalの疑問
    //"Big"ということは、普通のDecimalもある？
    //→ doubleやfloatがそれに近い？誤差が出るけど、高速らしい
    //誤差がないなら、少数計算は全部BigDecimalでよくない？
    //→数万回呼ばれたり、数msのレスポンスを意識する場合は、適切にdoubleと使い分けることが必要
    //BigDecimal:重いけど正確。金額計算などに使う
    //double:早くてちょいちょい誤差が出る。ゲーム・物理演算などに使う
    // done nakamura [ふぉろー] webサービスの実務だとほぼほぼ全部BigDecimalですね by jflute (2026/07/16)
    // 変に誤差が出ても困るし、インフラの性能が格段に上がったので、BigDecimalのコストをあまり考えなくても良くなりました。

    // done jflute 1on1にて、immutableのお話しじっくりフォロー予定。あとadd()のコードリーディングも (2026/07/16)
    // ↑くぼの備忘録とぅどぅなので、そのままにしておいて大丈夫です

    // ===================================================================================
    //                                                                   Instance Variable
    //                                                                   =================
    private String instanceBroadway;
    private int instanceDockside;
    private Integer instanceHangar;
    private String instanceMagiclamp;

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_variable_instance_variable_default_String() {
        String sea = instanceBroadway;
        log(sea); // your answer? => 
    }

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_variable_instance_variable_default_int() {
        int sea = instanceDockside;
        log(sea); // your answer? => 
    }

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_variable_instance_variable_default_Integer() {
        Integer sea = instanceHangar;
        log(sea); // your answer? => 
    }

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_variable_instance_variable_via_method() {
        instanceBroadway = "bbb";
        instanceMagiclamp = "magician";
        helpInstanceVariableViaMethod(instanceMagiclamp);
        String sea = instanceBroadway + "|" + instanceDockside + "|" + instanceHangar + "|" + instanceMagiclamp;
        log(sea); // your answer? => 
    }

    private void helpInstanceVariableViaMethod(String instanceMagiclamp) {
        instanceBroadway = "bigband";
        ++instanceDockside;
        instanceMagiclamp = "burn";
    }

    // ===================================================================================
    //                                                                     Method Argument
    //                                                                     ===============
    // -----------------------------------------------------
    //                                 Immutable Method-call
    //                                 ---------------------
    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_variable_method_argument_immutable_methodcall() {
        String sea = "harbor";
        int land = 415;
        helpMethodArgumentImmutableMethodcall(sea, land);
        log(sea); // your answer? => 
    }

    private void helpMethodArgumentImmutableMethodcall(String sea, int land) {
        ++land;
        String landStr = String.valueOf(land); // is "416"
        sea.concat(landStr);
    }

    // -----------------------------------------------------
    //                                   Mutable Method-call
    //                                   -------------------
    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_variable_method_argument_mutable_methodcall() {
        StringBuilder sea = new StringBuilder("harbor");
        int land = 415;
        helpMethodArgumentMethodcall(sea, land);
        log(sea); // your answer? => 
    }

    private void helpMethodArgumentMethodcall(StringBuilder sea, int land) {
        ++land;
        sea.append(land);
    }

    // -----------------------------------------------------
    //                                   Variable Assignment
    //                                   -------------------
    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_variable_method_argument_variable_assignment() {
        StringBuilder sea = new StringBuilder("harbor");
        int land = 415;
        helpMethodArgumentVariable(sea, land);
        log(sea); // your answer? => 
    }

    private void helpMethodArgumentVariable(StringBuilder sea, int land) {
        ++land;
        String seaStr = sea.toString(); // is "harbor"
        sea = new StringBuilder(seaStr).append(land);
    }

    // ===================================================================================
    //                                                                           Challenge
    //                                                                           =========
    /**
     * Define variables as followings:
     * <pre>
     * o local variable named sea typed String, initial value is "mystic"
     * o local variable named land typed Integer, initial value is null
     * o instance variable named piari typed int, without initial value
     * o show all variables by log() as comma-separated
     * </pre>
     * (変数を以下のように定義しましょう):
     * <pre>
     * o ローカル変数、名前はsea, 型はString, 初期値は "mystic"
     * o ローカル変数、名前はland, 型はInteger, 初期値は null
     * o インスタンス変数、名前はpiari, 型はint, 初期値なし
     * o すべての変数をlog()でカンマ区切りの文字列で表示
     * </pre>
     */
    public void test_variable_writing() {
        // define variables here
    }

    // ===================================================================================
    //                                                                           Good Luck
    //                                                                           =========
    /**
     * Make your original exercise as question style about variable. <br>
     * (変数についてあなたのオリジナルの質問形式のエクササイズを作ってみましょう)
     * <pre>
     * _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
     * your question here (ここにあなたの質問を):
     * 
     * _/_/_/_/_/_/_/_/_/_/
     * </pre>
     */
    public void test_variable_yourExercise() {
        // write your code here
    }
}
