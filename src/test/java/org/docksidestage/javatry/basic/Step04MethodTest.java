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

import org.docksidestage.unit.PlainTestCase;

/**
 * The test of method. <br>
 * Operate exercise as javadoc. If it's question style, write your answer before test execution. <br>
 * (javadocの通りにエクササイズを実施。質問形式の場合はテストを実行する前に考えて答えを書いてみましょう)
 * @author jflute
 * @author your_name_here
 */
public class Step04MethodTest extends PlainTestCase {

    // ===================================================================================
    //                                                                         Method Call
    //                                                                         ===========
    /**
     * What string is sea variable at the method end? <br>
     * (メソッド終了時の変数 sea の中身は？)
     */
    public void test_method_call_basic() {
        String sea = supplySomething();
        log(sea); // your answer? => over
    }

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_method_call_many() {
        String sea = functionSomething("mystic");
        consumeSomething(supplySomething());
        runnableSomething();
        log(sea); // your answer? => mysmys
    }

    private String functionSomething(String name) {
        String replaced = name.replace("tic", "mys");
        log("in function: {}", replaced);
        return replaced;
    }

    private String supplySomething() {
        String sea = "over";
        log("in supply: {}", sea);
        return sea;
    }

    private void consumeSomething(String sea) {
        log("in consume: {}", sea.replace("over", "mystic"));
    }

    private void runnableSomething() {
        String sea = "outofshadow";
        log("in runnable: {}", sea);
    }

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_method_object() {
        St4MutableStage mutable = new St4MutableStage();
        int sea = 904;
        boolean land = false;
        helloMutable(sea - 4, land, mutable);
        if (!land) {
            sea = sea + mutable.getStageName().length();
        }
        log(sea); // your answer? => 910
    }

    private int helloMutable(int sea, Boolean land, St4MutableStage piari) {
        sea++;
        land = true;
        piari.setStageName("mystic");
        return sea;
    }

    private static class St4MutableStage {

        private String stageName;

        public String getStageName() {
            return stageName;
        }

        public void setStageName(String stageName) {
            this.stageName = stageName;
        }
    }

    // ===================================================================================
    //                                                                   Instance Variable
    //                                                                   =================
    private int inParkCount;
    private boolean hasAnnualPassport;

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_method_instanceVariable() {
        hasAnnualPassport = true;
        int sea = inParkCount;
        offAnnualPassport(hasAnnualPassport);
        for (int i = 0; i < 100; i++) {
            goToPark();
        }
        ++sea;
        sea = inParkCount;
        log(sea); // your answer? => 100
    }
    //久々に引数系の引っ掛けがきて危なかった
    //当たり前だけど、offAnnualPassport で引数を受け取らない/渡さないようにしたら関数外の変数を参照してくれた

    private void offAnnualPassport(boolean hasAnnualPassport) {
        hasAnnualPassport = false;
    }

    private void goToPark() {
        if (hasAnnualPassport) {
            ++inParkCount;
        }
    }

    // ===================================================================================
    //                                                                           Challenge
    //                                                                           =========
    // write instance variables here
    /**
     * Make private methods as followings, and comment out caller program in test method:
     * <pre>
     * o replaceAwithB(): has one argument as String, returns argument replaced "A" with "B" as String 
     * o replaceCwithB(): has one argument as String, returns argument replaced "C" with "B" as String 
     * o quote(): has two arguments as String, returns first argument quoted by second argument (quotation) 
     * o isAvailableLogging(): no argument, returns private instance variable "availableLogging" initialized as true (also make it separately)  
     * o showSea(): has one argument as String argument, no return, show argument by log()
     * </pre>
     * (privateメソッドを以下のように定義して、テストメソッド内の呼び出しプログラムをコメントアウトしましょう):
     * <pre>
     * o replaceAwithB(): 一つのString引数、引数の "A" を "B" に置き換えたStringを戻す 
     * o replaceCwithB(): 一つのString引数、引数の "C" を "B" に置き換えたStringを戻す 
     * o quote(): 二つのString引数、第一引数を第二引数(引用符)で囲ったものを戻す 
     * o isAvailableLogging(): 引数なし、privateのインスタンス変数 "availableLogging" (初期値:true) を戻す (それも別途作る)
     * o showSea(): 一つのString引数、戻り値なし、引数をlog()で表示する
     * </pre>
     */
    public void test_method_making() {
        // use after making these methods
        String replaced = replaceCwithB(replaceAwithB("ABC"));
        String sea = quote(replaced, "'");
        if (isAvailableLogging()) {
            showSea(sea);
        }
    }

    // #1on1: いいね、メソッド定義位置とメソッド呼び出し順序が一致してて直感的で把握しやすい (2026/10/07)
    // $ぜんぜん意識してなかったかも、テストのとき正常系/異常系分けることはあった
    // まとまりを意識したことあるというのはつながる話で素晴らしい。
    // 呼び出し順序とまとまり、どっちを優先？
    // jfluteの場合、まとまりの存在感がどの程度か？ (感覚値)
    // 存在感あるなら、そもそもタグコメントで独立させちゃったり。
    // まとまりと呼び出し順序のハイブリッド (まとまりを優先して、次に呼び出し順序)
    // LastaFlute の ActionRequestProcessor を例に。
    // 頭の中で再現しやすいコードを意識している。
    // コードをあっちこっち見る時に、元のコードを思い浮かべながら見たい。
    //
    // 実際の現場だと、既存コードにメソッドを追加するとき...一番下に追加される問題(9割ぐらい)。
    // 既存コードに対して、おじゃまします感。
    // $すっごい
    // 会社のプログラミング、オーナーはみんな。
    // 20人がひとつずつゴミを落としていく
    // $技術負債ってこういうことか
    //
    // 既存コードの「コード体裁デザイン」を把握して修正して欲しい。
    // 既存コードの「コード体裁デザイン」に対する責任は、いま修正しようとしてる人が持ってる。
    //
    // コード自体は良くても、コード体裁デザインが微妙で読みにくいだと...
    // $もったいない
    //

    // write methods here
    private String replaceAwithB(String a) {
        return a.replace("A", "B");
    }

    private String replaceCwithB(String c) {
        return c.replace("C", "B");
    }

    // TODO nakamura 引数名、第二引数に関しては、業務名があるはずなのでそれを付けましょう by jflute (2026/10/07)
    // 引用符: quatation, e.g. '' ""
    // 引数名って、普通のローカル変数よりも大事(両方大事だけど比較的)。
    // 引数名って、呼び出し側へのインターフェース。(通信の項目名と言える)
    private String quote(String first, String second) {
        return second + first + second;
    }

    private Boolean isAvailableLogging() {
        return availableLogging;
    }

    private void showSea(String sea) {
        log(sea);
    }

    private Boolean availableLogging = true;
}
// きちんと指示通りに作れたか不安
// done jflute:問題の意図をつかめないまま無心で書いてしまったのですが、どのような意図が込められていたのでしょうか？
// #1on1: 要件の用語が理解できているか？をとうエクササイズなのでGoodです。 (2026/10/07)
