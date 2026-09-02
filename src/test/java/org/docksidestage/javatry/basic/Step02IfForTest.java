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

import java.util.ArrayList;
import java.util.List;

import org.docksidestage.unit.PlainTestCase;

/**
 * The test of if-for. <br>
 * Operate exercise as javadoc. If it's question style, write your answer before test execution. <br>
 * (javadocの通りにエクササイズを実施。質問形式の場合はテストを実行する前に考えて答えを書いてみましょう)
 * @author jflute
 * @author your_name_here
 */
public class Step02IfForTest extends PlainTestCase {

    // ===================================================================================
    //                                                                        if Statement
    //                                                                        ============
    /**
     * What string is sea variable at the method end? <br>
     * (メソッド終了時の変数 sea の中身は？)
     */
    public void test_if_basic() { // example, so begin from the next method
        int sea = 904;
        if (sea >= 904) {
            sea = 2001;
        }
        log(sea); // your answer? => 2001
    }

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_if_else_basic() {
        int sea = 904;
        if (sea > 904) {
            sea = 2001;
        } else {
            sea = 7;
        }
        log(sea); // your answer? => 7
    }

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_if_elseif_basic() {
        int sea = 904;
        if (sea > 904) {
            sea = 2001;
        } else if (sea >= 904) {
            sea = 7;
        } else if (sea >= 903) {
            sea = 8;
        } else {
            sea = 9;
        }
        log(sea); // your answer? => 7
    }

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_if_elseif_nested() {
        boolean land = false;
        int sea = 904;
        if (sea > 904) {
            sea = 2001;
            sea = sea++ * 2;
        } else if (land && sea >= 904) {
            sea = 7;
            sea = ++sea * 2;
        } else if (sea >= 903 || land) {
            if (sea % 2 == 0) {
                sea = sea++ * 2;
            }
            if (!land) {
                land = true; // ここにきたらseaは10
            } else if (sea <= 903) {
                sea++;
            }
            if (sea < 1810) {
                sea = 8;
            }
        } else if (sea == 8) {
            sea++;
            land = false; // land=trueが実行されたらこっちは絶対に来ない(のが構造でわかる)
        } else {
            sea = 9;
        }
        if (sea >= 9 || (sea > 7 && sea < 9)) {
            sea--;
            if (sea % 2 == 1) {
                sea++;
            }
        }
        if (land) {
            sea = 10;
        }
        log(sea); // your answer? => 10

        // TODO jflute 1on1にて、漠然読みフォロー予定 (2026/08/16)
        // #1on1: 1行ずつ読んだこと自体は、トレーニングになるのでそれはそれで無駄はない。 (2026/08/19)
        // 一方で、もっかい記憶をなくして効率よく読めと言われたら？
        // $後ろから眺めてみる
        // → 逆さ読み
        // seaが最後どうなっているか？が知りたいこと(目的)
        // seaに一番影響を与えるプログラムってどこかというと、直近。
        // (遠いところから読んでも、影響を与えてない部分も読んじゃって無駄かもしれない)
        // ただ、逆さ読みの前にやっておきたいこと。
        // 
        // o 漠然読みで構造を把握 (全体像を見る)
        //  → 変数宣言、if3つ、ログ出しの5つのレイヤー
        // o 当たり(ギャンブルポイント)を付けてフォーカス読み
        //  → landのライフサイクルにフォーカスをシフトさせて逆さ読み
        //
        // 「漠然読みからのフォーカス読み」
        //
        // 当たりが外れても損はない。
        // 構造把握してるし、landもくわしいので、網羅読みも早くなってる(はず)。
        //
        // 一方で、当たりが外れても、次の当たりが見つかることも多い。
        // １個目の当たりを検証する上で、分析が進んだので、別の「怪しい」が見つかりやすい。
        // それを繰り返して、3,4回で見つかったら、網羅より速い可能性が高い。
        //
        // お仕事でコードを読むというのは目的が必ずあるので、
        // その目的に到達するための最短の道のりはどこかにあるはず。それを早く見つけたい。
        //
        // jfluteだと、まずスクロールから全体像を見る (漠然読みで構造把握)。
        // これが習慣化している。(小さいプログラムとかだったら別だけど)
        // 習慣化はそれなりに時間は掛かった。言葉で理解してすぐできるものじゃない。
        // ぼくらの仕事も、時間をすごく引き伸ばしたスポーツと考えていい。
        // こういう状況になったら、こういうことを考える、っていう意識を反復させて無意識に浸透させる。
        // 「知る」と「身に付く」の違い。
        //
        // 仮説思考的なコードリーディング(!?)。
        // done nakamura [読み物課題] My Favorite Book: 仮説思考 by jflute (2026/08/19)
        // https://jflute.hatenadiary.jp/entry/20150111/kasetsu
        //
        // done nakamura [読み物課題] jfluteのプログラマーオススメ五冊 by jflute (2026/08/19)
        // https://jflute.hatenadiary.jp/entry/20150727/fivebooks
        // $リーダブルコードと論点思考は倒さないといけない by なかむらさん
        // 今は、難易度的にも能力的にもまずは気づかいを取り入れる必要がありそうです...
    }

