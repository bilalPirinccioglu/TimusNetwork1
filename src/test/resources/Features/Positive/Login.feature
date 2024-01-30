@Login
@Positive

Feature: Başarılı Giriş Kontrolü

  Scenario Outline: Sağlanan kullanıcı adı ve şifrelerle başarılı giriş sağlanması kontrolü
    Given Açılan giriş sayfasında "<Email Address>" ve "<Password>" alanları doldurulur
    And Continue butonuna basarak başarılı giriş sağlandığı gözlenir
    And Açılan profilin bilgilerinin "<First Name>" ve  "<Last Name>" eşleştiği doğrulanır
    And Çıkış yapılarak ana sayfaya yönlendirildiği gözlenir
    Examples:
      | Email Address         | Password    | First Name | Last Name |
      | nepex86621@alibrs.com | Timus2020** | test       | testt     |