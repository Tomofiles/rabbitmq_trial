# RabbitMQの動作検証用プロジェクト

## 検証ポイント
DDDのドメインイベント配信のインフラとして、RabbitMQを検討中。  
以下の2つのポイントを確認する。

- 一つのコンテキストから配信されたイベントを、複数の別のコンテキストが購読し、非同期に受信できること
- 一つのコンテキストがイベントを購読する際、水平スケールされている場合に、イベントが複製されて受信しない（同一コンテキストは、ラウンドロビン等で一つのイベントを受信できる）こと

簡易なサンプルのため、コメントアウトで切り替えて確認できるものとする。