    // ===================================================================================
    //                                                                       for Statement
    //                                                                       =============
    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_for_inti_basic() {
        List<String> stageList = prepareStageList();
        String sea = null;
        for (int i = 0; i < stageList.size(); i++) {
            String stage = stageList.get(i);
            if (i == 1) {
                sea = stage;
            }
        }
        log(sea); // your answer? => dockside
    }
    //ちゃんと定義元まで確認しに行くの大事

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_for_foreach_basic() {
        List<String> stageList = prepareStageList();
        String sea = null;
        for (String stage : stageList) {
            sea = stage;
        }
        log(sea); // your answer? => magiclamp
    }
    //範囲for文って実務で使うんだろうか？インデックスを使わない文行数が減って楽になるけど、何番目をみてるかがわかりづらい？
    //逆に変数が減ってみやすい人もいるんだろうか？配列外参照が起きづらいけど、後からの変更（N-1まで,i += 2のような変更）が効かないから一長一短？
    // done nakamura [ふぉろー] 逆に、intあいのfor文を見かけることがなくなっています by jflute (2026/08/16)
    // webサービスだと、リストをストレートに回して処理しておしまいみたいな場面が多く、
    // ループ回数を制御したり、ループ回数を判定したりなどすることがほとんどないのです。
    // ちょっとやりたくなったら...
    //  int index = 0;
    //  for (String stage : stageList) {
    //      ++index;
    //  }
    // というように、自分でindexを作ってしまうことも。
    // (intあいのfor文の使い方を忘れてしまって、思い出すよりは↑をやってしまうみたいな)

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_for_foreach_continueBreak() {
        List<String> stageList = prepareStageList();
        String sea = null;
        for (String stage : stageList) {
            if (stage.startsWith("br")) {
                continue;
            }
            sea = stage;
            if (stage.contains("ga")) {
                break;
            }
        }
        log(sea); // your answer? => dockside | correct => hangar
    }
    //breakの条件にばかり目が入って、先に代入していることを忘れてた...反省

    /** Same as the previous method question. (前のメソッドの質問と同じ) */
    public void test_for_listforeach_basic() {
        List<String> stageList = prepareStageList();
        StringBuilder sb = new StringBuilder();
        //String test = "hello";
        stageList.forEach(stage -> {
            if (sb.length() > 0) {
                return;
            }
            if (stage.contains("i")) {
                sb.append(stage);
            }
            //            log(test);
            //            test += "world"; 再代入すると怒られる
        });
        String sea = sb.toString();
        log(sea); // your answer? => dockside
    }
    //for (String stage : stageList)って書くのと何が違うんだろう？
    //--調べた結果--
    //範囲for文に比べて、forEachは制約が多い
    //範囲for文：breakでループを抜けられる・for文の外の変数を使いやすい
    //forEach：returnでもループを抜けられない（continueみたいな挙動になる）・外の変数に再代入できない
    //forEachの方ができることが少なく、不要なのでは？と思ったが、配列の中身を列挙するときなど、変更を加えないならforEachを使ったほうが安全？
    // TODO nakamura [いいね] 違いをしっかりまとめられてGood by jflute (2026/08/16)
    // そして、「変更を加えないなら安全？」という発想もGood。
    // TODO jflute 1on1にて、forEach()メソッドの仕組みの話 (2026/08/16)
    // TODO jflute 1on1にて、"なんでもできること" と "適材適所" のジレンマの話 (2026/08/16)

