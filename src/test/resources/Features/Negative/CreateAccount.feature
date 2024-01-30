@CreateAccount
@Negative

Feature: Yeni Hesap Oluştururken Çıkan Uyarı Kontrolleri

  Scenario Outline: Yeni hesap oluşturma başarısız durum kontrolü
    Given Ana sayfa üzerinden yeni hesap oluşturma butonuna tıklanır
    When First name alanı "<First Name>" Last Name alanı "<Last Name>" ile doldurulur
    And Mock email sayfasında bir e mail oluşturulur
    And "<Email>" Email address alanına girilir
    And Country alanından "<ülke>" seçilir
    And Privacy Policy  okunur ve kabul edilir
    And Terms Of Service okunur ve kabul edilir
    And Continue butonna basılarak başarılı şekilde oluşturma maili gönderildiği gözlemlenir
    And Mock Email sayfasındaki mail açılır ve gelen Set Password linkine tıklanır
    And Company Name alanı "<Company Name>" Password alanı "<Password>" Confirm Password alanı "<ConfirmedPassword>" ile doldurulur
    And Set Up My Password butonu ile başarılı şifre oluşturulduğu ve siteye soktuğu gözlemlenir
    Examples:
      | First Name | Last Name    | Email         | ülke   | Company Name | Password    | ConfirmedPassword |
      | Testname   | testLastName | test | Turkey | test         | Timus2020** | Timus2020**       |