# tag

### ▼タグとは<br>
&ensp;・コミットを参照しやすくするために、名前をつけて管理するもの（リリースポイントなど）<br>
<br>

#### ▼タグの一覧を表示する（アルファベット順）<br>
```
-git tag 
```
<br>
<br>

#### ▼タグの種類<br>
&ensp;①注釈付き版(annotated)<br>
```
-git tag -a タグ名　-m メッセージ
```
<br>
&ensp; `-a` オプションを付けると注釈付きをタグを作成する<br>
&ensp; `-m`オプションを付けるとエディタを立ち上げずにメッセージを入力出来る<br>
<br>

&ensp;②軽量版(lightweight)<br>
```
-git tag タグ名
```
<br>
&ensp;・過去のコミットにタグ付けする<br>

```
-git tag タグ名　コミットID
```

<br>
<br>

#### ▼タグのデータを表示<br>
&ensp;・タグのデータと関連づけられたコミットを表示<br>
```
-git show タグ名
```
<br>
<br>

#### ▼タグをリモートに送信<br>
&ensp;`git push`で別途指定が必要<br>
```
-git push リモート名　タグ名
```
<br>

&ensp;・タグを一斉に送信（ローカルに存在し、リモートに存在しないタグを全て送信）<br>
```
-git push origin --tags
```
<br>
<br>

&ensp;**★リモートのタグは、GitHubを開き、対象リポジトリの「release」の「Tags」から確認可能**<br>

