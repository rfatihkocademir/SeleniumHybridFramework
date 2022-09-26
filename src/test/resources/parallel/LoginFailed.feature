Feature: Login page

  Scenario Template: Gecersiz kullanici adi veya sifre girisi

    Given   Login sayfasina gidilir
    Then    Login sayfasinda olundugu kontrol edilir
    And     Telefon ve Email Radio buttonlarının geldiği kontrol edilir
    When    "<email>" ve "<password>" alanlari doldurulur
    When    Giris Yap butonuna tiklanir
    Then    Hatali giris mesaji goruntulenir
    When    "<email>" ve "<password>" alanlari silinir
    Then    input error mesajlari gorulur


    Examples:
      | email                         | password        |
      | inValidEmail@test.com         | inValidPassword |
      | testotomasyonhesabi@gmail.com | inValidPassword |
      | inValidEmail@test.com         | test.123        |


