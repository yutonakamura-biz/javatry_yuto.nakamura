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
        log(sea); // your answer? => null
    }

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_variable_instance_variable_default_int() {
        int sea = instanceDockside;
        log(sea); // your answer? => 0
    }

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_variable_instance_variable_default_Integer() {
        Integer sea = instanceHangar;
        log(sea); // your answer? => null
    }

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_variable_instance_variable_via_method() {
        instanceBroadway = "bbb";
        instanceMagiclamp = "magician";
        helpInstanceVariableViaMethod(instanceMagiclamp);
        String sea = instanceBroadway + "|" + instanceDockside + "|" + instanceHangar + "|" + instanceMagiclamp;
        log(sea); // your answer? => bbb|0|null|magician  correct = bigband|1|null|magician
    }
    //instanceBroadway:privateで、引数として渡してないから変更されないと思った。でも良く考えたらコンパイルエラーにならない時点で参照できてる？
    //instanceDockside:同上
    //instanceHangar:変更されてないのでnullのまま
    //instanceMagiclamp:引数としてのinstanceMagiclampと、上で宣言している変数が別物だから変化しなかった？

    //調べた結果
    //privateは「他のクラスから触れないよ！」って意味らしい
    //Step01VariableTestという同じクラスの中では、privateでも普通に扱える
    //宣言していたものと、引数として新たに宣言したものは別物

    // TODO nakamura [ふぉろー] そうですね、コンパイルエラーになってない時点でprivateに関しては大丈夫と捉えて良いですね by jflute (2026/08/05)
    // そして、メソッド呼び出し時、呼び出し側で指定した変数自体がメソッドの渡っていくのではなく、
    // あくまで中身だけが渡っていって、受け取り側の引数変数で受け取るという感じになります。
    // (厳密には、アドレスがコピーされるだけ)
    // 今回はたまたま同じ名前の変数名でしたが、変数という箱としては別物です。

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
        log(sea); // your answer? => harbor
    }
    //引数としてのString sea と String sea = "harbor" は別物
    // TODO nakamura [いいね] yes, yes by jflute (2026/08/05)
    // 実務でもこういうケースはよくあります。例えば、memberId (会員ID) という変数名で取り扱ってて、
    // 引数側でも memberId という引数変数名で受け取るとか。業務的に同じものということで。
    // 

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
        Integer sky = 400;
        helpMethodArgumentMethodcall(sea, land, sky);
        log(sea); // your answer? => harbor correct answer = harbor416;
        log(land); //一応試したけど流石に 415 だった。
        log(sky);
        // TODO nakamura [ふぉろー] 試すのいいですね！ by jflute (2026/08/05)
        // まず、プリミティブ型は変数に値そのものが入っているイメージですから、
        // help内の ++land; でも、helpのland変数の中身が+1されただけとなります。
        // そして、Integerであっても、++sky; って、要は sky = sky + 1 ですから、
        // これまた help内の sky のアドレスが+1された別インスタンスに差し変わっただけと。
        //
        // それにしても、次の新しいパークで sky ができたらいいですね。
    }

    private void helpMethodArgumentMethodcall(StringBuilder sea, int land, Integer sky) {
        ++land;
        ++sky;
        sea.append(land);
    }

    //StringBuilder は 可変で加算がしやすいString
    //上のメソッドで定義してる sea と引数の sea が指しているインスタンスが一緒だから変更されている？　なんでだ？
    //StringBuilderは値を渡しているのではなく、インスタンスを指し示している変数をコピーしている。appendで値を直接変更しているため、元のメソッドでも反映される
    //Integerはimmutableなので、++skyの際に新たなインスタンスが作られて変数がさすアドレスが変更される。→元のメソッドのskyは変わらない！

    // -----------------------------------------------------
    //                                   Variable Assignment
    //                                   -------------------
    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_variable_method_argument_variable_assignment() {
        StringBuilder sea = new StringBuilder("harbor");
        int land = 415;
        helpMethodArgumentVariable(sea, land);
        log(sea); // your answer? => harbor
    }

    private void helpMethodArgumentVariable(StringBuilder sea, int land) {
        ++land;
        String seaStr = sea.toString(); // is "harbor"
        sea = new StringBuilder(seaStr).append(land);
    }

    //sea = new StringBuilder(seaStr).append(land);
    //appendで直接値を変えているのではなく、再代入しているため元のメソッドには反映されない。

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
    int piari;

    public void test_variable_writing() {
        // define variables here
        String sea = "mystic";
        Integer land = null;
        log(sea + ", " + land + ", " + piari);
    }

    //ローカル変数・インスタンス変数がわからなかったの調べた
    //ローカル変数：メソッドの中で定義される変数
    //インスタンス変数：classの中(メソッド外）で定義される変数。classが呼び出されるたびに別物が作られる
    // TODO nakamura [ふぉろー] classが呼び出されるたびに → classのインスタンスが生成されるたびに by jflute (2026/08/05)
    // というニュアンスですね。

    // ===================================================================================
    //                                                                           Good Luck
    //                                                                           =========
    /**
     * Make your original exercise as question style about variable. <br>
     * (変数についてあなたのオリジナルの質問形式のエクササイズを作ってみましょう)
     * <pre>
     * _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
     * your question here (ここにあなたの質問を):
     * メソッド終了時の変数 B の中身は？
     * _/_/_/_/_/_/_/_/_/_/
     * </pre>
     */

    public void test_variable_yourExercise() {
        // write your code here
        int A = 10;
        Integer B = null;
        B = A;

        B += 'B' - 'A';
        log(B);
    }

    //staticを使った問題を作ろうと思ったが、java8ではダメらしい... (inner classにstaticを作れない？）
    // TODO nakamura [ふぉろー] インスタンスに属したinner classだとstatic作れないですね by jflute (2026/08/05)
    // static の inner class だと static変数など作れますが。(レアな話)

    //Integer B = null の直後にB += 'B' - 'A'; を記載するとエラーが出た。
    //調べた結果：Integerは加算時にアンボクシングしてintに変換してから計算している
    //          その結果、nullをintに変換しようとしてエラーが発生していた。Integer　B の初期値を0にするとエラーが起きなかった。
    //          BigDecimalのaddみたいにそのまま加算できないのかと調べたけど、周りくどい手法以外ないっぽい？
    // TODO nakamura [ふぉろー] Integer と BigDecimal で違うのは... by jflute (2026/08/05)
    // Integer はラッパー型ということで、対応するプリミティブ型がいるのに対して、
    // BigDecimal は厳密にはラッパー型ではないので、自力で add() するしかないんですよね。
    // float, double をラップしたクラスに見えて、ある意味その通りなのですが、
    // しっかり1:1で対になっているわけではないので、ボクシングとか特別扱いされているわけではないと。
}