    // ===================================================================================
    //                                                                           Challenge
    //                                                                           =========
    /**
     * Make list containing "a" from list of prepareStageList() and show it as log by loop. (without Stream API) <br>
     * (prepareStageList()のリストから "a" が含まれているものだけのリストを作成して、それをループで回してログに表示しましょう。(Stream APIなしで))
     */
    public void test_iffor_making() {
        // write if-for here
        List<String> stageList = prepareStageList();
        List<String> a_list = new ArrayList<>();
        stageList.forEach(stage -> {
            if (stage.contains("a")) {
                a_list.add(stage);
            }
        });
        a_list.forEach(a_str -> {
            log(a_str);
        });
    }
    //stageList.forEachの中身で、"a"が含まれているものだけのリスト作成とログ表示を同時に行えるけど、指示通りきっちり分けたほうがいいんだろうか？
    //実務を考えるとリスト作成と出力の責務は分けた方が良さそう

    // ===================================================================================
    //                                                                           Good Luck
    //                                                                           =========
    /**
     * Change foreach statement to List's forEach() (keep result after fix) <br>
     * (foreach文をforEach()メソッドへの置き換えてみましょう (修正前と修正後で実行結果が同じになるように))
     */
    public void test_iffor_refactor_foreach_to_forEach() {
        List<String> stageList = prepareStageList();
        String sea = null;
        for (String stage : stageList) {
            if (stage.startsWith("br")) {
                continue;
            }
            sea = stage;
            if (stage.contains("ga")) {
                break;
            }
        }
        log(sea); // should be same as before-fix
    }

    /**
     * Make your original exercise as question style about if-for statement. <br>
     * (if文for文についてあなたのオリジナルの質問形式のエクササイズを作ってみましょう)
     * <pre>
     * _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
     * your question here (ここにあなたの質問を):
     * n = 5の場合の、log(list.get(n));の実行結果は？
     * _/_/_/_/_/_/_/_/_/_/
     * </pre>
     */
    public void test_iffor_yourExercise() {
        // write your code here
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        int n = 5;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = list.get(i) + list.get(i + 1);
            list.add(sum);
        }
        log(list.get(n));
    }
    // done nakamura [いいね] むずかしー。なんとか当たりました、ふぅ^^ by jflute (2026/08/16)

    // ===================================================================================
    //                                                                        Small Helper
    //                                                                        ============
    private List<String> prepareStageList() {
        List<String> stageList = new ArrayList<>();
        stageList.add("broadway");
        stageList.add("dockside");
        stageList.add("hangar");
        stageList.add("magiclamp");
        return stageList;
    }

    // #1on1: 破片プログラマーの悲しみを読んでもらった (2026/09/02)
    // // 破片プログラマーの悲しみ
    // https://jflute.hatenadiary.jp/entry/20160330/fragramming
    // 
    // TODO nakamura [読み物課題] プライベートで一切勉強しなくても優秀になる七つのコツ by jflute (2026/09/02)
    // https://jflute.hatenadiary.jp/entry/20180911/outofprivate
    //
    // 効率よくインプットしていくための努力(量)を泥臭くやる。by jflute
    // つねに振り返って反省する。なんでこうできなかったのか？もっと良いやり方は？ by jflute
    //
    // $振り返る対象をどう選択するか？
    // jfluteの場合は、ある程度そのときどきに感情を得ているはずだから、自然と気になる。
    // 自分が自分の出した成果に(感覚的な)納得がいってないことなら覚えてるので、それを振り返る。
    //
    // 目の前の仕事、本当に本気でやっているか？
    // Aという成果を出す仕事、A+αの成果、まだまだ出せるんじゃないだろうか？
    // 目の前の仕事、本気でやっていれば、大きなインプットになります。
    // (少しでも手を抜いていると、インプット効率は悪くなる。得られるもの得られなくてもったいない)
    // 仕事を本気出るやる、というスキルを持っていればなんでもできる。
    //
    // 色々な効率をよくする選択肢があるので、自分にあったもの、自分が好きそうなやり方が良い。
}
